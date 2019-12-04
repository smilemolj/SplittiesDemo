package com.fengzhisoft.splittiesdemo.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class User(@PrimaryKey(autoGenerate = true)
                var id: Long,
                var name: String,
                var email: String) {
    companion object {
        val TABLE_NAME = "User"
        val COLUMN_ID = "id"
        val COLUMN_NAME = "name"
        val COLUMN_EMAIL = "email"
    }
}
