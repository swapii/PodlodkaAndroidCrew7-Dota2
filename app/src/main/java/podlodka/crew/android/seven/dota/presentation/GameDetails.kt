package podlodka.crew.android.seven.dota.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import coil.compose.rememberImagePainter

@Composable
internal fun GameDetails() {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {

        Toolbar()

        Image(
            painter = rememberImagePainter(data = "https://s3-alpha-sig.figma.com/img/284d/401f/f98fb91fbba05e15f99cdcd8e4f9d673?Expires=1646006400&Signature=OAGiVBdLRFBWxvG4UkCHI9QYZQ6UoC2Mo5nag0ZPMmDdPcCG6xKE9-TMgsHvWjfaauYmi8XSHiQyb3fRd5NXPuDWkw5ByMPqj7R97EDvFer8G9pZDXa~5rAMlPuqEggABRYR8zeOd~kKDJsvyyKeVGGUf90JyW6z7kwYZPIKmhfpard6R38-Y9ddX-xbzNTcPE5-7hRSobk3BtUMEJfz5UCKaSaQrZPpsHloNiXeAtI7RDQUuGMLWA5gMc6VFgTeZ4fl0I7K8M~qHIInOUzRbIDjl8gXFXXP0hpitPIfmX9A6vOVdxdjeel2nkQKLyv0ndeO6h3wsmec3WkB38R-0w__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA"),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Image(
            painter = rememberImagePainter(
                data = "https://scontent-arn2-1.xx.fbcdn.net/v/t1.6435-9/p320x320/66162438_2584053128326795_4329606593789296640_n.png?_nc_cat=109&ccb=1-5&_nc_sid=7aed08&efg=eyJpIjoidCJ9&_nc_ohc=Kcc6QC-e9xwAX8H9-wH&_nc_ht=scontent-arn2-1.xx&oh=00_AT9sONelr7lahF3mM77d0texHRPYQq5Qd4FYMCad7oGf_A&oe=6231E698".toUri()
            ),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .border(
                    width = 2.dp,
                    color = Color(0xFF1F2430),
                    shape = RoundedCornerShape(12.dp),
                )
                .size(84.dp)
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

        //

        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
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

        listOf(
            "https://s3-alpha-sig.figma.com/img/c3b9/76aa/11be05ad43b164622bda3a953bc4e6e8?Expires=1646006400&Signature=Uqh8lhOFAQp0m987SW1vJqaXc77qL6PAM53TMaqCU5g2exFaMy43~dn4hmnKRAahVzijd6OyJCIwfghDWvoyVRTtmVpFkLDw4jfAnJ61UntxpqeWX-VJWrvX3Z2ycSGFxbGFnHF3zYno~jYvwPnE5qTNfaZd4OIC5~7Ts6KAYhk7AHCNSkzd1JIyRkSoPruXPxg3QTn~FISYlXuL0IC4tNo4wfHVn4hAh1Fb7JjIDFVjrIS8hsj2kFUxTDF2hO8EbOgURzjtVaOfvM6-sk7AuT2RaxmcwTr--RpxLOZPLNERRujISh~50J13rFHP2oNxxG3K9hFaKSTmfEh9IKXo7Q__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            "https://s3-alpha-sig.figma.com/img/63aa/c3ec/76b6a69911e1fbf3e855e655af57992e?Expires=1646006400&Signature=JTLz9wxNE7juJgDHJvae3a~scNcljzhMMSHnYD5vr9rgJh3TFxfAVUAyq-xwFKwpjRWYaRYAkDkMVYYBv2ocA-ZLwSps8~fFlEa6~uHHnHMt67cNdzs3pGCWZ-lPYPTCw~ECMNDzW4445d9aX8toFN7AC~DkDpbscYuRNeqVCP9W01xiwbKIxqaWnbshEMAITVWyX~LD~mtpIedDAK6QcrWUwSlJlEeYy7UwyWZhferRKCjbRJWm~xscITGAYGkkY-gHi0Sj1IlvKEJtNvVuQMTCnyfGkXwZWCiZ~iJbu8BvmuLGN3QxL-KMGx146leAaCkkExxuxgp8I8YPgRq6uA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
        )
            .map { it.toUri() }
            .forEach { userAvatarAddress ->
                Image(
                    painter = rememberImagePainter(data = userAvatarAddress),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(36.dp)
                )
            }

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

@Composable
private fun Toolbar() {
    Row {
        ToolbarButton(Icons.Default.ArrowBack)
        Spacer(modifier = Modifier.weight(1f))
        ToolbarButton(Icons.Default.MoreVert)
    }
}

@Composable
private fun ToolbarButton(icon: ImageVector) {
    Icon(
        imageVector = icon,
        contentDescription = null,
        tint = MaterialTheme.colors.onBackground,
        modifier = Modifier
            .clip(CircleShape)
            .border(
                width = 1.dp,
                color = Color(0x4DF2F2F2),
                shape = CircleShape,
            )
            .background(Color(0x47FFFFFF))
            .padding(16.dp)
    )
}
