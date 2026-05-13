package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v52 implements po6, Cloneable {
    public static final v52 j = new v52();
    public boolean g;
    public double c = -1.0d;
    public int e = 136;
    public boolean f = true;
    public List h = Collections.emptyList();
    public List i = Collections.emptyList();

    public class a extends no6 {
        public no6 a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Gson d;
        public final /* synthetic */ TypeToken e;

        public a(boolean z, boolean z2, Gson gson, TypeToken typeToken) {
            this.b = z;
            this.c = z2;
            this.d = gson;
            this.e = typeToken;
        }

        public final no6 delegate() {
            no6 no6Var = this.a;
            if (no6Var != null) {
                return no6Var;
            }
            no6 delegateAdapter = this.d.getDelegateAdapter(v52.this, this.e);
            this.a = delegateAdapter;
            return delegateAdapter;
        }

        @Override // com.zepto.no6
        public Object read(s53 s53Var) throws IOException {
            if (!this.b) {
                return delegate().read(s53Var);
            }
            s53Var.Q0();
            return null;
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Object obj) throws IOException {
            if (this.c) {
                b63Var.m0();
            } else {
                delegate().write(b63Var, obj);
            }
        }
    }

    @Override // com.zepto.po6
    public no6 a(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zE = e(rawType);
        boolean z = zE || f(rawType, true);
        boolean z2 = zE || f(rawType, false);
        if (z || z2) {
            return new a(z2, z, gson, typeToken);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v52 clone() {
        try {
            return (v52) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public v52 c() {
        v52 v52VarClone = clone();
        v52VarClone.f = false;
        return v52VarClone;
    }

    public boolean d(Class cls, boolean z) {
        return e(cls) || f(cls, z);
    }

    public final boolean e(Class cls) {
        if (this.c == -1.0d || q((a36) cls.getAnnotation(a36.class), (lq6) cls.getAnnotation(lq6.class))) {
            return (!this.f && k(cls)) || i(cls);
        }
        return true;
    }

    public final boolean f(Class cls, boolean z) {
        Iterator it = (z ? this.h : this.i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        wb0.a(it.next());
        throw null;
    }

    public boolean g(Field field, boolean z) {
        x62 x62Var;
        if ((this.e & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.c != -1.0d && !q((a36) field.getAnnotation(a36.class), (lq6) field.getAnnotation(lq6.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.g && ((x62Var = (x62) field.getAnnotation(x62.class)) == null || (!z ? x62Var.deserialize() : x62Var.serialize()))) {
            return true;
        }
        if ((!this.f && k(field.getType())) || i(field.getType())) {
            return true;
        }
        List list = z ? this.h : this.i;
        if (list.isEmpty()) {
            return false;
        }
        new db2(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        wb0.a(it.next());
        throw null;
    }

    public v52 h() {
        v52 v52VarClone = clone();
        v52VarClone.g = true;
        return v52VarClone;
    }

    public final boolean i(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || l(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    public final boolean k(Class cls) {
        return cls.isMemberClass() && !l(cls);
    }

    public final boolean l(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean o(a36 a36Var) {
        if (a36Var != null) {
            return this.c >= a36Var.value();
        }
        return true;
    }

    public final boolean p(lq6 lq6Var) {
        if (lq6Var != null) {
            return this.c < lq6Var.value();
        }
        return true;
    }

    public final boolean q(a36 a36Var, lq6 lq6Var) {
        return o(a36Var) && p(lq6Var);
    }

    public v52 r(w52 w52Var, boolean z, boolean z2) {
        v52 v52VarClone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.h);
            v52VarClone.h = arrayList;
            arrayList.add(w52Var);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.i);
            v52VarClone.i = arrayList2;
            arrayList2.add(w52Var);
        }
        return v52VarClone;
    }

    public v52 s(int... iArr) {
        v52 v52VarClone = clone();
        v52VarClone.e = 0;
        for (int i : iArr) {
            v52VarClone.e = i | v52VarClone.e;
        }
        return v52VarClone;
    }

    public v52 t(double d) {
        v52 v52VarClone = clone();
        v52VarClone.c = d;
        return v52VarClone;
    }
}
