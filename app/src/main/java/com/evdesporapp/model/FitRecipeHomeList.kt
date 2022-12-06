package com.evdesporapp.model
import com.evdesporapp.R

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 5.12.2022                │
//└──────────────────────────┘

object FitRecipeHomeList {
    fun getFitRecipe(): List<FitHomeVM> {
        val recipe1 = FitHomeVM(
            R.drawable.kabak,
            "Kabak Köfte"
        )
        val recipe2 = FitHomeVM(
            R.drawable.yulafli_pogaca,
            "Yulaflı Poğaça"
        )
        val recipe3 = FitHomeVM(
            R.drawable.kabak_oturtma,
            "Kabak Oturtma"
        )
        val recipeList: ArrayList<FitHomeVM> = ArrayList()
        recipeList.add(recipe1)
        recipeList.add(recipe2)
        recipeList.add(recipe3)
        return recipeList
    }
}
