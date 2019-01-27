package com.chetan.daggerapplication.di


import com.chetan.daggerapplication.employee.EmployeeActivity
import com.chetan.daggerapplication.models.Address
import com.chetan.daggerapplication.models.ContactDetails
import com.chetan.daggerapplication.models.EmployeeDetail
import dagger.Module
import dagger.Provides
import dagger.Subcomponent


@EmployeeScope
@Subcomponent(modules = [EmployeeModule::class])
interface EmployeeSubComponent {
    fun injectAt(activity: EmployeeActivity)
}

@Module
class EmployeeModule {
    @Provides
    @EmployeeScope
    fun provideEmployeeDetail(): EmployeeDetail = EmployeeDetail("Watson",
        Address("Baker street", "London"),
        ContactDetails("watson@gmail.com", "00123")
    )
}