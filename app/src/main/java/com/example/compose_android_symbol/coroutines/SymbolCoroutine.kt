package com.example.compose_android_symbol.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {
        // 会阻塞当期线程
        doWorld()


    }
}

private suspend fun doWorld() = coroutineScope {

    val job = launch {
        delay(1000L)
        print(" from job ")
    }

    launch {
        delay(1000L)
        print(" 1000L delay")
    }

    job.join()

    launch {
        delay(2000L)
        print(" symbol AAA  ")
    }
    print("from doworld ")
}
