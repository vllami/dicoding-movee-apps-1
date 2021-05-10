package com.dicoding.submissionsatu.ui.details

import android.os.Bundle
import android.view.Window
import android.view.WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.bumptech.glide.request.RequestOptions.placeholderOf
import com.dicoding.submissionsatu.R.drawable
import com.dicoding.submissionsatu.data.DetailsEntity
import com.dicoding.submissionsatu.databinding.ActivityDetailsBinding
import com.dicoding.submissionsatu.databinding.ActivityDetailsBinding.inflate
import com.dicoding.submissionsatu.databinding.ContentDetailsBinding
import jp.wasabeef.glide.transformations.BlurTransformation

class DetailsActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAILS = "extra_details"
    }

    private lateinit var activityDetailsBinding: ActivityDetailsBinding
    private lateinit var contentDetailsBinding: ContentDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityDetailsBinding = inflate(layoutInflater)
        with(activityDetailsBinding) {
            setContentView(root)
            contentDetailsBinding = details
        }

        val detailsViewModel = ViewModelProvider(this, NewInstanceFactory())[DetailsViewModel::class.java]
        intent.extras?.let {
            it.getString(EXTRA_DETAILS)?.apply {
                with(detailsViewModel) {
                    setSelected(this@apply)
                    detailsOfItemSelected(getSelected())
                }
            }
        }

        val window: Window = window
        window.setFlags(FLAG_LAYOUT_NO_LIMITS, FLAG_LAYOUT_NO_LIMITS)
    }

    private fun detailsOfItemSelected(entityOfDetails: DetailsEntity) {
        with(contentDetailsBinding) {
            with(entityOfDetails) {
                Glide
                    .with(this@DetailsActivity)
                    .load(poster)
                    .apply(bitmapTransform(BlurTransformation(4, 9)))
                    .into(imgPosterHeader)
                Glide
                    .with(this@DetailsActivity)
                    .load(poster)
                    .transform(RoundedCorners(36))
                    .apply(placeholderOf(drawable.ic_loading).error(drawable.ic_error))
                    .into(imgPoster)
                tvTitle.text = title
                tvReleaseDate.text = releaseDate
                tvGenre.text = genre
                tvDuration.text = duration
                tvSynopsis.text = synopsis
                tvOwner.text = owner
                tvRating.text = rating.toString()
            }
        }
    }

}