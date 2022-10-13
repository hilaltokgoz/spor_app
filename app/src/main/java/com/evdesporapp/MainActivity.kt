package com.evdesporapp

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.evdesporapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }
}