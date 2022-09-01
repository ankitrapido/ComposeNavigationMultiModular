package pseudoankit.droid.composenavigationmultimodule.navigation.impl

import androidx.navigation.NavController
import com.ramcosta.composedestinations.navigation.navigateTo
import pseudoankit.droid.listings.destinations.ShowListingsDestination
import pseudoankit.droid.onboarding.navigation.OnboardingNavigator

class OnboardingNavigatorImpl(
    private val navController: NavController
) : OnboardingNavigator {

    override fun navigateToListingScreen(list: List<Int>) {
        navController.navigateTo(ShowListingsDestination())
    }
}