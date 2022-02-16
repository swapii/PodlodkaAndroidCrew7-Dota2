package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
internal fun Toolbar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
    ) {
        ToolbarButton(Icons.Default.ArrowBack)
        Spacer(modifier = Modifier.weight(1f))
        ToolbarButton(Icons.Default.MoreVert)
    }
}

@Composable
private fun ToolbarButton(icon: ImageVector) {
    Icon(
        imageVector = icon,
        contentDescription = null,
        tint = MaterialTheme.colors.onBackground,
        modifier = Modifier
            .clip(CircleShape)
            .border(
                width = 1.dp,
                color = Color(0x4DF2F2F2),
                shape = CircleShape,
            )
            .background(Color(0x47FFFFFF))
            .padding(16.dp)
    )
}
