package com.example.quiz.data.remote.network

import com.example.quiz.data.remote.model.CreateUser
import com.example.quiz.data.remote.model.User
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface Api {

    @POST("users")
    suspend fun createUser(@Body user: CreateUser) : String

    @Multipart
    @POST("users/{id}/image") suspend fun uploadImage(@Path("id")id:String, @Part image : MultipartBody.Part): Any

    @GET("users") suspend fun getUserList(): List<User>


    @GET("users/{id}") suspend fun getUserInfo(@Path("id")id:String): User
}