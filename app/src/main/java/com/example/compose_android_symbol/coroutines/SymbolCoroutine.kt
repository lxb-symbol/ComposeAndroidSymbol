package com.example.compose_android_symbol.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {
//            doWorld()
        launch {
            doWorld()
        }
        print("symbol print ")
    }
}

private suspend fun doWorld() {
    delay(1000L)
    print("from doworld")
}

