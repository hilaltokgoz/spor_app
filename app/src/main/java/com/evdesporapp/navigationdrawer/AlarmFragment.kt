package com.evdesporapp.navigationdrawer

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.ALARM_SERVICE
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.evdesporapp.base.BaseHideFragment
import com.evdesporapp.databinding.FragmentAlarmBinding
import java.util.*

class AlarmFragment : Fragment() {
    private var _binding: FragmentAlarmBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlarmBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.ClockButton.setOnClickListener {
            val calendar: Calendar = Calendar.getInstance()
            if (Build.VERSION.SDK_INT >= 23) {
                calendar.set(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH),
                    binding.timePicker.hour,
                    binding.timePicker.minute,
                    0
                )
            } else {
                calendar.set(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH),
                    binding.timePicker.currentHour,
                    binding.timePicker.currentMinute, 0
                )
            }
         setAlarm(calendar.timeInMillis)
        }
        return view
    }
    private fun setAlarm(timeInMillis:Long) {
        val alarmManager = requireActivity().getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, MyAlarm::class.java)
        val pendingIntent = PendingIntent.getBroadcast(requireContext(), 0, intent, 0)
        alarmManager.setRepeating(
            AlarmManager.RTC,
            timeInMillis,
            AlarmManager.INTERVAL_DAY,
            pendingIntent
        )
        Toast.makeText(requireContext(), "Alarm Kuruldu", Toast.LENGTH_SHORT).show()
    }



    private class MyAlarm : BroadcastReceiver() {
        override fun onReceive(
            context: Context,
            intent: Intent
        ) {
            Log.d("Alarm Ring", "Alarm just fired")
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




