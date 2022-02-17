package podlodka.crew.android.seven.dota.feature.game.details.presentation.info

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import podlodka.crew.android.seven.dota.R
import podlodka.crew.android.seven.dota.feature.game.details.domain.Media
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.roundButton

@Composable
internal fun MediaGallery(
    items: List<Media>,
    horizontalPadding: Dp,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = horizontalPadding)
    ) {
        items
            .forEach { media ->
                MediaItem(media)
            }
    }
}

@Composable
private fun MediaItem(media: Media) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(14.dp))
            .size(width = 240.dp, height = 128.dp)
    ) {
        Image(
            painter = rememberImagePainter(data = media.previewAddress),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .matchParentSize()
        )
        if (media is Media.Video) {
            Icon(
                ImageVector.vectorResource(R.drawable.iconly_arrow_right_2),
                contentDescription = null,
                tint = MaterialTheme.colors.onBackground,
                modifier = Modifier
                    .align(Alignment.Center)
                    .roundButton()
            )
        }
    }
}
