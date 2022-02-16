package podlodka.crew.android.seven.dota.feature.rating.domain

import androidx.annotation.FloatRange

data class Rating(
    @FloatRange(from = 0.0, to = 1.0) val value: Float
)
