package com.maxscrub.bw.sffoodtrucksoftheday.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*


class TruckApiService {

    private val BASE_URL = "https://data.sfgov.org/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(TruckApi::class.java)

    fun getTrucks() : Single<List<Truck>> {
        return api.getTrucks(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 1)
    }
}