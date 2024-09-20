package com.example.locations.view.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val LOCATIONS_ROUTE = "locations_route"

fun NavController.navigateToLocations(navOptions: NavOptions? = null) =
    navigate(LOCATIONS_ROUTE, navOptions)

fun NavGraphBuilder.locationsScreen() {
    composable(route = LOCATIONS_ROUTE) { }
}