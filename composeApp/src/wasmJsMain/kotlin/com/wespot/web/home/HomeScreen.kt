package com.wespot.web.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import kotlinx.collections.immutable.persistentListOf
import org.jetbrains.compose.resources.painterResource
import wespot_web.composeapp.generated.resources.Res
import wespot_web.composeapp.generated.resources.landing1
import wespot_web.composeapp.generated.resources.landing2
import wespot_web.composeapp.generated.resources.landing3
import wespot_web.composeapp.generated.resources.landing4
import wespot_web.composeapp.generated.resources.landing5

private val imageList = persistentListOf(
    Res.drawable.landing1,
    Res.drawable.landing2,
    Res.drawable.landing3,
    Res.drawable.landing4,
    Res.drawable.landing5,
)

@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        imageList.forEachIndexed { index, item ->
            Image(
                painter = painterResource(item),
                contentDescription = "Lading Page Image $index",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}
