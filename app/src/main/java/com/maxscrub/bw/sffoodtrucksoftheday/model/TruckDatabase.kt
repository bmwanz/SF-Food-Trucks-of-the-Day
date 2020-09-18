package com.maxscrub.bw.sffoodtrucksoftheday.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Truck::class), version = 2)
abstract class TruckDatabase: RoomDatabase() {

    abstract fun truckDataObject(): TruckDataAccessObject

    companion object {
        @Volatile private var instance: TruckDatabase? = null
        private val LOCK = Any()

        // if instance not null, if not created, sync (only 1 thread can access)
        // either return instance or build database and return it
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            TruckDatabase::class.java,
            "truckdatabase"
        ).fallbackToDestructiveMigration().build()
    }

}