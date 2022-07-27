package com.akakce.uikit.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @Author: Selim Simsek
 * @Date: 25.07.2022
 */

@Preview
@Composable
fun Component() {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .size(185.dp, 280.dp)
            .padding(all = 8.dp)
            .fillMaxWidth()
    ) {
        Box {
            Column {
                ProductImage()
                ProductName()
                DiscountCell()
                PriceCell()
                UnitPrice()
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Badge()
                Bell()

            }
        }

    }

}