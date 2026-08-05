package com.example.cubic

expect fun platformName(): String

class SharedGreeting {
    fun greet(): String {
        return "Hello from ${platformName()}!"
    }
}