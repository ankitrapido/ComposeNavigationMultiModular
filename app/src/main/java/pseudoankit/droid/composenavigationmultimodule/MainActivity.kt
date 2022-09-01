package pseudoankit.droid.composenavigationmultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pseudoankit.droid.composenavigationmultimodule.ui.theme.ComposeNavigationMultiModuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationMultiModuleTheme {

            }
        }
    }
}
