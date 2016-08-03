package com.gerrymccormick.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.gerrymccormick.kedditbysteps.R
import com.gerrymccormick.kedditbysteps.commons.RedditNewsItem
import com.gerrymccormick.kedditbysteps.commons.adapter.ViewType
import com.gerrymccormick.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import com.gerrymccormick.kedditbysteps.commons.extensions.getFriendlyTime
import com.gerrymccormick.kedditbysteps.commons.extensions.inflate
import com.gerrymccormick.kedditbysteps.commons.extensions.loadImg

import kotlinx.android.synthetic.main.news_item.view.*

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class NewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}