package com.example.a40669.foodtrackerapp.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a40669.foodtrackerapp.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        imageViewBack.setOnClickListener {
            val intent = Intent(this, LoginFormActivity::class.java)
            startActivity(intent);
        }
    }
}
