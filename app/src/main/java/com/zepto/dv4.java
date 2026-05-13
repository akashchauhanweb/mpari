package com.zepto;

import com.zepto.a73;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class dv4 {
    public final ConcurrentMap a;
    public c b;
    public final Class c;
    public final sw3 d;
    public final boolean e;

    public static class b {
        public final Class a;
        public ConcurrentMap b;
        public c c;
        public sw3 d;

        public b a(Object obj, Object obj2, a73.c cVar) {
            return c(obj, obj2, cVar, false);
        }

        public b b(Object obj, Object obj2, a73.c cVar) {
            return c(obj, obj2, cVar, true);
        }

        public final b c(Object obj, Object obj2, a73.c cVar, boolean z) throws GeneralSecurityException {
            if (this.b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.c0() != q63.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c cVarB = dv4.b(obj, obj2, cVar, this.b);
            if (z) {
                if (this.c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.c = cVarB;
            }
            return this;
        }

        public dv4 d() {
            ConcurrentMap concurrentMap = this.b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            dv4 dv4Var = new dv4(concurrentMap, this.c, this.d, this.a);
            this.b = null;
            return dv4Var;
        }

        public b e(sw3 sw3Var) {
            if (this.b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.d = sw3Var;
            return this;
        }

        public b(Class cls) {
            this.b = new ConcurrentHashMap();
            this.a = cls;
            this.d = sw3.b;
        }
    }

    public static final class c {
        public final Object a;
        public final Object b;
        public final byte[] c;
        public final q63 d;
        public final qj4 e;
        public final int f;
        public final String g;
        public final e63 h;

        public c(Object obj, Object obj2, byte[] bArr, q63 q63Var, qj4 qj4Var, int i, String str, e63 e63Var) {
            this.a = obj;
            this.b = obj2;
            this.c = Arrays.copyOf(bArr, bArr.length);
            this.d = q63Var;
            this.e = qj4Var;
            this.f = i;
            this.g = str;
            this.h = e63Var;
        }

        public Object a() {
            return this.a;
        }

        public final byte[] b() {
            byte[] bArr = this.c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public e63 c() {
            return this.h;
        }

        public int d() {
            return this.f;
        }

        public String e() {
            return this.g;
        }

        public qj4 f() {
            return this.e;
        }

        public Object g() {
            return this.b;
        }

        public q63 h() {
            return this.d;
        }
    }

    public static class d implements Comparable {
        public final byte[] c;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.c;
            int length = bArr.length;
            byte[] bArr2 = dVar.c;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.c;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = dVar.c[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.c, ((d) obj).c);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.c);
        }

        public String toString() {
            return bm2.b(this.c);
        }

        public d(byte[] bArr) {
            this.c = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static c b(Object obj, Object obj2, a73.c cVar, ConcurrentMap concurrentMap) {
        Integer numValueOf = Integer.valueOf(cVar.a0());
        if (cVar.b0() == qj4.RAW) {
            numValueOf = null;
        }
        c cVar2 = new c(obj, obj2, r31.a(cVar), cVar.c0(), cVar.b0(), cVar.a0(), cVar.Z().a0(), ry3.a().d(zw4.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), numValueOf), pz2.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List list = (List) concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static b j(Class cls) {
        return new b(cls);
    }

    public Collection c() {
        return this.a.values();
    }

    public sw3 d() {
        return this.d;
    }

    public c e() {
        return this.b;
    }

    public List f(byte[] bArr) {
        List list = (List) this.a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class g() {
        return this.c;
    }

    public List h() {
        return f(r31.a);
    }

    public boolean i() {
        return !this.d.b().isEmpty();
    }

    public dv4(ConcurrentMap concurrentMap, c cVar, sw3 sw3Var, Class cls) {
        this.a = concurrentMap;
        this.b = cVar;
        this.c = cls;
        this.d = sw3Var;
        this.e = false;
    }
}
