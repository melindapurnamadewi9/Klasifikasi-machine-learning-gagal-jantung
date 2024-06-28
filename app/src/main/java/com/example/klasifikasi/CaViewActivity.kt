package com.example.klasifikasi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class CaViewActivity : AppCompatActivity() {

    private lateinit var profile: CardView
    private lateinit var dataset: CardView
    private lateinit var fitur: CardView
    private lateinit var model: CardView
    private lateinit var simulasi: CardView
    private lateinit var logout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca_view)

        profile = findViewById(R.id.cardProfile)
        dataset = findViewById(R.id.cardDataset)
        fitur = findViewById(R.id.cardfitur)
        model = findViewById(R.id.cardModel)
        simulasi = findViewById(R.id.cardSimulasi)
        logout = findViewById(R.id.cardLogout)

        profile.setOnClickListener {
            showToast("Profil")
            val intent = Intent(this@CaViewActivity, Profile::class.java)
            startActivity(intent)
        }
        dataset.setOnClickListener {
            showToast("Dataset")
            val intent = Intent(this@CaViewActivity, Dataset::class.java)
            startActivity(intent)
        }
        fitur.setOnClickListener {
            showToast("Fitur")
            val intent = Intent(this@CaViewActivity, Fitur::class.java)
            startActivity(intent)
        }
        model.setOnClickListener {
            showToast("Model")
            val intent = Intent(this@CaViewActivity, Model::class.java)
            startActivity(intent)
        }
        simulasi.setOnClickListener {
            showToast("Simulasi")
            val intent = Intent(this@CaViewActivity, MainActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            showToast("Berhasil Keluar")

            val intent = Intent(this@CaViewActivity, ScreenActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

