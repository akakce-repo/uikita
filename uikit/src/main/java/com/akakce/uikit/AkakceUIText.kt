package com.akakce.uikit

import androidx.activity.ComponentActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

class AkakceUIText : ComponentActivity() {

    @Composable
    fun setText(message: String, style: TextStyle) {
        Text(text = "$message",style= style)
    }
}