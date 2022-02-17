package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.CircleButton

@Composable
internal fun Toolbar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
    ) {
        CircleButton(Icons.Default.ArrowBack)
        Spacer(modifier = Modifier.weight(1f))
        CircleButton(
            icon = Icons.Default.MoreVert,
            finalModifier = {
                rotate(90f)
            }
        )
    }
}
