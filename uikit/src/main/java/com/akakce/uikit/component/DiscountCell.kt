package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akakce.uikit.R
import com.akakce.uikit.ui.theme.AkakceTheme

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

class AkakceUIDiscountCell {
    @Composable
    fun DiscountCell(cheaperText: String, percent: String, isDown: Boolean) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = cheaperText,
                style = MaterialTheme.typography.subtitle2,
                fontSize = 9.sp,
                modifier = Modifier.padding(9.dp, 1.dp),
                fontWeight = FontWeight.Bold
            )
            if (isDown) {
                Image(
                    painter = painterResource(id = R.drawable.ic_downarrow),
                    contentDescription = null,
                    modifier = Modifier.padding(0.dp, 5.dp)
                )
            }

            Text(
                text = percent,
                style = MaterialTheme.typography.subtitle2,
                fontSize = 10.sp,
                color = AkakceTheme.colors.akakceBaseGreen,
                modifier = Modifier.padding(1.dp, 0.dp)
            )
        }
    }
}