package com.evdesporapp.plans

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.evdesporapp.databinding.FragmentListOfDaysPlanBinding
import com.evdesporapp.model.*
import com.evdesporapp.model.ExercisePlanList.getExercisePlanList


class ListOfDaysPlanFragment : Fragment() {
    private var _binding: FragmentListOfDaysPlanBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListOfDaysPlanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.rvExercisePlanDetail
        binding.rvExercisePlanDetail.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val adapter =
            ExercisePlanListAdapter(ExercisePlanList.getExercisePlanList() as ArrayList<ExercisePlanVM>)
        recyclerView.adapter = adapter
        getExercisePlanList()

        //Sayfa Yönlendirmesi

        binding.cvPlanTitle.setOnClickListener {
            val action =
                ListOfDaysPlanFragmentDirections.actionListOfDaysPlanFragment2ToDaysDetailFragment()
            findNavController().navigate(action)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}