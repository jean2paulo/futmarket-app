package com.futmarket_app.core.network.repositories

import androidx.annotation.VisibleForTesting
import com.futmarket_app.core.BuildConfig
import com.futmarket_app.core.network.responses.SearchResponse
import com.futmarket_app.core.network.services.RapidApiService

class RapidApiRepository(
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    internal val service: RapidApiService
) {

    suspend fun search(query: String): SearchResponse {
        return service.search(
            query
        )
    }

}