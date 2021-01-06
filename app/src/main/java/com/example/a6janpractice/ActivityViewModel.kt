package com.example.a6janpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel: ViewModel() {
    val stringLiveData = MutableLiveData<String>()

    fun setString(string: String) {
        stringLiveData.value = string
    }
}