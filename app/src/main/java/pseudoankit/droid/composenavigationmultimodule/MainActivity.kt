package pseudoankit.droid.composenavigationmultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import pseudoankit.droid.composenavigationmultimodule.ui.theme.ComposeNavigationMultiModuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationMultiModuleTheme {
                DestinationsNavHost(NavGraphs.root)
            }
        }
    }
}

@RootNavGraph(start = true) // sets this as the start destination of the default nav graph
@Destination
@Composable
fun WelcomeScreen(
    navigator: DestinationsNavigator
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(text = "Welcome multi modular compose", modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeNavigationMultiModuleTheme() {
//        DestinationsNavHost(navGraph = NavGraphs.root)
    }
}
