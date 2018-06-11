package com.example.nb004.broadcastreceiver;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button normal,order,stick,launch;
    MyReceiver6 myReceiver6 = new MyReceiver6();
    MyReceiver1 myReceiver1 = new MyReceiver1();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launch= findViewById(R.id.launch);
        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);


            }});

        normal = findViewById(R.id.normal);
        normal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent("com.example.action.MyReceiver");
                    it.putExtra("info","123");
                    MainActivity.this.sendBroadcast(it);
                }});
        order=findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.action.MyReceiver2");
                MainActivity.this.sendOrderedBroadcast(i,null);
            }});
        stick=findViewById(R.id.stick);
        stick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.action.MyReceiver3");
                MainActivity.this.sendStickyBroadcast(i);
            }});

    }
    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter filter = new IntentFilter("com.example.action.MyReceiver");
        //filter.addAction("");
        registerReceiver(myReceiver1,filter);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myReceiver6, intentFilter);
    }
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(myReceiver1);
    }
}
