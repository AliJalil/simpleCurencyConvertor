package com.example.myapplication

import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter

@BindingAdapter("myToast")
fun showToast(
    view: View,
    str:String
) {
    Toast.makeText(view.context, str, Toast.LENGTH_SHORT).show()
}
