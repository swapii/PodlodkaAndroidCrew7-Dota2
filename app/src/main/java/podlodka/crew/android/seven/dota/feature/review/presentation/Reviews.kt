package podlodka.crew.android.seven.dota.feature.review.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import podlodka.crew.android.seven.dota.feature.review.domain.Review

@Composable
internal fun Reviews(horizontalPadding: Dp, items: List<Review>) {
    Column {
        items
            .forEachIndexed { index, review ->
                if (index > 0) {
                    Divider(
                        modifier = Modifier
                            .padding(horizontal = horizontalPadding + 16.dp)
                    )
                }
                Review(
                    review = review,
                    modifier = Modifier
                        .padding(horizontalPadding)
                )
            }
    }
}
