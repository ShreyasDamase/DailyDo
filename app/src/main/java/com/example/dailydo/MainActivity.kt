package com.example.dailydo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.dailydo.ui.navigation.AppNavigation
import com.example.dailydo.ui.theme.DailyDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemePlayground()
        }
    }
}

/* ────────────────────────────────────────────── */
/* THEME PLAYGROUND */
/* ────────────────────────────────────────────── */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemePlayground() {
    var isDark by rememberSaveable { mutableStateOf(false) }

    DailyDoTheme(darkTheme = isDark) {
        AppNavigation(
            isDark = isDark,
            onToggleTheme = { isDark = it }
        )
    }
}
