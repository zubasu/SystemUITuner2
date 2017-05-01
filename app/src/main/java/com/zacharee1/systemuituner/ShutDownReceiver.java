package com.zacharee1.systemuituner;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by Zacha on 5/1/2017.
 */

public class ShutDownReceiver extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Settings.Secure.putString(context.getContentResolver(), "icon_blacklist", "");
    }
}