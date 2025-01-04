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

  public val landing1: DrawableResource by 
      lazy { init_landing1() }

  public val landing2: DrawableResource by 
      lazy { init_landing2() }

  public val landing3: DrawableResource by 
      lazy { init_landing3() }

  public val landing4: DrawableResource by 
      lazy { init_landing4() }

  public val landing5: DrawableResource by 
      lazy { init_landing5() }

  public val main_logo: DrawableResource by 
      lazy { init_main_logo() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", CommonMainDrawable0.compose_multiplatform)
  map.put("landing1", CommonMainDrawable0.landing1)
  map.put("landing2", CommonMainDrawable0.landing2)
  map.put("landing3", CommonMainDrawable0.landing3)
  map.put("landing4", CommonMainDrawable0.landing4)
  map.put("landing5", CommonMainDrawable0.landing5)
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

internal val Res.drawable.landing1: DrawableResource
  get() = CommonMainDrawable0.landing1

private fun init_landing1(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:landing1",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/landing1.png", -1, -1),
    )
)

internal val Res.drawable.landing2: DrawableResource
  get() = CommonMainDrawable0.landing2

private fun init_landing2(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:landing2",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/landing2.png", -1, -1),
    )
)

internal val Res.drawable.landing3: DrawableResource
  get() = CommonMainDrawable0.landing3

private fun init_landing3(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:landing3",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/landing3.png", -1, -1),
    )
)

internal val Res.drawable.landing4: DrawableResource
  get() = CommonMainDrawable0.landing4

private fun init_landing4(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:landing4",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/landing4.png", -1, -1),
    )
)

internal val Res.drawable.landing5: DrawableResource
  get() = CommonMainDrawable0.landing5

private fun init_landing5(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:landing5",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/wespot_web.composeapp.generated.resources/drawable/landing5.png", -1, -1),
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
