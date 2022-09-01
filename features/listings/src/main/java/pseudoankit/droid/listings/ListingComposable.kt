package pseudoankit.droid.listings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(start = true)
@Destination(start = true)
@Composable
fun ShowListings(
    navigator: DestinationsNavigator
) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(text = "I will show list items")
    }
}