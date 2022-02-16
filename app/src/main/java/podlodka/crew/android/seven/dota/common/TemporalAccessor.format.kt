package podlodka.crew.android.seven.dota.common

import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.temporal.TemporalAccessor

internal fun TemporalAccessor.format(style: FormatStyle) : String =
    DateTimeFormatter.ofLocalizedDate(style).format(this)
