package com.zepto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s70 extends dx0 {
    public final BroadcastReceiver f;

    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            s70.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(Context context, uc6 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f = new a();
    }

    @Override // com.zepto.dx0
    public void h() {
        rn3.e().a(t70.a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f, j());
    }

    @Override // com.zepto.dx0
    public void i() {
        rn3.e().a(t70.a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
