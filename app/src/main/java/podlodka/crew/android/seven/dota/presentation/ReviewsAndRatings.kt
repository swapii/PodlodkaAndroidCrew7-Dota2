package podlodka.crew.android.seven.dota.presentation

import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.net.toUri
import java.time.Instant

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
                        top.linkTo(starsRef.bottom, margin = 8.dp)
                        bottom.linkTo(scoreRef.bottom)
                        start.linkTo(starsRef.start)
                    }
            )

        }

        Column {
            listOf(
                reviewFromAugusteConte,
                reviewFromJangMarcelino,
            )
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

}

internal val reviewFromAugusteConte = Review(
    author = Review.Author(
        name = "Auguste Conte",
        avatarAddress = "https://s3-alpha-sig.figma.com/img/c3b9/76aa/11be05ad43b164622bda3a953bc4e6e8?Expires=1646006400&Signature=Uqh8lhOFAQp0m987SW1vJqaXc77qL6PAM53TMaqCU5g2exFaMy43~dn4hmnKRAahVzijd6OyJCIwfghDWvoyVRTtmVpFkLDw4jfAnJ61UntxpqeWX-VJWrvX3Z2ycSGFxbGFnHF3zYno~jYvwPnE5qTNfaZd4OIC5~7Ts6KAYhk7AHCNSkzd1JIyRkSoPruXPxg3QTn~FISYlXuL0IC4tNo4wfHVn4hAh1Fb7JjIDFVjrIS8hsj2kFUxTDF2hO8EbOgURzjtVaOfvM6-sk7AuT2RaxmcwTr--RpxLOZPLNERRujISh~50J13rFHP2oNxxG3K9hFaKSTmfEh9IKXo7Q__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
    ),
    date = Instant.parse("2019-02-14T10:15:30.00Z"),
    comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
)

internal val reviewFromJangMarcelino = Review(
    author = Review.Author(
        name = "Jang Marcelino",
        avatarAddress = "https://s3-alpha-sig.figma.com/img/63aa/c3ec/76b6a69911e1fbf3e855e655af57992e?Expires=1646006400&Signature=JTLz9wxNE7juJgDHJvae3a~scNcljzhMMSHnYD5vr9rgJh3TFxfAVUAyq-xwFKwpjRWYaRYAkDkMVYYBv2ocA-ZLwSps8~fFlEa6~uHHnHMt67cNdzs3pGCWZ-lPYPTCw~ECMNDzW4445d9aX8toFN7AC~DkDpbscYuRNeqVCP9W01xiwbKIxqaWnbshEMAITVWyX~LD~mtpIedDAK6QcrWUwSlJlEeYy7UwyWZhferRKCjbRJWm~xscITGAYGkkY-gHi0Sj1IlvKEJtNvVuQMTCnyfGkXwZWCiZ~iJbu8BvmuLGN3QxL-KMGx146leAaCkkExxuxgp8I8YPgRq6uA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
    ),
    date = Instant.parse("2020-11-27T22:49:00.00Z"),
    comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
)

internal data class Review(
    val author: Author,
    val date: Instant,
    val comment: String,
) {

    data class Author(
        val name: String,
        val avatarAddress: Uri,
    )

}
