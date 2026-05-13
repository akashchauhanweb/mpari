package com.zepto;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
public interface af3 {
    void b(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback c(String str, Class cls);

    Activity d();

    void startActivityForResult(Intent intent, int i);
}
