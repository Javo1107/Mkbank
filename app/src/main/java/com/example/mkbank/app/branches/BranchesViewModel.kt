package com.example.mkbank.app.branches

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BranchesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is branches Fragment"
    }
    val text: LiveData<String> = _text
}