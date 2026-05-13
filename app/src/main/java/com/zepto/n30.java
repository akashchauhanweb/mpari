package com.zepto;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n30 {
    public static final a e = new a(null);
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n30(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n30(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        bq bqVar = bq.a;
        this(bqVar.d(backEvent), bqVar.e(backEvent), bqVar.b(backEvent), bqVar.c(backEvent));
    }
}
