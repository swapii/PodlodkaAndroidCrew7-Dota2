package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow

@Composable
internal fun Tags(
    modifier: Modifier = Modifier,
) {
    FlowRow(
        mainAxisSpacing = 10.dp,
        crossAxisSpacing = 10.dp,
        modifier = modifier,
    ) {
        listOf(
            "MOBA",
            "Multiplayer",
            "Strategy",
        )
            .map { it.uppercase() }
            .forEach { name ->
                Tag(name)
            }
    }
}

@Composable
private fun Tag(name: String) {
    Text(
        text = name,
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
