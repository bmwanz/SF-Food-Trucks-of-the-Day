package com.maxscrub.bw.sffoodtrucksoftheday.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query


interface TruckApi {

    @Headers("X-App-Token: dANrEghQNAdGQQp4ad8AUtJUZ")
    @GET("resource/jjew-r69b.json")
    fun getTrucks(@Query("dayorder") dayorder: Int) : Single<List<Truck>>

}