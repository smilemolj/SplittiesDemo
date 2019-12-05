package com.fengzhisoft.splittiesdemo.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
//自动增加是要写的，只要注意插入数据时冲突的规则为替换就好了，清空表直接用db.clearAllTables()
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
