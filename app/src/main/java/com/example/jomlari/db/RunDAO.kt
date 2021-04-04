package com.example.jomlari.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    /**
     * onConflict = OnConflictStrategy.REPLACE
     * Old run command will be replaced by new run if it is similar
    */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(run: Run)

    @Delete
    suspend fun delete(run: Run)

    /**
     * Queries to filter data by chosen attribute
     */
    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getDataSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY speed DESC")
    fun getDataSortedBySpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distance DESC")
    fun getDataSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY duration DESC")
    fun getDataSortedByDuration(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY calories DESC")
    fun getDataSortedByCalorie(): LiveData<List<Run>>

    /**
     * get total values
     */
    @Query("SELECT SUM(duration) FROM running_table")
    fun getTotalRunningDuration(): LiveData<Long>

    @Query("SELECT SUM(calories) FROM running_table")
    fun getTotalRunningCalorie(): LiveData<Int>

    @Query("SELECT SUM(distance) FROM running_table")
    fun getTotalRunningDistance(): LiveData<Int>

    @Query("SELECT AVG(speed) FROM running_table")
    fun getAverageRunningSpeed(): LiveData<Float>

}