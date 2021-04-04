package com.example.jomlari.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.jomlari.R
import com.example.jomlari.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){

    private val viewmodel: StatisticsViewModel by viewModels()
}