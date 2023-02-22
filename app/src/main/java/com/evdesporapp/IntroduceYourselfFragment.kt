package com.evdesporapp

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.evdesporapp.base.BaseHideFragment
import com.evdesporapp.databinding.FragmentIntroduceYourselfBinding
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.MaterialDatePicker
import kotlinx.coroutines.launch
import java.util.*


class IntroduceYourselfFragment : Fragment(){
    private var _binding: FragmentIntroduceYourselfBinding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()
        //Cinsiyet secimi
        val genders = resources.getStringArray(R.array.gender)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, genders)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntroduceYourselfBinding.inflate(inflater, container, false)
        Locale.setDefault(Locale("tr", "TR"))
        getDate()
        return binding.root
    }

    private fun getDate() {
        //Calendar with Date Limiter
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        val today = MaterialDatePicker.todayInUtcMilliseconds()
        calendar.timeInMillis = today
        calendar[Calendar.YEAR] = 1950
        val startDate = calendar.timeInMillis

        calendar.timeInMillis = today
        calendar[Calendar.YEAR] = 2010
        val endDate = calendar.timeInMillis

        val constraints: CalendarConstraints = CalendarConstraints.Builder()
            .setOpenAt(endDate)
            .setStart(startDate)
            .setEnd(endDate)
            .build()

        //MaterialDatePicker
        val datePicker =
            MaterialDatePicker.Builder.datePicker()
                .setTitleText("Doğum Tarihini Seçiniz")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds()) //varsayılan olarak bugünü seçer.
                .setInputMode(MaterialDatePicker.INPUT_MODE_TEXT)
                .setCalendarConstraints(constraints)
                .build()

        binding.dateOfBirthEditText.setOnClickListener {
            datePicker.show(parentFragmentManager, "DATE_PICKER")

        }
        datePicker.addOnPositiveButtonClickListener {
            binding.dateOfBirthEditText.setText(datePicker.headerText.toString())
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}





