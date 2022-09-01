package pseudoankit.droid.composenavigationmultimodule.navigation.impl

import androidx.navigation.NavController
import com.ramcosta.composedestinations.navigation.navigateTo
import com.ramcosta.composedestinations.spec.DestinationSpec
import pseudoankit.droid.listings.destinations.ShowListingsDestination
import pseudoankit.droid.onboarding.navigation.OnboardingNavigator

class OnboardingNavigatorImpl(
    private val currentDestination: DestinationSpec<*>,
    private val navController: NavController
) : OnboardingNavigator {

    override fun navigateToListingScreen() {
        navController.navigateTo(ShowListingsDestination)
    }
}