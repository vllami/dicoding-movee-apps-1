package com.dicoding.submissionsatu.ui.details

import com.dicoding.submissionsatu.utils.DetailsDummyData
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class DetailsViewModelTest {

    private lateinit var detailsViewModel: DetailsViewModel

    private val moviesData = DetailsDummyData.generateDetailsMoviesData()[0]
    private val moviesTitle = moviesData.title

    private val tvShowsData = DetailsDummyData.generateDetailsTvShowsData()[0]
    private val tvShowsTitle = tvShowsData.title

    @Before
    fun setUp() {
        detailsViewModel = DetailsViewModel()
        with(detailsViewModel) {
            setSelected(moviesTitle)
            setSelected(tvShowsTitle)
        }
    }

    @Test
    fun getMovies_hasData_returnsCorrectResult() {
        val moviesDetailsEntities = detailsViewModel.getSelected()
        assertThat(moviesDetailsEntities).isNotNull()
    }

    @Test
    fun getMovies_hasThisData_returnsCorrectResult() {
        with(detailsViewModel) {
            setSelected(moviesData.title)

            val moviesDetailsEntities = getSelected()
            with(moviesDetailsEntities) {
                assertThat(poster).isEqualTo(moviesData.poster)
                assertThat(title).isEqualTo(moviesData.title)
                assertThat(releaseDate).isEqualTo(moviesData.releaseDate)
                assertThat(genre).isEqualTo(moviesData.genre)
                assertThat(duration).isEqualTo(moviesData.duration)
                assertThat(synopsis).isEqualTo(moviesData.synopsis)
                assertThat(owner).isEqualTo(moviesData.owner)
                assertThat(rating).isEqualTo(moviesData.rating)
            }
        }
    }

    @Test
    fun getTvShows_hasData_returnsCorrectResult() {
        val tvShowsDetailsEntities = detailsViewModel.getSelected()
        assertThat(tvShowsDetailsEntities).isNotNull()
    }

    @Test
    fun getTvShows_hasThisData_returnsCorrectResult() {
        with(detailsViewModel) {
            setSelected(tvShowsData.title)

            val tvShowsDetailsEntities = getSelected()
            with(tvShowsDetailsEntities) {
                assertThat(poster).isEqualTo(tvShowsData.poster)
                assertThat(title).isEqualTo(tvShowsData.title)
                assertThat(releaseDate).isEqualTo(tvShowsData.releaseDate)
                assertThat(genre).isEqualTo(tvShowsData.genre)
                assertThat(duration).isEqualTo(tvShowsData.duration)
                assertThat(synopsis).isEqualTo(tvShowsData.synopsis)
                assertThat(owner).isEqualTo(tvShowsData.owner)
                assertThat(rating).isEqualTo(tvShowsData.rating)
            }
        }
    }

}