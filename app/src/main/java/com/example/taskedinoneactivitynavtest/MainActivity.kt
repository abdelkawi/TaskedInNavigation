package com.example.taskedinoneactivitynavtest


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)

        setContentView(R.layout.activity_main)
        findNavController(R.id.fragment_main_host).addOnDestinationChangedListener { controller, destination, arguments ->
            Log.d("xxxxxxxxxxx",destination.toString())

            when(destination.id){
                R.id.home->{
                   setTheme(R.style.AppTheme_NoActionBar)
                }
                R.id.splash->{

                }
            }
        }
        createNote()
    }

    fun createNote() {
        val pendingIntent = NavDeepLinkBuilder(this)
            .setGraph(R.navigation.home_bottom_nav)
            .setDestination(R.id.chatRoom)
            .createPendingIntent()
        var builder = NotificationCompat.Builder(this, "testing")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Single Chat room")
            .setContentText("this is to test single chat  room")
            .setChannelId("testing")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
        with(NotificationManagerCompat.from(this)) {
            // notificationId is a unique int for each notification that you must define
            notify(1, builder.build())
        }
    }
}
