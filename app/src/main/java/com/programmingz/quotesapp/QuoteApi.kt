package com.programmingz.quotesapp

import android.app.DownloadManager.Request
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApi {

    @GET("random")
    suspend fun getRandomQuote() : Response<List<QuoteModel>>
}