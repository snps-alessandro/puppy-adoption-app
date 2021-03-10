package it.alexs.puppyapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import it.alexs.puppyapp.nav.Navigation
import it.alexs.puppyapp.ui.theme.PuppyAdoptionTheme
import it.alexs.puppyapp.views.PuppiesList
import it.alexs.puppyapp.views.PuppyDetail

@Composable
fun NavPuppyApp(
    titleActivity: String
) {

    val navController = rememberNavController()

    PuppyAdoptionTheme {

        NavHost(navController = navController, startDestination = Navigation.PUPPIES_LIST) {

            composable(Navigation.PUPPIES_LIST) { PuppiesList(navController, titleActivity) }

            composable(
                Navigation.PUPPY_DETAIL.plus("/{puppyId}"),
                arguments = listOf(navArgument("puppyId") { type = NavType.LongType } )
            ) { backStackEntry ->
                PuppyDetail(backStackEntry.arguments?.getLong("puppyId")) }

        }
    }
}