package com.evdesporapp.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 15.11.2022               │
//└──────────────────────────┘

class ItemAdapter(private val itemList:ArrayList<ItemModel>): RecyclerView.Adapter<ItemListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListViewHolder {
        return ItemListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_image_with_text,
                parent,
                false
            )
        )
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {
        holder.bindItems(itemList[position])
    }


}