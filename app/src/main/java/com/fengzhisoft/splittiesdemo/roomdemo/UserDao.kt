package com.fengzhisoft.splittiesdemo.roomdemo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.fengzhisoft.splittiesdemo.roomdemo.User

@Dao
interface UserDao {
    @get:Query("SELECT * FROM User")
    val all: List<User?>?

    @Insert
    fun insertAll(vararg users: User?)
}