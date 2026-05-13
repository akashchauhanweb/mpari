package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class f72 {
    public static final Class a = c();

    public static g72 a() {
        g72 g72VarB = b("getEmptyRegistry");
        return g72VarB != null ? g72VarB : g72.d;
    }

    public static final g72 b(String str) {
        Class cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (g72) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
