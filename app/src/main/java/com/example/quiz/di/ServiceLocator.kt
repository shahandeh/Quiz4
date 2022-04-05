package com.example.quiz.di

import android.app.Application
import com.example.quiz.data.Repository
import com.example.quiz.data.remote.AppRemoteDataSource
import com.example.quiz.data.remote.network.NetworkManager

class ServiceLocator() {

//    private val appLocalDataSource = AppLocalDataSource(AppDataBase.getDatabase(application).movieDao())
    private val appRemoteDateSource = AppRemoteDataSource(NetworkManager.service)

    val repository = Repository(appRemoteDateSource)

}