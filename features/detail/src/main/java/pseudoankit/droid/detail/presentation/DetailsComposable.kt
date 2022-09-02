package pseudoankit.droid.detail.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun DetailScreen(
    param: Int
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "$param got itach")
    }
}