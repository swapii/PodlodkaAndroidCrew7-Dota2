package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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
import podlodka.crew.android.seven.dota.common.presentation.withDensity

@Composable
internal fun GameDetails() {

    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
    ) {

        Image(
            painter = rememberImagePainter(data = "https://s3-alpha-sig.figma.com/img/284d/401f/f98fb91fbba05e15f99cdcd8e4f9d673?Expires=1646006400&Signature=OAGiVBdLRFBWxvG4UkCHI9QYZQ6UoC2Mo5nag0ZPMmDdPcCG6xKE9-TMgsHvWjfaauYmi8XSHiQyb3fRd5NXPuDWkw5ByMPqj7R97EDvFer8G9pZDXa~5rAMlPuqEggABRYR8zeOd~kKDJsvyyKeVGGUf90JyW6z7kwYZPIKmhfpard6R38-Y9ddX-xbzNTcPE5-7hRSobk3BtUMEJfz5UCKaSaQrZPpsHloNiXeAtI7RDQUuGMLWA5gMc6VFgTeZ4fl0I7K8M~qHIInOUzRbIDjl8gXFXXP0hpitPIfmX9A6vOVdxdjeel2nkQKLyv0ndeO6h3wsmec3WkB38R-0w__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA"),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        var bottomPanelHeight by remember { mutableStateOf(0f) }

        Info(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(
                    top = 260.dp,
                    bottom = withDensity { bottomPanelHeight.toDp() },
                )
        )

        Toolbar(
            modifier = Modifier
                .padding(24.dp)
        )

        Box(
            modifier = Modifier
                .onGloballyPositioned {
                    bottomPanelHeight = it.boundsInParent().height
                }
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(24.dp)
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

    }

}
