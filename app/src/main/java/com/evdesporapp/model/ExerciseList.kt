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
            R.drawable.ic_sports_handball_24,
            "Biceps Curl"
        )
        val exercise2 = ExerciseListVM(
            R.drawable.aa,
            "Biceps Curl"
        )
        val exercise3 = ExerciseListVM(
            R.drawable.biceps_curl2,
            "Biceps Curl"
        )
        val exercise4 = ExerciseListVM(
            R.drawable.biceps_curl2,
            "Biceps Curl"
        )
        val exerciseList: ArrayList<ExerciseListVM> = ArrayList()
        exerciseList.add(exercise1)
        exerciseList.add(exercise2)
        exerciseList.add(exercise3)
        exerciseList.add(exercise4)
        return exerciseList

    }
}