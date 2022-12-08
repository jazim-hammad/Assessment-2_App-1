package com.example.craftingcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.WindowManager


class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the purple bar at the top of the app.
        setContentView(R.layout.activity_splashscreen)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        //Codes for the splash screen.
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },12500)
    }
}