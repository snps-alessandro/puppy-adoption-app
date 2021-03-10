package it.alexs.puppyapp.model

import androidx.annotation.DrawableRes

data class Puppy(
    val puppyId: Long,
    val puppyName: String,
    val puppyDescription: String,
    val puppyAge: String,
    @DrawableRes val puppyImage: Int
)
