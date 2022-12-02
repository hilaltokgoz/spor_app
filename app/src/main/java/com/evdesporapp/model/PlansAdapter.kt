package com.evdesporapp.model

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.app.NotificationCompat.getColor
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.core.content.res.ResourcesCompat.getColor
import androidx.core.view.get
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

class PlansAdapter(private val mList: List<PlanViewModel>) :
    RecyclerView.Adapter<PlansAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_plans, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.textView.text = ItemsViewModel.text

        if(position %2==0) {
            holder.plansCardView.setCardBackgroundColor(Color.BLUE)

        } else {
            holder.plansCardView.setBackgroundColor(Color.parseColor("#bcfd42"))
          //  holder.plansCardView.setCardBackgroundColor()

        }

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.cvPlansImageView)
        val textView: TextView = itemView.findViewById(R.id.cvPlansTextView)
        val plansCardView: CardView=itemView.findViewById(R.id.cv_plans)

    }
}