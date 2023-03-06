package com.evdesporapp.plans

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.DialogRest
import com.evdesporapp.R
import com.evdesporapp.databinding.FragmentStartExerciseBinding
import com.evdesporapp.model.PlanDayList
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class StartExerciseFragment : Fragment() {
    private var _binding: FragmentStartExerciseBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartExerciseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //PlanDayList'teki egzersizler sırayla sıralanacak


      // süre bitince dialog çıkıcak (PlanDayList ten süre çekilecek)

        binding.btnDialog.setOnClickListener{

          onLogin(view)
        }




    }
    fun onLogin(view: View) {
        DialogRest().show(childFragmentManager, "MyCustomFragment")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}