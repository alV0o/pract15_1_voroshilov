package com.example.pract15_1_voroshilov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnboardingScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen)
    }

    fun Login(view: View) {
        val intent = Intent(this@OnboardingScreenActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}