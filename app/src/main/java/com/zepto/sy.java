package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class sy extends RuntimeException {
    public static final a e = new a(null);
    public final int c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sy(int i, Throwable th) {
        super(th);
        this.c = i;
    }
}
