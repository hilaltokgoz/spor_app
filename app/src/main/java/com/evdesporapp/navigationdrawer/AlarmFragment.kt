package com.evdesporapp.navigationdrawer

import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evdesporapp.databinding.FragmentAlarmBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.MaterialTimePicker.INPUT_MODE_KEYBOARD
import com.google.android.material.timepicker.TimeFormat

class AlarmFragment : Fragment() {
    private var _binding: FragmentAlarmBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlarmBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
  private fun timePicker(){
      val picker = MaterialTimePicker.Builder()
          .setTimeFormat(TimeFormat.CLOCK_12H)
          .setHour(12)
          .setMinute(10)
          .setTitleText("Saat Seçiniz..")
          .build()

      val isSystem24Hour = is24HourFormat(requireContext())
      val clockFormat = if (isSystem24Hour) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H
      MaterialTimePicker.Builder().setInputMode(INPUT_MODE_KEYBOARD)

      picker.addOnPositiveButtonClickListener {
          // call back code
      }
      picker.addOnNegativeButtonClickListener {
          // call back code
      }
      picker.addOnCancelListener {
          // call back code
      }
      picker.addOnDismissListener {
          // call back code
      }
      binding.alarmCV.setOnClickListener {
          picker.show(parentFragmentManager, "tag");
      }

  }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}