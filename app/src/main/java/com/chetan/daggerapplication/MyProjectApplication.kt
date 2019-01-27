package com.chetan.daggerapplication

import android.app.Application
import com.chetan.daggerapplication.di.AppComponent
import com.chetan.daggerapplication.di.AppModule
import com.chetan.daggerapplication.di.DaggerAppComponent


class MyProjectApplication: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}