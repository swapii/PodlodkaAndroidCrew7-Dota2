package podlodka.crew.android.seven.dota.feature.game.details.domain

import android.net.Uri

internal sealed interface Media {

    val previewAddress: Uri

    data class Video(
        override val previewAddress: Uri,
    ) : Media

    data class Image(
        override val previewAddress: Uri,
    ) : Media

}
