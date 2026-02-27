package com.example.dailydo.ui.navigation

import android.icu.text.CaseMap
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route : String,val icon: ImageVector? ,var title: String) {
    object Main : Screen("Home", Icons.Rounded.Home, "Home")
    object Discover : Screen("Discover", Icons.Rounded.Search, "Discover")
    object Create : Screen("Create", Icons.Rounded.Add, "Create")

}