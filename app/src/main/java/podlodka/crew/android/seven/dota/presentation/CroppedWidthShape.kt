package podlodka.crew.android.seven.dota.presentation

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.toRect
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

internal class CroppedWidthShape(
    private val leftFraction: Float = 0.0f,
    private val rightFraction: Float = 1.0f,
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline =
        Outline.Rectangle(
            size
                .toRect()
                .copy(
                    left = size.width * leftFraction,
                    right = size.width * rightFraction,
                )
        )

}
