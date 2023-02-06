package com.evdesporapp.model

import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 6.02.2023                │
//└──────────────────────────┘

object ExerciseList {
    fun getExerciseList(): List<ExerciseListVM> {
        val exercise1 = ExerciseListVM(
            R.drawable.biceps_curl,
            "Biceps Curl"
        )
        val exerciseList: ArrayList<ExerciseListVM> = ArrayList()
        exerciseList.add(exercise1)
        return exerciseList

    }
}