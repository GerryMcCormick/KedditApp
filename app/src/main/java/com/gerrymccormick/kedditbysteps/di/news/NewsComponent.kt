package com.gerrymccormick.kedditbysteps.di.news

import com.gerrymccormick.kedditbysteps.di.AppModule
import com.gerrymccormick.kedditbysteps.di.NetworkModule
import com.gerrymccormick.kedditbysteps.features.news.NewsFragment
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        NewsModule::class,
        NetworkModule::class)
)
interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}