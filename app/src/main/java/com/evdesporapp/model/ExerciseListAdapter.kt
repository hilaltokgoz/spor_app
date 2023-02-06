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
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 6.02.2023                │
//└──────────────────────────┘

class ExerciseListAdapter(private val exerciseList: List<ExerciseListVM>) :
    RecyclerView.Adapter<ExerciseListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cv_exercise_list_detail, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ExerciseListVM = exerciseList[position]
        holder.exerciseListImage.setImageResource(ExerciseListVM.exerciseDetailListImage)
        holder.exerciseListText.text = ExerciseListVM.exerciseDetailListText
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val exerciseListImage: ImageView = itemView.findViewById(R.id.cvExerciseDetailListImage)
        val exerciseListText: TextView = itemView.findViewById(R.id.cvExerciseDetailListText)
    }

}

