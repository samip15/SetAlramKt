package com.sam.alramdemokt

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextAlram = findViewById<EditText>(R.id.txt_edit)
        val btnAlram = findViewById<Button>(R.id.btn_alram)
        btnAlram.setOnClickListener {
            try {
                var sec = editTextAlram.text.toString().toInt()
                var i = Intent(applicationContext,MyBroadcastReceiver::class.java)
                var pi = PendingIntent.getBroadcast(applicationContext,111,i, 0)
                var am = getSystemService(Context.ALARM_SERVICE) as AlarmManager
                am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(sec*1000),pi)
                Toast.makeText(applicationContext, "Alarm is set for $sec Seconds", Toast.LENGTH_SHORT).show()
            }catch (e:NumberFormatException){
                null
                Toast.makeText(applicationContext, "Enter The Duration For Alarm", Toast.LENGTH_SHORT).show()
            }
        }
    }
}