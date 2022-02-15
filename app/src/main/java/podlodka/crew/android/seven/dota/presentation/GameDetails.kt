package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun GameDetails() {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back button",
        )

        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "More button",
        )

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Game logo",
        )

        Text(
            text = "DoTA 2",
            style = MaterialTheme.typography.h6,
        )

        Text("RATING")

        Text(
            text = "70M",
            style = MaterialTheme.typography.caption,
        )

        Text("TAGS")

        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
            style = MaterialTheme.typography.caption,
        )

        Text("MEDIA")

        Text(
            text = "Review & Ratings",
            style = MaterialTheme.typography.subtitle1,
        )

        Text(
            text = "4.9",
            style = MaterialTheme.typography.h3,
        )

        Text("RATING")

        Text(
            text = "70M Reviews",
            style = MaterialTheme.typography.caption,
        )

        Text("REVIEWS")

        TextButton(
            onClick = {
                /*TODO*/
            },
        ) {
            Text(
                text = "Install",
                style = MaterialTheme.typography.caption,
            )
        }

    }
}
