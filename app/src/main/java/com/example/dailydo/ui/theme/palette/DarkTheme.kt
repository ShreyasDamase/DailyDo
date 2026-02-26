package com.example.dailydo.ui.theme.palette

 import androidx.compose.material3.darkColorScheme
 import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Auto-generated from dark.json
 * Palette: dark · DO NOT EDIT — regenerate from Token Studio
 */

// M3 Color Scheme

import com.example.dailydo.ui.theme.tokens.AppColors

val DarkColorScheme = darkColorScheme(

    // ── Brand ─────────────────────────────
    primary = AppColors.Pink500,
    onPrimary = AppColors.White,
    primaryContainer = AppColors.Slate800,
    onPrimaryContainer = AppColors.Pink500,

    secondary = AppColors.PinkBrand,
    onSecondary = AppColors.White,
    secondaryContainer = AppColors.Slate800,
    onSecondaryContainer = AppColors.PinkBrand,

    tertiary = AppColors.PinkBrand,
    onTertiary = AppColors.White,
    tertiaryContainer = AppColors.Slate900,
    onTertiaryContainer = AppColors.White,

    // ── Status ────────────────────────────
    error = AppColors.Rose500,
    onError = AppColors.White,
    errorContainer = AppColors.Slate900,
    onErrorContainer = AppColors.Rose500,

    // ── Background / Surface ──────────────
    background = AppColors.Slate950,
    onBackground = AppColors.White,

    surface = AppColors.Slate900,
    onSurface = AppColors.White,

    surfaceVariant = AppColors.Slate800,
    onSurfaceVariant = AppColors.Slate400,

    // ── Outline / Divider ─────────────────
    outline = AppColors.Slate800,
    outlineVariant = AppColors.Slate800,

    // ── Inverse ───────────────────────────
    inverseSurface = AppColors.White,
    inverseOnSurface = AppColors.Slate950,
    inversePrimary = AppColors.PinkBrand,

    // ── Material 3 extras ─────────────────
    surfaceTint = AppColors.Pink500,
    scrim = AppColors.Black,

    surfaceBright = AppColors.Slate800,
    surfaceDim = AppColors.Slate800,

    surfaceContainerLowest = AppColors.Slate950,
    surfaceContainerLow = AppColors.Slate800,
    surfaceContainer = AppColors.Slate900,
    surfaceContainerHigh = AppColors.Slate800,
    surfaceContainerHighest = AppColors.Slate900,
)
// Extended / Custom Colors
@Immutable
data class DarkExtendedColors(
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

val DarkExtended = DarkExtendedColors(
    success     = Color(0xFF22C55E),
    onSuccess   = Color(0xFF003910),
    warning     = Color(0xFFF59E0B),
    onWarning   = Color(0xFF2A1700),
    info        = Color(0xFF3B82F6),
    onInfo      = Color(0xFF001E31),
    cardPrimary = Color(0xFF0F172A),
    cardMuted   = Color(0xFF1E293B),
    cardAccent  = Color(0xFFF4257B),
)

val LocalDarkExtended = staticCompositionLocalOf { DarkExtended }

