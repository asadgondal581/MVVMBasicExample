package com.example.mvvmbasicexample.viewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmbasicexample.model.DataModel

class MainViewModel : ViewModel() {
    private val model = DataModel(textForUI = "Here's the updated text!")
    val uiTextLiveData = MutableLiveData<String>()
    fun getUpdatedText() {
        val updatedText = model.textForUI
        uiTextLiveData.postValue(updatedText)
    }
}