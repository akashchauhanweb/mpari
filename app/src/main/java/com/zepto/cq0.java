package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class cq0 implements xm6 {
    public static ClassLoader d() {
        return Thread.currentThread().getContextClassLoader();
    }

    public final ClassLoader c() {
        return getClass().getClassLoader();
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Class b(String str) {
        Class clsF = f(str);
        if (clsF != null) {
            return clsF;
        }
        ClassLoader classLoaderD = d();
        if (classLoaderD == null) {
            classLoaderD = c();
        }
        return classLoaderD.loadClass(str);
    }

    public final Class f(String str) {
        if (str.equals("byte")) {
            return Byte.TYPE;
        }
        if (str.equals("short")) {
            return Short.TYPE;
        }
        if (str.equals("int")) {
            return Integer.TYPE;
        }
        if (str.equals("long")) {
            return Long.TYPE;
        }
        if (str.equals("char")) {
            return Character.TYPE;
        }
        if (str.equals("float")) {
            return Float.TYPE;
        }
        if (str.equals("double")) {
            return Double.TYPE;
        }
        if (str.equals("boolean")) {
            return Boolean.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return null;
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String a(Class cls) {
        return cls.getName();
    }
}
