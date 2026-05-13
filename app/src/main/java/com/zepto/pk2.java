package com.zepto;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class pk2 {
    public static final jb2 A = ib2.c;
    public static final gi6 B = fi6.c;
    public static final gi6 C = fi6.e;
    public static final String z = null;
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final qx0 c;
    public final w43 d;
    public final List e;
    public final u52 f;
    public final jb2 g;
    public final Map h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final int r;
    public final int s;
    public final ho3 t;
    public final List u;
    public final List v;
    public final gi6 w;
    public final gi6 x;
    public final List y;

    public class a extends mo6 {
        public a() {
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
                return;
            }
            double dDoubleValue = number.doubleValue();
            pk2.c(dDoubleValue);
            a63Var.F0(dDoubleValue);
        }
    }

    public class b extends mo6 {
        public b() {
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
                return;
            }
            float fFloatValue = number.floatValue();
            pk2.c(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            a63Var.I0(number);
        }
    }

    public class c extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
            } else {
                a63Var.J0(number.toString());
            }
        }
    }

    public class d extends mo6 {
        public final /* synthetic */ mo6 a;

        public d(mo6 mo6Var) {
            this.a = mo6Var;
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, AtomicLong atomicLong) {
            this.a.c(a63Var, Long.valueOf(atomicLong.get()));
        }
    }

    public class e extends mo6 {
        public final /* synthetic */ mo6 a;

        public e(mo6 mo6Var) {
            this.a = mo6Var;
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, AtomicLongArray atomicLongArray) throws IOException {
            a63Var.j();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.a.c(a63Var, Long.valueOf(atomicLongArray.get(i)));
            }
            a63Var.w();
        }
    }

    public static class f extends ty5 {
        public mo6 a = null;

        private mo6 e() {
            mo6 mo6Var = this.a;
            if (mo6Var != null) {
                return mo6Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.zepto.mo6
        public void c(a63 a63Var, Object obj) {
            e().c(a63Var, obj);
        }

        @Override // com.zepto.ty5
        public mo6 d() {
            return e();
        }

        public void f(mo6 mo6Var) {
            if (this.a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.a = mo6Var;
        }
    }

    public pk2(u52 u52Var, jb2 jb2Var, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, ho3 ho3Var, String str, int i, int i2, List list, List list2, List list3, gi6 gi6Var, gi6 gi6Var2, List list4) {
        this.f = u52Var;
        this.g = jb2Var;
        this.h = map;
        qx0 qx0Var = new qx0(map, z9, list4);
        this.c = qx0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.t = ho3Var;
        this.q = str;
        this.r = i;
        this.s = i2;
        this.u = list;
        this.v = list2;
        this.w = gi6Var;
        this.x = gi6Var2;
        this.y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(to6.W);
        arrayList.add(ef4.d(gi6Var));
        arrayList.add(u52Var);
        arrayList.addAll(list3);
        arrayList.add(to6.C);
        arrayList.add(to6.m);
        arrayList.add(to6.g);
        arrayList.add(to6.i);
        arrayList.add(to6.k);
        mo6 mo6VarI = i(ho3Var);
        arrayList.add(to6.b(Long.TYPE, Long.class, mo6VarI));
        arrayList.add(to6.b(Double.TYPE, Double.class, d(z8)));
        arrayList.add(to6.b(Float.TYPE, Float.class, e(z8)));
        arrayList.add(ke4.d(gi6Var2));
        arrayList.add(to6.o);
        arrayList.add(to6.q);
        arrayList.add(to6.a(AtomicLong.class, a(mo6VarI)));
        arrayList.add(to6.a(AtomicLongArray.class, b(mo6VarI)));
        arrayList.add(to6.s);
        arrayList.add(to6.x);
        arrayList.add(to6.E);
        arrayList.add(to6.G);
        arrayList.add(to6.a(BigDecimal.class, to6.z));
        arrayList.add(to6.a(BigInteger.class, to6.A));
        arrayList.add(to6.a(jb3.class, to6.B));
        arrayList.add(to6.I);
        arrayList.add(to6.K);
        arrayList.add(to6.O);
        arrayList.add(to6.Q);
        arrayList.add(to6.U);
        arrayList.add(to6.M);
        arrayList.add(to6.d);
        arrayList.add(de1.b);
        arrayList.add(to6.S);
        if (b66.a) {
            arrayList.add(b66.e);
            arrayList.add(b66.d);
            arrayList.add(b66.f);
        }
        arrayList.add(tx.c);
        arrayList.add(to6.b);
        arrayList.add(new nr0(qx0Var));
        arrayList.add(new rp3(qx0Var, z3));
        w43 w43Var = new w43(qx0Var);
        this.d = w43Var;
        arrayList.add(w43Var);
        arrayList.add(to6.X);
        arrayList.add(new m75(qx0Var, jb2Var, u52Var, w43Var, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static mo6 a(mo6 mo6Var) {
        return new d(mo6Var).a();
    }

    public static mo6 b(mo6 mo6Var) {
        return new e(mo6Var).a();
    }

    public static void c(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static mo6 i(ho3 ho3Var) {
        return ho3Var == ho3.c ? to6.t : new c();
    }

    public final mo6 d(boolean z2) {
        return z2 ? to6.v : new a();
    }

    public final mo6 e(boolean z2) {
        return z2 ? to6.u : new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.f(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.mo6 f(com.zepto.uo6 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.b
            java.lang.Object r0 = r0.get(r7)
            com.zepto.mo6 r0 = (com.zepto.mo6) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r6.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.zepto.mo6 r1 = (com.zepto.mo6) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.zepto.pk2$f r2 = new com.zepto.pk2$f     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List r3 = r6.e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.zepto.oo6 r4 = (com.zepto.oo6) r4     // Catch: java.lang.Throwable -> L58
            com.zepto.mo6 r4 = r4.a(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.f(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal r2 = r6.a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap r7 = r6.b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.10.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal r0 = r6.a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.pk2.f(com.zepto.uo6):com.zepto.mo6");
    }

    public mo6 g(Class cls) {
        return f(uo6.a(cls));
    }

    public mo6 h(oo6 oo6Var, uo6 uo6Var) {
        if (!this.e.contains(oo6Var)) {
            oo6Var = this.d;
        }
        boolean z2 = false;
        for (oo6 oo6Var2 : this.e) {
            if (z2) {
                mo6 mo6VarA = oo6Var2.a(this, uo6Var);
                if (mo6VarA != null) {
                    return mo6VarA;
                }
            } else if (oo6Var2 == oo6Var) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + uo6Var);
    }

    public a63 j(Writer writer) throws IOException {
        if (this.k) {
            writer.write(")]}'\n");
        }
        a63 a63Var = new a63(writer);
        if (this.m) {
            a63Var.B0("  ");
        }
        a63Var.A0(this.l);
        a63Var.C0(this.n);
        a63Var.D0(this.i);
        return a63Var;
    }

    public String k(e53 e53Var) {
        StringWriter stringWriter = new StringWriter();
        o(e53Var, stringWriter);
        return stringWriter.toString();
    }

    public String l(Object obj) {
        return obj == null ? k(j53.c) : m(obj, obj.getClass());
    }

    public String m(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        q(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void n(e53 e53Var, a63 a63Var) {
        boolean zU = a63Var.U();
        a63Var.C0(true);
        boolean zP = a63Var.P();
        a63Var.A0(this.l);
        boolean zD = a63Var.D();
        a63Var.D0(this.i);
        try {
            try {
                w76.a(e53Var, a63Var);
            } catch (IOException e2) {
                throw new h53(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            a63Var.C0(zU);
            a63Var.A0(zP);
            a63Var.D0(zD);
        }
    }

    public void o(e53 e53Var, Appendable appendable) {
        try {
            n(e53Var, j(w76.b(appendable)));
        } catch (IOException e2) {
            throw new h53(e2);
        }
    }

    public void p(Object obj, Type type, a63 a63Var) {
        mo6 mo6VarF = f(uo6.b(type));
        boolean zU = a63Var.U();
        a63Var.C0(true);
        boolean zP = a63Var.P();
        a63Var.A0(this.l);
        boolean zD = a63Var.D();
        a63Var.D0(this.i);
        try {
            try {
                mo6VarF.c(a63Var, obj);
            } catch (IOException e2) {
                throw new h53(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            a63Var.C0(zU);
            a63Var.A0(zP);
            a63Var.D0(zD);
        }
    }

    public void q(Object obj, Type type, Appendable appendable) {
        try {
            p(obj, type, j(w76.b(appendable)));
        } catch (IOException e2) {
            throw new h53(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
