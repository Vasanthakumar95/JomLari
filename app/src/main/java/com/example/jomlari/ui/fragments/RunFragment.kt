package com.example.jomlari.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.jomlari.R
import com.example.jomlari.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run){

    private val viewmodel: MainViewModel by viewModels()



}