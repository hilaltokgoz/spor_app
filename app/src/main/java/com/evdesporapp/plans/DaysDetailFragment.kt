package com.evdesporapp.plans

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.evdesporapp.databinding.FragmentDaysDetailBinding
import com.evdesporapp.model.*


class DaysDetailFragment : Fragment(){
    private var _binding: FragmentDaysDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDaysDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.rvDayDetail
        binding.rvDayDetail.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val adapter =
            PlanDayDetailAdapter(PlanDayList.getPlanList() as ArrayList<PlanDayListVM>)
        recyclerView.adapter = adapter
        PlanDayList.getPlanList()

        //Sayfa Yönlendirmesi
        binding.startsButton.setOnClickListener {
            val action =
                DaysDetailFragmentDirections.actionDaysDetailFragmentToStartExerciseFragment()
            findNavController().navigate(action)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}