package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.roundButton

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
            .roundButton()
    )
}
