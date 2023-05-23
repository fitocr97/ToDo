package com.example.todo

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoriesViewHolder(view:View) : RecyclerView.ViewHolder(view){
    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryMame)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory){
        tvCategoryName.text = "Example"
    }
}