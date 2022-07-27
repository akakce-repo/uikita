package com.akakce.uikit.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

@Composable
fun UnitPrice() {
    val unitPrice = ""
    Text(
        text = unitPrice,
        modifier = Modifier.padding(9.dp, 3.dp),
        color = Color.Blue,
        fontSize = 10.sp
    )
}