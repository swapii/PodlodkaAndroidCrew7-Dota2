package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun GameDetails() {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back button",
            tint = MaterialTheme.colors.onBackground,
        )

        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "More button",
            tint = MaterialTheme.colors.onBackground,
        )

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Game logo",
        )

        Text(
            text = "DoTA 2",
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onBackground,
        )

        Text(
            text = "RATING",
            color = MaterialTheme.colors.onBackground,
        )

        Text(
            text = "70M",
            style = MaterialTheme.typography.caption,
            color = Color(0xFF45454D),
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            repeat(5) {
                Text(
                    text = "TAG",
                    color = MaterialTheme.colors.primaryVariant,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.primaryVariant)
                        .padding(
                            vertical = 5.dp,
                            horizontal = 10.dp,
                        )
                )
            }
        }

        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
            style = MaterialTheme.typography.caption,
            color = Color(0xB3EEF2FB),
        )

        Text(
            text = "MEDIA",
            color = MaterialTheme.colors.onBackground,
        )

        Text(
            text = "Review & Ratings",
            style = MaterialTheme.typography.subtitle1,
            color = MaterialTheme.colors.onBackground,
        )

        Text(
            text = "4.9",
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.onBackground,
        )

        Text(
            text = "RATING",
            color = MaterialTheme.colors.onBackground,
        )

        Text(
            text = "70M Reviews",
            style = MaterialTheme.typography.caption,
            color = Color(0xFFA8ADB7),
        )

        Text(
            text = "REVIEWS",
            color = MaterialTheme.colors.onBackground,
        )

        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary,
            ),
            onClick = {
                /*TODO*/
            },
        ) {
            Text(
                text = "Install",
                style = MaterialTheme.typography.caption,
                color = MaterialTheme.colors.onSecondary,
            )
        }

    }
}
