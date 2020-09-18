package com.maxscrub.bw.sffoodtrucksoftheday.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TruckDataAccessObject {

    @Insert
    suspend fun insertAll(vararg trucks: Truck) : List<Long>

    @Query("SELECT * FROM truck ORDER BY Applicant ASC")
    suspend fun getAllTrucks() : List<Truck>

    @Query("SELECT * FROM truck WHERE :dayOfWeek = DayOrder ORDER BY Applicant ASC")
    suspend fun getTodayTrucksAlphabetical(dayOfWeek: Int) : List<Truck>

    @Query("DELETE FROM truck")
    suspend fun deleteAllTrucks()
}