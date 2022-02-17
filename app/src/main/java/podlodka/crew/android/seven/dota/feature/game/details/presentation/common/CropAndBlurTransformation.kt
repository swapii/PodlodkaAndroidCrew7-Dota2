package podlodka.crew.android.seven.dota.feature.game.details.presentation.common

import android.content.Context
import android.graphics.Bitmap
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import coil.ImageLoader
import coil.bitmap.BitmapPool
import coil.size.Size
import coil.transform.Transformation

class CropAndBlurTransformation(
    private val context: Context,
    private val imageLoader: ImageLoader,
    private val targetWidthPx: Int,
    private val targetHeightPx: Int,
    private val handleBlurredResultImage: (resultImage: ImageBitmap) -> Unit,
) : Transformation {

    override fun key(): String = "crop-and-blur"

    override suspend fun transform(
        pool: BitmapPool,
        input: Bitmap,
        size: Size
    ): Bitmap =
        Bitmap.createBitmap(
            input,
            (input.width - targetWidthPx) / 2,
            (input.height - targetHeightPx) / 2,
            targetWidthPx,
            targetHeightPx,
        )
            .also {
                handleBlurredResultImage(
                    imageLoader.blur(context, it, 16f).asImageBitmap()
                )
            }

}
