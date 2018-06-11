package com.example.nb004.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver6 extends BroadcastReceiver {

    public MyReceiver6(){}

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"123123123123123",Toast.LENGTH_SHORT).show();
    }
}
