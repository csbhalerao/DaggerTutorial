package com.chetan.daggerapplication.di

import com.chetan.daggerapplication.models.OfficeDetail
import com.chetan.daggerapplication.office.OfficeActivity
import dagger.Module
import dagger.Provides
import dagger.Subcomponent


@EmployeeScope
@Subcomponent(modules = [OfficeModule::class])
interface OfficeSubComponent {
    fun injectAt(activity: OfficeActivity)
}

@Module
class OfficeModule {
    @Provides
    @EmployeeScope
    fun provideOfficeDetail(): OfficeDetail = OfficeDetail("9977", "London bridge")
}