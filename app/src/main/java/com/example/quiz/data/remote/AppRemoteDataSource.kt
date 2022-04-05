package com.example.quiz.data.remote

import com.example.quiz.data.RemoteDataSource
import com.example.quiz.data.remote.model.CreateUser
import com.example.quiz.data.remote.model.User
import com.example.quiz.data.remote.network.Api
import okhttp3.MultipartBody
import retrofit2.Response

class AppRemoteDataSource(
    private val api: Api
) : RemoteDataSource {

    override suspend fun createUser(user: CreateUser): String {
        return api.createUser(user)
    }

    override suspend fun uploadImage(id: String, image: MultipartBody.Part): Any {
        return api.uploadImage(id, image)
    }

    override suspend fun getUserList(): List<User> {
        return api.getUserList()
    }

    override suspend fun getUserInfo(id: String): User {
        return api.getUserInfo(id)
    }
}