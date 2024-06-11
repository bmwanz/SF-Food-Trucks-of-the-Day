package com.maxscrub.bw.sffoodtrucksoftheday.view

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class TruckMapFragmentArgs(
    val applicant: String = "",
    val latitude: String = "",
    val longitude: String = ""
) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("applicant", this.applicant)
        result.putString("latitude", this.latitude)
        result.putString("longitude", this.longitude)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): TruckMapFragmentArgs {
            bundle.setClassLoader(TruckMapFragmentArgs::class.java.classLoader)
            val __applicant : String?
            if (bundle.containsKey("applicant")) {
                __applicant = bundle.getString("applicant")
                if (__applicant == null) {
                    throw IllegalArgumentException("Argument \"applicant\" is marked as non-null but was passed a null value.")
                }
            } else {
                __applicant = ""
            }
            val __latitude : String?
            if (bundle.containsKey("latitude")) {
                __latitude = bundle.getString("latitude")
                if (__latitude == null) {
                    throw IllegalArgumentException("Argument \"latitude\" is marked as non-null but was passed a null value.")
                }
            } else {
                __latitude = ""
            }
            val __longitude : String?
            if (bundle.containsKey("longitude")) {
                __longitude = bundle.getString("longitude")
                if (__longitude == null) {
                    throw IllegalArgumentException("Argument \"longitude\" is marked as non-null but was passed a null value.")
                }
            } else {
                __longitude = ""
            }
            return TruckMapFragmentArgs(__applicant, __latitude, __longitude)
        }
    }
}
