package com.chetan.daggerapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chetan.daggerapplication.employee.EmployeeActivity
import com.chetan.daggerapplication.models.EmployeeDetail
import com.chetan.daggerapplication.office.OfficeActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addClickListeners()
    }

    private fun addClickListeners() {
        buttonEmployeeDetail.setOnClickListener {
            val intent: Intent = Intent(this, EmployeeActivity::class.java)
            startActivity(intent)
        }

        buttonOfficeDetail.setOnClickListener {
            val intent: Intent = Intent(this, OfficeActivity::class.java)
            startActivity(intent)
        }
    }

}

