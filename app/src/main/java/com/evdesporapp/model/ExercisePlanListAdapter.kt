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
//│ 2.03.2023                  │
//└──────────────────────────┘

class ExercisePlanListAdapter (private val exercisePlanList:List<ExercisePlanVM>):
    RecyclerView.Adapter<ExercisePlanListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cv_evercise_plan_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ExercisePlanVM = exercisePlanList[position]
        holder.exercisePlanListText.text = ExercisePlanVM.exercisePlanListText
    }

    override fun getItemCount(): Int {
        return exercisePlanList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val exercisePlanListText: TextView = itemView.findViewById(R.id.cvPlansTextView)
    }

}
