package podlodka.crew.android.seven.dota.feature.game.details.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

internal fun Modifier.roundButton() =
    this
        .clip(CircleShape)
        .border(
            width = 1.dp,
            color = Color(0x4DF2F2F2),
            shape = CircleShape,
        )
        .background(Color(0x47FFFFFF))
        .padding(16.dp)
