package com.zepto;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class z63 {

    public static class a {
        public static KeyguardManager a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        public static boolean b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    public static KeyguardManager a(Context context) {
        return a.a(context);
    }

    public static boolean b(Context context) {
        KeyguardManager keyguardManagerA = a(context);
        if (keyguardManagerA == null) {
            return false;
        }
        return a.b(keyguardManagerA);
    }
}
