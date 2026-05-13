package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f36 {
    public String a;
    public Integer b;
    public String c;
    public gm5 d;

    public /* synthetic */ f36(Integer num, String str, gm5 gm5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : gm5Var);
    }

    public final Integer a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final gm5 c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public f36(Integer num, String str, gm5 gm5Var) {
        this.b = num;
        this.c = str;
        this.d = gm5Var;
    }
}
