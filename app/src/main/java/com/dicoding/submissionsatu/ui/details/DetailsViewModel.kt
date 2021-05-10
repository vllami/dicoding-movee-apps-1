package com.dicoding.submissionsatu.ui.details

import androidx.lifecycle.ViewModel
import com.dicoding.submissionsatu.data.DetailsEntity
import com.dicoding.submissionsatu.utils.DetailsDummyData

class DetailsViewModel : ViewModel() {

    private lateinit var title: String
    private lateinit var detailsEntity: DetailsEntity

    private val detailsMoviesData = DetailsDummyData.generateDetailsMoviesData()
    private val detailsTvShowsData = DetailsDummyData.generateDetailsTvShowsData()

    fun setSelected(selectedTitle: String) {
        this.title = selectedTitle
    }

    fun getSelected(): DetailsEntity {
        for (movies in detailsMoviesData) if (movies.title == title) detailsEntity = movies
        for (tvShows in detailsTvShowsData) if (tvShows.title == title) detailsEntity = tvShows

        return detailsEntity
    }

}