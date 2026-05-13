package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j50 extends s70 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(Context context, uc6 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // com.zepto.s70
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.zepto.s70
    public void k(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        rn3.e().a(k50.a, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    g(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    g(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    g(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    g(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public final boolean l(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.zepto.dx0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(l(intentRegisterReceiver));
        }
        rn3.e().c(k50.a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
