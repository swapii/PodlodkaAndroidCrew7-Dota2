package podlodka.crew.android.seven.dota.feature.game.details.presentation.info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.flowlayout.FlowRow
import podlodka.crew.android.seven.dota.common.presentation.Fonts

@Composable
internal fun Tags(
    tags: List<String>,
    modifier: Modifier = Modifier,
) {
    FlowRow(
        mainAxisSpacing = 8.dp,
        crossAxisSpacing = 8.dp,
        modifier = modifier,
    ) {
        tags
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
        fontFamily = Fonts.Montserrat,
        style = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 10.sp,
            lineHeight = 12.19.sp,
        ),
        color = MaterialTheme.colors.primaryVariant,
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.primaryVariant)
            .padding(
                vertical = 4.dp,
                horizontal = 8.dp,
            )
    )
}
