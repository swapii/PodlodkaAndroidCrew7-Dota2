package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.google.accompanist.insets.statusBarsPadding
import podlodka.crew.android.seven.dota.common.presentation.withDensity
import podlodka.crew.android.seven.dota.feature.game.details.domain.Game
import podlodka.crew.android.seven.dota.feature.game.details.presentation.info.Info

@Composable
internal fun GameDetails(
    game: Game,
) {

    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
    ) {

        Image(
            painter = rememberImagePainter(data = game.backgroundImageAddress),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        var bottomPanelHeight by remember { mutableStateOf(0f) }

        TopShade()

        Toolbar(
            modifier = Modifier
                .statusBarsPadding()
                .padding(24.dp)
        )

        Info(
            game = game,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(
                    top = 260.dp,
                    bottom = (withDensity { bottomPanelHeight.toDp() } - 32.dp).coerceAtLeast(0.dp),
                )
        )

        Footer(
            modifier = Modifier
                .onGloballyPositioned {
                    bottomPanelHeight = it.boundsInParent().height
                }
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        )

    }

}
