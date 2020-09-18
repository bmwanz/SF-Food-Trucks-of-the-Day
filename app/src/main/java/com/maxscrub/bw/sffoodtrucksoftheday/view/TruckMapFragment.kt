package com.maxscrub.bw.sffoodtrucksoftheday.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.maxscrub.bw.sffoodtrucksoftheday.R
import com.maxscrub.bw.sffoodtrucksoftheday.viewmodel.TruckMapFragViewModel


class TruckMapFragment: Fragment() {

    private lateinit var truckMapFragViewModel: TruckMapFragViewModel
    private lateinit var mMap : GoogleMap
    private var mapReady = false
    private var applicant = ""
    private var latitude = ""
    private var longitude = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)
        val mapFragment = childFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync {
            googleMap -> mMap = googleMap
            mapReady = true
            updateMap()
        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            applicant = TruckMapFragmentArgs.fromBundle(it).applicant
            latitude = TruckMapFragmentArgs.fromBundle(it).latitude
            longitude = TruckMapFragmentArgs.fromBundle(it).longitude
        }

        truckMapFragViewModel = ViewModelProviders.of(this).get(TruckMapFragViewModel::class.java)
        updateMap()
    }

    private fun updateMap() {
        if (mapReady && latitude.isNotEmpty() && latitude.isNotEmpty()) {
            val marker = LatLng(latitude.toDouble(), longitude.toDouble())
            mMap.setMinZoomPreference(15.0f)
            mMap.setMaxZoomPreference(20.0f)
            mMap.addMarker(MarkerOptions().position(marker).title(applicant))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(marker))
        }
    }
}