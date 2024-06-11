package com.maxscrub.bw.sffoodtrucksoftheday.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.maxscrub.bw.sffoodtrucksoftheday.R

class TruckMapFragmentDirections private constructor() {
    companion object {
        fun actionToListFrag(): NavDirections = ActionOnlyNavDirections(R.id.action_toListFrag)
    }
}
