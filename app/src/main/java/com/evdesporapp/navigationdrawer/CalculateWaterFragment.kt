package com.evdesporapp.navigationdrawer

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.evdesporapp.R
import com.evdesporapp.databinding.FragmentCalculateWaterBinding

class CalculateWaterFragment : Fragment() {
    private var _binding: FragmentCalculateWaterBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalculateWaterBinding.inflate(inflater, container, false)

        val activityTypes=resources.getStringArray(R.array.activities_types)
        val arrayAdapter= ArrayAdapter(requireContext(),R.layout.dropdown_item,activityTypes)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}