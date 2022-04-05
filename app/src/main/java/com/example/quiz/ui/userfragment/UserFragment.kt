package com.example.quiz.ui.userfragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.R
import com.example.quiz.di.App
import com.example.quiz.ui.RecyclerViewAdapter
import com.example.quiz.ui.SharedViewModel

class UserFragment: Fragment(R.layout.fragment_user) {

    private val viewModelHome by activityViewModels<SharedViewModel>{
        UserFragmentViewModelFactory(App().serviceLocator.repository)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModelHome.getUserList()
        viewModelHome.userList.observe(viewLifecycleOwner){
            val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_fragment_user)
            recyclerView.adapter = RecyclerViewAdapter(it)
        }

    }

}