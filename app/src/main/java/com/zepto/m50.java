package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m50 extends s70 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(Context context, uc6 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // com.zepto.s70
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // com.zepto.s70
    public void k(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        rn3.e().a(n50.a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    g(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                g(Boolean.FALSE);
            }
        }
    }

    @Override // com.zepto.dx0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            rn3.e().c(n50.a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
