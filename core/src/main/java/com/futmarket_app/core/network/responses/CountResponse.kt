package com.futmarket_app.core.network.responses

data class CountResponse (
    val players: Int,
    val coaches: Int,
    val clubs: Int,
    val competitions: Int,
    val referees: Int
)
