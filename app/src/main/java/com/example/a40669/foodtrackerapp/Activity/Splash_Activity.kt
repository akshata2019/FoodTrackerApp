package com.example.a40669.foodtrackerapp.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.a40669.foodtrackerapp.R


class Splash_Activity : Activity() {


        private val SPLASH_TIME_OUT:Long=3000 // 3 sec
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_)
            Handler().postDelayed({
                // This method will be executed once the timer is over
                // Start your app main activity

                startActivity(Intent(this, LoginActivity::class.java))

                // close this activity
                finish()
            }, SPLASH_TIME_OUT)
        }
    }
