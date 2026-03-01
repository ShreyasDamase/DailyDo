package com.example.dailydo.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Search
import com.example.dailydo.R

sealed class Screen(val route: String, val icon: Int, var title: String) {
    object Main : Screen("Home", R.drawable.home, "Home")
    object Discover : Screen("Discover", R.drawable.discover, "Discover")
    object Saved : Screen("Saved", R.drawable.save, "Saved")

    object Create : Screen("Create", R.drawable.save, "Create")
    object Profile : Screen("Profile", R.drawable.profile, "Profile")


}