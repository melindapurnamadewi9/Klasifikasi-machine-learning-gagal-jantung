package com.example.klasifikasi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Model : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_model)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Set the back button drawable
        val backDrawable = resources.getDrawable(R.drawable.back, null)
        toolbar.setNavigationIcon(backDrawable)

        // Set the navigation click listener
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}