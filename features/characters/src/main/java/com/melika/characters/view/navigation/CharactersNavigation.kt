package com.melika.characters.view.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.melika.characters.view.CharactersRoute

const val CHARACTERS_ROUTE = "characters_route"


fun NavController.navigateToCharacters(navOptions: NavOptions? = null) =
    navigate(CHARACTERS_ROUTE, navOptions)


fun NavGraphBuilder.charactersScreen() {
    composable(route = CHARACTERS_ROUTE) {
        CharactersRoute()
    }
}