package com.evdesporapp.model

import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 2.03.2023                  │
//└──────────────────────────┘


object ExercisePlanList {
    fun getExercisePlanList(): List<ExercisePlanVM> {
        val exercise1 = ExercisePlanVM(
            "1. Gün"
        )
        val exercise2 = ExercisePlanVM(
            "2. Gün"
        )
        val exercise3 = ExercisePlanVM(
            "Dinlenme Günü"
        )
        val exercise4 = ExercisePlanVM(
            "4. Gün"
        )
        val exercise5 = ExercisePlanVM(
            "5. Gün"
        )
        val exercise6 = ExercisePlanVM(
            "Dinlenme Günü"
        )
        val exercise7 = ExercisePlanVM(
            "7. Gün"
        )
        val exerciseList: ArrayList<ExercisePlanVM> = ArrayList()
        exerciseList.add(exercise1)
        exerciseList.add(exercise2)
        exerciseList.add(exercise3)
        exerciseList.add(exercise4)
        exerciseList.add(exercise5)
        exerciseList.add(exercise6)
        exerciseList.add(exercise7)
        return exerciseList

    }
}