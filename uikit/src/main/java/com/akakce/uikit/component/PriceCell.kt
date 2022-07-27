package com.akakce.uikit.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.*
import com.akakce.uikit.ui.theme.AkakceTheme

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

class AkakceUIPriceCell {
    @OptIn(ExperimentalUnitApi::class)
    @Composable
    fun PriceCell(price: String, countPrice: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = price,
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(9.dp, 0.dp, 7.dp, 0.dp),
                color = AkakceTheme.colors.akakceBlueGray600
            )
            Text(
                text = countPrice,
                style = MaterialTheme.typography.subtitle1,
                fontSize = 8.sp,
                color = AkakceTheme.colors.akakceBaseBlue,
                modifier = Modifier.padding(12.dp, 4.dp),
                letterSpacing = TextUnit(0.6f, TextUnitType.Sp)
            )
        }
    }
}