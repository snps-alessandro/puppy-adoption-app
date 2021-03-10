package it.alexs.puppyapp.composable

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun PuppyTopBar(title: String) {
    TopAppBar( title = { Text(text = title) } )
}