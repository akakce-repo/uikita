package com.akakce.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.akakce.uikit.R
import com.akakce.uikit.ui.theme.AkakceTheme

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
        Box(
            modifier = Modifier
                .size(205.dp, 290.dp)
                .padding(all = 8.dp)
                .fillMaxWidth()
        ) {
            Column {
                Image(
                    painter = rememberImagePainter(imageUrl), contentDescription = null,
                    contentScale = ContentScale.Inside,
                    modifier = Modifier
                        .padding(9.dp, 15.dp, 9.dp, 0.dp)
                        .size(180.dp, 165.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = productName,
                    modifier = Modifier.padding(9.dp, 0.dp),
                    color = AkakceTheme.colors.akakceBlueGray500,
                    fontSize = 13.sp,
                    maxLines = 2
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = cheaperText,
                        style = MaterialTheme.typography.subtitle2,
                        fontSize = 9.sp,
                        modifier = Modifier.padding(9.dp, 1.dp),
                        fontWeight = FontWeight.Bold,
                        color = AkakceTheme.colors.akakceBlueGray600
                    )
                    if (isDown) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_downarrow),
                            contentDescription = null,
                            modifier = Modifier.padding(0.dp, 4.dp)
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
                        fontSize = 10.sp,
                        color = AkakceTheme.colors.akakceBaseBlue,
                        modifier = Modifier.padding(12.dp, 4.dp)
                    )
                }
                Text(
                    text = unitPrice,
                    modifier = Modifier.padding(9.dp, 0.dp),
                    color = AkakceTheme.colors.akakceBasePurple,
                    fontSize = 10.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
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
                        fontWeight = FontWeight.Bold
                    )

                }
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.ic_ellipse),
                        contentDescription = null,
                        modifier = Modifier
                            .size(38.dp)
                            .padding(5.dp),  //avoid the oval shape ,
                    )
                    Image(
                        painter = painterResource(
                            id = if (onClick) {
                                R.drawable.ic_follow
                            } else {
                                R.drawable.ic_unfollow
                            }
                        ),
                        contentDescription = "content description",
                        modifier = Modifier
                            .padding(12.dp, 12.dp)
                            .size(15.dp)
                    )


                }

            }
        }

    }

}
