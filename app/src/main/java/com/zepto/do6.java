package com.zepto;

import java.lang.reflect.Array;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class do6 implements r76 {
    public final fm3 a;
    public final String b;
    public final String c;

    public do6() {
        this("class", "length");
    }

    @Override // com.zepto.r76
    public im7 a(lo6 lo6Var, w94 w94Var, Map map) {
        Class clsD = d(lo6Var, w94Var);
        Class type = lo6Var.getType();
        if (type.isArray()) {
            return c(clsD, w94Var);
        }
        if (type != clsD) {
            return new gf4(clsD);
        }
        return null;
    }

    @Override // com.zepto.r76
    public boolean b(lo6 lo6Var, Object obj, w94 w94Var, Map map) {
        Class<?> cls = obj.getClass();
        Class<?> type = lo6Var.getType();
        Class<?> clsE = cls.isArray() ? e(type, obj, w94Var) : cls;
        if (cls == type) {
            return false;
        }
        w94Var.K(this.c, clsE.getName());
        return false;
    }

    public final im7 c(Class cls, w94 w94Var) {
        r94 r94VarRemove = w94Var.remove(this.b);
        return new vx(cls, r94VarRemove != null ? Integer.parseInt(r94VarRemove.getValue()) : 0);
    }

    public final Class d(lo6 lo6Var, w94 w94Var) {
        r94 r94VarRemove = w94Var.remove(this.c);
        Class<?> type = lo6Var.getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        if (r94VarRemove == null) {
            return type;
        }
        return this.a.c(r94VarRemove.getValue());
    }

    public final Class e(Class cls, Object obj, w94 w94Var) {
        int length = Array.getLength(obj);
        String str = this.b;
        if (str != null) {
            w94Var.K(str, String.valueOf(length));
        }
        return cls.getComponentType();
    }

    public do6(String str, String str2) {
        this.a = new fm3();
        this.b = str2;
        this.c = str;
    }
}
