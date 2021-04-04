package com.example.jomlari.repository

import com.example.jomlari.db.Run
import com.example.jomlari.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insert(run)

    suspend fun deleteRun(run: Run) = runDao.insert(run)

    fun getAllRunsSortedByData() = runDao.getDataSortedByDate()

    fun getAllRunsSortedByCalorie() = runDao.getDataSortedByCalorie()

    fun getAllRunsSortedBySpeed() = runDao.getDataSortedBySpeed()

    fun getAllRunsSortedByDistance() = runDao.getDataSortedByDistance()

    fun getAllRunsSortedByDuration() = runDao.getDataSortedByDuration()

    fun getTotalRunningDuration() = runDao.getTotalRunningDuration()

    fun getTotalCalorie() = runDao.getTotalRunningCalorie()

    fun getTotalRunningDistance() = runDao.getTotalRunningDistance()

    fun getAverageRunningDistance() = runDao.getAverageRunningSpeed()
}