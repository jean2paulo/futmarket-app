package com.futmarket_app.core.network.responses


/**
 * Marvel API character network response item.
 *
 * @param count An object that contains how many items of each type it was found
 * @param players A list of players found
 * @param clubs A list of clubs found
 * @param thumbnail The representative image for this character.
 */

data class SearchResponse (
    val count: CountResponse,
    val players: List<PlayerResponse>,
    val clubs: List<ClubResponse>
)