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
//│ 5.12.2022                │
//└──────────────────────────┘

class FitHomeAdapter(private val recipeList: List<FitHomeVM>) :
    RecyclerView.Adapter<FitHomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cv_fit_recipe, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val FitRecipeVM = recipeList[position]
        holder.recipeImage.setImageResource(FitRecipeVM.recipeImage)
        holder.recipeName.text = FitRecipeVM.recipeName
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val recipeImage: ImageView = itemView.findViewById(R.id.cvFitRecipeImage)
        val recipeName: TextView = itemView.findViewById(R.id.cvFitRecipeText)
    }

}