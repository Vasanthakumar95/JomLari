package com.example.jomlari.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(BitmapConverter::class)

abstract class RunningDatabase: RoomDatabase() {

    abstract fun getDatabase():RunDAO

}