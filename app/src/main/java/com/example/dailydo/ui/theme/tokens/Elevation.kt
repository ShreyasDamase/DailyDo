package com.example.dailydo.ui.theme.tokens

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Auto-generated from core.json
 * DO NOT EDIT — regenerate from Token Studio
 *
 * Usage in Compose:
 *   Surface(shadowElevation = Elevation.Md)   // drop-shadow
 *   Surface(tonalElevation  = Elevation.Md)   // tonal color shift (M3)
 *   Card(elevation = CardDefaults.cardElevation(defaultElevation = Elevation.Sm))
 */

// ── Token-derived elevations ─────────────────────────────
object Elevation {
    val Sm           = 2.dp   // blur 2px → nearest M3 level: 1.dp
    val Md           = 6.dp   // blur 6px → nearest M3 level: 3.dp
    val Lg           = 15.dp   // blur 15px → nearest M3 level: 8.dp
    val Xl           = 25.dp   // blur 25px → nearest M3 level: 12.dp

    // ── M3 canonical tonal-elevation levels ─────────────
    // Source: androidx.compose.material3.tokens.ElevationTokens
    // Use these for consistent M3 surface tinting:
    // Surface(tonalElevation = Elevation.Level2) // e.g. NavigationBar
    val Level0 = 0.dp    // Flat: filled buttons, outlined cards
    val Level1 = 1.dp    // Elevated: cards, bottom sheets
    val Level2 = 3.dp    // Navigation bar, menus
    val Level3 = 6.dp    // FAB, dialogs
    val Level4 = 8.dp    // Hover states
    val Level5 = 12.dp   // Extended hover / top app bar scrolled
}

// ── Shadow → M3 level mapping reference ────────────────
// Elevation.Sm (2.dp) → use Elevation.Level1 (1.dp) for M3 tonal surfaces
// Elevation.Md (6.dp) → use Elevation.Level2 (3.dp) for M3 tonal surfaces
// Elevation.Lg (15.dp) → use Elevation.Level4 (8.dp) for M3 tonal surfaces
// Elevation.Xl (25.dp) → use Elevation.Level5 (12.dp) for M3 tonal surfaces