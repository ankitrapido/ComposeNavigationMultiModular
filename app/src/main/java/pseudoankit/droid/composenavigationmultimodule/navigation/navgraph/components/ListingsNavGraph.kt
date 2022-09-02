package pseudoankit.droid.composenavigationmultimodule.navigation.navgraph.components

import com.ramcosta.composedestinations.spec.NavGraphSpec
import pseudoankit.droid.detail.presentation.destinations.DetailScreenDestination
import pseudoankit.droid.listings.destinations.ShowListingsDestination

object ListingsNavGraph : NavGraphSpec {

    override val route = "listings"

    override val startRoute = ShowListingsDestination

    override val destinationsByRoute = listOf(
        ShowListingsDestination,
        DetailScreenDestination
    ).associateBy { it.route }

}