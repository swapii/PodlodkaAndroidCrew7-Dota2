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
import podlodka.crew.android.seven.dota.feature.rating.domain.Rating

@Composable
internal fun Info(
    modifier: Modifier = Modifier,
) {

    val rating = Rating(0.67f)

    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = modifier
            .background(MaterialTheme.colors.background)
            .padding(top = 10.dp)
    ) {

        val horizontalPadding = 24.dp

        Header(
            rating = rating,
            modifier = Modifier
                .padding(horizontal = horizontalPadding)
        )

        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
            style = MaterialTheme.typography.caption,
            color = Color(0xB3EEF2FB),
            modifier = Modifier
                .padding(horizontal = horizontalPadding)
        )

        Media(
            horizontalPadding = horizontalPadding,
        )

        ReviewsAndRatings(
            horizontalPadding = horizontalPadding,
            rating = rating,
        )

    }

}
