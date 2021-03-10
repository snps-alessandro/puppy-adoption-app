package it.alexs.puppyapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = orange700,
    primaryVariant = orange400,
    secondary = teal600,
    secondaryVariant = teal300,
    background = white50,
    surface = white50,
    onPrimary = black900,
    onSecondary = black900
)

private val LightColorPalette = lightColors(
    primary = orange400,
    primaryVariant = orange300,
    secondary = teal300,
    secondaryVariant = teal200,
    background = white50,
    surface = white50,
    onPrimary = black900,
    onSecondary = black900,
)

@Composable
fun PuppyAdoptionTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
