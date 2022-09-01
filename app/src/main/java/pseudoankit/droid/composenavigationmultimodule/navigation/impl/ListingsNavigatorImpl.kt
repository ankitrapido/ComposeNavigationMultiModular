package pseudoankit.droid.composenavigationmultimodule.navigation.impl

import androidx.navigation.NavController
import com.ramcosta.composedestinations.navigation.navigateTo
import pseudoankit.droid.listings.destinations.DetailScreenDestination
import pseudoankit.droid.listings.navigation.ListingNavigator

class ListingsNavigatorImpl(
    private val navController: NavController
) : ListingNavigator {

    override fun navigateToDetailScreen(num: Int) {
        navController.navigateTo(DetailScreenDestination(num))
    }
}