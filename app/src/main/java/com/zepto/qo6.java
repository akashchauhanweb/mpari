package com.zepto;

import com.zepto.m75;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes2.dex */
public final class qo6 extends mo6 {
    public final pk2 a;
    public final mo6 b;
    public final Type c;

    public qo6(pk2 pk2Var, mo6 mo6Var, Type type) {
        this.a = pk2Var;
        this.b = mo6Var;
        this.c = type;
    }

    public static Type d(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    public static boolean e(mo6 mo6Var) {
        mo6 mo6VarD;
        while ((mo6Var instanceof ty5) && (mo6VarD = ((ty5) mo6Var).d()) != mo6Var) {
            mo6Var = mo6VarD;
        }
        return mo6Var instanceof m75.b;
    }

    @Override // com.zepto.mo6
    public void c(a63 a63Var, Object obj) {
        mo6 mo6VarF = this.b;
        Type typeD = d(this.c, obj);
        if (typeD != this.c) {
            mo6VarF = this.a.f(uo6.b(typeD));
            if ((mo6VarF instanceof m75.b) && !e(this.b)) {
                mo6VarF = this.b;
            }
        }
        mo6VarF.c(a63Var, obj);
    }
}
