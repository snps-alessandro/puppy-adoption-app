package it.alexs.puppyapp.views

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import it.alexs.puppyapp.composable.ListsOfPuppy
import it.alexs.puppyapp.composable.PuppyTopBar
import it.alexs.puppyapp.utils.PuppyUtils

@Composable
fun PuppiesList(
    navController: NavController,
    titleActivity: String) {

    // A surface container using the 'background' color from the theme
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            topBar = { PuppyTopBar(title = titleActivity) }
            , content = {
                ListsOfPuppy(
                    puppies = PuppyUtils.getPuppies(),
                    modifier = Modifier
                        .height(180.dp)
                        .fillMaxWidth(),
                    navController
                ) }
        )
    }
}