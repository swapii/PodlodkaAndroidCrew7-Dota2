package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.CircleButton

@Composable
internal fun Toolbar(
    parentBackground: ImageBitmap?,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(24.dp)
    ) {
        CircleButton(
            icon = Icons.Default.ArrowBack,
            parentBackground = parentBackground
        )
        Spacer(modifier = Modifier.weight(1f))
        CircleButton(
            icon = Icons.Default.MoreVert,
            parentBackground = parentBackground,
            finalModifier = {
                rotate(90f)
            },
        )
    }
}
