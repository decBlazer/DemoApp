package com.varughese.myapplication

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Data(val firstName: String, val lastName: String, val email: String)
