package com.akakce.uikit

import androidx.activity.ComponentActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

class AkakceUIText : ComponentActivity() {

    @Composable
    fun setText(message: String, style: TextStyle) {
        Text(text = "$message",style= style,modifier =Modifier.padding(4.dp))
    }
}