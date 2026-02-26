package com.example.dailydo.ui.theme.palette

 import androidx.compose.material3.lightColorScheme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Auto-generated from light.json
 * Palette: light · DO NOT EDIT — regenerate from Token Studio
 */

// M3 Color Scheme
 import com.example.dailydo.ui.theme.tokens.AppColors

val LightColorScheme = lightColorScheme(

    // ── Brand ─────────────────────────────
    primary = AppColors.Pink500,
    onPrimary = AppColors.White,
    primaryContainer = AppColors.Pink50,
    onPrimaryContainer = AppColors.Pink500,

    secondary = AppColors.PinkBrand,
    onSecondary = AppColors.White,
    secondaryContainer = AppColors.Pink50,
    onSecondaryContainer = AppColors.PinkBrand,

    tertiary = AppColors.PinkBrand,
    onTertiary = AppColors.White,
    tertiaryContainer = AppColors.Pink50,
    onTertiaryContainer = AppColors.Black,

    // ── Status ────────────────────────────
    error = AppColors.Rose500,
    onError = AppColors.White,
    errorContainer = AppColors.Pink50,
    onErrorContainer = AppColors.Rose500,

    // ── Background / Surface ──────────────
    background = AppColors.White,
    onBackground = AppColors.Black,

    surface = AppColors.White,
    onSurface = AppColors.Black,

    surfaceVariant = AppColors.White,
    onSurfaceVariant = AppColors.Slate900,

    // ── Outline / Divider ─────────────────
    outline = AppColors.Slate100,
    outlineVariant = AppColors.Pink50Soft,

    // ── Inverse ───────────────────────────
    inverseSurface = AppColors.Slate900,
    inverseOnSurface = AppColors.White,
    inversePrimary = AppColors.Pink300,

    // ── Material 3 extras ─────────────────
    surfaceTint = AppColors.Pink500,
    scrim = AppColors.Black,

    surfaceBright = AppColors.White,
    surfaceDim = AppColors.Slate100,

    surfaceContainerLowest = AppColors.White,
    surfaceContainerLow = AppColors.Slate100,
    surfaceContainer = AppColors.White,
    surfaceContainerHigh = AppColors.White,
    surfaceContainerHighest = AppColors.Pink50,
)
// Extended / Custom Colors
@Immutable
data class LightExtendedColors(
    val success:         Color,
    val onSuccess:       Color,
    val warning:         Color,
    val onWarning:       Color,
    val info:            Color,
    val onInfo:          Color,
    val cardPrimary:     Color,
    val cardMuted:       Color,
    val cardAccent:      Color,
)

val LightExtended = LightExtendedColors(
    success     = Color(0xFF10B981),
    onSuccess   = Color.White,
    warning     = Color(0xFFF59E0B),
    onWarning   = Color.White,
    info        = Color(0xFF3B82F6),
    onInfo      = Color.White,
    cardPrimary = Color(0xFFFDF2F8),
    cardMuted   = Color(0xFFFFFFFF),
    cardAccent  = Color(0xFFF4257B),
)

val LocalLightExtended = staticCompositionLocalOf { LightExtended }
