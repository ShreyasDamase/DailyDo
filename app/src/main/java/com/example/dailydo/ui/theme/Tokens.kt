package com.example.dailydo.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.example.dailydo.ui.theme.palette.AppColorTokens
import com.example.dailydo.ui.theme.palette.LocalAppTokens

object Tokens {

    val colors: AppColorTokens
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTokens.current
}