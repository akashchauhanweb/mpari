package com.zepto;

import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class gw4 {
    public static final gw4 a = new gw4();

    public final String a() {
        return jt.c.i();
    }

    public final boolean b() {
        return StringsKt__StringsJVMKt.equals(jt.c.i(), "nonprod", true);
    }

    public final boolean c() {
        return StringsKt__StringsJVMKt.equals(jt.c.i(), "prod", true);
    }
}
