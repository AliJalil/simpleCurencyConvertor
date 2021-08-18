package com.example.myapplication.model.repository

import com.example.myapplication.model.domain.Currency
import com.example.myapplication.model.domain.Currency.*

class MainRepository {

    fun getConvertedData(from: Currency, amount: Double): Double {
        return when (from) {
            IQD -> amount / 1460
            USD -> amount * 1460
        }
    }
}