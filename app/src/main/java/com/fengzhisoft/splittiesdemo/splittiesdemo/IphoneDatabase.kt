package com.fengzhisoft.splittiesdemo.splittiesdemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Iphone::class], version = 3)
abstract class IphoneDatabase : RoomDatabase() {
    abstract fun iphoneDao(): IphoneDao
}