package pseudoankit.droid.composenavigationmultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import pseudoankit.droid.composenavigationmultimodule.ui.theme.ComposeNavigationMultiModuleTheme
import pseudoankit.droid.onboarding.OnboardingNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            ComposeNavigationMultiModuleTheme {
                DestinationsNavHost(
                    navGraph = RootNavGraph,
                    navController = navController,
                    startRoute = OnboardingNavGraph,
                )
            }
        }
    }
}
