package com.hajatonline.android.mobile.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityView : ViewModel() {
    private var count = 0

    fun getCurrentCount():Int{
        return count
    }

    fun getUpdatedCount():Int{
        return count++;
    }

}