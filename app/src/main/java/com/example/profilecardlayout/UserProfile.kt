package com.example.profilecardlayout

data class UserProfile(val name: String, val status: Boolean, val drawableId: Int)

val userList = arrayListOf<UserProfile>(
    UserProfile(name = "John Doe", status = true, drawableId = R.drawable.profile_picture),
    UserProfile(name = "Anna Joe", status = false, drawableId = R.drawable.profile_picture),
)