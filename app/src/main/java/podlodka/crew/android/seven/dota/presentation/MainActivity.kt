package podlodka.crew.android.seven.dota.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import podlodka.crew.android.seven.dota.feature.game.details.presentation.GameDetails

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MaterialTheme(
                colors = darkColors(
                    primary = Color(0xFF41A0E7),
                    primaryVariant = Color(0x3D44A9F4),
                    secondary = Color(0xFFF4D144),
                    background = Color(0xFF050B18),
                ),
            ) {
                GameDetails()
            }
        }

    }

}
