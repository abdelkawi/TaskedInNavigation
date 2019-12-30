package com.example.taskedinoneactivitynavtest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Splash :Fragment(R.layout.splash_fragment){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController().navigate(SplashDirections.actionSplashToHome())

    }
}