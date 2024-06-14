package com.varughese.myapplication

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class EncodeAndDecode : JSONData {
    override fun encode(data: Data): String {
        val json = Json.encodeToString(data)
        println("Encode: " + json)
        return json
    }

    override fun decode(json: String) {
        val obj = Json.decodeFromString<Data>(json)
        println("Decode: " + obj)
    }
}

fun main() {
    val encodeAndDecode = EncodeAndDecode()
    val data = Data("Blaise", "Varughese", "blaisevarughese@gmail.com")
    val json = encodeAndDecode.encode(data)
    encodeAndDecode.decode(json)
}