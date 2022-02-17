package podlodka.crew.android.seven.dota.feature.game.details.data

import androidx.core.net.toUri
import podlodka.crew.android.seven.dota.feature.game.details.domain.Game
import podlodka.crew.android.seven.dota.feature.game.details.domain.Media
import podlodka.crew.android.seven.dota.feature.rating.domain.Rating
import podlodka.crew.android.seven.dota.feature.review.data.reviewFromAugusteConte
import podlodka.crew.android.seven.dota.feature.review.data.reviewFromJangMarcelino

internal val Dota2 = Game(
    name = "DoTA 2",
    description = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
    tags = listOf(
        "MOBA",
        "Multiplayer",
        "Strategy",
    ),
    logoAddress = "https://scontent-arn2-1.xx.fbcdn.net/v/t1.6435-9/p320x320/66162438_2584053128326795_4329606593789296640_n.png?_nc_cat=109&ccb=1-5&_nc_sid=7aed08&efg=eyJpIjoidCJ9&_nc_ohc=Kcc6QC-e9xwAX8H9-wH&_nc_ht=scontent-arn2-1.xx&oh=00_AT9sONelr7lahF3mM77d0texHRPYQq5Qd4FYMCad7oGf_A&oe=6231E698".toUri(),
    media = listOf(
        Media.Video(
            previewAddress = "https://s3-alpha-sig.figma.com/img/719b/0aa8/0e6e573f15f2d4d74b5ce2df394c368c?Expires=1646006400&Signature=dbm-MzAUJ3GIbchz00qdvOpaGzh5MeCMcIS1qz1FHSRdD~lMD9V0Uf878x96qjQIaehTogpWugHvMccnvyttST5ac1kray8ubBaaWLJpVgKQn~WjdGWWnf50hAEKKDFj1rnmR0H6PajcyoRRpQU6UpVT5JTEP9e~ZXSLX0NMoL2zdzaY6lfqbijHNk8UY5SYdjXytv9W~MMatf1x2tEc8OB1TY3FQt7n5g2iu0aHfoitAEWy2vM~QSfm3gHAtgCWe3l~Jyc~k3jyCELYU2viToeFvptETAdyXpBP2lO0N4cAmIF0woYRNjicWgcjox698Qx7saTVaifrvhh7wvN1IQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
        ),
        Media.Image(
            previewAddress = "https://s3-alpha-sig.figma.com/img/1608/5fac/e9314038d9f57b15c30067393738676a?Expires=1646006400&Signature=TPkEtrIIArRz3lv8qK4RuKFOachfASXMNJGvD9sWz13J6C66Ol~IiqcOHw0oFS2P8lfVC4QQtkiak5y2LJ4a41R0HP2-E8L-XAqHQnhqeBcAS-UypDSwRXmo7xeCwNZEMgb1AWVNocLneLWn5I2MdfGQxk~9XuR68s4dlaWV8O0ig0Wh8-LSSSZFkLSqKYEs4Je-sMr3G2QDF2Z5l64lFAHE4JrUShKonvJZkCiDIvUxsC3rfg09xizw0sWxBgFNFdkv32bBqi8pKJ9zWHBksrSf9~yAfQm5xo0JMBpwm59Rp8f5tdvxAjA24x7NlylEHLa-vz3s6rMIJ9FZYoie7Q__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
        ),
    ),
    backgroundImageAddress = "https://s3-alpha-sig.figma.com/img/284d/401f/f98fb91fbba05e15f99cdcd8e4f9d673?Expires=1646006400&Signature=OAGiVBdLRFBWxvG4UkCHI9QYZQ6UoC2Mo5nag0ZPMmDdPcCG6xKE9-TMgsHvWjfaauYmi8XSHiQyb3fRd5NXPuDWkw5ByMPqj7R97EDvFer8G9pZDXa~5rAMlPuqEggABRYR8zeOd~kKDJsvyyKeVGGUf90JyW6z7kwYZPIKmhfpard6R38-Y9ddX-xbzNTcPE5-7hRSobk3BtUMEJfz5UCKaSaQrZPpsHloNiXeAtI7RDQUuGMLWA5gMc6VFgTeZ4fl0I7K8M~qHIInOUzRbIDjl8gXFXXP0hpitPIfmX9A6vOVdxdjeel2nkQKLyv0ndeO6h3wsmec3WkB38R-0w__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
    rating = Rating(4.54321f / 5.0f),
    reviewsCount = "70M",
    reviews = listOf(
        reviewFromAugusteConte,
        reviewFromJangMarcelino,
    ),
)
