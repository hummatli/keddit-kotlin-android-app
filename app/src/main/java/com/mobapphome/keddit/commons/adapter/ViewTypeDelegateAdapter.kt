package com.mobapphome.keddit.commons.adapter

/**
 * Created by settar on 6/18/17.
 */

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}