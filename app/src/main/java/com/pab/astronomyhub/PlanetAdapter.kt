package com.pab.astronomyhub

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlanetAdapter(private val planetList: List<Planet>) :
    RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    class PlanetViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPlanet: ImageView = view.findViewById(R.id.imgPlanet)
        val tvNamaPlanet: TextView = view.findViewById(R.id.tvNamaPlanet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_planet, parent, false)
        return PlanetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        val planet = planetList[position]
        holder.tvNamaPlanet.text = planet.name
        holder.imgPlanet.setImageResource(planet.imageRes)

        // KLIK BIASA -> KE DETAIL
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java).apply {
                putExtra("EXTRA_NAME", planet.name)
                putExtra("EXTRA_LONG_DESC", planet.longDesc)
                putExtra("EXTRA_DISTANCE", planet.distance)
                putExtra("EXTRA_TEMP", planet.temperature)
                putExtra("EXTRA_ORBIT", planet.orbit)
                putExtra("EXTRA_IMG", planet.imageRes)
            }
            it.context.startActivity(intent)
        }

        // KLIK LAMA -> OVERLAY
        holder.itemView.setOnLongClickListener {
            showOverlay(it.context, planet)
            true
        }
    }

    override fun getItemCount(): Int = planetList.size

    private fun showOverlay(context: android.content.Context, planet: Planet) {
        val dialog = Dialog(context)
        val view = LayoutInflater.from(context).inflate(R.layout.dialog_overlay, null)
        dialog.setContentView(view)

        view.findViewById<ImageView>(R.id.imgOverlay).setImageResource(planet.imageRes)
        view.findViewById<TextView>(R.id.tvTitleOverlay).text = planet.name
        view.findViewById<TextView>(R.id.tvShortDescOverlay).text = planet.shortDesc

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }
}