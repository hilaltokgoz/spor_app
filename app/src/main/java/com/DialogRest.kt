package com

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.evdesporapp.R


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ   │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 6.03.2023                  │
//└──────────────────────────┘

 class DialogRest:DialogFragment() {
     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         dialog!!.window?.setBackgroundDrawableResource(R.drawable.round_corner);
         return inflater.inflate(R.layout.dialog_rest, container, false)
     }
     override fun onStart() {
         super.onStart()
         val width = (resources.displayMetrics.widthPixels * 0.95).toInt()
         val height = (resources.displayMetrics.heightPixels * 0.50).toInt()
         dialog!!.window?.setLayout(width,height)
     }
 }