package com.gahlot.broadcastreceviers101;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyFirstBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Toast.makeText(context, "Phone has booted successfully", Toast.LENGTH_SHORT).show();
        } else if (Intent.ACTION_LOCALE_CHANGED.equals(intent.getAction())) {
            Toast.makeText(context,"Language is changed", Toast.LENGTH_SHORT).show();
        } else if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {
            Toast.makeText(context,"Charger is connected", Toast.LENGTH_SHORT).show();
        }
    }
}
