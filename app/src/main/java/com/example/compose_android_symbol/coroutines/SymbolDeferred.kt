package com.example.compose_android_symbol.coroutines

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {

        val deferred: Deferred<Int> = async {
            loadData()
        }
        println("wating")
        println(deferred.await())


    }
}

suspend fun loadData(): Int {
    print("loading ...")
    delay(1000L)
    println("down")
    return 12
}


class SymbolDeferred {
}