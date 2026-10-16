package com.example.myapplication.logo.logos

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MessengerLogo(modifier: Modifier = Modifier) {

    Canvas(
        modifier = Modifier
            .padding(12.dp)
            .size(300.dp)
    ) {

        val triangle = Path().apply {
            moveTo(x = size.width.times(0.2f), y = size.height.times(0.84f))
            lineTo(x = size.width.times(0.2f), y = size.height.times(0.99f))
            lineTo(x = size.width.times(0.3f), y = size.height.times(0.90f))
        }

        val electricPath = Path().apply {
            moveTo(x = size.width.times(0.20f), y = size.height.times(0.6f))
            lineTo(x = size.width.times(0.45f), y = size.height.times(0.34f))
            lineTo(x = size.width.times(0.50f), y = size.height.times(0.44f))
            lineTo(x = size.width.times(0.70f), y = size.height.times(0.24f))
            lineTo(x = size.width.times(0.50f), y = size.height.times(0.60f))
            lineTo(x = size.width.times(0.42f), y = size.height.times(0.47f))
            close()
        }

        drawOval(
            color = Color.Blue,
            size = Size(
                width = size.width,
                height = size.height.times(0.95f)
            )
        )

        drawPath(
            path = triangle,
            color = Color.Blue,
            style = Fill
        )

        drawPath(
            path = electricPath,
            color = Color.White,
            style = Fill
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MessengerLogoPreview() {
    MyApplicationTheme {
        MessengerLogo()
    }
}
