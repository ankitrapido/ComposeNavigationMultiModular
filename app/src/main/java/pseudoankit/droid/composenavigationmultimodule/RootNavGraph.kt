package pseudoankit.droid.composenavigationmultimodule

import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.ramcosta.composedestinations.spec.Route
import pseudoankit.droid.listings.ListingsNavGraph
import pseudoankit.droid.onboarding.OnboardingNavGraph

object RootNavGraph : NavGraphSpec {

    override val destinationsByRoute: Map<String, DestinationSpec<*>>
        get() = emptyMap()

    override val route: String
        get() = "root"

    override val startRoute: Route
        get() = ListingsNavGraph

    override val nestedNavGraphs: List<NavGraphSpec>
        get() = listOf(
            OnboardingNavGraph, ListingsNavGraph
        )
}