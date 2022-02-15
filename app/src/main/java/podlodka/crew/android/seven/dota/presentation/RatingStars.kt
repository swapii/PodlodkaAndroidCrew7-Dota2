package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun RatingStars() {
    Box {
        Stars(Color(0xFF282E3E))
        Stars(Color(0xFFF4D144))
    }
}

@Composable
private fun Stars(color: Color) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(2.dp),
    ) {
        repeat(5) {
            Star(color)
        }
    }
}

@Composable
private fun Star(color: Color) {
    Icon(
        imageVector = Icons.Default.Star,
        contentDescription = null,
        tint = color,
        modifier = Modifier
            .size(14.dp)
    )
}
