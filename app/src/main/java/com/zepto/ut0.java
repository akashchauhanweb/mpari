package com.zepto;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final iu0 f;
    public final Set g;

    public static b c(ky4 ky4Var) {
        return new b(ky4Var, new ky4[0]);
    }

    public static b d(ky4 ky4Var, ky4... ky4VarArr) {
        return new b(ky4Var, ky4VarArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static ut0 l(final Object obj, Class cls) {
        return m(cls).e(new iu0() { // from class: com.zepto.st0
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return ut0.q(obj, cu0Var);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).f();
    }

    public static /* synthetic */ Object q(Object obj, cu0 cu0Var) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, cu0 cu0Var) {
        return obj;
    }

    public static ut0 s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).e(new iu0() { // from class: com.zepto.tt0
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return ut0.r(obj, cu0Var);
            }
        }).d();
    }

    public Set g() {
        return this.c;
    }

    public iu0 h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set j() {
        return this.b;
    }

    public Set k() {
        return this.g;
    }

    public boolean n() {
        return this.d == 1;
    }

    public boolean o() {
        return this.d == 2;
    }

    public boolean p() {
        return this.e == 0;
    }

    public ut0 t(iu0 iu0Var) {
        return new ut0(this.a, this.b, this.c, this.d, this.e, iu0Var, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public static class b {
        public String a;
        public final Set b;
        public final Set c;
        public int d;
        public int e;
        public iu0 f;
        public final Set g;

        public b b(hi1 hi1Var) {
            ku4.c(hi1Var, "Null dependency");
            i(hi1Var.b());
            this.c.add(hi1Var);
            return this;
        }

        public b c() {
            return h(1);
        }

        public ut0 d() {
            ku4.d(this.f != null, "Missing required property: factory.");
            return new ut0(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        public b e(iu0 iu0Var) {
            this.f = (iu0) ku4.c(iu0Var, "Null factory");
            return this;
        }

        public final b f() {
            this.e = 1;
            return this;
        }

        public b g(String str) {
            this.a = str;
            return this;
        }

        public final b h(int i) {
            ku4.d(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        public final void i(ky4 ky4Var) {
            ku4.a(!this.b.contains(ky4Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            ku4.c(cls, "Null interface");
            hashSet.add(ky4.b(cls));
            for (Class cls2 : clsArr) {
                ku4.c(cls2, "Null interface");
                this.b.add(ky4.b(cls2));
            }
        }

        public b(ky4 ky4Var, ky4... ky4VarArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            ku4.c(ky4Var, "Null interface");
            hashSet.add(ky4Var);
            for (ky4 ky4Var2 : ky4VarArr) {
                ku4.c(ky4Var2, "Null interface");
            }
            Collections.addAll(this.b, ky4VarArr);
        }
    }

    public ut0(String str, Set set, Set set2, int i, int i2, iu0 iu0Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = iu0Var;
        this.g = Collections.unmodifiableSet(set3);
    }
}
