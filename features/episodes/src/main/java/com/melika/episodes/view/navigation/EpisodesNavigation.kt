import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val EPISODES_ROUTE = "episodes_route"

fun NavController.navigateToEpisodes(navOptions: NavOptions? = null) =
    navigate(EPISODES_ROUTE, navOptions)

fun NavGraphBuilder.episodesScreen() {
    composable(route = EPISODES_ROUTE) { }
}