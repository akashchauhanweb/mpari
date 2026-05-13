package com.zepto;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class to6 {
    public static final mo6 A;
    public static final mo6 B;
    public static final oo6 C;
    public static final mo6 D;
    public static final oo6 E;
    public static final mo6 F;
    public static final oo6 G;
    public static final mo6 H;
    public static final oo6 I;
    public static final mo6 J;
    public static final oo6 K;
    public static final mo6 L;
    public static final oo6 M;
    public static final mo6 N;
    public static final oo6 O;
    public static final mo6 P;
    public static final oo6 Q;
    public static final mo6 R;
    public static final oo6 S;
    public static final mo6 T;
    public static final oo6 U;
    public static final mo6 V;
    public static final oo6 W;
    public static final oo6 X;
    public static final mo6 a;
    public static final oo6 b;
    public static final mo6 c;
    public static final oo6 d;
    public static final mo6 e;
    public static final mo6 f;
    public static final oo6 g;
    public static final mo6 h;
    public static final oo6 i;
    public static final mo6 j;
    public static final oo6 k;
    public static final mo6 l;
    public static final oo6 m;
    public static final mo6 n;
    public static final oo6 o;
    public static final mo6 p;
    public static final oo6 q;
    public static final mo6 r;
    public static final oo6 s;
    public static final mo6 t;
    public static final mo6 u;
    public static final mo6 v;
    public static final mo6 w;
    public static final oo6 x;
    public static final mo6 y;
    public static final mo6 z;

    public class a implements oo6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ mo6 e;

        public a(Class cls, mo6 mo6Var) {
            this.c = cls;
            this.e = mo6Var;
        }

        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            if (uo6Var.c() == this.c) {
                return this.e;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.c.getName() + ",adapter=" + this.e + "]";
        }
    }

    public class a0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, BitSet bitSet) throws IOException {
            a63Var.j();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                a63Var.G0(bitSet.get(i) ? 1L : 0L);
            }
            a63Var.w();
        }
    }

    public class b implements oo6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ Class e;
        public final /* synthetic */ mo6 f;

        public b(Class cls, Class cls2, mo6 mo6Var) {
            this.c = cls;
            this.e = cls2;
            this.f = mo6Var;
        }

        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            Class clsC = uo6Var.c();
            if (clsC == this.c || clsC == this.e) {
                return this.f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.e.getName() + "+" + this.c.getName() + ",adapter=" + this.f + "]";
        }
    }

    public class b0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Boolean bool) throws IOException {
            a63Var.H0(bool);
        }
    }

    public class c implements oo6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ Class e;
        public final /* synthetic */ mo6 f;

        public c(Class cls, Class cls2, mo6 mo6Var) {
            this.c = cls;
            this.e = cls2;
            this.f = mo6Var;
        }

        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            Class clsC = uo6Var.c();
            if (clsC == this.c || clsC == this.e) {
                return this.f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.c.getName() + "+" + this.e.getName() + ",adapter=" + this.f + "]";
        }
    }

    public class c0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Boolean bool) throws IOException {
            a63Var.J0(bool == null ? "null" : bool.toString());
        }
    }

    public class d implements oo6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ mo6 e;

        public class a extends mo6 {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // com.zepto.mo6
            public void c(a63 a63Var, Object obj) {
                d.this.e.c(a63Var, obj);
            }
        }

        public d(Class cls, mo6 mo6Var) {
            this.c = cls;
            this.e = mo6Var;
        }

        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            Class<?> clsC = uo6Var.c();
            if (this.c.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.c.getName() + ",adapter=" + this.e + "]";
        }
    }

    public class d0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
            } else {
                a63Var.G0(number.byteValue());
            }
        }
    }

    public static final class e extends mo6 {
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public final Map c = new HashMap();

        public class a implements PrivilegedAction {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public e(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    wy5 wy5Var = (wy5) field.getAnnotation(wy5.class);
                    if (wy5Var != null) {
                        strName = wy5Var.value();
                        for (String str : wy5Var.alternate()) {
                            this.a.put(str, r4);
                        }
                    }
                    this.a.put(strName, r4);
                    this.b.put(string, r4);
                    this.c.put(r4, strName);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Enum r3) throws IOException {
            a63Var.J0(r3 == null ? null : (String) this.c.get(r3));
        }
    }

    public class e0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
            } else {
                a63Var.G0(number.shortValue());
            }
        }
    }

    public class f extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, AtomicIntegerArray atomicIntegerArray) throws IOException {
            a63Var.j();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                a63Var.G0(atomicIntegerArray.get(i));
            }
            a63Var.w();
        }
    }

    public class f0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
            } else {
                a63Var.G0(number.intValue());
            }
        }
    }

    public class g extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
            } else {
                a63Var.G0(number.longValue());
            }
        }
    }

    public class g0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, AtomicInteger atomicInteger) throws IOException {
            a63Var.G0(atomicInteger.get());
        }
    }

    public class h extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            a63Var.I0(number);
        }
    }

    public class h0 extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, AtomicBoolean atomicBoolean) throws IOException {
            a63Var.K0(atomicBoolean.get());
        }
    }

    public class i extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Number number) throws IOException {
            if (number == null) {
                a63Var.m0();
            } else {
                a63Var.F0(number.doubleValue());
            }
        }
    }

    public class j extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Character ch) throws IOException {
            a63Var.J0(ch == null ? null : String.valueOf(ch));
        }
    }

    public class k extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, String str) throws IOException {
            a63Var.J0(str);
        }
    }

    public class l extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, BigDecimal bigDecimal) throws IOException {
            a63Var.I0(bigDecimal);
        }
    }

    public class m extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, BigInteger bigInteger) throws IOException {
            a63Var.I0(bigInteger);
        }
    }

    public class n extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, jb3 jb3Var) throws IOException {
            a63Var.I0(jb3Var);
        }
    }

    public class o extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, StringBuilder sb) throws IOException {
            a63Var.J0(sb == null ? null : sb.toString());
        }
    }

    public class p extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class q extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, StringBuffer stringBuffer) throws IOException {
            a63Var.J0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class r extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, URL url) throws IOException {
            a63Var.J0(url == null ? null : url.toExternalForm());
        }
    }

    public class s extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, URI uri) throws IOException {
            a63Var.J0(uri == null ? null : uri.toASCIIString());
        }
    }

    public class t extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, InetAddress inetAddress) throws IOException {
            a63Var.J0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class u extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, UUID uuid) throws IOException {
            a63Var.J0(uuid == null ? null : uuid.toString());
        }
    }

    public class v extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Currency currency) throws IOException {
            a63Var.J0(currency.getCurrencyCode());
        }
    }

    public class w extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Calendar calendar) throws IOException {
            if (calendar == null) {
                a63Var.m0();
                return;
            }
            a63Var.m();
            a63Var.e0("year");
            a63Var.G0(calendar.get(1));
            a63Var.e0("month");
            a63Var.G0(calendar.get(2));
            a63Var.e0("dayOfMonth");
            a63Var.G0(calendar.get(5));
            a63Var.e0("hourOfDay");
            a63Var.G0(calendar.get(11));
            a63Var.e0("minute");
            a63Var.G0(calendar.get(12));
            a63Var.e0("second");
            a63Var.G0(calendar.get(13));
            a63Var.B();
        }
    }

    public class x extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, Locale locale) throws IOException {
            a63Var.J0(locale == null ? null : locale.toString());
        }
    }

    public class y extends mo6 {
        @Override // com.zepto.mo6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a63 a63Var, e53 e53Var) throws IOException {
            if (e53Var == null || e53Var.u()) {
                a63Var.m0();
                return;
            }
            if (e53Var.z()) {
                q53 q53VarN = e53Var.n();
                if (q53VarN.a0()) {
                    a63Var.I0(q53VarN.D());
                    return;
                } else if (q53VarN.P()) {
                    a63Var.K0(q53VarN.B());
                    return;
                } else {
                    a63Var.J0(q53VarN.O());
                    return;
                }
            }
            if (e53Var.r()) {
                a63Var.j();
                Iterator it = e53Var.j().iterator();
                while (it.hasNext()) {
                    c(a63Var, (e53) it.next());
                }
                a63Var.w();
                return;
            }
            if (!e53Var.w()) {
                throw new IllegalArgumentException("Couldn't write " + e53Var.getClass());
            }
            a63Var.m();
            for (Map.Entry entry : e53Var.m().D()) {
                a63Var.e0((String) entry.getKey());
                c(a63Var, (e53) entry.getValue());
            }
            a63Var.B();
        }
    }

    public class z implements oo6 {
        @Override // com.zepto.oo6
        public mo6 a(pk2 pk2Var, uo6 uo6Var) {
            Class clsC = uo6Var.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new e(clsC);
        }
    }

    static {
        mo6 mo6VarA = new p().a();
        a = mo6VarA;
        b = a(Class.class, mo6VarA);
        mo6 mo6VarA2 = new a0().a();
        c = mo6VarA2;
        d = a(BitSet.class, mo6VarA2);
        b0 b0Var = new b0();
        e = b0Var;
        f = new c0();
        g = b(Boolean.TYPE, Boolean.class, b0Var);
        d0 d0Var = new d0();
        h = d0Var;
        i = b(Byte.TYPE, Byte.class, d0Var);
        e0 e0Var = new e0();
        j = e0Var;
        k = b(Short.TYPE, Short.class, e0Var);
        f0 f0Var = new f0();
        l = f0Var;
        m = b(Integer.TYPE, Integer.class, f0Var);
        mo6 mo6VarA3 = new g0().a();
        n = mo6VarA3;
        o = a(AtomicInteger.class, mo6VarA3);
        mo6 mo6VarA4 = new h0().a();
        p = mo6VarA4;
        q = a(AtomicBoolean.class, mo6VarA4);
        mo6 mo6VarA5 = new f().a();
        r = mo6VarA5;
        s = a(AtomicIntegerArray.class, mo6VarA5);
        t = new g();
        u = new h();
        v = new i();
        j jVar = new j();
        w = jVar;
        x = b(Character.TYPE, Character.class, jVar);
        k kVar = new k();
        y = kVar;
        z = new l();
        A = new m();
        B = new n();
        C = a(String.class, kVar);
        o oVar = new o();
        D = oVar;
        E = a(StringBuilder.class, oVar);
        q qVar = new q();
        F = qVar;
        G = a(StringBuffer.class, qVar);
        r rVar = new r();
        H = rVar;
        I = a(URL.class, rVar);
        s sVar = new s();
        J = sVar;
        K = a(URI.class, sVar);
        t tVar = new t();
        L = tVar;
        M = d(InetAddress.class, tVar);
        u uVar = new u();
        N = uVar;
        O = a(UUID.class, uVar);
        mo6 mo6VarA6 = new v().a();
        P = mo6VarA6;
        Q = a(Currency.class, mo6VarA6);
        w wVar = new w();
        R = wVar;
        S = c(Calendar.class, GregorianCalendar.class, wVar);
        x xVar = new x();
        T = xVar;
        U = a(Locale.class, xVar);
        y yVar = new y();
        V = yVar;
        W = d(e53.class, yVar);
        X = new z();
    }

    public static oo6 a(Class cls, mo6 mo6Var) {
        return new a(cls, mo6Var);
    }

    public static oo6 b(Class cls, Class cls2, mo6 mo6Var) {
        return new b(cls, cls2, mo6Var);
    }

    public static oo6 c(Class cls, Class cls2, mo6 mo6Var) {
        return new c(cls, cls2, mo6Var);
    }

    public static oo6 d(Class cls, mo6 mo6Var) {
        return new d(cls, mo6Var);
    }
}
