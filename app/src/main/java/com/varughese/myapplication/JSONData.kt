package com.varughese.myapplication

import kotlinx.serialization.json.Json

interface JSONData {
    fun encode(data: Data) : String
    fun decode(json: String)
}