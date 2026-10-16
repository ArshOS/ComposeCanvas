package com.example.myapplication.logo.logos

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun WeatherLogo(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .padding(12.dp)
            .size(300.dp)
    ) {

        val path = Path().apply {
            moveTo(size.width.times(0.45f), size.height.times(0.75f))
            cubicTo(
                // First control point
                x1 = size.width.times(0.25f),
                y1 = size.height.times(0.75f),

                // Second control point
                x2 = size.width.times(0.25f),
                y2 = size.height.times(0.45f),

                // Destination point
                x3 = size.width.times(0.45f),
                y3 = size.height.times(0.50f)
            )
            cubicTo(
                // First control point
                x1 = size.width.times(0.45f),
                y1 = size.height.times(0.20f),

                // Second control point
                x2 = size.width.times(0.65f),
                y2 = size.height.times(0.15f),

                // Destination point
                x3 = size.width.times(0.75f),
                y3 = size.height.times(0.40f)
            )
            cubicTo(
                // First control point
                x1 = size.width.times(0.95f),
                y1 = size.height.times(0.35f),

                // Second control point
                x2 = size.width.times(0.95f),
                y2 = size.height.times(0.75f),

                // Destination point
                x3 = size.width.times(0.75f),
                y3 = size.height.times(0.75f)
            )
        }

        drawRoundRect(
            brush = Brush.verticalGradient(listOf(
                Color.Blue, Color.Cyan
            )),
            cornerRadius = CornerRadius(x = 120f, y = 120f)
        )

        drawCircle(
            color = Color.Yellow,
            radius = size.width.times(0.20f),
            center = Offset(x = size.width.times(0.35f), y = size.height.times(0.35f))
        )

        drawPath(
            path = path,
            color = Color.White.copy(alpha = 0.9f),
            style = Fill
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherLogoPreview() {
    MyApplicationTheme {
        WeatherLogo()
    }
}
