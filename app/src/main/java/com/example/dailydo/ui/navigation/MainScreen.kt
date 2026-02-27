package com.example.dailydo.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dailydo.ui.screens.HomeScreen
import com.example.dailydo.ui.theme.palette.LocalAppTokens

// --------------------------------------------------
// MAIN SCREEN
// --------------------------------------------------
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun MainScreen(    isDark: Boolean, onToggleTheme: (Boolean) -> Unit
) {
    val navController = rememberNavController()
    val tokens = LocalAppTokens.current

    Scaffold(
        bottomBar = {
            Box {
                BottomNavigationBar(navController)

                // top divider
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(tokens.border.light)
                        .align(Alignment.TopCenter)
                        .zIndex(1f)
                )
            }
        },
        floatingActionButton = {
            CenterFab(
                modifier = Modifier.offset(y = 40.dp),
                onClick = {
                    navController.navigate(Screen.Create.route)
                }
            )
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        NavHost(
            navController = navController,
            startDestination = Screen.Main.route
        ) {
            composable(Screen.Main.route) {
                HomeScreen(isDark,onToggleTheme)
            }
            composable(Screen.Create.route) {
                Text("Create", color = tokens.text.primary)
            }
            composable(Screen.Discover.route) {
                Text("Discover", color = tokens.text.primary)
            }
        }
    }
}

// --------------------------------------------------
// CENTER FAB
// --------------------------------------------------
@Composable
fun CenterFab(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val tokens = LocalAppTokens.current

    Box(
        modifier = modifier
            .size(56.dp)
            .dropShadow(
                shape = CircleShape,
                shadow = Shadow(
                    radius = 10.dp,
                    spread = 1.dp,
                    color = tokens.brand.default,
                    offset = DpOffset(0.dp, 10.dp)
                )
            )
            .clip(CircleShape),
        contentAlignment = Alignment.Center
    ) {
        FloatingActionButton(
            onClick = onClick,
            containerColor = tokens.surface.raised,
            shape = CircleShape,
            elevation = FloatingActionButtonDefaults.elevation(50.dp),
        ) {
            Icon(
                imageVector = Icons.Rounded.Add,
                contentDescription = "Add",
                modifier = Modifier.size(30.dp),
                tint = tokens.icon.dark
            )
        }
    }
}

// --------------------------------------------------
// BOTTOM NAVIGATION BAR
// --------------------------------------------------
@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val tokens = LocalAppTokens.current

    val items = listOf(
        Screen.Main, Screen.Main,
        Screen.Discover, Screen.Discover
    )

    NavigationBar(
        containerColor = tokens.surface.default
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { screen ->
            val selected = currentRoute == screen.route

            NavigationBarItem(
                selected = selected,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(Screen.Main.route) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    screen.icon?.let {
                        Icon(
                            imageVector = it,
                            contentDescription = screen.title
                        )
                    }
                },
                label = {
                    Text(
                        text = screen.title,
                        color = if (selected)
                            tokens.text.brand
                        else
                            tokens.text.muted
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = tokens.icon.dark,
                    unselectedIconColor = tokens.icon.muted,
                    indicatorColor = tokens.surface.pressed
                )
            )
        }
    }
}