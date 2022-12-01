package com.evdesporapp.model

import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 1.12.2022                  │
//└──────────────────────────┘

object FavExerciseList {
    fun getFavExercise(): List<FavExerciseViewModel> {

        val itemModel1 = FavExerciseViewModel(
            R.drawable.slim,
            "Biceps Curl"
        )
        val itemModel2 = FavExerciseViewModel(
            R.drawable.slim,
            "Squat"
        )
        val itemModel3 = FavExerciseViewModel(
            R.drawable.slim,
            "Leg Crunch"
        )
        val itemModel4=FavExerciseViewModel(
            R.drawable.slim,
            "Russian Twist"
        )
        val itemModel5=FavExerciseViewModel(
            R.drawable.slim,
            "Plank Jack"
        )
        val itemModel6=FavExerciseViewModel(
            R.drawable.slim,
            "Bird Dog"
        )
        val itemList: ArrayList<FavExerciseViewModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        return itemList
    }
}