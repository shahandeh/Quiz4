package com.example.quiz.data

import com.example.quiz.data.remote.model.CreateUser
import com.example.quiz.data.remote.model.User
import okhttp3.MultipartBody
import retrofit2.Response

class Repository(
    private val remoteDataSource: RemoteDataSource
) {

    suspend fun createUser(user: CreateUser): String {
        return remoteDataSource.createUser(user)
    }

    suspend fun uploadImage(id: String, image: MultipartBody.Part): Any {
        return remoteDataSource.uploadImage(id, image)
    }

    suspend fun getUserList(): List<User> {
        return remoteDataSource.getUserList()
    }

    suspend fun getUserInfo(id: String): User {
        return remoteDataSource.getUserInfo(id)
    }



}