package com.zepto;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class ed6 {
    public static void a(Status status, rc6 rc6Var) {
        b(status, null, rc6Var);
    }

    public static void b(Status status, Object obj, rc6 rc6Var) {
        if (status.h()) {
            rc6Var.c(obj);
        } else {
            rc6Var.b(gq.a(status));
        }
    }
}
