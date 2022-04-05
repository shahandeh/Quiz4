package com.example.quiz.data

import com.example.quiz.data.remote.model.CreateUser
import com.example.quiz.data.remote.model.User
import okhttp3.MultipartBody
import okhttp3.Request
import retrofit2.Response

interface RemoteDataSource {

    suspend fun createUser(user: CreateUser): String

    suspend fun uploadImage(id: String, image: MultipartBody.Part): Any

    suspend fun getUserList(): List<User>

    suspend fun getUserInfo(id: String): User

}