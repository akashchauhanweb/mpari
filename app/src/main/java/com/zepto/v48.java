package com.zepto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class v48 extends yy0 {
    public static Intent o(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (s48.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != s48.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
