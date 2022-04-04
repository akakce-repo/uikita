package com.akakce.uikit.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
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
    Font(R.font.roboto_thin, FontWeight.W100),
    Font(R.font.roboto_thin_italic, FontWeight.W100, style = FontStyle.Italic),
    Font(R.font.roboto_light, FontWeight.W300),
    Font(R.font.roboto_light_italic, FontWeight.W300, style = FontStyle.Italic),
    Font(R.font.roboto_regular, FontWeight.W400),
    Font(R.font.roboto_medium, FontWeight.W500),
    Font(R.font.roboto_medium_italic, FontWeight.W500, style = FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.W700),
    Font(R.font.roboto_bold_italic, FontWeight.W700, style = FontStyle.Italic),
    Font(R.font.roboto_black, FontWeight.W900),
    Font(R.font.roboto_black_italic, FontWeight.W900, style = FontStyle.Italic),
)

val RHAkakceTypography = Typography(
    body2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(11F).sp
    ),
    body1 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(12.5F).sp
    ),
    subtitle2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(14.5F).sp
    ),
    subtitle1 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(16.3F).sp
    ),
    h6 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(18F).sp
    ),
    h5 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(20F).sp
    ),
    h4 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(21.5F).sp
    ),
    h3 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(23F).sp
    ),
    h2 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(24.5F).sp
    ),
    h1 = TextStyle(
        color = AkakceBlack,
        fontFamily = RHAkakceFonts,
        fontWeight = FontWeight.Normal,
        fontSize = getFontSize(26F).sp
    )
)


fun getFontSize(size: Float): Float {
    return ((size / fontScale) * fontScale)
}
