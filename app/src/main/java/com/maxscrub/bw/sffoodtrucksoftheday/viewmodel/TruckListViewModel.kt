package com.maxscrub.bw.sffoodtrucksoftheday.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.maxscrub.bw.sffoodtrucksoftheday.model.SharedPreferencesHelper
import com.maxscrub.bw.sffoodtrucksoftheday.model.Truck
import com.maxscrub.bw.sffoodtrucksoftheday.model.TruckApiService
import com.maxscrub.bw.sffoodtrucksoftheday.model.TruckDatabase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch
import java.util.*

class TruckListViewModel(application: Application) : BaseViewModel(application) {

    private val truckService = TruckApiService()
    private val disposable = CompositeDisposable()

    private var prefHelper = SharedPreferencesHelper(getApplication())
    private var refreshTime = 5 * 60 * 1000 * 1000 * 1000L             // 5min in nanoseconds

    // LiveData
    val trucks = MutableLiveData<List<Truck>>()
    val truckLoadError = MutableLiveData<Boolean>()  // true = ERROR
    val isLoading = MutableLiveData<Boolean>()       // display loading spinner

    fun refresh() {
        // refresh information

        val updateTime = prefHelper.getUpdateTime()

        if (updateTime != null && updateTime != 0L
            && System.nanoTime() - updateTime < refreshTime) {
            fetchFromDatabase()
        } else {
            fetchFromRemote()
        }
    }

    fun fetchFromRemote() {
        isLoading.value = true
        disposable.add(
            truckService.getTrucks()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<List<Truck>>() {
                    override fun onSuccess(truckList: List<Truck>) {
                        storeTrucksLocally(truckList)
                        Toast.makeText(
                            getApplication(), "Trucks retrieved from endpoint",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onError(e: Throwable) {
                        truckLoadError.value = true
                        isLoading.value = false
                        e.printStackTrace()
                    }
                })
        )
        prefHelper.saveUpdateTime(System.nanoTime())
    }

    private fun fetchFromDatabase() {
        isLoading.value = true
        launch {
            val trucks = TruckDatabase(getApplication())
                .truckDataObject()
                .getAllTrucks()
            trucksRetrieved(trucks)
            Toast.makeText(getApplication(), "Trucks retrieved from database", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun trucksRetrieved(truckList: List<Truck>) {
        trucks.value = truckList
        truckLoadError.value = false
        isLoading.value = false
    }

    private fun storeTrucksLocally(truckList: List<Truck>) {
        launch {
            val accessor = TruckDatabase(getApplication()).truckDataObject()
            accessor.deleteAllTrucks()
            accessor.insertAll(*truckList.toTypedArray())
            trucksRetrieved(truckList)
        }
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}