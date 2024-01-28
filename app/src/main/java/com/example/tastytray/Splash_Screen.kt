package com.example.tastytray

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Use the postDelayed method directly on the Handler object
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the MainActivity
            startActivity(Intent(this, StartActivity::class.java))
            // Finish the current activity (splash screen)
            finish()
        }, 3000) // Delay for 3 seconds (3000 milliseconds)


    }
}


