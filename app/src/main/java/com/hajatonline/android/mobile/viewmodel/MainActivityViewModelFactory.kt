package com.hajatonline.android.mobile.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import java.lang.IllegalArgumentException

class MainActivityViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityView::class.java)){
            return MainActivityView(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }


}