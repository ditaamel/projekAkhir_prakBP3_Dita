package com.pab.astronomyhub

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnBack = findViewById<ImageView>(R.id.btnBackDetail)
        val imgDetail = findViewById<ImageView>(R.id.imgDetailPlanet)
        val tvName = findViewById<TextView>(R.id.tvDetailTitle)
        val tvLongDesc = findViewById<TextView>(R.id.tvDetailDescription)
        val tvDist = findViewById<TextView>(R.id.tvDistanceValue) // Pastikan ID ini ada di XML
        val tvTemp = findViewById<TextView>(R.id.tvRadiusValue)     // Pastikan ID ini ada di XML
        val tvOrb = findViewById<TextView>(R.id.tvOrbitalValue)      // Pastikan ID ini ada di XML

        tvName.text = intent.getStringExtra("EXTRA_NAME")
        tvLongDesc.text = intent.getStringExtra("EXTRA_LONG_DESC")
        tvDist.text = intent.getStringExtra("EXTRA_DISTANCE")
        tvTemp.text = intent.getStringExtra("EXTRA_TEMP")
        tvOrb.text = intent.getStringExtra("EXTRA_ORBIT")
        imgDetail.setImageResource(intent.getIntExtra("EXTRA_IMG", 0))

        btnBack.setOnClickListener { finish() }
    }
}