package com.zepto;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class v28 extends b58 {
    public final Context a;
    public final /* synthetic */ xj2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v28(xj2 xj2Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = xj2Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int iF = this.b.f(this.a);
        if (this.b.i(iF)) {
            this.b.n(this.a, iF);
        }
    }
}
