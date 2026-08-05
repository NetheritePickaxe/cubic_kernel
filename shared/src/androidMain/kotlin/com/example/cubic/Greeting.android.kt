package com.example.cubic

actual fun platformName(): String {
    return "Android ${android.os.Build.VERSION.SDK_INT}"
}