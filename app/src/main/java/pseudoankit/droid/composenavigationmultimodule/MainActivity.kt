package pseudoankit.droid.composenavigationmultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.dependency
import pseudoankit.droid.composenavigationmultimodule.navigation.CoreNavigator
import pseudoankit.droid.composenavigationmultimodule.navigation.navgraph.root.RootNavGraph
import pseudoankit.droid.composenavigationmultimodule.ui.theme.ComposeNavigationMultiModuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            ComposeNavigationMultiModuleTheme {
                DestinationsNavHost(
                    navGraph = RootNavGraph,
                    navController = navController,
                    dependenciesContainerBuilder = {
                        dependency(CoreNavigator(destination, navController))
                    }
                )
            }
        }
    }
}
