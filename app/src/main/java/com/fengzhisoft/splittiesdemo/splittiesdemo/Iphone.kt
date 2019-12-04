package com.fengzhisoft.splittiesdemo.splittiesdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Iphone")
data class Iphone(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var type: String,
    var type2: String
)