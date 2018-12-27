package com.kanykeinu.beautifulness.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kanykeinu.beautifulness.R
import com.kanykeinu.beautifulness.model.Salon
import kotlinx.android.synthetic.main.saloon_item_view.view.*

class SalonListAdapter(private val listOfSalons : List<Salon>) : RecyclerView.Adapter<SalonListAdapter.SalonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalonViewHolder {
        return SalonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.saloon_item_view,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfSalons.size
    }

    override fun onBindViewHolder(holder: SalonViewHolder, position: Int) {
        holder.bindView(listOfSalons[position])
    }

    class SalonViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindView(salon : Salon){
            itemView.tvSalonName.text = salon.name
            itemView.tvSalonDescription.text = salon.description
            itemView.tvSalonSchedule.text = salon.schedule
            itemView.imgSalon.setImageResource(salon.iconRes)
        }

    }
}