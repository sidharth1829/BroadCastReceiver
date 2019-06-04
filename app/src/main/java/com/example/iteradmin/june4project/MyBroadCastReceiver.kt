package com.example.iteradmin.june4project

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val s:String?=p1?.action

        when(s){
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(p0,"Charging",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED -> {
                Toast.makeText(p0,"Charger Disconnected ...",Toast.LENGTH_LONG).show()
            }

        }
    }
}