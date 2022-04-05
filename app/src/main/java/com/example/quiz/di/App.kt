package com.example.quiz.di

import android.app.Application

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        serviceLocator = ServiceLocator()
    }
    var serviceLocator = ServiceLocator()

}