package com.hajatonline.android.mobile.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.hajatonline.android.mobile.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainActivityView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityView::class.java)
        binding.txtCount.text = viewModel.getCurrentCount().toString()

        binding.buttonAddCount.setOnClickListener {
            binding.txtCount.text = viewModel.getUpdatedCount().toString()
        }
    }
}