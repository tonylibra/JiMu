package com.application.jimu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.plusAssign
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.application.jimu.databinding.ActivityMainBinding
import com.application.jimu.ui.base.KeepStateNavigator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.navController
        navController.navigatorProvider.addNavigator(
            KeepStateNavigator(
                this,
                navHostFragment.childFragmentManager,
                R.id.nav_host
            )
        )

        navController.setGraph(R.navigation.main_nav_graph)
        binding.bottomNavigationView.apply {
            setupWithNavController(navController)
        }
    }
}