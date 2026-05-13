package com.zepto;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eq0 {

    public static class a implements PrivilegedAction {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
