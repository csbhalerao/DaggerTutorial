package com.chetan.daggerapplication.models


data class Address(val address: String, val city: String)
data class ContactDetails(val email: String, val phoneNo: String)
data class EmployeeDetail(val name: String, val address: Address,
                          val contactDetails: ContactDetails)
