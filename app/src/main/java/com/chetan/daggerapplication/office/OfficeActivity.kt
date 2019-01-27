package com.chetan.daggerapplication.office

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chetan.daggerapplication.MyProjectApplication
import com.chetan.daggerapplication.R
import com.chetan.daggerapplication.di.EmployeeModule
import com.chetan.daggerapplication.di.OfficeModule
import com.chetan.daggerapplication.models.OfficeDetail
import kotlinx.android.synthetic.main.activity_office.*
import javax.inject.Inject

class OfficeActivity : AppCompatActivity() {
    @Inject
    lateinit var officeDetail: OfficeDetail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office)
        val officeComponent =
            (application as MyProjectApplication).appComponent.addOfficeComponent(OfficeModule())
        officeComponent.injectAt(this)
        populateOfficeDetail()
    }

    private fun populateOfficeDetail() {
        textOfficeId.text = "Office Id :${officeDetail.officeId}"
        textOfficeAddress.text = "Office Address :${officeDetail.officeAddress}"
    }
}
