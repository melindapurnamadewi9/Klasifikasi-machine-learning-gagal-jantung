package com.example.klasifikasi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
        val secondActbutton = findViewById<Button>(R.id.button)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this,CaViewActivity::class.java)
            startActivity(Intent)


        }
    }
}