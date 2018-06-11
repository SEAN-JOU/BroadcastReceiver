package com.example.nb004.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver3 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"have order MyReceiver3",Toast.LENGTH_SHORT).show();
        Bundle bundle = new Bundle();
        bundle.putString("1111","aaaa");
        this.setResultExtras(bundle);
        //this.abortBroadcast();
    }
}
