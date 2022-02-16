package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun TopShade() {

    val shadeColor = Color(0xFF050B18)

    Box(
        modifier = Modifier
            .background(
                Brush.verticalGradient(
                    listOf(
                        shadeColor,
                        shadeColor.copy(alpha = 0f),
                    )
                )
            )
            .fillMaxWidth()
            .height(128.dp)
    )

}