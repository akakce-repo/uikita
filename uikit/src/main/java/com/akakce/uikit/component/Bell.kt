package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.akakce.uikit.R

/**
 * @Author: Selim Simsek
 * @Date: 27.07.2022
 */

class AkakceUIBell {
    var isClick = false

    @Composable
    fun Bell(onClick: Boolean) {

        val clickable = remember {
            mutableStateOf(onClick)
        }

        Box {
            Box(modifier = Modifier.padding(0.dp, 2.dp)) {
                OutlinedButton(
                    shape = RoundedCornerShape(
                        20.dp,
                        20.dp,
                        20.dp,
                        20.dp
                    ),
                    modifier = Modifier
                        .size(41.dp)
                        .padding(4.dp),
                    onClick = { clickable.value = !clickable.value }
                ) {}
                if (clickable.value){
                    Image(
                        painter = painterResource(
                            id = R.drawable.ic_follow

                        ),
                        contentDescription = "content description",
                        modifier = Modifier
                            .padding(11.dp, 11.dp)
                            .size(20.dp)
                    )
                    isClick = true
                }else{
                    Image(
                        painter = painterResource(
                            id = R.drawable.ic_follow

                        ),
                        contentDescription = "content description",
                        modifier = Modifier
                            .padding(11.dp, 11.dp)
                            .size(20.dp)
                    )
                    isClick = false
                }
            }

        }
    }
}