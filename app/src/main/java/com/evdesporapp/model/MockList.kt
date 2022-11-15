package com.evdesporapp.model

import com.evdesporapp.R


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 15.11.2022               │
//└──────────────────────────┘

object MockList {
    fun getMockedItemList(): List<ItemModel> {

        val itemModel1 = ItemModel(
            "Kas Güçlendirme",
            R.drawable.muscle,
        )
        val itemModel2 = ItemModel(
            "Zayıflama",
            R.drawable.slim
        )
        val itemModel3 = ItemModel(
            "Boy uzatma",
            R.drawable.tall
        )
        val itemList: ArrayList<ItemModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        return itemList
    }
}
