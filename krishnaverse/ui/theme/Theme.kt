package com.example.krishnaverse.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = BrownPrimary,
    background = CreamLight,
    surface = CreamLight,
    onSurface = Color(0xFF3E2723)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFD7CCC8),
    background = WarmDark,
    surface = DarkBrown,
    onSurface = Color(0xFFEDE7E3)
)
@Composable
fun KrishnaVerseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
