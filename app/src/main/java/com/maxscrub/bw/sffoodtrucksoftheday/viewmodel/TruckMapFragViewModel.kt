package com.maxscrub.bw.sffoodtrucksoftheday.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.maxscrub.bw.sffoodtrucksoftheday.model.Truck

class TruckMapFragViewModel(application: Application) : BaseViewModel(application), OnMapReadyCallback {

    val truck = MutableLiveData<Truck>()

    override fun onMapReady(googleMap: GoogleMap?) {
        googleMap ?: return
        with(googleMap) {
            addMarker(MarkerOptions().position(LatLng(0.0 , 0.0)).title("Marker"))
        }
    }


}