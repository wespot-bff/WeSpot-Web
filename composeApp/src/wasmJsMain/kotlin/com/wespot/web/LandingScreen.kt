package com.wespot.web

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.collections.immutable.persistentListOf
import org.jetbrains.compose.resources.painterResource
import wespot_web.composeapp.generated.resources.Res
import wespot_web.composeapp.generated.resources.landing1
import wespot_web.composeapp.generated.resources.landing2
import wespot_web.composeapp.generated.resources.landing3
import wespot_web.composeapp.generated.resources.landing4
import wespot_web.composeapp.generated.resources.landing5

@Composable
fun LandingScreen() {
    val imageList = persistentListOf(
        Res.drawable.landing1,
        Res.drawable.landing2,
        Res.drawable.landing3,
        Res.drawable.landing4,
        Res.drawable.landing5,
    )
    val pagerState = rememberPagerState { imageList.size }

    VerticalPager(
        modifier = Modifier.fillMaxSize(),
        state = pagerState,
    ) {
        Image(
            painter = painterResource(imageList[it]),
            contentDescription = "Lading Page Image $it",
            modifier = Modifier.fillMaxSize(),
        )
    }
}
