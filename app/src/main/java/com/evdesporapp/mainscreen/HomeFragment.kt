package com.evdesporapp.mainscreen

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evdesporapp.R
import com.evdesporapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addWaterButton.setOnClickListener {
            showCustomDialog()
        }
    }

    private fun showCustomDialog() {
        val builder = AlertDialog.Builder(requireContext(), R.style.CustomAlertDialog)
            .create()
        val view = layoutInflater.inflate(R.layout.dialog_message_layout, null)
        builder.setView(view)
        binding.addWaterButton.setOnClickListener {
            builder.dismiss()
        }
        builder.setCanceledOnTouchOutside(false) //dış ekrana dokunarak iptal etmeyi kapat.
        builder.show()
    }
    fun addWater(){

        TODO("ekle butonuna basınca miktar kadar progress bar çubuğu artacak")
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}