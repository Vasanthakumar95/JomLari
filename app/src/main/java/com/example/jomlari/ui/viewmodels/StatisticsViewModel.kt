package com.example.jomlari.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.jomlari.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {



}