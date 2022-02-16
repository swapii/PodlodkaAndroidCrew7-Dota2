package podlodka.crew.android.seven.dota.feature.rating.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import podlodka.crew.android.seven.dota.feature.rating.domain.Rating
import podlodka.crew.android.seven.dota.presentation.CroppedWidthShape

@Composable
internal fun RatingStars(
    rating: Rating,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        Stars(
            color = Color(0xFF282E3E),
            modifier = Modifier
                .clip(CroppedWidthShape(leftFraction = rating.value))
        )
        Stars(
            color = Color(0xFFF4D144),
            modifier = Modifier
                .clip(CroppedWidthShape(rightFraction = rating.value))
        )
    }
}

@Composable
private fun Stars(
    color: Color,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        modifier = modifier,
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
