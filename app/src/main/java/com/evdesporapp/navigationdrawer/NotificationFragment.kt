package com.evdesporapp.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.evdesporapp.base.BaseHideFragment
import com.evdesporapp.databinding.FragmentNotificationBinding
import com.evdesporapp.model.*

class NotificationFragment : Fragment(){
    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView= binding.rvNotification
        recyclerView.layoutManager= GridLayoutManager(requireContext(),1)
        val adapter = NotificationAdapter(NotificationList.getNotificationItemList() as ArrayList<NotificationVM>)
        recyclerView.adapter=adapter



        //listedeki elemanları random ver, eğer exercise ise exercise iconunu, su ise water iconunu imageView e ata.
    }

    private fun addListItemWater() {
        val listWater = mutableListOf(
            "Hey,su içme zamanı!",
            "Su içmeyi unutmamalısın.",
            "Su içme zamanı",
        )
    }

    private fun addListItemExercise() {
        val listExercise= mutableListOf(
            "Egzersizini kaçırma!",
            "Egzersiz zamanı"
        )

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}