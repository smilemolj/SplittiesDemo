package com.fengzhisoft.splittiesdemo.splittiesdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface IphoneDao {
    @get:Query("SELECT * FROM Iphone")
    val all: List<Iphone?>?

    @Insert
    fun insertAll(iphone: Array<Iphone>)
}