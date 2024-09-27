package com.melika.rickandmorty.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.melika.rickandmorty.navigation.TopLevelDestination

@Composable
fun RickAndMortyBottomBar(
    topDestinations: List<TopLevelDestination>,
    currentDestination: NavDestination?,
    onTopDestinationClick: (TopLevelDestination) -> Unit,
) {
    MainNavigationBar(
        modifier = Modifier.fillMaxWidth()
    ) {
        topDestinations.forEach { destination ->
            val selected = currentDestination.isTopLevelDestinationInHierarchy(destination)
            NavigationBarItem(
                selected = selected,
                onDestinationClick = { onTopDestinationClick.invoke(destination) },
                icon = destination.icon,
                labelId = destination.titleTextId,
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun MainNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    NavigationBar(
        modifier = modifier,
        contentColor = MaterialTheme.colorScheme.onBackground,
        tonalElevation = 0.dp,
        content = content
    )
}

@Composable
private fun NavigationBarItem(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    @StringRes labelId: Int,
    selected: Boolean,
    onDestinationClick: () -> Unit,
) {
    Column(
        modifier = modifier.then(
            Modifier.clickable { onDestinationClick.invoke() }
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = stringResource(labelId),
            modifier = Modifier.size(24.dp),
            tint = if (selected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSecondary,
        )

        Spacer(Modifier.height(4.dp))

        Text(
            text = stringResource(labelId),
            color = if (selected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSecondary
        )
    }
}

private fun NavDestination?.isTopLevelDestinationInHierarchy(destination: TopLevelDestination) =
    this?.hierarchy?.any {
        it.route?.contains(destination.name, true) ?: false
    } ?: false