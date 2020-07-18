package com.gahlot.broadcastreceviers101;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExplicitBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "You Triggered me", Toast.LENGTH_SHORT).show();
    }
}
