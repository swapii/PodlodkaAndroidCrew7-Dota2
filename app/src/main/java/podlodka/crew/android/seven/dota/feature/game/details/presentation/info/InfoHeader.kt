package podlodka.crew.android.seven.dota.feature.game.details.presentation.info

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import podlodka.crew.android.seven.dota.feature.rating.domain.Rating
import podlodka.crew.android.seven.dota.feature.rating.presentation.RatingStars

@Composable
internal fun Header(
    logo: Uri,
    name: String,
    rating: Rating,
    reviewsCount: String,
    tags: List<String>,
    modifier: Modifier = Modifier,
) {

    ConstraintLayout(
        modifier = modifier
    ) {

        val (logoRef, titleRef, ratingRef, tagsRef) = createRefs()

        Image(
            painter = rememberImagePainter(data = logo),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(logoRef) {
                    top.linkTo(titleRef.top)
                }
                .offset(y = (-28).dp)
                .clip(RoundedCornerShape(12.dp))
                .border(
                    width = 2.dp,
                    color = Color(0xFF1F2430),
                    shape = RoundedCornerShape(12.dp),
                )
                .size(84.dp)
        )

        Text(
            text = name,
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .constrainAs(titleRef) {
                    top.linkTo(parent.top)
                    start.linkTo(logoRef.end, margin = 14.dp)
                }
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .constrainAs(ratingRef) {
                    top.linkTo(titleRef.bottom, margin = 4.dp)
                    start.linkTo(titleRef.start)
                }
        ) {

            RatingStars(rating = rating)

            Text(
                text = reviewsCount,
                style = MaterialTheme.typography.caption,
                color = Color(0xFF45454D),
            )

        }

        Tags(
            tags = tags,
            modifier = Modifier
                .constrainAs(tagsRef) {
                    top.linkTo(ratingRef.bottom, margin = 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

    }

}
