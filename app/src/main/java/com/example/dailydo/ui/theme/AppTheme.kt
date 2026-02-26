package com.example.dailydo.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.dailydo.ui.theme.foundation.AppShapes
import com.example.dailydo.ui.theme.foundation.AppTypography
import com.example.dailydo.ui.theme.palette.DarkColorScheme
import com.example.dailydo.ui.theme.palette.LightColorScheme


@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}