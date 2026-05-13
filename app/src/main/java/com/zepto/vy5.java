package com.zepto;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vy5 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public static class c {
        public final Class a;
        public final x80 b;

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
            return this.a.getSimpleName() + ", object identifier: " + this.b;
        }

        public c(Class cls, x80 x80Var) {
            this.a = cls;
            this.b = x80Var;
        }
    }

    public static class d {
        public final Class a;
        public final Class b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }

        public d(Class cls, Class cls2) {
            this.a = cls;
            this.b = cls2;
        }
    }

    public boolean e(sy5 sy5Var) {
        return this.b.containsKey(new c(sy5Var.getClass(), sy5Var.a()));
    }

    public e63 f(sy5 sy5Var, pu5 pu5Var) throws GeneralSecurityException {
        c cVar = new c(sy5Var.getClass(), sy5Var.a());
        if (this.b.containsKey(cVar)) {
            return ((n63) this.b.get(cVar)).d(sy5Var, pu5Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public vy5(b bVar) {
        this.a = new HashMap(bVar.a);
        this.b = new HashMap(bVar.b);
        this.c = new HashMap(bVar.c);
        this.d = new HashMap(bVar.d);
    }

    public static final class b {
        public final Map a;
        public final Map b;
        public final Map c;
        public final Map d;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
        }

        public vy5 e() {
            return new vy5(this);
        }

        public b f(n63 n63Var) throws GeneralSecurityException {
            c cVar = new c(n63Var.c(), n63Var.b());
            if (this.b.containsKey(cVar)) {
                n63 n63Var2 = (n63) this.b.get(cVar);
                if (!n63Var2.equals(n63Var) || !n63Var.equals(n63Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.b.put(cVar, n63Var);
            }
            return this;
        }

        public b g(o63 o63Var) throws GeneralSecurityException {
            d dVar = new d(o63Var.b(), o63Var.c());
            if (this.a.containsKey(dVar)) {
                o63 o63Var2 = (o63) this.a.get(dVar);
                if (!o63Var2.equals(o63Var) || !o63Var.equals(o63Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.a.put(dVar, o63Var);
            }
            return this;
        }

        public b h(kl4 kl4Var) throws GeneralSecurityException {
            c cVar = new c(kl4Var.c(), kl4Var.b());
            if (this.d.containsKey(cVar)) {
                kl4 kl4Var2 = (kl4) this.d.get(cVar);
                if (!kl4Var2.equals(kl4Var) || !kl4Var.equals(kl4Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.d.put(cVar, kl4Var);
            }
            return this;
        }

        public b i(ll4 ll4Var) throws GeneralSecurityException {
            d dVar = new d(ll4Var.b(), ll4Var.c());
            if (this.c.containsKey(dVar)) {
                ll4 ll4Var2 = (ll4) this.c.get(dVar);
                if (!ll4Var2.equals(ll4Var) || !ll4Var.equals(ll4Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.c.put(dVar, ll4Var);
            }
            return this;
        }

        public b(vy5 vy5Var) {
            this.a = new HashMap(vy5Var.a);
            this.b = new HashMap(vy5Var.b);
            this.c = new HashMap(vy5Var.c);
            this.d = new HashMap(vy5Var.d);
        }
    }
}
