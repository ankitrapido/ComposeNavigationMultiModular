package pseudoankit.droid.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import pseudoankit.droid.onboarding.navigation.OnboardingNavigator

@RootNavGraph(start = true)
@Destination(start = true)
@Composable
fun StartOnboarding(
    navigator: OnboardingNavigator
) {
    val list = remember { listOf(1, 2, 3) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Onboarding Screen!")
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        )
        Button(onClick = {
            navigator.navigateToListingScreen(list)
        }) {
            Text(text = "Go to listings")
        }
    }
}