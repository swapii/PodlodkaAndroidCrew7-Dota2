package podlodka.crew.android.seven.dota.common

import java.time.Instant
import java.time.ZoneId
import java.time.format.FormatStyle

fun Instant.formatAtZone(
    zoneId: ZoneId = ZoneId.systemDefault(),
    formatStyle: FormatStyle,
): String =
    atZone(zoneId).format(formatStyle)
