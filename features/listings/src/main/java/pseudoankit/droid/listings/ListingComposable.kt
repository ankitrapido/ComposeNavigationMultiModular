package pseudoankit.droid.listings

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import pseudoankit.droid.listings.navigation.ListingNavigator
import kotlin.random.Random

@RootNavGraph(start = true)
@Destination(start = true)
@Composable
fun ShowListings(
    navigator: ListingNavigator,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "I will show list items")
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        )
        Button(onClick = {
            navigator.navigateToDetailScreen(Random.nextInt())
        }) {
            Text(text = "Go to Detail Screen")
        }
    }
}