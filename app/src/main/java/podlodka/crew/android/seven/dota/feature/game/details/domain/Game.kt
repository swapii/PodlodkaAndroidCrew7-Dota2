package podlodka.crew.android.seven.dota.feature.game.details.domain

import android.net.Uri
import podlodka.crew.android.seven.dota.feature.rating.domain.Rating
import podlodka.crew.android.seven.dota.feature.review.domain.Review

internal data class Game(
    val name: String,
    val logoAddress: Uri,
    val backgroundImageAddress: Uri,
    val tags: List<String>,
    val description: String,
    val media: List<Media>,
    val rating: Rating,
    val reviews: List<Review>,
    val reviewsCount: String,
)
