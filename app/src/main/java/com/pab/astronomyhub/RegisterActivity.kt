package com.pab.astronomyhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val etName = findViewById<EditText>(R.id.etNameRegister)
        val tvTabSignIn = findViewById<TextView>(R.id.tvTabSignIn)

        btnRegister.setOnClickListener {
            val username = etName.text.toString()
            if (username.isNotEmpty()) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                startActivity(intent)
                finish()
            } else {
                etName.error = "Nama jangan dikosongkan ya!"
            }
        }

        // Kembali ke Login saat klik tab "Sign in"
        tvTabSignIn.setOnClickListener {
            finish() // Menutup halaman register dan balik ke login
        }
    }
}