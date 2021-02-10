package com.sam.alramdemokt
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
class MyBroadcastReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        var i = Intent(context,AlarmOnActivity::class.java)
        // setting up flag
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(i)
    }
}