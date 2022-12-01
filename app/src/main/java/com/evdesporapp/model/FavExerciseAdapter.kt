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
//│ 1.12.2022                │
//└──────────────────────────┘

class FavExerciseAdapter(private val favList:List<FavExerciseViewModel>):
    RecyclerView.Adapter<FavExerciseAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cv_fav_exercise, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val FavsViewModel = favList[position]

        holder.imageView.setImageResource(FavsViewModel.favImage)
        holder.textView.text = FavsViewModel.favText
    }

    override fun getItemCount(): Int {
        return favList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.cvFavExerciseImage)
        val textView: TextView = itemView.findViewById(R.id.cvFavExerciseText)
    }
}
