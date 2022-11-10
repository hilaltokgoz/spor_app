package com.evdesporapp

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.evdesporapp.databinding.ActivityMainBinding
import com.evdesporapp.exercises.ExerciseHomeFragment
import com.evdesporapp.fitrecipe.FitRecipeHomeFragment
import com.evdesporapp.plans.PlanHomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Light)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(IntroduceYourselfFragment())

        //navController
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        setupWithNavController(binding.bottomNavigation, navController)

        binding.apply {
            bottomNavigation.background = null
            //  bottomNavigation.menu.getItem(2).isEnabled=false

            bottomNavigation.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        loadFragment(HomeFragment())
                        return@setOnItemSelectedListener true
                    }
                    R.id.plans -> {
                        loadFragment(PlanHomeFragment())
                        return@setOnItemSelectedListener true
                    }
                    R.id.exercise -> {
                        loadFragment(ExerciseHomeFragment())
                        return@setOnItemSelectedListener true
                    }
                    R.id.fitFood -> {
                        loadFragment(FitRecipeHomeFragment())
                        return@setOnItemSelectedListener true
                    }
                }
                false
            }


            floatingActionButton = fab
            floatingActionButton.setOnClickListener {
                //showing a toast message when clicked
                Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
            }

        }


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}