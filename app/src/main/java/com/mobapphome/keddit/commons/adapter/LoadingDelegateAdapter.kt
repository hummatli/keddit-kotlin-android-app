package com.mobapphome.keddit.commons.adapter

/**
 * Created by settar on 6/18/17.
 */

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.mobapphome.keddit.R
import com.mobapphome.keddit.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}