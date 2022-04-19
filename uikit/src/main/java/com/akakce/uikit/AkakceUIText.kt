package com.akakce.uikit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.akakce.uikit.ui.theme.AkakceTheme
import com.akakce.uikit.ui.theme.darkColors
import com.akakce.uikit.ui.theme.lightColors

class AkakceUIText : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkTheme: Boolean = isSystemInDarkTheme()
            val colors = if (darkTheme) darkColors() else lightColors()
            AkakceTheme(colors = colors) {
                @OptIn(ExperimentalUnitApi::class)
                @Composable
                fun setText(message: String, style: TextStyle) {
                    Text(
                        text = "$message",
                        letterSpacing = TextUnit(-0.2f, TextUnitType.Sp),
                        style = style,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }

        }
    }
}