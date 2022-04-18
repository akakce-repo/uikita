package com.akakce.uikit.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember

object AkakceTheme {

    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: RHAkakceTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

}

@Composable
fun AkakceTheme(
    colors: AppColors = AkakceTheme.colors,
    typography: RHAkakceTypography = AkakceTheme.typography,
    content: @Composable () -> Unit
) {
    val darkTheme: Boolean = isSystemInDarkTheme()
    val colors = if (darkTheme) darkColors() else lightColors()
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography
    ) {
        content()
    }
}