package com.example.taskedinoneactivitynavtest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class MainViewModel :ViewModel(){
    var currentNavControllerLiveData: LiveData<NavController> = MutableLiveData<NavController>()

}