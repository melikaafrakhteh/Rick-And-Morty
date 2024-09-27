package com.melika.rickandmorty.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.melika.rickandmorty.navigation.AppNavHost

@Composable
fun RickAndMortyApp(
    appState: RickAndMortyAppState = rememberRickAndMortyAppState()
) {
    Scaffold(
        containerColor = Color.Transparent,
        contentColor = MaterialTheme.colorScheme.onBackground,
        bottomBar = {
            RickAndMortyBottomBar(
                topDestinations = appState.topLevelDestinations,
                onTopDestinationClick = appState::navigateToTopLevelDestination,
                currentDestination = appState.currentDestination
            )
        }
    ) { innerPadding ->
        Row(modifier = Modifier.fillMaxSize()) {
            AppNavHost(
                navController = appState.navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}