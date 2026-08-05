package com.example.cubic

actual fun platformName(): String {
    return "JVM ${System.getProperty("os.name")} (${Runtime.version()})"
}