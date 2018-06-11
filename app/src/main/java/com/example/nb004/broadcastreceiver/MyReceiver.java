package com.example.nb004.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String sss=intent.getStringExtra("info");

        Toast.makeText(context,sss,Toast.LENGTH_SHORT).show();
    }
}
