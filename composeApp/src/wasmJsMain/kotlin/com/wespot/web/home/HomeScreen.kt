package com.wespot.web.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.wespot.web.designsystem.component.WSTopBar
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
import wespot_web.composeapp.generated.resources.main_logo

private val imageList = persistentListOf(
    Res.drawable.landing1,
    Res.drawable.landing2,
    Res.drawable.landing3,
    Res.drawable.landing4,
    Res.drawable.landing5,
)

@OptIn(ExperimentalMaterial3Api::class)
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
        topBar = {
            WSTopBar(
                title = {
                    // HomeTopBarTab()
                },
                navigation = {
                    Image(
                        painter = painterResource(resource = Res.drawable.main_logo),
                        contentDescription = "Main_Logo",
                    )
                },
            )
        }
    ) { innerPadding ->
        VerticalPager(
            modifier = Modifier
                .fillMaxSize()
                .background(color = WeSpotThemeManager.colors.backgroundColor)
                .padding(innerPadding),
            state = pagerState,
        ) {
            Image(
                painter = painterResource(imageList[it]),
                contentDescription = "Lading Page Image $it",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { openPlayStore() },
                contentScale = ContentScale.FillWidth,
            )
        }
    }
}

@Composable
fun HomeTopBarTab(
    onTabClick: (Int) -> Unit,
) {

}
