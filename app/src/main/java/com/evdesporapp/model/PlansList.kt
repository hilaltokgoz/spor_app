package com.evdesporapp.model

import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 1.12.2022                │
//└──────────────────────────┘

object PlansList {
    fun getPlansItemList(): List<PlanViewModel> {

        val itemModel1 = PlanViewModel(
            R.drawable.muscle,
            "Kas Güçlendirme"
        )
        val itemModel2 = PlanViewModel(
            R.drawable.slim,
            "30 Günde Kilo Ver"
        )
        val itemModel3 = PlanViewModel(
            R.drawable.tall,
            "Kilo Al"
        )
        val itemModel4=PlanViewModel(
            R.drawable.slim,
            "Karın Yağından Kurtul"
        )
        val itemModel5=PlanViewModel(
            R.drawable.muscle,
            "Sıkılaşma Zamanı"
        )
        val itemModel6=PlanViewModel(
            R.drawable.slim,
            "10 Günde Fit Görünmek"
        )
        val itemList: ArrayList<PlanViewModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        return itemList
    }
}