package com.example.myapplication.logo.logos

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun GooglePhotosLogo(modifier: Modifier = Modifier) {
    Canvas(
        modifier = Modifier
            .padding(12.dp)
            .size(300.dp)
    ) {
        drawArc(
            topLeft = Offset(x = size.width.times(0.5f), y = size.height.times(0.25f)),
            color = Color.Blue,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            size = Size(
                width = size.width.div(2f),
                height = size.height.div(2f)
            )
        )

        drawArc(
            topLeft = Offset(x = size.width.times(0.25f), y = size.height.times(0f)),
            color = Color.Red,
            startAngle = -90f,
            sweepAngle = 180f,
            useCenter = true,
            size = Size(
                width = size.width.div(2f),
                height = size.height.div(2f)
            )
        )

        drawArc(
            topLeft = Offset(x = size.width.times(0f), y = size.height.times(0.25f)),
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = -180f,
            useCenter = true,
            size = Size(
                width = size.width.div(2f),
                height = size.height.div(2f)
            )
        )

        drawArc(
            topLeft = Offset(x = size.width.times(0.25f), y = size.height.times(0.5f)),
            color = Color.Yellow,
            startAngle = 270f,
            sweepAngle = -180f,
            useCenter = true,
            size = Size(
                width = size.width.div(2f),
                height = size.height.div(2f)
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GooglePhotosLogoPreview() {
    MyApplicationTheme {
        GooglePhotosLogo()
    }
}
