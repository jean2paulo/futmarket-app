package com.futmarket_app.core.network.responses

data class PlayerResponse(
    val id: String,
    val playerName: String,
    val firstName: String,
    val lastName: String,
    val alias: String,
    val nationImage: String,
    val club: String,
    val playerImage: String
)
