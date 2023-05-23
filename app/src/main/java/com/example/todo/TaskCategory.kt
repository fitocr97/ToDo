package com.example.todo

sealed class TaskCategory {
    //create objets to send to recycler view
    object Personal:TaskCategory()
    object Business:TaskCategory()
    object Other:TaskCategory()
}