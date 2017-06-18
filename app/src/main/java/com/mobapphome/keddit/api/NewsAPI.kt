package com.mobapphome.keddit.api

import retrofit2.Call

/**
 * Created by settar on 6/18/17.
 */

interface NewsAPI {
    fun getNews(after: String, limit: String): Call<RedditNewsResponse>
}