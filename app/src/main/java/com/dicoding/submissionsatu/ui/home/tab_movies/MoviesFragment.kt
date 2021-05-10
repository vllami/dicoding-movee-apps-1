package com.dicoding.submissionsatu.ui.home.tab_movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.submissionsatu.databinding.FragmentMoviesBinding
import com.dicoding.submissionsatu.databinding.FragmentMoviesBinding.inflate
import com.dicoding.submissionsatu.ui.home.HomeViewModel
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper.ORIENTATION_VERTICAL
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper.setUpOverScroll

class MoviesFragment : Fragment() {

    private lateinit var moviesAdapter: MoviesAdapter
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var fragmentMoviesBinding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentMoviesBinding = inflate(inflater, container, false)
        return fragmentMoviesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            homeViewModel = ViewModelProvider(this, NewInstanceFactory())[HomeViewModel::class.java]

            val movies = homeViewModel.getMovies()
            moviesAdapter = MoviesAdapter()
            moviesAdapter.setMovies(movies)

            with(fragmentMoviesBinding) {
                with(rvMovies) {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = moviesAdapter
                    setUpOverScroll(this, ORIENTATION_VERTICAL)
                }
            }
        }
    }

}