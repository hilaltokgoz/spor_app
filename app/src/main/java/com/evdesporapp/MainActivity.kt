package com.evdesporapp

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.evdesporapp.databinding.ActivityMainBinding
import com.evdesporapp.exercises.ExerciseHomeFragment
import com.evdesporapp.fitrecipe.FitRecipeHomeFragment
import com.evdesporapp.mainscreen.HomeFragment
import com.evdesporapp.navigationdrawer.DrawerHomeFragment
import com.evdesporapp.plans.PlanHomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Light)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // loadFragment(IntroduceYourselfFragment())

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
                        findNavController(R.id.nav_host_fragment).navigate(R.id.homeFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.plans -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.planHomeFragment2)
                        return@setOnItemSelectedListener true
                    }
                    R.id.exercise -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.exerciseHomeFragment2)
                        return@setOnItemSelectedListener true
                    }
                    R.id.fitFood -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.fitRecipeHomeFragment)
                        return@setOnItemSelectedListener true
                    }
                }
                false
            }


            fab.setOnClickListener {
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_drawerHomeFragment2)
                Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
            }

        }


    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }


//     fun navigate(){
//
//          findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_alarmFragment)
//
//         findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_aboutFragment)
//
//         findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_bmiFragment)
//
//         findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_notificationFragment)
//
//         findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_calculateWaterFragment)
//
//      }

    }
