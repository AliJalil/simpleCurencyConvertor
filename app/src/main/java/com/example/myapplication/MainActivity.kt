package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.viewModel.MainViewModel





class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}