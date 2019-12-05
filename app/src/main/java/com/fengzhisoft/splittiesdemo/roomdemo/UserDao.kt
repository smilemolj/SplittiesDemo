package com.fengzhisoft.splittiesdemo.roomdemo

import androidx.room.*
import com.fengzhisoft.splittiesdemo.roomdemo.User

@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    fun getall(): List<User?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(listusers: List<User?>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(users: User)

    @Delete
    fun delete(users: User)

    @Delete
    fun deleteall(userslist: List<User?>?)

    @Query("SELECT * FROM User WHERE id = :id and name= :name")
    fun favoriteByIdandname(id: Int, name: String): User

}