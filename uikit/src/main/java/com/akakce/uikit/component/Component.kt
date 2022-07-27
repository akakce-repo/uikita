package com.akakce.uikit.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * @Author: Selim Simsek
 * @Date: 25.07.2022
 */


class AkakceUIComponent {
    @Composable
    fun Component(
        imageUrl: String,
        productName: String,
        cheaperText: String,
        percent: String,
        isDown: Boolean,
        price: String,
        countPrice: String,
        unitPrice: String,
        badgeText: String,
        onClick: Boolean
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .size(185.dp, 280.dp)
                .padding(all = 8.dp)
                .fillMaxWidth()
        ) {
            Box {
                Column {
                    AkakceUIProductImage().ProductImage(imageUrl)
                    AkakceUIProductName().ProductName(productName)
                    AkakceUIDiscountCell().DiscountCell(cheaperText, percent, isDown)
                    AkakceUIPriceCell().PriceCell(price, countPrice)
                    AkakceUIUnitPrice().UnitPrice(unitPrice)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    AkakceUIBadge().Badge(badgeText)
                    AkakceUIBell().Bell(onClick)

                }
            }

        }

    }
}