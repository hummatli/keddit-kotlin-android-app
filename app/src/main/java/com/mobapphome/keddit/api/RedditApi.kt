package com.mobapphome.keddit.api

/**
 * Created by settar on 6/18/17.
 */


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface  RedditApi {
    @GET("/top.json")
    fun getTop(@Query("after") after: String,
               @Query("limit") limit: String): Call<RedditNewsResponse>;
}