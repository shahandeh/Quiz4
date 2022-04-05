package com.example.quiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.R
import com.example.quiz.data.remote.model.User

class RecyclerViewAdapter(
    private val list: List<User>
) : RecyclerView.Adapter<RecyclerViewAdapter.AppViewHolder>() {

    class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val username = itemView.findViewById<TextView>(R.id.username_recycler_view_sample)
        fun bind(user: User) {
            username.text = user._id
        }

        override fun onClick(p0: View?) {
            //
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_sample, parent, false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}