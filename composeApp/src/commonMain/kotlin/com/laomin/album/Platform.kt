package com.laomin.album

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform