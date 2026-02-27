package com.example.dailydo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(
    isDark: Boolean, onToggleTheme: (Boolean) -> Unit
) {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Screen.Main.route)
    {
        composable(route = Screen.Main.route) {
            MainScreen(
                isDark = isDark,
                onToggleTheme = onToggleTheme
            )


        }

    }
}
