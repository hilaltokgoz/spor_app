package com.evdesporapp.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evdesporapp.databinding.FragmentBmiBinding

class BmiFragment : Fragment() {
    private var _binding: FragmentBmiBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBmiBinding.inflate(inflater, container, false)
        return binding.root

    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val line= binding.imageViewLine
//        val height=binding.editTextHeight.text
//        val weight=binding.editTextWeight.text
//        val result=height/(weight*weight)
//        binding.buttonCalculateWater.setOnClickListener {
//            when(it){
//                result<=18.5 -> binding.textViewBmiBox1 //line burada   //zayıf
//               18.5 <=result<=24.9 -> binding.textViewBmiBox2    //normal
//               25.0 <=result<=29.9 -> binding.textViewBmiBox3    //kilolu
//                30<=result<=34.9 -> binding.textViewBmiBox4     //obezite
//                result>=35 -> binding.textViewBmiBox5         //aşırı obez
//            }
//
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}