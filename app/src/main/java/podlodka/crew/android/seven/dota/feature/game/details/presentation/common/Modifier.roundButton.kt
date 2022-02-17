package podlodka.crew.android.seven.dota.feature.game.details.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

internal fun Modifier.roundButton() =
    this
        .clip(CircleShape)
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
