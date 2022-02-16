package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import podlodka.crew.android.seven.dota.feature.review.presentation.Reviews

@Composable
internal fun ReviewsAndRatings(
    horizontalPadding: Dp,
) {

    Column {

        Text(
            text = "Review & Ratings",
            style = MaterialTheme.typography.subtitle1,
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .padding(horizontal = horizontalPadding)
        )

        Spacer(modifier = Modifier.height(12.dp))

        ConstraintLayout(
            modifier = Modifier
                .padding(horizontal = horizontalPadding)
        ) {

            val (scoreRef, starsRef, reviewsCountRef) = createRefs()

            createVerticalChain(starsRef, reviewsCountRef, chainStyle = ChainStyle.Packed(0.5F))

            Text(
                text = "4.9",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier
                    .constrainAs(scoreRef) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
            )

            RatingStars(
                modifier = Modifier
                    .constrainAs(starsRef) {
                        start.linkTo(scoreRef.end, margin = 16.dp)
                        top.linkTo(scoreRef.top)
                        bottom.linkTo(reviewsCountRef.top)
                    }
            )

            Text(
                text = "70M Reviews",
                style = MaterialTheme.typography.caption,
                color = Color(0xFFA8ADB7),
                modifier = Modifier
                    .constrainAs(reviewsCountRef) {
                        top.linkTo(starsRef.bottom)
                        bottom.linkTo(scoreRef.bottom)
                        start.linkTo(starsRef.start)
                    }
                    .padding(top = 8.dp)
            )

        }

        Reviews(horizontalPadding)

    }

}
