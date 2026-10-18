package com.hongphil.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(5000L)
        println("World!")
    }
    println("Hello,")
}
