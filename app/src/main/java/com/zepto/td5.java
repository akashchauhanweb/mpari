package com.zepto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class td5 implements cu0 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final cu0 g;

    public static class a implements xx4 {
        public final Set a;
        public final xx4 b;

        public a(Set set, xx4 xx4Var) {
            this.a = set;
            this.b = xx4Var;
        }
    }

    public td5(ut0 ut0Var, cu0 cu0Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (hi1 hi1Var : ut0Var.g()) {
            if (hi1Var.d()) {
                if (hi1Var.f()) {
                    hashSet4.add(hi1Var.b());
                } else {
                    hashSet.add(hi1Var.b());
                }
            } else if (hi1Var.c()) {
                hashSet3.add(hi1Var.b());
            } else if (hi1Var.f()) {
                hashSet5.add(hi1Var.b());
            } else {
                hashSet2.add(hi1Var.b());
            }
        }
        if (!ut0Var.k().isEmpty()) {
            hashSet.add(ky4.b(xx4.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = ut0Var.k();
        this.g = cu0Var;
    }

    @Override // com.zepto.cu0
    public Object a(Class cls) {
        if (!this.a.contains(ky4.b(cls))) {
            throw new mi1(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.g.a(cls);
        return !cls.equals(xx4.class) ? objA : new a(this.f, (xx4) objA);
    }

    @Override // com.zepto.cu0
    public nx4 b(ky4 ky4Var) {
        if (this.e.contains(ky4Var)) {
            return this.g.b(ky4Var);
        }
        throw new mi1(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", ky4Var));
    }

    @Override // com.zepto.cu0
    public Set d(ky4 ky4Var) {
        if (this.d.contains(ky4Var)) {
            return this.g.d(ky4Var);
        }
        throw new mi1(String.format("Attempting to request an undeclared dependency Set<%s>.", ky4Var));
    }

    @Override // com.zepto.cu0
    public nx4 e(ky4 ky4Var) {
        if (this.b.contains(ky4Var)) {
            return this.g.e(ky4Var);
        }
        throw new mi1(String.format("Attempting to request an undeclared dependency Provider<%s>.", ky4Var));
    }

    @Override // com.zepto.cu0
    public Object f(ky4 ky4Var) {
        if (this.a.contains(ky4Var)) {
            return this.g.f(ky4Var);
        }
        throw new mi1(String.format("Attempting to request an undeclared dependency %s.", ky4Var));
    }

    @Override // com.zepto.cu0
    public nx4 g(Class cls) {
        return e(ky4.b(cls));
    }
}
