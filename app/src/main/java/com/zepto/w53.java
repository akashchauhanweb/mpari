package com.zepto;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class w53 extends s53 {
    public static final Reader w = new a();
    public static final Object x = new Object();
    public Object[] s;
    public int t;
    public String[] u;
    public int[] v;

    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v53.values().length];
            a = iArr;
            try {
                iArr[v53.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v53.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v53.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[v53.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public w53(f53 f53Var) {
        super(w);
        this.s = new Object[32];
        this.t = 0;
        this.u = new String[32];
        this.v = new int[32];
        Y0(f53Var);
    }

    private String m0() {
        return " at path " + b();
    }

    @Override // com.zepto.s53
    public String A0() {
        return U0(false);
    }

    @Override // com.zepto.s53
    public void B() {
        S0(v53.END_OBJECT);
        this.u[this.t - 1] = null;
        W0();
        W0();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.zepto.s53
    public void C0() {
        S0(v53.NULL);
        W0();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.zepto.s53
    public String E0() throws gp3 {
        v53 v53VarG0 = G0();
        v53 v53Var = v53.STRING;
        if (v53VarG0 == v53Var || v53VarG0 == v53.NUMBER) {
            String strR = ((r53) W0()).r();
            int i = this.t;
            if (i > 0) {
                int[] iArr = this.v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return strR;
        }
        throw new IllegalStateException("Expected " + v53Var + " but was " + v53VarG0 + m0());
    }

    @Override // com.zepto.s53
    public v53 G0() throws gp3 {
        if (this.t == 0) {
            return v53.END_DOCUMENT;
        }
        Object objV0 = V0();
        if (objV0 instanceof Iterator) {
            boolean z = this.s[this.t - 2] instanceof m53;
            Iterator it = (Iterator) objV0;
            if (!it.hasNext()) {
                return z ? v53.END_OBJECT : v53.END_ARRAY;
            }
            if (z) {
                return v53.NAME;
            }
            Y0(it.next());
            return G0();
        }
        if (objV0 instanceof m53) {
            return v53.BEGIN_OBJECT;
        }
        if (objV0 instanceof z43) {
            return v53.BEGIN_ARRAY;
        }
        if (objV0 instanceof r53) {
            r53 r53Var = (r53) objV0;
            if (r53Var.g0()) {
                return v53.STRING;
            }
            if (r53Var.d0()) {
                return v53.BOOLEAN;
            }
            if (r53Var.f0()) {
                return v53.NUMBER;
            }
            throw new AssertionError();
        }
        if (objV0 instanceof k53) {
            return v53.NULL;
        }
        if (objV0 == x) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new gp3("Custom JsonElement subclass " + objV0.getClass().getName() + " is not supported");
    }

    public final String P(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i = 0;
        while (true) {
            int i2 = this.t;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.s;
            Object obj = objArr[i];
            if (obj instanceof z43) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.v[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof m53) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.u[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // com.zepto.s53
    public void Q0() throws gp3 {
        int i = b.a[G0().ordinal()];
        if (i == 1) {
            U0(true);
            return;
        }
        if (i == 2) {
            w();
            return;
        }
        if (i == 3) {
            B();
            return;
        }
        if (i != 4) {
            W0();
            int i2 = this.t;
            if (i2 > 0) {
                int[] iArr = this.v;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    public final void S0(v53 v53Var) {
        if (G0() == v53Var) {
            return;
        }
        throw new IllegalStateException("Expected " + v53Var + " but was " + G0() + m0());
    }

    public f53 T0() throws gp3 {
        v53 v53VarG0 = G0();
        if (v53VarG0 != v53.NAME && v53VarG0 != v53.END_ARRAY && v53VarG0 != v53.END_OBJECT && v53VarG0 != v53.END_DOCUMENT) {
            f53 f53Var = (f53) V0();
            Q0();
            return f53Var;
        }
        throw new IllegalStateException("Unexpected " + v53VarG0 + " when reading a JsonElement.");
    }

    @Override // com.zepto.s53
    public String U() {
        return P(true);
    }

    public final String U0(boolean z) {
        S0(v53.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) V0()).next();
        String str = (String) entry.getKey();
        this.u[this.t - 1] = z ? "<skipped>" : str;
        Y0(entry.getValue());
        return str;
    }

    public final Object V0() {
        return this.s[this.t - 1];
    }

    public final Object W0() {
        Object[] objArr = this.s;
        int i = this.t - 1;
        this.t = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public void X0() {
        S0(v53.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) V0()).next();
        Y0(entry.getValue());
        Y0(new r53((String) entry.getKey()));
    }

    public final void Y0(Object obj) {
        int i = this.t;
        Object[] objArr = this.s;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.s = Arrays.copyOf(objArr, i2);
            this.v = Arrays.copyOf(this.v, i2);
            this.u = (String[]) Arrays.copyOf(this.u, i2);
        }
        Object[] objArr2 = this.s;
        int i3 = this.t;
        this.t = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.zepto.s53
    public String b() {
        return P(false);
    }

    @Override // com.zepto.s53, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.s = new Object[]{x};
        this.t = 1;
    }

    @Override // com.zepto.s53
    public void d() {
        S0(v53.BEGIN_ARRAY);
        Y0(((z43) V0()).iterator());
        this.v[this.t - 1] = 0;
    }

    @Override // com.zepto.s53
    public boolean d0() throws gp3 {
        v53 v53VarG0 = G0();
        return (v53VarG0 == v53.END_OBJECT || v53VarG0 == v53.END_ARRAY || v53VarG0 == v53.END_DOCUMENT) ? false : true;
    }

    @Override // com.zepto.s53
    public void e() {
        S0(v53.BEGIN_OBJECT);
        Y0(((m53) V0()).P().iterator());
    }

    @Override // com.zepto.s53
    public boolean p0() {
        S0(v53.BOOLEAN);
        boolean zD = ((r53) W0()).D();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zD;
    }

    @Override // com.zepto.s53
    public String toString() {
        return w53.class.getSimpleName() + m0();
    }

    @Override // com.zepto.s53
    public void w() {
        S0(v53.END_ARRAY);
        W0();
        W0();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.zepto.s53
    public double x0() throws gp3 {
        v53 v53VarG0 = G0();
        v53 v53Var = v53.NUMBER;
        if (v53VarG0 != v53Var && v53VarG0 != v53.STRING) {
            throw new IllegalStateException("Expected " + v53Var + " but was " + v53VarG0 + m0());
        }
        double dO = ((r53) V0()).O();
        if (!e0() && (Double.isNaN(dO) || Double.isInfinite(dO))) {
            throw new gp3("JSON forbids NaN and infinities: " + dO);
        }
        W0();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dO;
    }

    @Override // com.zepto.s53
    public int y0() throws gp3 {
        v53 v53VarG0 = G0();
        v53 v53Var = v53.NUMBER;
        if (v53VarG0 != v53Var && v53VarG0 != v53.STRING) {
            throw new IllegalStateException("Expected " + v53Var + " but was " + v53VarG0 + m0());
        }
        int iP = ((r53) V0()).P();
        W0();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iP;
    }

    @Override // com.zepto.s53
    public long z0() throws gp3 {
        v53 v53VarG0 = G0();
        v53 v53Var = v53.NUMBER;
        if (v53VarG0 != v53Var && v53VarG0 != v53.STRING) {
            throw new IllegalStateException("Expected " + v53Var + " but was " + v53VarG0 + m0());
        }
        long jT = ((r53) V0()).T();
        W0();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jT;
    }
}
