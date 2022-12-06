package com.evdesporapp.fitrecipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.evdesporapp.databinding.FragmentFitRecipeHomeBinding
import com.evdesporapp.model.FitHomeAdapter
import com.evdesporapp.model.FitHomeVM
import com.evdesporapp.model.FitRecipeHomeList


class FitRecipeHomeFragment : Fragment() {
    private var _binding: FragmentFitRecipeHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFitRecipeHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val recyclerView= binding.rvFitRecipe
           recyclerView.layoutManager= GridLayoutManager(requireContext(),2)
        val adapter = FitHomeAdapter(FitRecipeHomeList.getFitRecipe() as ArrayList<FitHomeVM>)
        recyclerView.adapter=adapter


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}