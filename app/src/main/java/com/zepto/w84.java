package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class w84 {
    public static final u84 a = c();
    public static final u84 b = new v84();

    public static u84 a() {
        return a;
    }

    public static u84 b() {
        return b;
    }

    public static u84 c() {
        try {
            return (u84) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
