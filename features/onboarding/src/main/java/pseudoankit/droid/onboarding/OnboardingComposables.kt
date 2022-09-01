package pseudoankit.droid.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph(start = true)
@Destination(start = true)
@Composable
fun StartOnboarding(
) {
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

        }) {
            Text(text = "Go to listings")
        }
    }
}