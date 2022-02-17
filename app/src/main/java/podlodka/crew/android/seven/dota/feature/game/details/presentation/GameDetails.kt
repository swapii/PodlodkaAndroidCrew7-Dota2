package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.LocalImageLoader
import coil.compose.rememberImagePainter
import coil.size.Precision
import com.google.accompanist.insets.statusBarsPadding
import podlodka.crew.android.seven.dota.common.presentation.withDensity
import podlodka.crew.android.seven.dota.feature.game.details.domain.Game
import podlodka.crew.android.seven.dota.feature.game.details.presentation.common.CropAndBlurTransformation
import podlodka.crew.android.seven.dota.feature.game.details.presentation.info.Info

@Composable
internal fun GameDetails(
    game: Game,
) {

    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
    ) {

        val backgroundImageHeight = 300.dp

        var backgroundImageSize by remember { mutableStateOf(IntSize.Zero) }
        val backgroundImageWidthPx: Int = withDensity { backgroundImageSize.width }
        val backgroundImageHeightPx: Int = withDensity { backgroundImageSize.height }

        var backgroundBlurredImage: ImageBitmap? by remember { mutableStateOf(null) }

        val imageLoader: ImageLoader = LocalImageLoader.current

        val context = LocalContext.current

        Box(
            modifier = Modifier
                .onSizeChanged { size ->
                    backgroundImageSize = size
                }
                .fillMaxWidth()
                .height(backgroundImageHeight)
        ) {
            if (backgroundImageSize != IntSize.Zero) {
                Image(
                    painter = rememberImagePainter(data = game.backgroundImageAddress) {
                        precision(Precision.EXACT)
                        transformations(
                            CropAndBlurTransformation(
                                context = context,
                                imageLoader = imageLoader,
                                backgroundImageWidthPx,
                                backgroundImageHeightPx,
                                handleBlurredResultImage = {
                                    backgroundBlurredImage = it
                                }
                            ),
                        )
                    },
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                )
            }
        }

        var bottomPanelHeight by remember { mutableStateOf(0f) }

        TopShade()

        val infoScrollState = rememberScrollState()

        Info(
            game = game,
            modifier = Modifier
                .verticalScroll(infoScrollState)
                .padding(
                    top = backgroundImageHeight - 40.dp,
                    bottom = (withDensity { bottomPanelHeight.toDp() } - 32.dp).coerceAtLeast(0.dp),
                )
        )

        val toolbarAlpha =
            ((backgroundImageHeight.value - infoScrollState.value) / backgroundImageHeight.value)
                .coerceAtLeast(0f)

        Toolbar(
            backgroundBlurredImage,
            modifier = Modifier
                .statusBarsPadding()
                .alpha(toolbarAlpha)
        )

        Footer(
            modifier = Modifier
                .onGloballyPositioned {
                    bottomPanelHeight = it.boundsInParent().height
                }
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        )

    }

}
