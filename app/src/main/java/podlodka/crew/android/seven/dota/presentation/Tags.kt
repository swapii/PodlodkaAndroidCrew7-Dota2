package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
internal fun Tags(
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier,
    ) {
        repeat(5) {
            Text(
                text = "TAG",
                color = MaterialTheme.colors.primaryVariant,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.primaryVariant)
                    .padding(
                        vertical = 5.dp,
                        horizontal = 10.dp,
                    )
            )
        }
    }
}
