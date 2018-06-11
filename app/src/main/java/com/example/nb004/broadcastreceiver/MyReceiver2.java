package com.example.nb004.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle =getResultExtras(true);
        String info = bundle.getString("1111");
        Toast.makeText(context,info,Toast.LENGTH_SHORT).show();
    }
}
