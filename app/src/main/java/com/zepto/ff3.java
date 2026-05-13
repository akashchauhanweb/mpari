package com.zepto;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff3 extends Service implements df3 {
    public final androidx.lifecycle.x a = new androidx.lifecycle.x(this);

    @Override // com.zepto.df3
    public androidx.lifecycle.h g0() {
        return this.a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.a.e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
