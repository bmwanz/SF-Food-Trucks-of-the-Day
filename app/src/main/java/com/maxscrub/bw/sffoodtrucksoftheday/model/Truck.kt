package com.maxscrub.bw.sffoodtrucksoftheday.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Truck(

    @ColumnInfo(name = "DayOrder")
    @SerializedName("dayorder")
    val dayOrder: Int?,

    @ColumnInfo(name = "DayOfWeekStr")
    @SerializedName("dayofweekstr")
    val dayOfWeekStr: String?,

    @ColumnInfo(name = "Location")
    @SerializedName("location")
    val location: String?,

    @ColumnInfo(name = "LocationID")
    @SerializedName("locationid")
    val locationID: String?,

    @ColumnInfo(name = "Start24")
    @SerializedName("start24")
    val start24: String?,

    @ColumnInfo(name = "End24")
    @SerializedName("end24")
    val end24: String?,

    @ColumnInfo(name = "Latitude")
    @SerializedName("latitude")
    val latitude: String?,

    @ColumnInfo(name = "Longitude")
    @SerializedName("longitude")
    val longitude: String?,

    @ColumnInfo(name = "OptionalText")
    @SerializedName("optionaltext")
    val optionalText: String?,

    @ColumnInfo(name = "Applicant")
    @SerializedName("applicant")
    val applicant: String?,

) {
    // init to 0 by default
    @PrimaryKey(autoGenerate = true)
    var key = 0
}