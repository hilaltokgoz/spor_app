package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evdesporapp.databinding.FragmentBottomSheetBinding

import com.google.android.material.bottomsheet.BottomSheetDialogFragment

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 27.02.2023                  │
//└──────────────────────────┘

class BottomSheetFragment:BottomSheetDialogFragment() {

    private var _binding: FragmentBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBottomSheetBinding.inflate(inflater, container, false)
        return binding.root

    }
    companion object{
        @JvmStatic //newInstance her yerde çağrılabilmek için
        fun newInstance( bundle: Bundle): BottomSheetFragment {
            val fragment= BottomSheetFragment()
            fragment.arguments=bundle
            return  fragment

        }
    }
}