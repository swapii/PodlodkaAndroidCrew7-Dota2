package podlodka.crew.android.seven.dota.presentation

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
import androidx.core.net.toUri
import coil.compose.rememberImagePainter

@Composable
fun Header() {
    ConstraintLayout {

        val (logoRef, titleRef, ratingRef, tagsRef) = createRefs()

        Image(
            painter = rememberImagePainter(
                data = "https://scontent-arn2-1.xx.fbcdn.net/v/t1.6435-9/p320x320/66162438_2584053128326795_4329606593789296640_n.png?_nc_cat=109&ccb=1-5&_nc_sid=7aed08&efg=eyJpIjoidCJ9&_nc_ohc=Kcc6QC-e9xwAX8H9-wH&_nc_ht=scontent-arn2-1.xx&oh=00_AT9sONelr7lahF3mM77d0texHRPYQq5Qd4FYMCad7oGf_A&oe=6231E698".toUri()
            ),
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
            text = "DoTA 2",
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

            RatingStars()

            Text(
                text = "70M",
                style = MaterialTheme.typography.caption,
                color = Color(0xFF45454D),
            )

        }

        Tags(
            modifier = Modifier
                .constrainAs(tagsRef) {
                    top.linkTo(ratingRef.bottom, margin = 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

    }
}
