package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.domain.Currency
import com.example.myapplication.model.repository.MainRepository

class MainViewModel : ViewModel() {

    private val repository = MainRepository()

    private val _result = MutableLiveData<Double>()
    val result: LiveData<Double>
        get() = _result

    fun getCurrency(from: Currency, amount: String) {
        _result.postValue(repository.getConvertedData(from, amount.toDouble()))
    }
}