package com.pab.astronomyhub

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Cari ID ikon back/menu di XML Profile kamu
        // Pastikan di activity_profile.xml, ImageView-nya punya ID: btnBackProfile
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed() // Cara modern untuk kembali
        }
    }
}