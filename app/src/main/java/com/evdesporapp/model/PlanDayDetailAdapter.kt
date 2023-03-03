package com.evdesporapp.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 3.03.2023                  │
//└──────────────────────────┘

class PlanDayDetailAdapter (private val planDayList: List<PlanDayListVM>) :
    RecyclerView.Adapter<PlanDayDetailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cv_day_detail, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val PlanListVM = planDayList[position]
        holder.planListImage.setImageResource(PlanListVM.planListImage)
        holder.planListText.text = PlanListVM.planListText
        holder.planListDownCounterText.text = PlanListVM.downCounter
    }

    override fun getItemCount(): Int {
        return planDayList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val planListImage: ImageView = itemView.findViewById(R.id.planImage)
        val planListText: TextView = itemView.findViewById(R.id.cvPlansTextView)
        val planListDownCounterText: TextView = itemView.findViewById(R.id.downTimerTextView)
    }

}





