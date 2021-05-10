package com.dicoding.submissionsatu.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.submissionsatu.databinding.ActivityHomeBinding
import com.dicoding.submissionsatu.databinding.ActivityHomeBinding.inflate

class HomeActivity : AppCompatActivity() {

    private lateinit var activityHomeBinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityHomeBinding = inflate(layoutInflater)
        with(activityHomeBinding) {
            setContentView(root)

            val homePagerAdapter = HomePagerAdapter(this@HomeActivity, supportFragmentManager)
            viewPager.adapter = homePagerAdapter
            tabs.setupWithViewPager(viewPager)
        }
    }

}