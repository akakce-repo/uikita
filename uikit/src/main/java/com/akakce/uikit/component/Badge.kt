package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import com.akakce.uikit.R
import com.akakce.uikit.ui.theme.AkakceTheme

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

class AkakceUIBadge {
    @OptIn(ExperimentalUnitApi::class)
    @Composable
    fun Badge(badgeText: String) {
        Box {
            OutlinedButton(
                shape = RoundedCornerShape(
                    0.dp,
                    25.dp,
                    25.dp,
                    0.dp),
                modifier = Modifier
                    .padding(0.dp, 8.dp)
                    .size(120.dp, 25.dp),
                onClick = {}
            ){}
            Text(
                text = "BROŞÜRDE EN UCUZ",
                modifier = Modifier.padding(6.dp, 15.dp),
                color = AkakceTheme.colors.akakceBasePurple,
                fontSize = 9.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = TextUnit(0.4f, TextUnitType.Sp)
            )

        }
    }
}