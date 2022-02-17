package podlodka.crew.android.seven.dota.feature.game.details.presentation.info

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import java.util.Locale
import podlodka.crew.android.seven.dota.common.presentation.Fonts
import podlodka.crew.android.seven.dota.feature.rating.domain.Rating
import podlodka.crew.android.seven.dota.feature.rating.presentation.RatingStars
import podlodka.crew.android.seven.dota.feature.review.domain.Review
import podlodka.crew.android.seven.dota.feature.review.presentation.Reviews

@Composable
internal fun ReviewsAndRatings(
    horizontalPadding: Dp,
    rating: Rating,
    reviews: List<Review>,
    reviewsCount: String,
) {

    Column {

        Text(
            text = "Review & Ratings",
            fontFamily = Fonts.SkModernist,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                lineHeight = 19.2.sp,
                letterSpacing = 0.6.sp
            ),
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
                text = "%.1f".format(Locale.US, rating.value * 5.0f),
                fontFamily = Fonts.SkModernist,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    lineHeight = 57.6.sp,
                ),
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
                    },
                rating = rating,
            )

            Text(
                text = "$reviewsCount Reviews",
                fontFamily = Fonts.SkModernist,
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 14.4.sp,
                    letterSpacing = 0.5.sp
                ),
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

        Reviews(horizontalPadding, reviews)

    }

}
