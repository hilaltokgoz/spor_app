package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment.STYLE_NORMAL
import androidx.fragment.app.Fragment
import com.evdesporapp.R
import com.evdesporapp.base.BaseHideFragment
import com.evdesporapp.databinding.FragmentExerciseListDetailBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


class ExerciseListDetailFragment : Fragment()  {
    private var _binding:FragmentExerciseListDetailBinding?=null
    private val binding get() = _binding!!

    private val bottomSheetView by lazy { findViewById<ConstraintLayout>(R.id.bottomSheet) }
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentExerciseListDetailBinding.inflate(inflater,container,false)
        val view=binding.root

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetView)
        setBottomSheetVisibility(false)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialog)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     //bottom sheet
        binding.button.setOnClickListener {
            setBottomSheetVisibility(true)
        }

    }
    private fun setBottomSheetVisibility(isVisible: Boolean) {
        val updatedState = if (isVisible) BottomSheetBehavior.STATE_EXPANDED else BottomSheetBehavior.STATE_COLLAPSED
        bottomSheetBehavior.state = updatedState
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}