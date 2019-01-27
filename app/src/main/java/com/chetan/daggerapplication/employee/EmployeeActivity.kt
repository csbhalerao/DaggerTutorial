package com.chetan.daggerapplication.employee

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.chetan.daggerapplication.MyProjectApplication
import com.chetan.daggerapplication.R
import com.chetan.daggerapplication.di.EmployeeModule
import com.chetan.daggerapplication.models.EmployeeDetail

import kotlinx.android.synthetic.main.activity_employee.*
import javax.inject.Inject

class EmployeeActivity : AppCompatActivity() {
    @Inject
    lateinit var employeeDetail: EmployeeDetail
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        val employeeComponent =
            (application as MyProjectApplication).appComponent.addEmployeeComponent(EmployeeModule())
        employeeComponent.injectAt(this)
        populateEmployeeDetail()
    }

    private fun populateEmployeeDetail() {
        textEmployeeName.text = "Employee Name: ${employeeDetail.name}"
        textEmployeeAddress.text = "Employee Address: ${employeeDetail.address.address}"
        textEmployeeEmail.text = "Employee Email: ${employeeDetail.contactDetails.email}"
    }

}
