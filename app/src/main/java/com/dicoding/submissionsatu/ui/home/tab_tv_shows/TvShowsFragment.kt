package com.dicoding.submissionsatu.ui.home.tab_tv_shows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.submissionsatu.databinding.FragmentTvShowsBinding
import com.dicoding.submissionsatu.databinding.FragmentTvShowsBinding.inflate
import com.dicoding.submissionsatu.ui.home.HomeViewModel
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper.ORIENTATION_VERTICAL
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper.setUpOverScroll

class TvShowsFragment : Fragment() {

    private lateinit var tvShowsAdapter: TvShowsAdapter
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var fragmentTvShowsBinding: FragmentTvShowsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentTvShowsBinding = inflate(inflater, container, false)
        return fragmentTvShowsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            homeViewModel = ViewModelProvider(this, NewInstanceFactory())[HomeViewModel::class.java]

            val tvShows = homeViewModel.getTvShows()
            tvShowsAdapter = TvShowsAdapter()
            tvShowsAdapter.setTvShows(tvShows)

            with(fragmentTvShowsBinding) {
                with(rvTvShows) {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = tvShowsAdapter
                    setUpOverScroll(this, ORIENTATION_VERTICAL)
                }
            }
        }
    }

}