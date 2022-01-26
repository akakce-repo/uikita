package com.akakce.uikit.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.akakce.uikit.R

private val fontScale: Float = 14F

val RHAkakceFonts = FontFamily(
    Font(R.font.times_new_roman,FontWeight.W400),
    Font(R.font.times_new_roman_italic, FontWeight.W400,style= FontStyle.Italic) ,
    Font(R.font.times_new_roman_bold, FontWeight.W700),
)

val RHAkakceTypography = Typography(
    h1 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(12F).sp
    ),
    h2 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(13F).sp
    ),
    h3 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize =  getFontSize(14F).sp
    ),
    h4 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(15F).sp
    ),
    h5 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(16F).sp
    ),
    h6 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(18F).sp
    ),
    subtitle1 =  TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(24F).sp
    ),
    subtitle2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(26F).sp
    ),
    body1 = TextStyle(
        color = AkakceBlack,
        fontFamily =  RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(28F).sp
    ),
    body2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(11F).sp
    )
)

val BHAkakceTypography = Typography(
    h1 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(12F).sp
    ),
    h2 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(13F).sp
    ),
    h3 = TextStyle(
        color= AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize =  getFontSize(14F).sp
    ),
    h4 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(15F).sp
    ),
    h5 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(16F).sp
    ),
    h6 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(18F).sp
    ),
    subtitle1 =  TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(24F).sp
    ),
    subtitle2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(26F).sp
    ),
    body1 = TextStyle(
        color = AkakceBlack,
        fontFamily =  RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(28F).sp
    ),
    body2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Bold,
        fontSize = getFontSize(11F).sp
    )
)

fun getFontSize(size: Float):Float{
    return ((size / fontScale) * fontScale)
}
