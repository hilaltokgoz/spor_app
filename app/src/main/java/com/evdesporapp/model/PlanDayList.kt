package com.evdesporapp.model

import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 3.03.2023                  │
//└──────────────────────────┘

object PlanDayList {
    fun getPlanList(): List<PlanDayListVM> {
        val exercise1 = PlanDayListVM(
            R.drawable.plank,
            "Plank",
            "00:30"
        )
        val exercise2 = PlanDayListVM(
            R.drawable.biceps_curl,
            "Biceps Curl",
            "00:60"
        )
        val exercise3 = PlanDayListVM(
            R.drawable.biceps_curl2,
            "Biceps Curl2",
            "00:70"
        )
        val exercise4 = PlanDayListVM(
            R.drawable.plank,
            "Plank",
            "00:45"
        )
        val exercise5 = PlanDayListVM(
            R.drawable.plank,
            "Plank",
            "00:45"
        )
        val exercise6 = PlanDayListVM(
            R.drawable.biceps_curl2,
            "Biceps Curl2",
            "00:70"
        )
        val planList: ArrayList<PlanDayListVM> = ArrayList()
        planList.add(exercise1)
        planList.add(exercise2)
        planList.add(exercise3)
        planList.add(exercise4)
        planList.add(exercise5)
        planList.add(exercise6)
        return planList

    }
}
