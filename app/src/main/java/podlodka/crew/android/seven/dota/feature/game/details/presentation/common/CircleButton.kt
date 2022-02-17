package podlodka.crew.android.seven.dota.feature.game.details.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
internal fun CircleButton(
    icon: ImageVector,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    finalModifier: Modifier.() -> Modifier = { this },
) {
    Icon(
        imageVector = icon,
        contentDescription = null,
        tint = MaterialTheme.colors.onBackground,
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                onClick = onClick,
            )
            .border(
                width = 1.dp,
                shape = CircleShape,
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0x00FFFFFF),
                        Color(0x66FFFFFF),
                    ),
                )
            )
            .background(Color(0x47FFFFFF))
            .padding(16.dp)
            .finalModifier()
    )
}
