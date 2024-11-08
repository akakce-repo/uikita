package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

class AkakceUIProductImage {
    @Composable
    fun ProductImage(imageUrl:String) {
        Image(
            painter = rememberImagePainter(imageUrl), contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .padding(9.dp, 15.dp, 9.dp, 0.dp)
                .size(180.dp, 165.dp)
                .fillMaxWidth()
        )
    }
}