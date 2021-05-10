package com.dicoding.submissionsatu.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.submissionsatu.R.layout
import com.dicoding.submissionsatu.ui.home.HomeActivity

class SplashScreenActivity : AppCompatActivity() {

    companion object {
        private const val SPLASH_SCREEN_DELAY = 3_000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN_DELAY.toLong())
    }

}