package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.evdesporapp.base.BaseHideFragment
import com.evdesporapp.databinding.FragmentExerciseListDetailBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


class ExerciseListDetailFragment : Fragment()  {
    private var _binding:FragmentExerciseListDetailBinding?=null
    private val binding get() = _binding!!

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentExerciseListDetailBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Bottom Sheet
       // bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

//        bottomSheetBehavior.addBottomSheetCallback(object :
//            BottomSheetBehavior.BottomSheetCallback() {
//
//            override fun onSlide(bottomSheet: View, slideOffset: Float) {
//                // handle onSlide
//            }
//
//            override fun onStateChanged(bottomSheet: View, newState: Int) {
//                when (newState) {
//                    BottomSheetBehavior.STATE_COLLAPSED -> Toast.makeText(requireContext(), "STATE_COLLAPSED", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_EXPANDED -> Toast.makeText(requireContext(), "STATE_EXPANDED", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_DRAGGING -> Toast.makeText(requireContext(), "STATE_DRAGGING", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_SETTLING -> Toast.makeText(requireContext(), "STATE_SETTLING", Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_HIDDEN -> Toast.makeText(requireContext(), "STATE_HIDDEN", Toast.LENGTH_SHORT).show()
//                    else -> Toast.makeText(requireContext(), "OTHER_STATE", Toast.LENGTH_SHORT).show()
//                }
//            }
//        })



    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}