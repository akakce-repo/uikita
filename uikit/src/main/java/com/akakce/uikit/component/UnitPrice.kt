package com.akakce.uikit.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akakce.uikit.ui.theme.AkakceTheme

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

class AkakceUIUnitPrice{
    @Composable
    fun UnitPrice(unitPrice: String) {
        Text(
            text = unitPrice,
            modifier = Modifier.padding(9.dp, 0.dp),
            color = AkakceTheme.colors.akakceBasePurple,
            fontSize = 10.sp
        )
    }
}