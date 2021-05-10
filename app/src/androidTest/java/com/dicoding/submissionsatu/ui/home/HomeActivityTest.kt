package com.dicoding.submissionsatu.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.submissionsatu.R.id
import com.dicoding.submissionsatu.utils.DetailsDummyData
import com.dicoding.submissionsatu.utils.HomeDummyData
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    private val moviesHomeData = HomeDummyData.generateHomeMoviesData()
    private val moviesDetailsData = DetailsDummyData.generateDetailsMoviesData()

    private val tvShowsHomeData = HomeDummyData.generateHomeTvShowsData()
    private val tvShowsDetailsData = DetailsDummyData.generateDetailsTvShowsData()

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun movies() {
        onView(withId(id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(moviesHomeData.lastIndex))
        onView(withId(id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(0))
        onView(withId(id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(id.img_poster_header)).check(matches(isDisplayed()))
        onView(withId(id.img_poster)).check(matches(isDisplayed()))

        onView(withId(id.tv_title)).check(matches(isDisplayed()))
        onView(withId(id.tv_title)).check(matches(withText(moviesDetailsData[0].title)))

        onView(withId(id.tv_release_date)).check(matches(isDisplayed()))
        onView(withId(id.tv_release_date)).check(matches(withText(moviesDetailsData[0].releaseDate)))

        onView(withId(id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(id.tv_genre)).check(matches(withText(moviesDetailsData[0].genre)))

        onView(withId(id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(id.tv_duration)).check(matches(withText(moviesDetailsData[0].duration)))

        onView(withId(id.tv_synopsis)).check(matches(isDisplayed()))
        onView(withId(id.tv_synopsis)).check(matches(withText(moviesDetailsData[0].synopsis)))

        onView(withId(id.tv_owner)).check(matches(isDisplayed()))
        onView(withId(id.tv_owner)).check(matches(withText(moviesDetailsData[0].owner)))

        onView(withId(id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(id.tv_rating)).check(matches(withText(moviesDetailsData[0].rating.toString())))
    }

    @Test
    fun tvShows() {
        onView(withText("TV Shows")).perform(click())

        onView(withId(id.rv_tv_shows)).check(matches(isDisplayed()))
        onView(withId(id.rv_tv_shows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShowsHomeData.lastIndex))
        onView(withId(id.rv_tv_shows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(0))
        onView(withId(id.rv_tv_shows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(id.img_poster_header)).check(matches(isDisplayed()))
        onView(withId(id.img_poster)).check(matches(isDisplayed()))

        onView(withId(id.tv_title)).check(matches(isDisplayed()))
        onView(withId(id.tv_title)).check(matches(withText(tvShowsDetailsData[0].title)))

        onView(withId(id.tv_release_date)).check(matches(isDisplayed()))
        onView(withId(id.tv_release_date)).check(matches(withText(tvShowsDetailsData[0].releaseDate)))

        onView(withId(id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(id.tv_genre)).check(matches(withText(tvShowsDetailsData[0].genre)))

        onView(withId(id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(id.tv_duration)).check(matches(withText(tvShowsDetailsData[0].duration)))

        onView(withId(id.tv_synopsis)).check(matches(isDisplayed()))
        onView(withId(id.tv_synopsis)).check(matches(withText(tvShowsDetailsData[0].synopsis)))

        onView(withId(id.tv_owner)).check(matches(isDisplayed()))
        onView(withId(id.tv_owner)).check(matches(withText(tvShowsDetailsData[0].owner)))

        onView(withId(id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(id.tv_rating)).check(matches(withText(tvShowsDetailsData[0].rating.toString())))
    }
}