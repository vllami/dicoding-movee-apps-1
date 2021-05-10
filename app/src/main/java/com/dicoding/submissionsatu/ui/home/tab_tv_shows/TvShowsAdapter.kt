package com.dicoding.submissionsatu.ui.home.tab_tv_shows

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions.placeholderOf
import com.dicoding.submissionsatu.R.drawable
import com.dicoding.submissionsatu.data.HomeEntity
import com.dicoding.submissionsatu.databinding.ItemsTvShowsBinding
import com.dicoding.submissionsatu.databinding.ItemsTvShowsBinding.inflate
import com.dicoding.submissionsatu.ui.details.DetailsActivity

class TvShowsAdapter : RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {

    private lateinit var itemsTvShowsBinding: ItemsTvShowsBinding

    private val listTvShows = ArrayList<HomeEntity>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TvShowsViewHolder {
        itemsTvShowsBinding = inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return TvShowsViewHolder(itemsTvShowsBinding)
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) = holder.bind(listTvShows[position])

    override fun getItemCount(): Int = listTvShows.size

    fun setTvShows(tvShows: List<HomeEntity>?) {
        if (tvShows == null) return
        with(this.listTvShows) {
            clear()
            addAll(tvShows)
        }
    }

    inner class TvShowsViewHolder(private val binding: ItemsTvShowsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShows: HomeEntity) {
            with(binding) {
                with(tvShows) {
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