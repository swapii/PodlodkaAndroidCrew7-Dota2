package podlodka.crew.android.seven.dota.feature.review.domain

import android.net.Uri
import java.time.Instant

internal data class Review(
    val author: Author,
    val createdAt: Instant,
    val comment: String,
) {

    data class Author(
        val name: String,
        val avatarAddress: Uri,
    )

}
