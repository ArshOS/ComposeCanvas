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
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun InstagramLogo(modifier: Modifier = Modifier) {
    Canvas(
        modifier = Modifier
            .padding(12.dp)
            .size(300.dp)
    ) {
        drawRoundRect(
            brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Blue)),
            cornerRadius = CornerRadius(x = 120f, y = 120f),
            style = Stroke(width = 26f)
        )
        drawCircle(
            brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Blue)),
            style = Stroke(width = 26f),
            radius = 150f
        )
        drawCircle(
            center = Offset(size.width.times(0.8f), size.height.times(0.2f)),
            brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Blue)),
            radius = 24f
        )
    }

}

@Preview(showBackground = true)
@Composable
fun InstagramLogoPreview() {
    MyApplicationTheme {
        InstagramLogo()
    }
}

