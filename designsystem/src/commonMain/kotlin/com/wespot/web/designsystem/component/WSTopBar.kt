package com.wespot.web.designsystem.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.wespot.web.designsystem.theme.Gray400
import com.wespot.web.designsystem.theme.StaticTypography
import com.wespot.web.designsystem.theme.WeSpotThemeManager
import org.jetbrains.compose.resources.painterResource
import wespot_web.designsystem.generated.resources.Res
import wespot_web.designsystem.generated.resources.left_arrow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WSTopBar(
    title: @Composable () -> Unit = {},
    navigation: @Composable () -> Unit = {},
    canNavigateBack: Boolean = false,
    navigateUp: () -> Unit = {},
    action: @Composable RowScope.(textStyle: TextStyle) -> Unit = { },
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    CenterAlignedTopAppBar(
        title = title,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(
                    modifier = Modifier.padding(start = 4.dp),
                    onClick = { navigateUp.invoke() },
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.left_arrow),
                        contentDescription = "back_icon",
                    )
                }
            } else {
                navigation()
            }
        },
        actions = {
            action(StaticTypography().body4)
        },
        scrollBehavior = scrollBehavior,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = WeSpotThemeManager.colors.backgroundColor,
            navigationIconContentColor = Gray400,
            actionIconContentColor = Gray400,
        ),
    )
}
