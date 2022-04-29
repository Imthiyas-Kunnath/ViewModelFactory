package com.hajatonline.android.mobile.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hajatonline.android.mobile.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainActivityView
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this).get(MainActivityView::class.java)

        viewModel.totalData.observe(this, Observer {
            binding.txtCount.text = it.toString()
        })

     //   binding.txtCount.text = viewModel.getTotal().toString()

        binding.buttonAddCount.setOnClickListener {
            viewModel.setTotal(binding.etCount.text.toString().toInt())
       //     binding.txtCount.text = viewModel.getTotal().toString()
        }
    }
}