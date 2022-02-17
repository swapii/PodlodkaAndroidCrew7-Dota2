package podlodka.crew.android.seven.dota.feature.game.details.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.navigationBarsWithImePadding
import podlodka.crew.android.seven.dota.common.presentation.Fonts

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
            Text(
                text = "Install",
                textAlign = TextAlign.Center,
                fontFamily = Fonts.SkModernist,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                    letterSpacing = 0.6.sp
                ),
                color = MaterialTheme.colors.onSecondary,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .clickable { /* TODO */ }
                    .background(MaterialTheme.colors.secondary)
                    .padding(20.dp)
            )
        }

        Spacer(
            modifier = Modifier
                .background(backgroundColor)
                .fillMaxWidth()
                .padding(top = 12.dp)
                .navigationBarsWithImePadding()
        )

    }

}
