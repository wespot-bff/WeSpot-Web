package com.wespot.web.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.wespot.web.designsystem.theme.StaticTypography
import com.wespot.web.designsystem.theme.WeSpotThemeManager
import kotlinx.collections.immutable.persistentListOf
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
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
    val pagerState = rememberPagerState { imageList.size }
    val isDraggedState = pagerState.interactionSource.collectIsDraggedAsState()

    /** 드래그 가능한 상태가 아닌 경우, 자동으로 스와이프 되도록 설정 */
    LaunchedEffect(Unit) {
        snapshotFlow { isDraggedState.value }
            .collectLatest { isDragged ->
                if (isDragged) return@collectLatest
                while (true) {
                    delay(3_000)
                    pagerState.animateScrollToPage(pagerState.currentPage.inc())
                }
            }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(32.dp),
        ) {
            Text(
                text = "WeSpot",
                style = StaticTypography().header1,
                color = WeSpotThemeManager.colors.txtTitleColor,
            )

            HorizontalPager(
                state = pagerState,
                modifier = Modifier.width(512.dp)
            ) {
                Image(
                    painter = painterResource(imageList[it]),
                    contentDescription = "Lading Page Image $it",
                    contentScale = ContentScale.FillWidth,
                )
            }
        }
    }
}
