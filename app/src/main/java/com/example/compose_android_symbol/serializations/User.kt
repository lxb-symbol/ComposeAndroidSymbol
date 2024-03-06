package com.example.compose_android_symbol.serializations

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class User(val name: String, val age: Int)


fun  main(){
    val json = Json.encodeToString(User("symbol",18))
    print(json)

    val jsonOrigin  ="""
        {"name":"symbol", "age": 22}
    """
    val obj = Json.decodeFromString<User>(jsonOrigin)
    print(obj)



}
