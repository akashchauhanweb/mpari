package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public enum by7 {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
