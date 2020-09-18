package com.maxscrub.bw.sffoodtrucksoftheday.model

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager


class SharedPreferencesHelper {
    companion object {

        private const val PREF_TIME = "Pref time"
        private var prefs: SharedPreferences? = null

        @Volatile
        private var instance: SharedPreferencesHelper? = null
        private val LOCK = Any()

        operator fun invoke(context: Context): SharedPreferencesHelper =
            instance ?: synchronized(LOCK) {
                instance ?: buildHelper(context).also {
                    instance = it
                }
            }

        private fun buildHelper(context: Context): SharedPreferencesHelper {
            prefs = PreferenceManager.getDefaultSharedPreferences(context)
            return SharedPreferencesHelper()
        }
    }

    @SuppressLint("CommitPrefEdits")
    fun saveUpdateTime(time: Long) {
        prefs?.edit()?.putLong(PREF_TIME, time)?.apply()
    }

    fun getUpdateTime(): Long? {
        return prefs?.getLong(PREF_TIME, 0)
    }
}