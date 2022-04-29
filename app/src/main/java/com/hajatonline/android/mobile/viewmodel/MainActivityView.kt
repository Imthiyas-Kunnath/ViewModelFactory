package com.hajatonline.android.mobile.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityView(startingTotal : Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = total

    init {
        total.value = startingTotal
    }


    fun setTotal(input:Int){
        total.value = (total.value)?.plus(input);
    }


}