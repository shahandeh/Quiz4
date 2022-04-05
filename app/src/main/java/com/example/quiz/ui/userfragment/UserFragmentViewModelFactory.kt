package com.example.quiz.ui.userfragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quiz.data.Repository
import com.example.quiz.ui.SharedViewModel

class UserFragmentViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return SharedViewModel(repository) as T

    }
}