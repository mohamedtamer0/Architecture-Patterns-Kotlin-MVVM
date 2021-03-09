package com.example.architecture_patterns_kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.architecture_patterns_kotlin.model.DataModel

class MainViewModel : ViewModel() {

    private val model = DataModel(textForUI = "Here's the update text!")

    val uiTextLiveData = MutableLiveData<String>()

    fun getUpdateText() {
        val updateText = model.textForUI
        uiTextLiveData.postValue(updateText)
    }



}