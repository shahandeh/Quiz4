package com.example.quiz.ui

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quiz.data.Repository
import com.example.quiz.data.remote.model.CreateUser
import com.example.quiz.data.remote.model.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import retrofit2.Response

class SharedViewModel(
    private val repository: Repository
) : ViewModel() {

    val userList = MutableLiveData<List<User>>()
    val userInfo = MutableLiveData<User>()

    fun createUser(user: CreateUser) {
        CoroutineScope(IO).launch {
            repository.createUser(user)
        }
    }

    fun uploadImage(id: String, image: MultipartBody.Part) {
        CoroutineScope(IO).launch {
            repository.uploadImage(id, image)
        }
    }

    fun getUserList() {
        CoroutineScope(IO).launch {
            userList.postValue(repository.getUserList())
        }
    }

    fun getUserInfo(id: String) {
        CoroutineScope(IO).launch {
            userInfo.postValue(repository.getUserInfo(id))
        }
    }

}