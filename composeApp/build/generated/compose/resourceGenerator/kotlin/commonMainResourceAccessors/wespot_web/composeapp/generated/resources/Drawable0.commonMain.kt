@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package wespot_web.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainDrawable0 {
  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }

  public val landinPage: DrawableResource by 
      lazy { init_landinPage() }

  public val main_logo: DrawableResource by 
      lazy { init_main_logo() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", CommonMainDrawable0.compose_multiplatform)
  map.put("landinPage", CommonMainDrawable0.landinPage)
  map.put("main_logo", CommonMainDrawable0.main_logo)
}

internal val Res.drawable.compose_multiplatform: DrawableResource
  get() = CommonMainDrawable0.compose_multiplatform

private fun init_compose_multiplatform(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:compose_multiplatform",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/compose-multiplatform.xml", -1, -1),
    )
)

internal val Res.drawable.landinPage: DrawableResource
  get() = CommonMainDrawable0.landinPage

private fun init_landinPage(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:landinPage",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/landinPage.png", -1, -1),
    )
)

internal val Res.drawable.main_logo: DrawableResource
  get() = CommonMainDrawable0.main_logo

private fun init_main_logo(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:main_logo",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/main_logo.xml", -1, -1),
    )
)
