package com.pab.astronomyhub

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView = findViewById<NavigationView>(R.id.nav_view)
        val rvPlanet = findViewById<RecyclerView>(R.id.rvPlanet)
        val tvWelcome = findViewById<TextView>(R.id.tvWelcomeHeader)

        val username = intent.getStringExtra("EXTRA_USERNAME") ?: "Explorer"
        tvWelcome.text = "Welcome, $username!👋"

        // Sidebar Header
        val headerView = navView.getHeaderView(0)
        headerView.findViewById<TextView>(R.id.tvHeaderName).text = username

        findViewById<ImageView>(R.id.btnMenu).setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // RecyclerView setup
        rvPlanet.layoutManager = LinearLayoutManager(this)
        rvPlanet.adapter = PlanetAdapter(PlanetData.listPlanet)

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_profile -> startActivity(Intent(this, ProfileActivity::class.java))
                R.id.nav_settings -> startActivity(Intent(this, SettingsActivity::class.java))
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}