package com.melika.rickandmorty.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.melika.characters.view.navigation.CHARACTERS_ROUTE
import com.melika.characters.view.navigation.charactersScreen
import com.melika.locations.view.navigation.locationsScreen
import episodesScreen


@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = CHARACTERS_ROUTE,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        charactersScreen()
        episodesScreen()
        locationsScreen()
    }
}