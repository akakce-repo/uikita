package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.akakce.uikit.R

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

@Composable
fun Bell() {
    val ellipse = 0
    val bell = 0
    Box {
        Image(
            painter = painterResource(id = ellipse),
            contentDescription = null,
            modifier = Modifier
                .size(38.dp)
                .padding(5.dp),  //avoid the oval shape ,
        )
        Image(
            painter = painterResource(id = bell),
            contentDescription = "content description",
            modifier = Modifier
                .padding(12.dp, 12.dp)
                .size(15.dp)
        )


    }
}