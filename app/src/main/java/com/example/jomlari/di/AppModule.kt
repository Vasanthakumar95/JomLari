package com.example.jomlari.di

import android.content.Context
import androidx.room.Room
import com.example.jomlari.db.RunningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.example.jomlari.others.Constants.RUNNING_DATABASE_NAME

/**
     * module acts as an instruction manual on how to initiate instances
     * that are to be injected
     */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getDatabase()

}