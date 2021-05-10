package com.dicoding.submissionsatu.ui.home

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class HomeViewModelTest {

    private lateinit var homeViewModel: HomeViewModel

    @Before
    fun setUp() {
        homeViewModel = HomeViewModel()
    }

    @Test
    fun getMovies_hasData_returnsCorrectResult() {
        val moviesHomeEntities = homeViewModel.getMovies()
        assertThat(moviesHomeEntities).isNotNull()
    }

    @Test
    fun getMovies_hasTenData_returnsCorrectResult() {
        val moviesHomeEntities = homeViewModel.getMovies()
        assertThat(moviesHomeEntities.size).isEqualTo(10)
    }

    @Test
    fun getTvShows_hasData_returnsCorrectResult() {
        val tvShowsHomeEntities = homeViewModel.getTvShows()
        assertThat(tvShowsHomeEntities).isNotNull()
    }

    @Test
    fun getTvShows_hasTenData_returnsCorrectResult() {
        val tvShowsHomeEntities = homeViewModel.getTvShows()
        assertThat(tvShowsHomeEntities.size).isEqualTo(10)
    }
}