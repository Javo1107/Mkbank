package com.example.mkbank.app.foreignExchange

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ForeignExchangeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is foreign exchange Fragment"
    }
    val text: LiveData<String> = _text
}