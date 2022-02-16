package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import coil.compose.rememberImagePainter

@Composable
internal fun Info(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = modifier
            .background(MaterialTheme.colors.background)
            .padding(top = 10.dp)
    ) {

        val horizontalPadding = 24.dp

        Header(
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

        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = horizontalPadding)
        ) {
            listOf(
                "https://s3-alpha-sig.figma.com/img/719b/0aa8/0e6e573f15f2d4d74b5ce2df394c368c?Expires=1646006400&Signature=dbm-MzAUJ3GIbchz00qdvOpaGzh5MeCMcIS1qz1FHSRdD~lMD9V0Uf878x96qjQIaehTogpWugHvMccnvyttST5ac1kray8ubBaaWLJpVgKQn~WjdGWWnf50hAEKKDFj1rnmR0H6PajcyoRRpQU6UpVT5JTEP9e~ZXSLX0NMoL2zdzaY6lfqbijHNk8UY5SYdjXytv9W~MMatf1x2tEc8OB1TY3FQt7n5g2iu0aHfoitAEWy2vM~QSfm3gHAtgCWe3l~Jyc~k3jyCELYU2viToeFvptETAdyXpBP2lO0N4cAmIF0woYRNjicWgcjox698Qx7saTVaifrvhh7wvN1IQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
                "https://s3-alpha-sig.figma.com/img/1608/5fac/e9314038d9f57b15c30067393738676a?Expires=1646006400&Signature=TPkEtrIIArRz3lv8qK4RuKFOachfASXMNJGvD9sWz13J6C66Ol~IiqcOHw0oFS2P8lfVC4QQtkiak5y2LJ4a41R0HP2-E8L-XAqHQnhqeBcAS-UypDSwRXmo7xeCwNZEMgb1AWVNocLneLWn5I2MdfGQxk~9XuR68s4dlaWV8O0ig0Wh8-LSSSZFkLSqKYEs4Je-sMr3G2QDF2Z5l64lFAHE4JrUShKonvJZkCiDIvUxsC3rfg09xizw0sWxBgFNFdkv32bBqi8pKJ9zWHBksrSf9~yAfQm5xo0JMBpwm59Rp8f5tdvxAjA24x7NlylEHLa-vz3s6rMIJ9FZYoie7Q__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            )
                .map { it.toUri() }
                .forEach { imageAddress ->
                    Image(
                        painter = rememberImagePainter(data = imageAddress),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(RoundedCornerShape(14.dp))
                            .size(width = 240.dp, height = 128.dp)
                    )
                }
        }

        ReviewsAndRatings(
            horizontalPadding = horizontalPadding,
        )

    }
}
