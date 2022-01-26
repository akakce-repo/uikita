package com.akakce.uikit.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.akakce.uikit.R

private val fontScale = 14
private val h05Scale = (11 / fontScale) * fontScale
private val h1Scale = (12 / fontScale) * fontScale
private val h2Scale = (13 / fontScale) * fontScale
private val h3Scale = fontScale
private val h4Scale = (15 / fontScale) * fontScale
private val h5Scale = (16 / fontScale) * fontScale
private val h6Scale = (18 / fontScale) * fontScale
private val h7Scale = (24 / fontScale) * fontScale
private val h8Scale = (26 / fontScale) * fontScale
private val h9Scale = (28 / fontScale) * fontScale

val RHAkakceFonts = FontFamily(
    Font(R.font.times_new_roman,FontWeight.Normal),
    Font(R.font.times_new_roman_italic, FontWeight.W400,style= FontStyle.Italic)
)

val MHAkakceFonts = FontFamily(
    Font(R.font.times_new_roman,FontWeight.W700),
    Font(R.font.times_new_roman_bold, FontWeight.W700),
)

val RHAkakceTypography = Typography(
    h1 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h1Scale.sp
    ),
    h2 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h2Scale.sp),
    h3 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize =  h3Scale.sp),
    h4 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h4Scale.sp
    ),
    h5 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h5Scale.sp
    ),
    h6 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h6Scale.sp
    ),
    subtitle1 =  TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h7Scale.sp
    ),
    subtitle2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h8Scale.sp
    ),
    body1 = TextStyle(
        color = AkakceBlack,
        fontFamily =  RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h9Scale.sp
    ),
    body2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h05Scale.sp
    )
)

val BHAkakceTypography = Typography(
    h1 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h1Scale.sp
    ),
    h2 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h2Scale.sp),
    h3 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize =  h3Scale.sp),
    h4 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h4Scale.sp
    ),
    h5 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h5Scale.sp
    ),
    h6 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h6Scale.sp
    ),
    subtitle1 =  TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h7Scale.sp
    ),
    subtitle2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h8Scale.sp
    ),
    body1 = TextStyle(
        color = AkakceBlack,
        fontFamily =  RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h9Scale.sp
    ),
    body2 = TextStyle(
        color = AkakceBlack,
        fontFamily = MHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = h05Scale.sp,
    )
)
