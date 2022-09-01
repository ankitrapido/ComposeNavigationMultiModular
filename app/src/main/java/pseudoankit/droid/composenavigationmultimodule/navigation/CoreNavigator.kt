package pseudoankit.droid.composenavigationmultimodule.navigation

import androidx.navigation.NavController
import com.ramcosta.composedestinations.spec.DestinationSpec
import pseudoankit.droid.composenavigationmultimodule.navigation.impl.OnboardingNavigatorImpl
import pseudoankit.droid.onboarding.navigation.OnboardingNavigator

class CoreNavigator(
    private val currentDestination: DestinationSpec<*>,
    private val navController: NavController
) : OnboardingNavigator by OnboardingNavigatorImpl(currentDestination, navController)