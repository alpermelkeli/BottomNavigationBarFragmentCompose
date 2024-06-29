package com.alpermelkeli.bottomnavbarhomescreen

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.ui.graphics.Color
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.alpermelkeli.bottomnavbarhomescreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        createBottomNavBar()






    }

    private fun createBottomNavBar(){
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.mainFragmentContainer) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navHostFragment.navController)
    }

}