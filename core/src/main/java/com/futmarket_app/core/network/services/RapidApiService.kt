package com.futmarket_app.core.network.services

import com.futmarket_app.core.BuildConfig
import com.futmarket_app.core.network.responses.SearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

private const val API_HOST = BuildConfig.RAPID_API_HOST
private const val API_KEY = BuildConfig.RAPID_API_KEY

interface RapidApiService {

    /**
     * Fetches a single character resource. It is the canonical URI for any character resource
     * provided by the API.
     *
     * @param id A single character id.
     * @param apiKey A unique identifier used to authenticate all calling to an API.
     * @param hash A md5 digest of the ts parameter, private API key and public.
     * @param timestamp A digital current record of the time.
     * @return Response for single character resource.
     */
    @GET("/search")
    suspend fun search(
        @Query("query") query: String
    ): SearchResponse

}