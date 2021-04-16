package jp.techacademy.yasushi.nagasaka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("たいやき", 100, "~~")
        human.say()
        human.think()

        val human2 = Human("たこやき", 200, "~~")
        human2.say()
        human2.think()




    }


}