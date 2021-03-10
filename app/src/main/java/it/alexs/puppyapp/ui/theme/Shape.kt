package it.alexs.puppyapp.ui.theme

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

val shapesCardPuppy = Shapes(medium = RoundedCornerShape(
    topStart = 32.dp,
    bottomEnd = 32.dp,
    bottomStart = 0.dp,
    topEnd = 0.dp
))
