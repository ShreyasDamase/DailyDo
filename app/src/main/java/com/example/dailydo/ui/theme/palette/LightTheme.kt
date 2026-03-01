package com.example.dailydo.ui.theme.palette

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.example.dailydo.ui.theme.tokens.AppColors

// =====================
// ROOT TOKEN CONTAINER
// =====================
@Immutable
data class AppColorTokens(
    val bg: BgTokens,
    val surface: SurfaceTokens,
    val text: TextTokens,
    val border: BorderTokens,
    val icon: IconTokens,
    val brand: BrandTokens,
    val status: StatusTokens,
    val card: CardTokens,
)

// ---------------------
// BG
// ---------------------
@Immutable
data class BgTokens(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val inverse: Color,
)

// ---------------------
// SURFACE
// ---------------------
@Immutable
data class SurfaceTokens(
    val default: Color,
    val raised: Color,
    val overlay: Color,
    val pressed: Color,
    val disabled: Color,
)

// ---------------------
// TEXT
// ---------------------
@Immutable
data class TextTokens(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val muted: Color,
    val disabled: Color,
    val inverse: Color,
    val brand: Color,
    val darkPink: Color,
    val pinkLight: Color,
)

// ---------------------
// BORDER
// ---------------------
@Immutable
data class BorderTokens(
    val default: Color,
    val strong: Color,
    val muted: Color,
    val brand: Color,
    val disabled: Color,
    val error: Color,
    val light: Color,
    val inActive: Color,
)

// ---------------------
// ICON
// ---------------------
@Immutable
data class IconTokens(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val dark: Color,
    val muted: Color,
    val disabled: Color,
    val inverse: Color,
)

// ---------------------
// BRAND
// ---------------------
@Immutable
data class BrandTokens(
    val default: Color,
    val pressed: Color,
    val disabled: Color,
    val muted: Color,
    val light: Color,
)

// ---------------------
// STATUS
// ---------------------
@Immutable
data class StatusTokens(
    val success: StatusPair,
    val error: StatusPair,
    val warning: StatusPair,
    val info: StatusPair,
)

@Immutable
data class StatusPair(
    val default: Color,
    val muted: Color,
)

// ---------------------
// CARD
// ---------------------
@Immutable
data class CardTokens(
    val primary: Color,
    val mute: Color,
    val dark: Color,
)

// =====================
// LIGHT TOKEN MAPPING
// =====================
val LightTokens = AppColorTokens(

    bg = BgTokens(
        primary = AppColors.White,
        secondary = AppColors.Pink50,
        tertiary = AppColors.Slate100,
        inverse = AppColors.Slate900,
    ),

    surface = SurfaceTokens(
        default = AppColors.White,
        raised = AppColors.White,
        overlay = AppColors.Slate900,
        pressed = AppColors.Pink50,
        disabled = AppColors.Transparent,
    ),

    text = TextTokens(
        primary = AppColors.Black,
        secondary = AppColors.Slate900,
        tertiary = AppColors.Slate500,
        muted = AppColors.Slate400,
        disabled = AppColors.Transparent,
        inverse = AppColors.White,
        brand = AppColors.PinkBrand,
        darkPink = AppColors.Pink900,
        pinkLight = AppColors.Pink300,
    ),

    border = BorderTokens(
        default = AppColors.Slate100,
        strong = AppColors.Slate200,
        muted = AppColors.Pink50Soft,
        brand = AppColors.Pink500,
        disabled = AppColors.Transparent,
        error = AppColors.Transparent,
        light = AppColors.Pink50Soft,
        inActive = AppColors.Pink50Alt
    ),

    icon = IconTokens(
        primary = AppColors.Pink300,
        secondary = AppColors.White,
        tertiary = AppColors.Pink50,
        dark = AppColors.PinkBrand,
        muted = AppColors.Slate400,
        disabled = AppColors.Transparent,
        inverse = AppColors.Transparent,
    ),

    brand = BrandTokens(
        default = AppColors.Pink500,
        pressed = AppColors.Pink300,
        disabled = AppColors.Transparent,
        muted = AppColors.Pink50,
        light = AppColors.White,
    ),

    status = StatusTokens(
        success = StatusPair(AppColors.Green500, AppColors.Green100),
        error = StatusPair(AppColors.Rose500, AppColors.Transparent),
        warning = StatusPair(AppColors.Amber400, AppColors.Orange100),
        info = StatusPair(AppColors.Blue500, AppColors.Blue100),
    ),

    card = CardTokens(
        primary = AppColors.Pink50,
        mute = AppColors.White,
        dark = AppColors.PinkBrand,
    ),
)

val LocalAppTokens = staticCompositionLocalOf { LightTokens }