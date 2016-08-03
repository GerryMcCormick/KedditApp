package com.gerrymccormick.kedditbysteps

import android.app.Application
import com.gerrymccormick.kedditbysteps.di.AppModule
import com.gerrymccormick.kedditbysteps.di.news.DaggerNewsComponent
import com.gerrymccormick.kedditbysteps.di.news.NewsComponent

class KedditApp : Application() {

    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()
        newsComponent = DaggerNewsComponent.builder()
                .appModule(AppModule(this))
                //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
                .build()
    }
}