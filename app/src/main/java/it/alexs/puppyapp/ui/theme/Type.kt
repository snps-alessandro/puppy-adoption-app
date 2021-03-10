package it.alexs.puppyapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import it.alexs.puppyapp.R

// Set of Material typography styles to start with

val fira = FontFamily(
    Font(R.font.firasans_regular),
    Font(R.font.firasans_medium, FontWeight.W500)
)

val typography = Typography(defaultFontFamily = fira)
