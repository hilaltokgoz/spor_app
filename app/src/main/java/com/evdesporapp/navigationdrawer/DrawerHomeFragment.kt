package com.evdesporapp.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.evdesporapp.R
import com.evdesporapp.databinding.FragmentDrawerHomeBinding

class DrawerHomeFragment : Fragment() {
    private var _binding: FragmentDrawerHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDrawerHomeBinding.inflate(inflater, container, false)
        binding.colorTheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                setNightModeAuto(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                setNightModeAuto(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        return binding.root
    }
    private fun setNightModeAuto(mode: Int) {
        AppCompatDelegate.setDefaultNightMode(mode)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      binding.alarmText.setOnClickListener {
          it.findNavController().navigate(R.id.action_global_alarmFragment)
      }
        binding.aboutText.setOnClickListener {
            it.findNavController().navigate(R.id.action_global_aboutFragment)
        }
        binding.notificationText.setOnClickListener {
            it.findNavController().navigate(R.id.action_global_notificationFragment)
        }
        binding.waterDrinkCalculateText.setOnClickListener {
            it.findNavController().navigate(R.id.action_global_calculateWaterFragment)
        }
        binding.bmiText.setOnClickListener {
            it.findNavController().navigate(R.id.action_global_bmiFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}