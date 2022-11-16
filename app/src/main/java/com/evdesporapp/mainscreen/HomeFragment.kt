package com.evdesporapp.mainscreen

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.evdesporapp.R
import com.evdesporapp.databinding.FragmentHomeBinding
import com.evdesporapp.model.ItemAdapter
import com.evdesporapp.model.ItemModel
import com.evdesporapp.model.MockList
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IAxisValueFormatter


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        lineChartView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.recyclerview
        binding.recyclerview.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapter =
            ItemAdapter(MockList.getMockedItemList() as ArrayList<ItemModel>)
        recyclerView.adapter = adapter
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

    fun addWater() {

        TODO("ekle butonuna basınca miktar kadar progress bar çubuğu artacak")
    }


    fun lineChartView() {

        val entries: MutableList<Entry> = ArrayList()
        entries.add(Entry(0f, 3f))
        entries.add(Entry(1f, 3f))
        entries.add(Entry(2f, 2f))
        entries.add(Entry(3f, 1f))
        entries.add(Entry(4f, 5f))
        entries.add(Entry(5f, 4f))
        entries.add(Entry(6f, 6f))

        val dataSet = LineDataSet(entries, "Yakılan Kalori")
        dataSet.color = ContextCompat.getColor(requireContext(), R.color.active_green)
        dataSet.valueTextColor = ContextCompat.getColor(requireContext(), R.color.black)

        //****
        // Controlling X axis
        val xAxis = binding.lineChart.xAxis
        // Set the xAxis position to bottom. Default is top
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        //Customizing x axis value
        val days = arrayOf("P", "S", "Ç", "P", "C", "C", "P")

        val formatter = IAxisValueFormatter { value, _ -> days[value.toInt()] }
        xAxis.granularity = 1f // minimum axis-step (interval) is 1
        xAxis.valueFormatter = formatter

        //***
        // Controlling right side of y axis
        val yAxisRight = binding.lineChart.axisRight
        yAxisRight.isEnabled = false

        //***
        // Controlling left side of y axis
        val yAxisLeft = binding.lineChart.axisLeft
        yAxisLeft.granularity = 1f

        // Setting Data
        val data = LineData(dataSet)
        binding.lineChart.data = data
        binding.lineChart.invalidate()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}