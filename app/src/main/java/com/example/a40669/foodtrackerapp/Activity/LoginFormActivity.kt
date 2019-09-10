package com.example.a40669.foodtrackerapp.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.a40669.foodtrackerapp.R
import kotlinx.android.synthetic.main.activity_login_form.*

class LoginFormActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)
        textViewDone.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }
        textViewForgot.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent);
        }
        imageViewBack.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent);
        }
    }
}
