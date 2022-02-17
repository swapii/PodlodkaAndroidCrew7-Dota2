package podlodka.crew.android.seven.dota.feature.review.data

import androidx.core.net.toUri
import java.time.Instant

internal val reviewFromAugusteConte = podlodka.crew.android.seven.dota.feature.review.domain.Review(
    author = podlodka.crew.android.seven.dota.feature.review.domain.Review.Author(
        name = "Auguste Conte",
        avatarAddress = "https://s3-alpha-sig.figma.com/img/c3b9/76aa/11be05ad43b164622bda3a953bc4e6e8?Expires=1646006400&Signature=Uqh8lhOFAQp0m987SW1vJqaXc77qL6PAM53TMaqCU5g2exFaMy43~dn4hmnKRAahVzijd6OyJCIwfghDWvoyVRTtmVpFkLDw4jfAnJ61UntxpqeWX-VJWrvX3Z2ycSGFxbGFnHF3zYno~jYvwPnE5qTNfaZd4OIC5~7Ts6KAYhk7AHCNSkzd1JIyRkSoPruXPxg3QTn~FISYlXuL0IC4tNo4wfHVn4hAh1Fb7JjIDFVjrIS8hsj2kFUxTDF2hO8EbOgURzjtVaOfvM6-sk7AuT2RaxmcwTr--RpxLOZPLNERRujISh~50J13rFHP2oNxxG3K9hFaKSTmfEh9IKXo7Q__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
    ),
    createdAt = Instant.parse("2019-02-14T10:15:30.00Z"),
    comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
)

internal val reviewFromJangMarcelino =
    podlodka.crew.android.seven.dota.feature.review.domain.Review(
        author = podlodka.crew.android.seven.dota.feature.review.domain.Review.Author(
            name = "Jang Marcelino",
            avatarAddress = "https://s3-alpha-sig.figma.com/img/63aa/c3ec/76b6a69911e1fbf3e855e655af57992e?Expires=1646006400&Signature=JTLz9wxNE7juJgDHJvae3a~scNcljzhMMSHnYD5vr9rgJh3TFxfAVUAyq-xwFKwpjRWYaRYAkDkMVYYBv2ocA-ZLwSps8~fFlEa6~uHHnHMt67cNdzs3pGCWZ-lPYPTCw~ECMNDzW4445d9aX8toFN7AC~DkDpbscYuRNeqVCP9W01xiwbKIxqaWnbshEMAITVWyX~LD~mtpIedDAK6QcrWUwSlJlEeYy7UwyWZhferRKCjbRJWm~xscITGAYGkkY-gHi0Sj1IlvKEJtNvVuQMTCnyfGkXwZWCiZ~iJbu8BvmuLGN3QxL-KMGx146leAaCkkExxuxgp8I8YPgRq6uA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA".toUri(),
        ),
        createdAt = Instant.parse("2020-11-27T22:49:00.00Z"),
        comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
    )
