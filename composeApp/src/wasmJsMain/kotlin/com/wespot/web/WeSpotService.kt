package com.wespot.web

import androidx.compose.runtime.*
import com.wespot.web.designsystem.theme.WeSpotTheme
import com.wespot.web.home.HomeScreen

@Composable
fun WeSpotService() {
    WeSpotTheme {
        HomeScreen()
    }
}
