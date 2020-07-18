package com.gahlot.broadcastreceviers101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyFirstBroadcastReceiver myFirstBroadcastReceiver = new MyFirstBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        registerReceiver(myFirstBroadcastReceiver,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myFirstBroadcastReceiver);
    }

    public void sendBroadcasts(View view) {
        Intent intent = new Intent(this,ExplicitBroadcastReceiver.class);
        sendBroadcast(intent);
    }
}