package com.honzar.minimal.ui.main

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.honzar.minimal.R
import com.honzar.minimal.databinding.ActivityMainBinding
import com.honzar.minimal.extension.setupWithNavController
import com.honzar.minimal.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel, MainViewState, ActivityMainBinding>(), MainView {

    @Inject override lateinit var viewModelFactory: MainViewModelFactory

    override val layoutResId = R.layout.activity_main

    private var currentNavController: LiveData<NavController>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        } // Else, need to wait for onRestoreInstanceState
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {

        val navGraphIds = listOf(
            R.navigation.main_from,
            R.navigation.main_great,
            R.navigation.main_idea,
            R.navigation.main_to,
            R.navigation.main_action)

        // Setup the bottom navigation view with a list of navigation graphs
        val controller = navigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navHostContainer,
            intent = intent
        )

        currentNavController = controller
    }
}
