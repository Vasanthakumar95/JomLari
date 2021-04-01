package com.example.jomlari.di

import android.app.AppComponentFactory
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

    /**
     * module acts as an instruction manual on how to initiate instances
     * that are to be injected
     */

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

}