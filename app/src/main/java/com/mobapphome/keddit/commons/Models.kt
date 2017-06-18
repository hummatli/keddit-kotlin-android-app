package com.mobapphome.keddit.commons

import com.mobapphome.keddit.commons.adapter.AdapterConstants
import com.mobapphome.keddit.commons.adapter.ViewType

/**
 * Created by settar on 6/18/17.
 */

data class RedditNews(
        val after: String,
        val before: String,
        val news: List<RedditNewsItem>)

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}