package com.futmarket_app.core.di.modules

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.futmarket_app.core.BuildConfig
import okhttp3.Request

class NetworkModule {

    fun provideHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        val clientBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            clientBuilder.addInterceptor(interceptor)
        }

        //Add headers to all requests
        clientBuilder.addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader("X-RapidAPI-Host", BuildConfig.RAPID_API_HOST)
                .addHeader("X-RapidAPI-Key", BuildConfig.RAPID_API_KEY)
                .build()
            chain.proceed(request)
        }
        return clientBuilder.build()
    }

    fun provideRetrofitBuilder() =
        Retrofit.Builder()
            .baseUrl(BuildConfig.RAPID_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

}