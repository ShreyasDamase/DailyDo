package com.example.dailydo.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.dailydo.ui.theme.foundation.AppShapes
import com.example.dailydo.ui.theme.foundation.AppTypography
import com.example.dailydo.ui.theme.palette.DarkTokens
import com.example.dailydo.ui.theme.palette.LightTokens
import com.example.dailydo.ui.theme.palette.LocalAppTokens

@Composable
fun DailyDoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalAppTokens provides if (darkTheme) DarkTokens else LightTokens
    ) {
        MaterialTheme(
            typography = AppTypography,
            shapes = AppShapes,
            content = content
        )
    }
}