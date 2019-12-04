package com.fengzhisoft.splittiesdemo.splittiesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fengzhisoft.splittiesdemo.R
import com.orhanobut.logger.Logger
import kotlinx.android.synthetic.main.activity_main2.*
import splitties.arch.room.inTransaction
import splitties.arch.room.roomDb
import splitties.arch.room.transaction
import splitties.views.onClick
import kotlin.concurrent.thread

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button2.onClick {
            val iphone = Iphone(0, "iphone11", "type2")
            val db = roomDb<IphoneDatabase>(this, "iphone1.db", { fallbackToDestructiveMigration() })
            thread {
                val all=db.inTransaction {
                    it.iphoneDao().insertAll(arrayOf(iphone, iphone))
                    it.iphoneDao().all
                }
                runOnUiThread {
                    textView2.text = all.toString()
                }

//                db.transaction {
//                    it.iphoneDao().insertAll(arrayOf(iphone, iphone))
//                    val all = it.iphoneDao().all
//                    runOnUiThread {
//                        textView2.text = all.toString()
//                    }
//                    Logger.i("666")
//                }
            }

//            thread {
//                db.iphoneDao().insertAll(arrayOf(iphone, iphone))
//                val all = db.iphoneDao().all
//                runOnUiThread {
//                    textView2.text = all.toString()
//                }
//            }

        }
    }
}
