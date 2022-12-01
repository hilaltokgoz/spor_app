package com.evdesporapp.plans

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.evdesporapp.databinding.FragmentPlanHomeBinding
import com.evdesporapp.model.*


class PlanHomeFragment : Fragment() {
    private var _binding: FragmentPlanHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlanHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.recyclerview
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL, false)
      val adapter = PlansAdapter(PlansList.getPlansItemList() as ArrayList<PlanViewModel>)
        recyclerView.adapter = adapter

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}