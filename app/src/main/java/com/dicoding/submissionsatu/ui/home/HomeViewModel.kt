package com.dicoding.submissionsatu.ui.home

import androidx.lifecycle.ViewModel
import com.dicoding.submissionsatu.data.HomeEntity
import com.dicoding.submissionsatu.utils.HomeDummyData

class HomeViewModel : ViewModel() {

    fun getMovies(): List<HomeEntity> = HomeDummyData.generateHomeMoviesData()

    fun getTvShows(): List<HomeEntity> = HomeDummyData.generateHomeTvShowsData()

}