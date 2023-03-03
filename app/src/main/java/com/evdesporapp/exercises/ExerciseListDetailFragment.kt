package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evdesporapp.R
import com.evdesporapp.databinding.FragmentExerciseListDetailBinding


class ExerciseListDetailFragment : Fragment()  {
    private var _binding:FragmentExerciseListDetailBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentExerciseListDetailBinding.inflate(inflater,container,false)

      //setStyle(STYLE_NORMAL, R.style.BottomSheetDialog)
        context?.theme?.applyStyle(R.style.BottomSheetDialog, true);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     //bottom sheet


        binding.button.setOnClickListener {

            fragmentManager?.let{
                BottomSheetFragment.newInstance(bundle = Bundle()).apply {
                    show(it,"bottomSheet")
                }
            }

        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}