package com.zepto;

import com.zepto.v63;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u75 {
    public static final Logger a = Logger.getLogger(u75.class.getName());
    public static final AtomicReference b = new AtomicReference(new l63());
    public static final ConcurrentMap c = new ConcurrentHashMap();
    public static final ConcurrentMap d = new ConcurrentHashMap();
    public static final ConcurrentMap e = new ConcurrentHashMap();
    public static final ConcurrentMap f = new ConcurrentHashMap();

    public class a implements b {
        public final /* synthetic */ v63 a;

        public a(v63 v63Var) {
            this.a = v63Var;
        }
    }

    public interface b {
    }

    public static b a(v63 v63Var) {
        return new a(v63Var);
    }

    public static synchronized void b(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentMap concurrentMap = d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (((l63) b.get()).j(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object c(e63 e63Var, Class cls) {
        return qy3.c().b(e63Var, cls);
    }

    public static Class d(Class cls) {
        try {
            return qy3.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object e(f63 f63Var, Class cls) {
        return f(f63Var.a0(), f63Var.b0(), cls);
    }

    public static Object f(String str, s80 s80Var, Class cls) {
        return ((l63) b.get()).c(str, cls).a(s80Var);
    }

    public static Object g(String str, byte[] bArr, Class cls) {
        return f(str, s80.u(bArr), cls);
    }

    public static j63 h(String str) {
        return ((l63) b.get()).f(str);
    }

    public static synchronized Map i() {
        return Collections.unmodifiableMap(f);
    }

    public static synchronized at3 j(s63 s63Var) {
        j63 j63VarH;
        j63VarH = h(s63Var.a0());
        if (!((Boolean) d.get(s63Var.a0())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + s63Var.a0());
        }
        return j63VarH.d(s63Var.b0());
    }

    public static synchronized f63 k(s63 s63Var) {
        j63 j63VarH;
        j63VarH = h(s63Var.a0());
        if (!((Boolean) d.get(s63Var.a0())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + s63Var.a0());
        }
        return j63VarH.b(s63Var.b0());
    }

    public static synchronized void l(v63 v63Var, boolean z) {
        try {
            if (v63Var == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = b;
            l63 l63Var = new l63((l63) atomicReference.get());
            l63Var.g(v63Var);
            String strD = v63Var.d();
            b(strD, z ? v63Var.f().c() : Collections.emptyMap(), z);
            if (!((l63) atomicReference.get()).j(strD)) {
                c.put(strD, a(v63Var));
                if (z) {
                    m(strD, v63Var.f().c());
                }
            }
            d.put(strD, Boolean.valueOf(z));
            atomicReference.set(l63Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void m(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f.put((String) entry.getKey(), r63.a(str, ((at3) ((v63.a.C0125a) entry.getValue()).a).d(), ((v63.a.C0125a) entry.getValue()).b));
        }
    }

    public static synchronized void n(ev4 ev4Var) {
        qy3.c().e(ev4Var);
    }

    public static Object o(dv4 dv4Var, Class cls) {
        return qy3.c().f(dv4Var, cls);
    }
}
