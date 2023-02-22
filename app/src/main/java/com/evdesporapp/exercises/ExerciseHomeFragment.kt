package com.evdesporapp.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.evdesporapp.base.BaseHideFragment
import com.evdesporapp.databinding.FragmentExerciseHomeBinding
import com.evdesporapp.model.FavExerciseAdapter
import com.evdesporapp.model.FavExerciseList
import com.evdesporapp.model.FavExerciseViewModel

class ExerciseHomeFragment : Fragment() {
    private var _binding: FragmentExerciseHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExerciseHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.rvFavExercise
        binding.rvFavExercise.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapter =
            FavExerciseAdapter(FavExerciseList.getFavExercise() as ArrayList<FavExerciseViewModel>)
        recyclerView.adapter = adapter
        addListViewItem()

        //Sayfa Yönlendirmesi
        binding.textViewTitle.setOnClickListener {
            val action =
                ExerciseHomeFragmentDirections.actionExerciseHomeFragment2ToExerciseListFragment2()
            findNavController().navigate(action)
        }

        //   val position= binding.exercisePartLV[0]
        //   position.setBackgroundColor(Color.parseColor("#bcfd42"))
    }

    private fun addListViewItem() {
        val parts = arrayOf(
            "  Sırt ", "  Kol", "  Alt Karın", "  Üst Karın", "  Orta Karın", "  Kalça",
            "  Üst Bacak", "  Alt Bacak", "  Kardiyo", "  Esneme"
        )
        val arrayAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, parts)
        binding.exercisePartLV.adapter = arrayAdapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
