package com.zepto;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class sd8 extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (str != "com.google.android.gms.iid.MessengerCompat" && (str == null || !str.equals("com.google.android.gms.iid.MessengerCompat"))) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return tf8.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return tf8.class;
    }
}
