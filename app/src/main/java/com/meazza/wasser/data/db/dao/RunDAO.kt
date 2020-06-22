package com.meazza.wasser.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.meazza.wasser.data.db.entity.Run

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table WHERE id LIKE :id")
    fun getRun(id: Int): LiveData<Run>

    @Query("SELECT * FROM running_table ORDER BY time_stamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY time_in_millis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY calories_burned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY average_speed_in_kmh DESC")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distance_in_meters DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(time_in_millis) FROM running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(calories_burned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distance_in_meters) FROM running_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT AVG(average_speed_in_kmh) FROM running_table")
    fun getTotalAverageSpeed(): LiveData<Float>
}