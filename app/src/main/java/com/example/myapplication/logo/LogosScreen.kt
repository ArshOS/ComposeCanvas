package com.example.myapplication.logo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.logo.logos.FacebookLogo
import com.example.myapplication.logo.logos.GooglePhotosLogo
import com.example.myapplication.logo.logos.InstagramLogo
import com.example.myapplication.logo.logos.MessengerLogo
import com.example.myapplication.logo.logos.WeatherLogo

@Composable
fun LogosScreen(modifier: Modifier = Modifier) {

    LazyColumn(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item { InstagramLogo() }
        item { FacebookLogo() }
        item { MessengerLogo() }
        item { GooglePhotosLogo() }
        item { WeatherLogo() }

    }
}

@Preview
@Composable
fun LogosScreenPreview() {
    LogosScreen()
}