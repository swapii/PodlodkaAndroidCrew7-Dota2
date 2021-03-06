package podlodka.crew.android.seven.dota.feature.review.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale
import podlodka.crew.android.seven.dota.common.presentation.Fonts
import podlodka.crew.android.seven.dota.feature.review.data.reviewFromAugusteConte
import podlodka.crew.android.seven.dota.feature.review.domain.Review

@Composable
internal fun Review(
    review: Review,
    modifier: Modifier = Modifier,
) {
    ConstraintLayout(
        modifier = modifier
    ) {

        val (avatar, name, date, comment) = createRefs()

        val avatarAndDateBottomBarrier = createBottomBarrier(avatar, date)

        createVerticalChain(name, date, chainStyle = ChainStyle.SpreadInside)

        Image(
            painter = rememberImagePainter(data = review.author.avatarAddress),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(36.dp)
                .constrainAs(avatar) {
                    top.linkTo(name.top)
                    bottom.linkTo(date.bottom)
                }
        )

        Text(
            text = review.author.name,
            color = MaterialTheme.colors.onBackground,
            fontFamily = Fonts.SkModernist,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 19.2.sp,
                letterSpacing = 0.5.sp
            ),
            modifier = Modifier
                .constrainAs(name) {
                    start.linkTo(avatar.end, margin = 16.dp)
                    bottom.linkTo(date.top)
                }
        )

        Text(
            text = review.createdAt.format(),
            color = Color(0x66FFFFFF),
            fontFamily = Fonts.SkModernist,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 14.4.sp,
                letterSpacing = 0.5.sp
            ),
            modifier = Modifier
                .constrainAs(date) {
                    start.linkTo(name.start)
                    top.linkTo(name.bottom)
                }
                .padding(top = 8.dp)
        )

        Text(
            text = "???${review.comment}???",
            color = Color(0xFFA8ADB7),
            fontFamily = Fonts.SkModernist,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.5.sp
            ),
            modifier = Modifier
                .constrainAs(comment) {
                    top.linkTo(avatarAndDateBottomBarrier, margin = 16.dp)
                }
        )

    }
}

@Preview
@Composable
fun PreviewOfReviewFromAugusteConte() {
    Review(
        review = reviewFromAugusteConte,
        modifier = Modifier
            .padding(24.dp)
    )
}

@Composable
private fun Instant.format() =
    DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
        .withLocale(Locale.US)
        .format(atZone(ZoneId.systemDefault()))
