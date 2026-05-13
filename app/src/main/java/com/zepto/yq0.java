package com.zepto;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yq0 {
    public static final a d = new a(null);
    public final Method a;
    public final Method b;
    public final Method c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yq0 a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new yq0(method, method3, method2);
        }
    }

    public yq0(Method method, Method method2, Method method3) {
        this.a = method;
        this.b = method2;
        this.c = method3;
    }

    public final Object a(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.c;
            Intrinsics.checkNotNull(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
