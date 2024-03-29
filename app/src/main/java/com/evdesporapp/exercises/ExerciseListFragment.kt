package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.evdesporapp.databinding.FragmentExerciseListBinding
import com.evdesporapp.model.*


class ExerciseListFragment :  Fragment() {
    private var _binding: FragmentExerciseListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView= binding.rvExerciseDetailList
        recyclerView.layoutManager= GridLayoutManager(requireContext(),2)
        val adapter = ExerciseListAdapter(ExerciseList.getExerciseList() as ArrayList<ExerciseListVM>)
        recyclerView.adapter=adapter
        //Sayfa Yönlendirmesi
        binding.aabutton.setOnClickListener {
            val action =
                ExerciseListFragmentDirections.actionExerciseListFragment2ToExerciseListDetailFragment2()
            findNavController().navigate(action)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}