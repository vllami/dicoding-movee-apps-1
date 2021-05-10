package com.dicoding.submissionsatu.ui.home.tab_movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions.placeholderOf
import com.dicoding.submissionsatu.R.drawable
import com.dicoding.submissionsatu.data.HomeEntity
import com.dicoding.submissionsatu.databinding.ItemsMoviesBinding
import com.dicoding.submissionsatu.databinding.ItemsMoviesBinding.inflate
import com.dicoding.submissionsatu.ui.details.DetailsActivity

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private lateinit var itemsMoviesBinding: ItemsMoviesBinding

    private val listMovies = ArrayList<HomeEntity>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MoviesViewHolder {
        itemsMoviesBinding = inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return MoviesViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) = holder.bind(listMovies[position])

    override fun getItemCount(): Int = listMovies.size

    fun setMovies(movies: List<HomeEntity>?) {
        if (movies == null) return
        with(this.listMovies) {
            clear()
            addAll(movies)
        }
    }

    inner class MoviesViewHolder(private val binding: ItemsMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: HomeEntity) {
            with(binding) {
                with(movies) {
                    with(itemView) {
                        Glide
                            .with(context)
                            .load(poster)
                            .transform(RoundedCorners(18))
                            .apply(placeholderOf(drawable.ic_loading).error(drawable.ic_error))
                            .into(imgPoster)
                        tvTitle.text = title
                        tvRating.text = rating.toString()
                        tvDuration.text = duration
                        tvOwner.text = owner

                        setOnClickListener {
                            Intent(context, DetailsActivity::class.java).also {
                                it.putExtra(DetailsActivity.EXTRA_DETAILS, title)
                                context.startActivity(it)
                            }
                        }
                    }
                }
            }
        }
    }

}