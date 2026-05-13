package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class op3 {
    public static final mp3 a = c();
    public static final mp3 b = new np3();

    public static mp3 a() {
        return a;
    }

    public static mp3 b() {
        return b;
    }

    public static mp3 c() {
        try {
            return (mp3) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
