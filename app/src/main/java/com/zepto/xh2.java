package com.zepto;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class xh2 {
    public final Method a;
    public final boolean b;

    public xh2(Method method, boolean z) {
        this.b = z;
        this.a = method;
    }

    public Object a(wy0 wy0Var, Object obj) {
        if (obj != null) {
            return this.b ? this.a.invoke(obj, wy0Var.k().getMap()) : this.a.invoke(obj, new Object[0]);
        }
        return null;
    }
}
