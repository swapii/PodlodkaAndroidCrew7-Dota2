package podlodka.crew.android.seven.dota.common.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density

@Composable
inline fun <T> withDensity(getValue: Density.() -> T): T =
	LocalDensity.current.getValue()
