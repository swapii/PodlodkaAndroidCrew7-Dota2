package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.navigationBarsWithImePadding

@Composable
internal fun Footer(
    modifier: Modifier,
) {
    val backgroundColor = MaterialTheme.colors.background

    Column(
        modifier = modifier
    ) {

        Spacer(
            modifier = Modifier
                .background(
                    Brush.verticalGradient(
                        listOf(
                            backgroundColor.copy(alpha = 0f),
                            backgroundColor
                        )
                    )
                )
                .fillMaxWidth()
                .height(48.dp)
        )

        Box(
            modifier = Modifier
                .background(backgroundColor)
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                ),
                onClick = {
                    /*TODO*/
                },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Install",
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.onSecondary,
                )
            }
        }

        Spacer(
            modifier = Modifier
                .background(backgroundColor)
                .fillMaxWidth()
                .navigationBarsWithImePadding()
        )

    }

}
