package podlodka.crew.android.seven.dota.feature.game.details.presentation.info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import podlodka.crew.android.seven.dota.feature.game.details.domain.Game

@Composable
internal fun Info(
    game: Game,
    modifier: Modifier = Modifier,
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = modifier
            .background(MaterialTheme.colors.background)
            .padding(top = 10.dp)
    ) {

        val horizontalPadding = 24.dp

        Header(
            logo = game.logoAddress,
            name = game.name,
            rating = game.rating,
            reviewsCount = game.reviewsCount,
            tags = game.tags,
            modifier = Modifier
                .padding(horizontal = horizontalPadding),
        )

        Text(
            text = game.description,
            style = MaterialTheme.typography.caption,
            color = Color(0xB3EEF2FB),
            modifier = Modifier
                .padding(horizontal = horizontalPadding)
        )

        MediaGallery(
            items = game.media,
            horizontalPadding = horizontalPadding,
        )

        ReviewsAndRatings(
            horizontalPadding = horizontalPadding,
            rating = game.rating,
            reviews = game.reviews,
            reviewsCount = game.reviewsCount,
        )

    }

}
