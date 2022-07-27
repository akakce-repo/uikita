package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
            Image(
                painter = painterResource(id = R.drawable.ic_badge),
                contentDescription = null,
                modifier = Modifier
                    .size(104.dp, 38.dp)
                    .padding(0.dp, 9.dp),
            )
            Text(
                text = badgeText,
                modifier = Modifier.padding(6.dp, 12.dp),
                color = AkakceTheme.colors.akakceBasePurple,
                fontSize = 9.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = TextUnit(0.3f, TextUnitType.Sp)
            )

        }
    }
}