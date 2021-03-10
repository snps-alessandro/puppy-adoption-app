package it.alexs.puppyapp.views

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import it.alexs.puppyapp.composable.HeaderPuppyImageCard
import it.alexs.puppyapp.composable.PuppyTopBar
import it.alexs.puppyapp.composable.SubtitleOfPuppyContent
import it.alexs.puppyapp.composable.TitleOfPuppyContent
import it.alexs.puppyapp.model.Puppy
import it.alexs.puppyapp.utils.PuppyUtils

@ExperimentalAnimationApi
@Composable
fun PuppyDetail(
    puppyId: Long?
) {

    puppyId?.let { id ->
        val puppy = PuppyUtils.getPuppies().filter { it.puppyId == id }.getOrNull(0)

        puppy?.let {
            ShowPuppyDetail(it)
        } ?: run {
            ShowPuppyError()
        }

    }
}

@Composable
fun ShowPuppyError() {
    Scaffold(
        topBar = { PuppyTopBar(title = "Error") }
        , content = { Text(text = "Puppy not found") }
    )

}

@Composable
fun ShowPuppyDetail(puppy: Puppy) {
    Scaffold(
        topBar = { PuppyTopBar(title = "Puppy detail") }
        , content = { PuppyDetailContent(puppy) }
    )
}

@Composable
fun PuppyDetailContent(puppy: Puppy) {
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        HeaderPuppyImageCard(drawableRes = puppy.puppyImage, modifier = Modifier
            .height(180.dp)
            .fillMaxWidth())

        TitleOfPuppyContent(text = puppy.puppyName)

        SubtitleOfPuppyContent(text = puppy.puppyDescription)
    }
}
