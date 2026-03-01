package com.example.dailydo.ui.theme.palette

import com.example.dailydo.ui.theme.tokens.AppColors

// =====================
// DARK TOKEN MAPPING
// =====================
val DarkTokens = AppColorTokens(

    // ---------------------
    // BG
    // ---------------------
    bg = BgTokens(
        primary = AppColors.Slate950,
        secondary = AppColors.Slate900,
        tertiary = AppColors.Slate800,
        inverse = AppColors.White,
    ),

    // ---------------------
    // SURFACE
    // ---------------------
    surface = SurfaceTokens(
        default = AppColors.Slate900,
        raised = AppColors.Slate800,
        overlay = AppColors.Slate950,
        pressed = AppColors.Slate800,
        disabled = AppColors.Transparent,
    ),

    // ---------------------
    // TEXT
    // ---------------------
    text = TextTokens(
        primary = AppColors.White,
        secondary = AppColors.Slate400,
        tertiary = AppColors.Slate500,
        muted = AppColors.Slate600,
        disabled = AppColors.Transparent,
        inverse = AppColors.White,
        brand = AppColors.PinkBrand,
        darkPink = AppColors.Pink300,
        pinkLight = AppColors.Pink500,
    ),

    // ---------------------
    // BORDER
    // ---------------------
    border = BorderTokens(
        default = AppColors.Slate800,
        strong = AppColors.Slate700,
        muted = AppColors.Slate800,
        brand = AppColors.Pink500,
        disabled = AppColors.Transparent,
        error = AppColors.Transparent,
        light = AppColors.Slate800,
        inActive = AppColors.Slate800

    ),

    // ---------------------
    // ICON
    // ---------------------
    icon = IconTokens(
        primary = AppColors.Pink300,
        secondary = AppColors.Slate950, // bg.primary
        tertiary = AppColors.Slate800,
        dark = AppColors.PinkBrand,
        muted = AppColors.Slate600,
        disabled = AppColors.Transparent,
        inverse = AppColors.Transparent,
    ),

    // ---------------------
    // BRAND
    // ---------------------
    brand = BrandTokens(
        default = AppColors.Pink500,
        pressed = AppColors.PinkBrand,
        disabled = AppColors.Transparent,
        muted = AppColors.Slate800,
        light = AppColors.White,
    ),

    // ---------------------
    // STATUS
    // ---------------------
    status = StatusTokens(
        success = StatusPair(
            default = AppColors.Green400,
            muted = AppColors.Green600,
        ),
        error = StatusPair(
            default = AppColors.Rose500,
            muted = AppColors.Transparent,
        ),
        warning = StatusPair(
            default = AppColors.Amber400,
            muted = AppColors.Orange600,
        ),
        info = StatusPair(
            default = AppColors.Blue500,
            muted = AppColors.Blue600,
        ),
    ),

    // ---------------------
    // CARD
    // ---------------------
    card = CardTokens(
        primary = AppColors.Slate900,
        mute = AppColors.Slate800,
        dark = AppColors.PinkBrand,
    ),
)