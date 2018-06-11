package com.example.nb004.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {



        Toast.makeText(context,"sss",Toast.LENGTH_SHORT).show();
    }
}
