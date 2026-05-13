package com.zepto;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ej6 {
    public final dx0 a;
    public final m50 b;
    public final dx0 c;
    public final dx0 d;

    public ej6(Context context, uc6 taskExecutor, dx0 batteryChargingTracker, m50 batteryNotLowTracker, dx0 networkStateTracker, dx0 storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.a = batteryChargingTracker;
        this.b = batteryNotLowTracker;
        this.c = networkStateTracker;
        this.d = storageNotLowTracker;
    }

    public final dx0 a() {
        return this.a;
    }

    public final m50 b() {
        return this.b;
    }

    public final dx0 c() {
        return this.c;
    }

    public final dx0 d() {
        return this.d;
    }

    public /* synthetic */ ej6(Context context, uc6 uc6Var, dx0 dx0Var, m50 m50Var, dx0 dx0Var2, dx0 dx0Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        dx0 j50Var;
        m50 m50Var2;
        dx0 dx0VarA;
        dx0 p76Var;
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            j50Var = new j50(applicationContext, uc6Var);
        } else {
            j50Var = dx0Var;
        }
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            m50Var2 = new m50(applicationContext2, uc6Var);
        } else {
            m50Var2 = m50Var;
        }
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            dx0VarA = p44.a(applicationContext3, uc6Var);
        } else {
            dx0VarA = dx0Var2;
        }
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            p76Var = new p76(applicationContext4, uc6Var);
        } else {
            p76Var = dx0Var3;
        }
        this(context, uc6Var, j50Var, m50Var2, dx0VarA, p76Var);
    }
}
