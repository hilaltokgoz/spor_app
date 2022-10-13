package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evdesporapp.databinding.FragmentExerciseHomeBinding

class ExerciseHomeFragment : Fragment() {
    private var _binding: FragmentExerciseHomeBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseHomeBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}