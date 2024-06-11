package com.maxscrub.bw.sffoodtrucksoftheday.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.maxscrub.bw.sffoodtrucksoftheday.R
import kotlin.Int
import kotlin.String

class TruckListFragmentDirections private constructor() {
    private data class ActionToMapFrag(
        val applicant: String = "",
        val latitude: String = "",
        val longitude: String = ""
    ) : NavDirections {
        override fun getActionId(): Int = R.id.action_toMapFrag

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("applicant", this.applicant)
            result.putString("latitude", this.latitude)
            result.putString("longitude", this.longitude)
            return result
        }
    }

    companion object {
        fun actionToMapFrag(
            applicant: String = "",
            latitude: String = "",
            longitude: String = ""
        ): NavDirections = ActionToMapFrag(applicant, latitude, longitude)
    }
}
