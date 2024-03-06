package com.example.compose_android_symbol.coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext
import kotlin.math.log


fun main() {
    runBlocking {
        val channel = Channel<String>()
        val bufferChannel = Channel<String>(10)
        launch {
            channel.send("A1")
            channel.send("A2")
            myLog("A Down")
        }

        launch {
            channel.send("B")
            myLog("B Down")
        }

        launch {
            repeat(3) {
                val r = channel.receive()
                myLog(r)
            }
        }



        async(start = CoroutineStart.LAZY) {

        }
    }


}

private fun myLog(name: String) {
    println("[${Thread.currentThread().name}]-$name")
}


class SymbolChannels {
}