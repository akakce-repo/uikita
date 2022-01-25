package com.akakce.uikit

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.akakce.uikit.ui.theme.RHAkakceTypography

class ToastMessage : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White).padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                setText(message = "Patlıcan", style = RHAkakceTypography.h1)
                setText(message = "Havuç", style = RHAkakceTypography.h2)
                setText(message = "Domates", style = RHAkakceTypography.h3)
                setText(message = "Salatalık", style = RHAkakceTypography.h4)
                setText(message = "Patates", style = RHAkakceTypography.h5)
                setText(message = "Sogan", style = RHAkakceTypography.h6)
            }
        }
    }


    @Composable
    fun setText(message: String, style: TextStyle) {
        Text(text = "$message", style = style)
    }
}