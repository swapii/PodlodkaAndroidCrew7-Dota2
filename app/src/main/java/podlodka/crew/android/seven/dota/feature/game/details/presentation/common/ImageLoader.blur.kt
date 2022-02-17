package podlodka.crew.android.seven.dota.feature.game.details.presentation.common

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import coil.ImageLoader
import coil.request.ErrorResult
import coil.request.ImageRequest
import coil.request.SuccessResult
import coil.transform.BlurTransformation

internal suspend fun ImageLoader.blur(context: Context, bitmap: Bitmap, radius: Float): Bitmap {

    val request = ImageRequest.Builder(context)
        .data(bitmap)
        .transformations(BlurTransformation(context, radius = radius))
        .build()

    return when (val result = execute(request)) {
        is SuccessResult -> (result.drawable as BitmapDrawable).bitmap
        is ErrorResult -> throw result.throwable
    }
}
