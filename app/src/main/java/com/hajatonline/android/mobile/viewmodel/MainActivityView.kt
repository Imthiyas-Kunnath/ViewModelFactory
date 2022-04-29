package com.hajatonline.android.mobile.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityView(startingTotal : Int) : ViewModel() {
    private var total = 0

    init {
        total = startingTotal
    }
    fun getTotal():Int{
        return total
    }

    fun setTotal(input:Int){
        total+=input;
    }


}