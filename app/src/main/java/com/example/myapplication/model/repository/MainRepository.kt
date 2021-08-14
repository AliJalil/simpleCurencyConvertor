package com.example.myapplication.model.repository

import com.example.myapplication.model.domain.Currency
import com.example.myapplication.model.domain.Currency.*

class MainRepository {

    fun getConvertedData(from: Currency, amount: Double): Double {
        when (from) {
            IQD -> return amount / 1460
            USD -> return amount * 1460
        }
    }
}