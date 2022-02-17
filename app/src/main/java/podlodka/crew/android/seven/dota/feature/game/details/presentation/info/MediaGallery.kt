package podlodka.crew.android.seven.dota.feature.game.details.presentation.info

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import coil.compose.LocalImageLoader
import coil.compose.rememberImagePainter
import coil.size.Precision
import podlodka.crew.android.seven.dota.R
import podlodka.crew.android.seven.dota.common.presentation.withDensity
import podlodka.crew.android.seven.dota.feature.game.details.domain.Media
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.CircleButton
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.CropAndBlurTransformation

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

    var imageSize by remember { mutableStateOf(IntSize.Zero) }
    val imageWidthPx: Int = withDensity { imageSize.width }
    val imageHeightPx: Int = withDensity { imageSize.height }

    var blurredImage: ImageBitmap? by remember { mutableStateOf(null) }

    Log.wtf("DOTA", "$imageSize $imageWidthPx $imageHeightPx")

    blurredImage?.let {
        Log.wtf("DOTA", "Blurred bitmap ${it.width} ${it.height}")
    }

    val imageLoader = LocalImageLoader.current
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(14.dp))
            .size(width = 240.dp, height = 128.dp)
            .onSizeChanged { size ->
                imageSize = size
            }
    ) {

        if (imageSize != IntSize.Zero) {

            Image(
                painter = rememberImagePainter(data = media.previewAddress) {
                    size(imageWidthPx, imageHeightPx)
                    precision(Precision.EXACT)
                    transformations(
                        CropAndBlurTransformation(
                            context = context,
                            imageLoader = imageLoader,
                            imageWidthPx,
                            imageHeightPx,
                            handleBlurredResultImage = {
                                blurredImage = it
                            }
                        ),
                    )
                },
                contentDescription = null,
                modifier = Modifier
                    .matchParentSize()
            )

            if (media is Media.Video) {
                CircleButton(
                    icon = ImageVector.vectorResource(R.drawable.iconly_arrow_right_2),
                    parentBackground = blurredImage,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

        }

    }
}
