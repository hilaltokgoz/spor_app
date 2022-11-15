package com.evdesporapp.model

import android.view.View
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
//│ 15.11.2022               │
//└──────────────────────────┘

class ItemListViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){
    fun bindItems(itemModel : ItemModel) {
        val description = itemView.findViewById(R.id.item_textName) as TextView
        val image = itemView.findViewById(R.id.image) as ImageView

        description.text=itemModel.description
        image.setImageResource(itemModel.image)
    }


}