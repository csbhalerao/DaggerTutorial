package com.chetan.daggerapplication.di

import android.content.Context
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun addEmployeeSubComponent(module: EmployeeModule): EmployeeSubComponent
    fun addOfficeSubComponent(module: OfficeModule): OfficeSubComponent
}

@Module
class AppModule(val context: Context){
    @Singleton
    @Provides
    fun providesApplicationContext():Context = context
}