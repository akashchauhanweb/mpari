package com.zepto;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class js extends Service {

    public static class a {
        public static int a() {
            return ConstantsKt.MINIMUM_BLOCK_SIZE;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) js.class), a.a() | 128);
    }
}
