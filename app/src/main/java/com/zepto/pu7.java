package com.zepto;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class pu7 {
    public static final String a;

    static {
        String strI = rn3.i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WakeLocks\")");
        a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qu7 qu7Var = qu7.a;
        synchronized (qu7Var) {
            linkedHashMap.putAll(qu7Var.a());
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                rn3.e().k(a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        qu7 qu7Var = qu7.a;
        synchronized (qu7Var) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
