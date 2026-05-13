package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class so6 {
    public static final no6 A;
    public static final no6 B;
    public static final po6 C;
    public static final no6 D;
    public static final po6 E;
    public static final no6 F;
    public static final po6 G;
    public static final no6 H;
    public static final po6 I;
    public static final no6 J;
    public static final po6 K;
    public static final no6 L;
    public static final po6 M;
    public static final no6 N;
    public static final po6 O;
    public static final no6 P;
    public static final po6 Q;
    public static final no6 R;
    public static final po6 S;
    public static final no6 T;
    public static final po6 U;
    public static final no6 V;
    public static final po6 W;
    public static final po6 X;
    public static final no6 a;
    public static final po6 b;
    public static final no6 c;
    public static final po6 d;
    public static final no6 e;
    public static final no6 f;
    public static final po6 g;
    public static final no6 h;
    public static final po6 i;
    public static final no6 j;
    public static final po6 k;
    public static final no6 l;
    public static final po6 m;
    public static final no6 n;
    public static final po6 o;
    public static final no6 p;
    public static final po6 q;
    public static final no6 r;
    public static final po6 s;
    public static final no6 t;
    public static final no6 u;
    public static final no6 v;
    public static final no6 w;
    public static final po6 x;
    public static final no6 y;
    public static final no6 z;

    public class a extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray read(s53 s53Var) throws IOException {
            ArrayList arrayList = new ArrayList();
            s53Var.d();
            while (s53Var.d0()) {
                try {
                    arrayList.add(Integer.valueOf(s53Var.y0()));
                } catch (NumberFormatException e) {
                    throw new u53(e);
                }
            }
            s53Var.w();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, AtomicIntegerArray atomicIntegerArray) throws IOException {
            b63Var.j();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                b63Var.G0(atomicIntegerArray.get(i));
            }
            b63Var.w();
        }
    }

    public class a0 implements po6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ no6 e;

        public class a extends no6 {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // com.zepto.no6
            public Object read(s53 s53Var) {
                Object obj = a0.this.e.read(s53Var);
                if (obj == null || this.a.isInstance(obj)) {
                    return obj;
                }
                throw new u53("Expected a " + this.a.getName() + " but was " + obj.getClass().getName() + "; at path " + s53Var.U());
            }

            @Override // com.zepto.no6
            public void write(b63 b63Var, Object obj) {
                a0.this.e.write(b63Var, obj);
            }
        }

        public a0(Class cls, no6 no6Var) {
            this.c = cls;
            this.e = no6Var;
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            Class<?> rawType = typeToken.getRawType();
            if (this.c.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.c.getName() + ",adapter=" + this.e + "]";
        }
    }

    public class b extends no6 {
        @Override // com.zepto.no6
        public Number read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            try {
                return Long.valueOf(s53Var.z0());
            } catch (NumberFormatException e) {
                throw new u53(e);
            }
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Number number) throws IOException {
            if (number == null) {
                b63Var.m0();
            } else {
                b63Var.G0(number.longValue());
            }
        }
    }

    public static /* synthetic */ class b0 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v53.values().length];
            a = iArr;
            try {
                iArr[v53.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v53.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v53.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[v53.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[v53.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[v53.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c extends no6 {
        @Override // com.zepto.no6
        public Number read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return Float.valueOf((float) s53Var.x0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Number number) throws IOException {
            if (number == null) {
                b63Var.m0();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            b63Var.I0(number);
        }
    }

    public class c0 extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean read(s53 s53Var) throws IOException {
            v53 v53VarG0 = s53Var.G0();
            if (v53VarG0 != v53.NULL) {
                return v53VarG0 == v53.STRING ? Boolean.valueOf(Boolean.parseBoolean(s53Var.E0())) : Boolean.valueOf(s53Var.p0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Boolean bool) throws IOException {
            b63Var.H0(bool);
        }
    }

    public class d extends no6 {
        @Override // com.zepto.no6
        public Number read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return Double.valueOf(s53Var.x0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Number number) throws IOException {
            if (number == null) {
                b63Var.m0();
            } else {
                b63Var.F0(number.doubleValue());
            }
        }
    }

    public class d0 extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return Boolean.valueOf(s53Var.E0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Boolean bool) throws IOException {
            b63Var.J0(bool == null ? "null" : bool.toString());
        }
    }

    public class e extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            String strE0 = s53Var.E0();
            if (strE0.length() == 1) {
                return Character.valueOf(strE0.charAt(0));
            }
            throw new u53("Expecting character, got: " + strE0 + "; at " + s53Var.U());
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Character ch) throws IOException {
            b63Var.J0(ch == null ? null : String.valueOf(ch));
        }
    }

    public class e0 extends no6 {
        @Override // com.zepto.no6
        public Number read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            try {
                int iY0 = s53Var.y0();
                if (iY0 <= 255 && iY0 >= -128) {
                    return Byte.valueOf((byte) iY0);
                }
                throw new u53("Lossy conversion from " + iY0 + " to byte; at path " + s53Var.U());
            } catch (NumberFormatException e) {
                throw new u53(e);
            }
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Number number) throws IOException {
            if (number == null) {
                b63Var.m0();
            } else {
                b63Var.G0(number.byteValue());
            }
        }
    }

    public class f extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String read(s53 s53Var) throws IOException {
            v53 v53VarG0 = s53Var.G0();
            if (v53VarG0 != v53.NULL) {
                return v53VarG0 == v53.BOOLEAN ? Boolean.toString(s53Var.p0()) : s53Var.E0();
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, String str) throws IOException {
            b63Var.J0(str);
        }
    }

    public class f0 extends no6 {
        @Override // com.zepto.no6
        public Number read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            try {
                int iY0 = s53Var.y0();
                if (iY0 <= 65535 && iY0 >= -32768) {
                    return Short.valueOf((short) iY0);
                }
                throw new u53("Lossy conversion from " + iY0 + " to short; at path " + s53Var.U());
            } catch (NumberFormatException e) {
                throw new u53(e);
            }
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Number number) throws IOException {
            if (number == null) {
                b63Var.m0();
            } else {
                b63Var.G0(number.shortValue());
            }
        }
    }

    public class g extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigDecimal read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            String strE0 = s53Var.E0();
            try {
                return new BigDecimal(strE0);
            } catch (NumberFormatException e) {
                throw new u53("Failed parsing '" + strE0 + "' as BigDecimal; at path " + s53Var.U(), e);
            }
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, BigDecimal bigDecimal) throws IOException {
            b63Var.I0(bigDecimal);
        }
    }

    public class g0 extends no6 {
        @Override // com.zepto.no6
        public Number read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            try {
                return Integer.valueOf(s53Var.y0());
            } catch (NumberFormatException e) {
                throw new u53(e);
            }
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Number number) throws IOException {
            if (number == null) {
                b63Var.m0();
            } else {
                b63Var.G0(number.intValue());
            }
        }
    }

    public class h extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigInteger read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            String strE0 = s53Var.E0();
            try {
                return new BigInteger(strE0);
            } catch (NumberFormatException e) {
                throw new u53("Failed parsing '" + strE0 + "' as BigInteger; at path " + s53Var.U(), e);
            }
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, BigInteger bigInteger) throws IOException {
            b63Var.I0(bigInteger);
        }
    }

    public class h0 extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicInteger read(s53 s53Var) {
            try {
                return new AtomicInteger(s53Var.y0());
            } catch (NumberFormatException e) {
                throw new u53(e);
            }
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, AtomicInteger atomicInteger) throws IOException {
            b63Var.G0(atomicInteger.get());
        }
    }

    public class i extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kb3 read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return new kb3(s53Var.E0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, kb3 kb3Var) throws IOException {
            b63Var.I0(kb3Var);
        }
    }

    public class i0 extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean read(s53 s53Var) {
            return new AtomicBoolean(s53Var.p0());
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, AtomicBoolean atomicBoolean) throws IOException {
            b63Var.K0(atomicBoolean.get());
        }
    }

    public class j extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return new StringBuilder(s53Var.E0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, StringBuilder sb) throws IOException {
            b63Var.J0(sb == null ? null : sb.toString());
        }
    }

    public static final class j0 extends no6 {
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

        public j0(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    xy5 xy5Var = (xy5) field.getAnnotation(xy5.class);
                    if (xy5Var != null) {
                        strName = xy5Var.value();
                        for (String str : xy5Var.alternate()) {
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

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Enum read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            String strE0 = s53Var.E0();
            Enum r0 = (Enum) this.a.get(strE0);
            return r0 == null ? (Enum) this.b.get(strE0) : r0;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Enum r3) throws IOException {
            b63Var.J0(r3 == null ? null : (String) this.c.get(r3));
        }
    }

    public class k extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class read(s53 s53Var) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class l extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuffer read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return new StringBuffer(s53Var.E0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, StringBuffer stringBuffer) throws IOException {
            b63Var.J0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class m extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URL read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            String strE0 = s53Var.E0();
            if ("null".equals(strE0)) {
                return null;
            }
            return new URL(strE0);
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, URL url) throws IOException {
            b63Var.J0(url == null ? null : url.toExternalForm());
        }
    }

    public class n extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URI read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            try {
                String strE0 = s53Var.E0();
                if ("null".equals(strE0)) {
                    return null;
                }
                return new URI(strE0);
            } catch (URISyntaxException e) {
                throw new i53(e);
            }
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, URI uri) throws IOException {
            b63Var.J0(uri == null ? null : uri.toASCIIString());
        }
    }

    public class o extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InetAddress read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return InetAddress.getByName(s53Var.E0());
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, InetAddress inetAddress) throws IOException {
            b63Var.J0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class p extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UUID read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            String strE0 = s53Var.E0();
            try {
                return UUID.fromString(strE0);
            } catch (IllegalArgumentException e) {
                throw new u53("Failed parsing '" + strE0 + "' as UUID; at path " + s53Var.U(), e);
            }
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, UUID uuid) throws IOException {
            b63Var.J0(uuid == null ? null : uuid.toString());
        }
    }

    public class q extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Currency read(s53 s53Var) throws IOException {
            String strE0 = s53Var.E0();
            try {
                return Currency.getInstance(strE0);
            } catch (IllegalArgumentException e) {
                throw new u53("Failed parsing '" + strE0 + "' as Currency; at path " + s53Var.U(), e);
            }
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Currency currency) throws IOException {
            b63Var.J0(currency.getCurrencyCode());
        }
    }

    public class r extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            s53Var.e();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (s53Var.G0() != v53.END_OBJECT) {
                String strA0 = s53Var.A0();
                int iY0 = s53Var.y0();
                if ("year".equals(strA0)) {
                    i = iY0;
                } else if ("month".equals(strA0)) {
                    i2 = iY0;
                } else if ("dayOfMonth".equals(strA0)) {
                    i3 = iY0;
                } else if ("hourOfDay".equals(strA0)) {
                    i4 = iY0;
                } else if ("minute".equals(strA0)) {
                    i5 = iY0;
                } else if ("second".equals(strA0)) {
                    i6 = iY0;
                }
            }
            s53Var.B();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Calendar calendar) throws IOException {
            if (calendar == null) {
                b63Var.m0();
                return;
            }
            b63Var.m();
            b63Var.e0("year");
            b63Var.G0(calendar.get(1));
            b63Var.e0("month");
            b63Var.G0(calendar.get(2));
            b63Var.e0("dayOfMonth");
            b63Var.G0(calendar.get(5));
            b63Var.e0("hourOfDay");
            b63Var.G0(calendar.get(11));
            b63Var.e0("minute");
            b63Var.G0(calendar.get(12));
            b63Var.e0("second");
            b63Var.G0(calendar.get(13));
            b63Var.B();
        }
    }

    public class s extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Locale read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(s53Var.E0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, Locale locale) throws IOException {
            b63Var.J0(locale == null ? null : locale.toString());
        }
    }

    public class t extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f53 read(s53 s53Var) throws IOException {
            if (s53Var instanceof w53) {
                return ((w53) s53Var).T0();
            }
            v53 v53VarG0 = s53Var.G0();
            f53 f53VarC = c(s53Var, v53VarG0);
            if (f53VarC == null) {
                return b(s53Var, v53VarG0);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (s53Var.d0()) {
                    String strA0 = f53VarC instanceof m53 ? s53Var.A0() : null;
                    v53 v53VarG02 = s53Var.G0();
                    f53 f53VarC2 = c(s53Var, v53VarG02);
                    boolean z = f53VarC2 != null;
                    if (f53VarC2 == null) {
                        f53VarC2 = b(s53Var, v53VarG02);
                    }
                    if (f53VarC instanceof z43) {
                        ((z43) f53VarC).D(f53VarC2);
                    } else {
                        ((m53) f53VarC).D(strA0, f53VarC2);
                    }
                    if (z) {
                        arrayDeque.addLast(f53VarC);
                        f53VarC = f53VarC2;
                    }
                } else {
                    if (f53VarC instanceof z43) {
                        s53Var.w();
                    } else {
                        s53Var.B();
                    }
                    if (arrayDeque.isEmpty()) {
                        return f53VarC;
                    }
                    f53VarC = (f53) arrayDeque.removeLast();
                }
            }
        }

        public final f53 b(s53 s53Var, v53 v53Var) throws IOException {
            int i = b0.a[v53Var.ordinal()];
            if (i == 1) {
                return new r53(new kb3(s53Var.E0()));
            }
            if (i == 2) {
                return new r53(s53Var.E0());
            }
            if (i == 3) {
                return new r53(Boolean.valueOf(s53Var.p0()));
            }
            if (i == 6) {
                s53Var.C0();
                return k53.c;
            }
            throw new IllegalStateException("Unexpected token: " + v53Var);
        }

        public final f53 c(s53 s53Var, v53 v53Var) throws IOException {
            int i = b0.a[v53Var.ordinal()];
            if (i == 4) {
                s53Var.d();
                return new z43();
            }
            if (i != 5) {
                return null;
            }
            s53Var.e();
            return new m53();
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, f53 f53Var) throws IOException {
            if (f53Var == null || f53Var.w()) {
                b63Var.m0();
                return;
            }
            if (f53Var.B()) {
                r53 r53VarN = f53Var.n();
                if (r53VarN.f0()) {
                    b63Var.I0(r53VarN.a0());
                    return;
                } else if (r53VarN.d0()) {
                    b63Var.K0(r53VarN.D());
                    return;
                } else {
                    b63Var.J0(r53VarN.r());
                    return;
                }
            }
            if (f53Var.u()) {
                b63Var.j();
                Iterator it = f53Var.j().iterator();
                while (it.hasNext()) {
                    write(b63Var, (f53) it.next());
                }
                b63Var.w();
                return;
            }
            if (!f53Var.z()) {
                throw new IllegalArgumentException("Couldn't write " + f53Var.getClass());
            }
            b63Var.m();
            for (Map.Entry entry : f53Var.m().P()) {
                b63Var.e0((String) entry.getKey());
                write(b63Var, (f53) entry.getValue());
            }
            b63Var.B();
        }
    }

    public class u implements po6 {
        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    public class v extends no6 {
        @Override // com.zepto.no6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitSet read(s53 s53Var) throws IOException {
            BitSet bitSet = new BitSet();
            s53Var.d();
            v53 v53VarG0 = s53Var.G0();
            int i = 0;
            while (v53VarG0 != v53.END_ARRAY) {
                int i2 = b0.a[v53VarG0.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    int iY0 = s53Var.y0();
                    if (iY0 != 0) {
                        if (iY0 != 1) {
                            throw new u53("Invalid bitset value " + iY0 + ", expected 0 or 1; at path " + s53Var.U());
                        }
                        bitSet.set(i);
                    } else {
                        continue;
                    }
                } else {
                    if (i2 != 3) {
                        throw new u53("Invalid bitset value type: " + v53VarG0 + "; at path " + s53Var.b());
                    }
                    if (s53Var.p0()) {
                        bitSet.set(i);
                    }
                }
                i++;
                v53VarG0 = s53Var.G0();
            }
            s53Var.w();
            return bitSet;
        }

        @Override // com.zepto.no6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(b63 b63Var, BitSet bitSet) throws IOException {
            b63Var.j();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                b63Var.G0(bitSet.get(i) ? 1L : 0L);
            }
            b63Var.w();
        }
    }

    public class w implements po6 {
        public final /* synthetic */ TypeToken c;
        public final /* synthetic */ no6 e;

        public w(TypeToken typeToken, no6 no6Var) {
            this.c = typeToken;
            this.e = no6Var;
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            if (typeToken.equals(this.c)) {
                return this.e;
            }
            return null;
        }
    }

    public class x implements po6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ no6 e;

        public x(Class cls, no6 no6Var) {
            this.c = cls;
            this.e = no6Var;
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == this.c) {
                return this.e;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.c.getName() + ",adapter=" + this.e + "]";
        }
    }

    public class y implements po6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ Class e;
        public final /* synthetic */ no6 f;

        public y(Class cls, Class cls2, no6 no6Var) {
            this.c = cls;
            this.e = cls2;
            this.f = no6Var;
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.c || rawType == this.e) {
                return this.f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.e.getName() + "+" + this.c.getName() + ",adapter=" + this.f + "]";
        }
    }

    public class z implements po6 {
        public final /* synthetic */ Class c;
        public final /* synthetic */ Class e;
        public final /* synthetic */ no6 f;

        public z(Class cls, Class cls2, no6 no6Var) {
            this.c = cls;
            this.e = cls2;
            this.f = no6Var;
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.c || rawType == this.e) {
                return this.f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.c.getName() + "+" + this.e.getName() + ",adapter=" + this.f + "]";
        }
    }

    static {
        no6 no6VarNullSafe = new k().nullSafe();
        a = no6VarNullSafe;
        b = b(Class.class, no6VarNullSafe);
        no6 no6VarNullSafe2 = new v().nullSafe();
        c = no6VarNullSafe2;
        d = b(BitSet.class, no6VarNullSafe2);
        c0 c0Var = new c0();
        e = c0Var;
        f = new d0();
        g = c(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        h = e0Var;
        i = c(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        j = f0Var;
        k = c(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        l = g0Var;
        m = c(Integer.TYPE, Integer.class, g0Var);
        no6 no6VarNullSafe3 = new h0().nullSafe();
        n = no6VarNullSafe3;
        o = b(AtomicInteger.class, no6VarNullSafe3);
        no6 no6VarNullSafe4 = new i0().nullSafe();
        p = no6VarNullSafe4;
        q = b(AtomicBoolean.class, no6VarNullSafe4);
        no6 no6VarNullSafe5 = new a().nullSafe();
        r = no6VarNullSafe5;
        s = b(AtomicIntegerArray.class, no6VarNullSafe5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        no6 no6VarNullSafe6 = new q().nullSafe();
        P = no6VarNullSafe6;
        Q = b(Currency.class, no6VarNullSafe6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = e(f53.class, tVar);
        X = new u();
    }

    public static po6 a(TypeToken typeToken, no6 no6Var) {
        return new w(typeToken, no6Var);
    }

    public static po6 b(Class cls, no6 no6Var) {
        return new x(cls, no6Var);
    }

    public static po6 c(Class cls, Class cls2, no6 no6Var) {
        return new y(cls, cls2, no6Var);
    }

    public static po6 d(Class cls, Class cls2, no6 no6Var) {
        return new z(cls, cls2, no6Var);
    }

    public static po6 e(Class cls, no6 no6Var) {
        return new a0(cls, no6Var);
    }
}
