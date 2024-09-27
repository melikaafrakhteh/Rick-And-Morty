package com.melika.rickandmorty.ui

import EPISODES_ROUTE
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.melika.characters.view.navigation.CHARACTERS_ROUTE
import com.melika.characters.view.navigation.navigateToCharacters
import com.melika.locations.view.navigation.LOCATIONS_ROUTE
import com.melika.locations.view.navigation.navigateToLocations
import com.melika.rickandmorty.navigation.TopLevelDestination
import navigateToEpisodes

@Stable
class RickAndMortyAppState(
    val navController: NavHostController
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            CHARACTERS_ROUTE -> TopLevelDestination.CHARACTERS
            EPISODES_ROUTE -> TopLevelDestination.EPISODES
            LOCATIONS_ROUTE -> TopLevelDestination.LOCATIONS
            else -> null
        }

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelNavOption = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }

            launchSingleTop = true
            restoreState = true
        }

        when (topLevelDestination) {
            TopLevelDestination.CHARACTERS -> navController.navigateToCharacters(topLevelNavOption)
            TopLevelDestination.EPISODES -> navController.navigateToEpisodes(topLevelNavOption)
            TopLevelDestination.LOCATIONS -> navController.navigateToLocations(topLevelNavOption)
        }
    }

    fun onBackClick() = navController.popBackStack()
}


@Composable
fun rememberRickAndMortyAppState(
    navController: NavHostController = rememberNavController()
): RickAndMortyAppState {
    return remember(navController) {
        RickAndMortyAppState(navController)
    }
}