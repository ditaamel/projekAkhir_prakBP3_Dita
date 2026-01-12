package com.pab.astronomyhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inisialisasi View (Pastikan ID sesuai dengan XML activity_login)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        // Jika di XML kamu pakai ID lain, sesuaikan di sini (misal R.id.etEmail)
        val etEmail = findViewById<EditText>(R.id.etEmailLogin)
        val tvTabSignUp = findViewById<TextView>(R.id.tvTabSignUp)

        btnLogin.setOnClickListener {
            val username = etEmail.text.toString()
            if (username.isNotEmpty()) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                startActivity(intent)
                finish() // Agar user tidak bisa kembali ke login setelah masuk
            } else {
                etEmail.error = "Masukkan email dulu, Explorer!"
            }
        }

        // Pindah ke Register saat klik tab "Sign up"
        tvTabSignUp.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}