package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class j72 {
    public static final h72 a = new i72();
    public static final h72 b = c();

    public static h72 a() {
        h72 h72Var = b;
        if (h72Var != null) {
            return h72Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static h72 b() {
        return a;
    }

    public static h72 c() {
        try {
            return (h72) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
