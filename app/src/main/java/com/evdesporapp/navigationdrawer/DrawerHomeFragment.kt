package com.evdesporapp.navigationdrawer

import android.app.ActionBar
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
        binding.toolbar.setNavigationOnClickListener {
        //TODO: Back button geri dönüş home fragmenta
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}