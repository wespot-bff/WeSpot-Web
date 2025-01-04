package com.wespot.web.home

fun openPlayStore() {
    js("window.open('https://play.google.com/store/apps/details?id=com.bff.wespot.real', '_blank')")
}

fun openAppStore() {
    js("window.open('https://apps.apple.com/kr/app/wespot-%EC%9A%B0%EB%A6%AC%EA%B0%80-%EC%97%B0%EA%B2%B0%EB%90%98%EB%8A%94-%EA%B3%B5%EA%B0%84/id6661029016', '_blank')")
}
