package com.example.himanishmunjal.listapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by himanishmunjal on 14/08/18.
 */

public class StartServiceAtBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent serviceLauncher = new Intent(context, MainActivity.class);
            context.startActivity(serviceLauncher);
        }
    }
}
