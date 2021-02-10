package com.sam.alramdemokt

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AlarmOnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_on)
        // Media player
        var mp = MediaPlayer.create(applicationContext,R.raw.baby_mix)
        mp.start()
        val btnStop = findViewById<Button>(R.id.button_stop)
        btnStop.setOnClickListener {
            mp.stop()
        }
    }
}