package com.wespot.web

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wespot.web.about.AboutScreen
import com.wespot.web.designsystem.component.WSTopBar
import com.wespot.web.designsystem.theme.StaticTypography
import com.wespot.web.designsystem.theme.WeSpotTheme
import com.wespot.web.designsystem.theme.WeSpotThemeManager
import com.wespot.web.home.HomeScreen
import org.jetbrains.compose.resources.painterResource
import wespot_web.composeapp.generated.resources.Res
import wespot_web.composeapp.generated.resources.main_logo

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeSpotService() {
    var currentSelectedItem by remember { mutableStateOf(0) }

    WeSpotTheme {
        Scaffold(
            topBar = {
                WSTopBar(
                    title = {
                        HomeTopNavigationTab(
                            selectedIndex = currentSelectedItem,
                            onSelected = {
                                currentSelectedItem = it
                            },
                        )
                    },
                    navigation = {
                        Image(
                            painter = painterResource(resource = Res.drawable.main_logo),
                            contentDescription = "Main_logo",
                        )
                    },
                )
            },
            modifier = Modifier.background(color = WeSpotThemeManager.colors.backgroundColor),
        ) {
            Box(modifier = Modifier.padding(it)) {
                RootNavigation(currentSelectedItem)
            }
        }
    }
}

@Composable
fun RootNavigation(selectedIndex: Int) {
    when (selectedIndex) {
        TopNavigationTabState.HOME.ordinal -> {
            HomeScreen()
        }
        TopNavigationTabState.ABOUT.ordinal -> {
            AboutScreen()
        }
    }
}

@Composable
fun HomeTopNavigationTab(
    selectedIndex: Int,
    onSelected: (Int) -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        NavigationBar(containerColor = WeSpotThemeManager.colors.backgroundColor) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                TopNavigationTabState.entries.forEachIndexed { index, state ->
                    TabItem(
                        title = state.title,
                        selected = selectedIndex == index,
                        onClick = { onSelected(index) },
                    )
                }
            }
        }
    }
}

@Composable
private fun RowScope.TabItem(
    title: String,
    selected: Boolean = false,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                onClick.invoke()
            },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = title,
            style = StaticTypography().body2,
            color = if (selected) {
                WeSpotThemeManager.colors.abledIconColor
            } else {
                WeSpotThemeManager.colors.disableIcnColor
            },
        )
    }
}

enum class TopNavigationTabState(
    val title: String,
) {
    HOME(title = "HOME"),
    ABOUT(title = "ABOUT"),
}
