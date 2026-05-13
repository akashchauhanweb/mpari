package com.zepto;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class qg8 extends Handler {
    public final Looper a;

    public qg8(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public qg8(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
