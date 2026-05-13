package com.zepto;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l63 {
    public static final Logger b = Logger.getLogger(l63.class.getName());
    public final ConcurrentMap a;

    public class a implements b {
        public final /* synthetic */ v63 a;

        public a(v63 v63Var) {
            this.a = v63Var;
        }

        @Override // com.zepto.l63.b
        public j63 a(Class cls) throws GeneralSecurityException {
            try {
                return new k63(this.a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // com.zepto.l63.b
        public j63 b() {
            v63 v63Var = this.a;
            return new k63(v63Var, v63Var.b());
        }

        @Override // com.zepto.l63.b
        public Class c() {
            return this.a.getClass();
        }

        @Override // com.zepto.l63.b
        public Set d() {
            return this.a.i();
        }
    }

    public interface b {
        j63 a(Class cls);

        j63 b();

        Class c();

        Set d();
    }

    public l63(l63 l63Var) {
        this.a = new ConcurrentHashMap(l63Var.a);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static b b(v63 v63Var) {
        return new a(v63Var);
    }

    public static String i(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public j63 c(String str, Class cls) {
        return e(str, (Class) a(cls));
    }

    public final synchronized b d(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (b) this.a.get(str);
    }

    public final j63 e(String str, Class cls) throws GeneralSecurityException {
        b bVarD = d(str);
        if (cls == null) {
            return bVarD.b();
        }
        if (bVarD.d().contains(cls)) {
            return bVarD.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + bVarD.c() + ", supported primitives: " + i(bVarD.d()));
    }

    public j63 f(String str) {
        return d(str).b();
    }

    public synchronized void g(v63 v63Var) {
        if (!v63Var.a().a()) {
            throw new GeneralSecurityException("failed to register key manager " + v63Var.getClass() + " as it is not FIPS compatible.");
        }
        h(b(v63Var), false);
    }

    public final synchronized void h(b bVar, boolean z) {
        try {
            String strC = bVar.b().c();
            b bVar2 = (b) this.a.get(strC);
            if (bVar2 != null && !bVar2.c().equals(bVar.c())) {
                b.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, bVar2.c().getName(), bVar.c().getName()));
            }
            if (z) {
                this.a.put(strC, bVar);
            } else {
                this.a.putIfAbsent(strC, bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean j(String str) {
        return this.a.containsKey(str);
    }

    public l63() {
        this.a = new ConcurrentHashMap();
    }
}
