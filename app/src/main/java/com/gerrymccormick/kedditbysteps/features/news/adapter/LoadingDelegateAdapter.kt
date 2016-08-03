package com.gerrymccormick.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.gerrymccormick.kedditbysteps.commons.adapter.ViewType
import com.gerrymccormick.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import com.gerrymccormick.kedditbysteps.R
import com.gerrymccormick.kedditbysteps.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}