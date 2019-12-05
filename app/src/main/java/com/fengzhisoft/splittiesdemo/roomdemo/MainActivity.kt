package com.fengzhisoft.splittiesdemo.roomdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fengzhisoft.splittiesdemo.R
import kotlinx.android.synthetic.main.activity_main.*
import splitties.views.onClick
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.onClick {
            //            val roomDb = roomDb<AppDatabase>("database.db")
//            roomDb.transaction { db: AppDatabase ->
//                val dbloacl = db.openHelper.writableDatabase
////                (User.TABLE_NAME, User.COLUMN_NAME to "John", User.COLUMN_EMAIL to "user@domain.org")
//                val values = ContentValues()
//                values.put("id", 5)
//                values.put("name", "John Smith")
//                values.put("email", "user@domain.org")
////                db.insert("User", null, values)
//                dbloacl.insert(User.TABLE_NAME, 0, values)
//
//                val query = db.query(User.TABLE_NAME, arrayOf("name = John"))
//                textview.text=query.toString()
//            }

            val values = User(
                81,
                "John Smith",
                "user@domain.org"
            )

//            val db = Room.databaseBuilder(
//                application,
//                AppDatabase::class.java, "database-name"
//            ).build()

            val db =
                UserDatabase.instance(
                    this
                )

            thread {

//                db.userDao().deleteall(all)
//                db.clearAllTables()

                db.userDao().addUser(values)

                val all = db.userDao().getall()

//                val all=db.userDao().favoriteByIdandname(12,"John Smith")

                runOnUiThread {
                    textview.text = all.toString()
                }
            }

        }


    }
}
