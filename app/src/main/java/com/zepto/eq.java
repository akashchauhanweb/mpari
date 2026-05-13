package com.zepto;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class eq extends Exception {
    public final Status c;

    public eq(Status status) {
        super(status.e() + ": " + (status.f() != null ? status.f() : ""));
        this.c = status;
    }

    public Status a() {
        return this.c;
    }
}
