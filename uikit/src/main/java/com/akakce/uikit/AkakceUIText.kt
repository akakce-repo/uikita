package com.akakce.uikit

import androidx.activity.ComponentActivity
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

class AkakceUIText : ComponentActivity() {
    @OptIn(ExperimentalUnitApi::class)
    @Composable
    fun setText(message: String, style: TextStyle) {
        Text(
            text = "$message",
            letterSpacing = TextUnit(-0.2f, TextUnitType.Sp),
            style = style,
            modifier = Modifier.padding(8.dp),
            color = AkakceTheme.colors.akakceBlueGray600
        )
    }
}
