package com.zepto;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class bv4 {
    public final Map a;
    public final Map b;

    public static final class c {
        public final Class a;
        public final Class b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
        }

        public c(Class cls, Class cls2) {
            this.a = cls;
            this.b = cls2;
        }
    }

    public Class c(Class cls) throws GeneralSecurityException {
        if (this.b.containsKey(cls)) {
            return ((ev4) this.b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object d(e63 e63Var, Class cls) throws GeneralSecurityException {
        c cVar = new c(e63Var.getClass(), cls);
        if (this.a.containsKey(cVar)) {
            return ((wu4) this.a.get(cVar)).a(e63Var);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public Object e(dv4 dv4Var, Class cls) throws GeneralSecurityException {
        if (!this.b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        ev4 ev4Var = (ev4) this.b.get(cls);
        if (dv4Var.g().equals(ev4Var.a()) && ev4Var.a().equals(dv4Var.g())) {
            return ev4Var.b(dv4Var);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public bv4(b bVar) {
        this.a = new HashMap(bVar.a);
        this.b = new HashMap(bVar.b);
    }

    public static final class b {
        public final Map a;
        public final Map b;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
        }

        public bv4 c() {
            return new bv4(this);
        }

        public b d(wu4 wu4Var) throws GeneralSecurityException {
            if (wu4Var == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(wu4Var.c(), wu4Var.d());
            if (this.a.containsKey(cVar)) {
                wu4 wu4Var2 = (wu4) this.a.get(cVar);
                if (!wu4Var2.equals(wu4Var) || !wu4Var.equals(wu4Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.a.put(cVar, wu4Var);
            }
            return this;
        }

        public b e(ev4 ev4Var) throws GeneralSecurityException {
            if (ev4Var == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class clsC = ev4Var.c();
            if (this.b.containsKey(clsC)) {
                ev4 ev4Var2 = (ev4) this.b.get(clsC);
                if (!ev4Var2.equals(ev4Var) || !ev4Var.equals(ev4Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsC);
                }
            } else {
                this.b.put(clsC, ev4Var);
            }
            return this;
        }

        public b(bv4 bv4Var) {
            this.a = new HashMap(bv4Var.a);
            this.b = new HashMap(bv4Var.b);
        }
    }
}
