package com.zepto;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u52 implements oo6, Cloneable {
    public static final u52 j = new u52();
    public boolean g;
    public double c = -1.0d;
    public int e = 136;
    public boolean f = true;
    public List h = Collections.emptyList();
    public List i = Collections.emptyList();

    public class a extends mo6 {
        public mo6 a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ pk2 d;
        public final /* synthetic */ uo6 e;

        public a(boolean z, boolean z2, pk2 pk2Var, uo6 uo6Var) {
            this.b = z;
            this.c = z2;
            this.d = pk2Var;
            this.e = uo6Var;
        }

        @Override // com.zepto.mo6
        public void c(a63 a63Var, Object obj) throws IOException {
            if (this.c) {
                a63Var.m0();
            } else {
                d().c(a63Var, obj);
            }
        }

        public final mo6 d() {
            mo6 mo6Var = this.a;
            if (mo6Var != null) {
                return mo6Var;
            }
            mo6 mo6VarH = this.d.h(u52.this, this.e);
            this.a = mo6VarH;
            return mo6VarH;
        }
    }

    @Override // com.zepto.oo6
    public mo6 a(pk2 pk2Var, uo6 uo6Var) {
        Class clsC = uo6Var.c();
        boolean zD = d(clsC);
        boolean z = zD || e(clsC, true);
        boolean z2 = zD || e(clsC, false);
        if (z || z2) {
            return new a(z2, z, pk2Var, uo6Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u52 clone() {
        try {
            return (u52) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean c(Class cls, boolean z) {
        return d(cls) || e(cls, z);
    }

    public final boolean d(Class cls) {
        if (this.c != -1.0d && !o((z26) cls.getAnnotation(z26.class), (kq6) cls.getAnnotation(kq6.class))) {
            return true;
        }
        if (this.f || !h(cls)) {
            return g(cls);
        }
        return true;
    }

    public final boolean e(Class cls, boolean z) {
        Iterator it = (z ? this.h : this.i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        wb0.a(it.next());
        throw null;
    }

    public boolean f(Field field, boolean z) {
        w62 w62Var;
        if ((this.e & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.c != -1.0d && !o((z26) field.getAnnotation(z26.class), (kq6) field.getAnnotation(kq6.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.g && ((w62Var = (w62) field.getAnnotation(w62.class)) == null || (!z ? w62Var.deserialize() : w62Var.serialize()))) {
            return true;
        }
        if ((!this.f && h(field.getType())) || g(field.getType())) {
            return true;
        }
        List list = z ? this.h : this.i;
        if (list.isEmpty()) {
            return false;
        }
        new cb2(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        wb0.a(it.next());
        throw null;
    }

    public final boolean g(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || i(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    public final boolean h(Class cls) {
        return cls.isMemberClass() && !i(cls);
    }

    public final boolean i(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean k(z26 z26Var) {
        if (z26Var != null) {
            return this.c >= z26Var.value();
        }
        return true;
    }

    public final boolean l(kq6 kq6Var) {
        if (kq6Var != null) {
            return this.c < kq6Var.value();
        }
        return true;
    }

    public final boolean o(z26 z26Var, kq6 kq6Var) {
        return k(z26Var) && l(kq6Var);
    }
}
