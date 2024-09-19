package com.melika.rickandmorty.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import com.melika.rickandmorty.R
import com.melika.rickandmorty.icon.Character
import com.melika.rickandmorty.icon.Episode
import com.melika.rickandmorty.icon.Location

enum class TopLevelDestination(
    val icon: ImageVector,
    val titleTextId: Int
) {
    CHARACTERS(
        icon = Icons.Character,
        titleTextId = R.string.nav_character_title,
    ),
    EPISODES(
        icon = Icons.Episode,
        titleTextId = R.string.nav_episode_title,
    ),
    LOCATION(
        icon = Icons.Location,
        titleTextId = R.string.nav_location_title,
    )
}
