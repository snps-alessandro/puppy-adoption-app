package it.alexs.puppyapp.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import it.alexs.puppyapp.model.Puppy
import it.alexs.puppyapp.nav.Navigation
import it.alexs.puppyapp.ui.theme.shapesCardPuppy


@Composable
fun ListsOfPuppy(
    puppies: List<Puppy>
    , modifier: Modifier
    , navController: NavController) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(puppies) { puppy ->
            PuppyColumn(puppy = puppy, modifier, navController)
        }
    }

}

@Composable
fun PuppyColumn(
    puppy: Puppy
    , modifier: Modifier
    , navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
            .clickable(onClick = {
                navController.navigate(Navigation.PUPPY_DETAIL.plus("/${puppy.puppyId}"))
            })
            .fillMaxWidth()
    ) {
        Card(
            elevation = 4.dp,
            shape = shapesCardPuppy.medium
            , backgroundColor = MaterialTheme.colors.secondary
        ) {
            Column {
                HeaderPuppyImageCard(drawableRes = puppy.puppyImage, modifier = modifier)

                TitleOfPuppyContent(text = puppy.puppyName)

                SubtitleOfPuppyContent(text = puppy.puppyDescription)

                PuppyButton(text = "Detail", onClick = {
                    navController.navigate(Navigation.PUPPY_DETAIL.plus("/${puppy.puppyId}"))
                } )
            }

        }

    }
}

@Composable
fun HeaderPuppyImageCard(
    contentDescription: String = "",
    @DrawableRes drawableRes: Int,
    modifier: Modifier
) {
    Image(
        painter = painterResource(id = drawableRes)
        , contentDescription = contentDescription
        , modifier = modifier
        , contentScale = ContentScale.Crop)
}

@Composable
fun TitleOfPuppyContent(
    text: String,
    style: TextStyle = MaterialTheme.typography.h4
) {
    Text(text = text, modifier = Modifier.padding(4.dp), style = style)
}

@Composable
fun SubtitleOfPuppyContent(
    text: String
    , style: TextStyle = MaterialTheme.typography.subtitle1
) {
    Text(
        text = text
        , modifier = Modifier.padding(4.dp)
        , style = style
        , maxLines = 5
        , overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun PuppyButton(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(text = text)
    }
}