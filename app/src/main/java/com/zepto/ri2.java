package com.zepto;

import com.zepto.k2;
import com.zepto.lx;
import com.zepto.x03;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ri2 extends k2 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ri2> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected vp6 unknownFields = vp6.c();

    public static abstract class a extends k2.a {
        public final ri2 c;
        public ri2 e;

        public a(ri2 ri2Var) {
            this.c = ri2Var;
            if (ri2Var.C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.e = s();
        }

        public static void r(Object obj, Object obj2) {
            dx4.a().d(obj).a(obj, obj2);
        }

        private ri2 s() {
            return this.c.J();
        }

        public final ri2 h() {
            ri2 ri2VarI = i();
            if (ri2VarI.A()) {
                return ri2VarI;
            }
            throw k2.a.g(ri2VarI);
        }

        public ri2 i() {
            if (!this.e.C()) {
                return this.e;
            }
            this.e.E();
            return this.e;
        }

        public a k() {
            a aVarH = p().H();
            aVarH.e = i();
            return aVarH;
        }

        public final void l() {
            if (this.e.C()) {
                return;
            }
            o();
        }

        public void o() {
            ri2 ri2VarS = s();
            r(ri2VarS, this.e);
            this.e = ri2VarS;
        }

        public ri2 p() {
            return this.c;
        }

        public a q(ri2 ri2Var) {
            if (p().equals(ri2Var)) {
                return this;
            }
            l();
            r(this.e, ri2Var);
            return this;
        }
    }

    public static class b extends l2 {
        public final ri2 b;

        public b(ri2 ri2Var) {
            this.b = ri2Var;
        }
    }

    public static class c extends d72 {
    }

    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final boolean B(ri2 ri2Var, boolean z) {
        byte bByteValue = ((Byte) ri2Var.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = dx4.a().d(ri2Var).f(ri2Var);
        if (z) {
            ri2Var.r(d.SET_MEMOIZED_IS_INITIALIZED, zF ? ri2Var : null);
        }
        return zF;
    }

    public static x03.d G(x03.d dVar) {
        int size = dVar.size();
        return dVar.t(size == 0 ? 10 : size * 2);
    }

    public static Object I(at3 at3Var, String str, Object[] objArr) {
        return new l45(at3Var, str, objArr);
    }

    public static ri2 K(ri2 ri2Var, s80 s80Var, g72 g72Var) {
        return k(N(ri2Var, s80Var, g72Var));
    }

    public static ri2 L(ri2 ri2Var, InputStream inputStream, g72 g72Var) {
        return k(O(ri2Var, fr0.f(inputStream), g72Var));
    }

    public static ri2 M(ri2 ri2Var, byte[] bArr, g72 g72Var) {
        return k(P(ri2Var, bArr, 0, bArr.length, g72Var));
    }

    public static ri2 N(ri2 ri2Var, s80 s80Var, g72 g72Var) throws b13 {
        fr0 fr0VarA0 = s80Var.a0();
        ri2 ri2VarO = O(ri2Var, fr0VarA0, g72Var);
        try {
            fr0VarA0.a(0);
            return ri2VarO;
        } catch (b13 e) {
            throw e.k(ri2VarO);
        }
    }

    public static ri2 O(ri2 ri2Var, fr0 fr0Var, g72 g72Var) throws b13 {
        ri2 ri2VarJ = ri2Var.J();
        try {
            dp5 dp5VarD = dx4.a().d(ri2VarJ);
            dp5VarD.d(ri2VarJ, gr0.M(fr0Var), g72Var);
            dp5VarD.e(ri2VarJ);
            return ri2VarJ;
        } catch (b13 e) {
            e = e;
            if (e.a()) {
                e = new b13(e);
            }
            throw e.k(ri2VarJ);
        } catch (rp6 e2) {
            throw e2.a().k(ri2VarJ);
        } catch (IOException e3) {
            if (e3.getCause() instanceof b13) {
                throw ((b13) e3.getCause());
            }
            throw new b13(e3).k(ri2VarJ);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof b13) {
                throw ((b13) e4.getCause());
            }
            throw e4;
        }
    }

    public static ri2 P(ri2 ri2Var, byte[] bArr, int i, int i2, g72 g72Var) throws b13 {
        ri2 ri2VarJ = ri2Var.J();
        try {
            dp5 dp5VarD = dx4.a().d(ri2VarJ);
            dp5VarD.b(ri2VarJ, bArr, i, i + i2, new lx.a(g72Var));
            dp5VarD.e(ri2VarJ);
            return ri2VarJ;
        } catch (b13 e) {
            e = e;
            if (e.a()) {
                e = new b13(e);
            }
            throw e.k(ri2VarJ);
        } catch (rp6 e2) {
            throw e2.a().k(ri2VarJ);
        } catch (IOException e3) {
            if (e3.getCause() instanceof b13) {
                throw ((b13) e3.getCause());
            }
            throw new b13(e3).k(ri2VarJ);
        } catch (IndexOutOfBoundsException unused) {
            throw b13.m().k(ri2VarJ);
        }
    }

    public static void Q(Class cls, ri2 ri2Var) {
        ri2Var.F();
        defaultInstanceMap.put(cls, ri2Var);
    }

    public static ri2 k(ri2 ri2Var) throws b13 {
        if (ri2Var == null || ri2Var.A()) {
            return ri2Var;
        }
        throw ri2Var.i().a().k(ri2Var);
    }

    public static x03.d t() {
        return ex4.n();
    }

    public static ri2 u(Class cls) {
        ri2 ri2VarV = defaultInstanceMap.get(cls);
        if (ri2VarV == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ri2VarV = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ri2VarV == null) {
            ri2VarV = ((ri2) iq6.k(cls)).v();
            if (ri2VarV == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, ri2VarV);
        }
        return ri2VarV;
    }

    public static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean A() {
        return B(this, true);
    }

    public boolean C() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void E() {
        dx4.a().d(this).e(this);
        F();
    }

    public void F() {
        this.memoizedSerializedSize &= IntCompanionObject.MAX_VALUE;
    }

    public final a H() {
        return (a) q(d.NEW_BUILDER);
    }

    public ri2 J() {
        return (ri2) q(d.NEW_MUTABLE_INSTANCE);
    }

    public void R(int i) {
        this.memoizedHashCode = i;
    }

    public void S(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & IntCompanionObject.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public final a T() {
        return ((a) q(d.NEW_BUILDER)).q(this);
    }

    @Override // com.zepto.at3
    public int a() {
        return g(null);
    }

    @Override // com.zepto.at3
    public void c(hr0 hr0Var) {
        dx4.a().d(this).c(this, ir0.P(hr0Var));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return dx4.a().d(this).g(this, (ri2) obj);
        }
        return false;
    }

    @Override // com.zepto.k2
    public int g(dp5 dp5Var) {
        if (!C()) {
            if (x() != Integer.MAX_VALUE) {
                return x();
            }
            int iO = o(dp5Var);
            S(iO);
            return iO;
        }
        int iO2 = o(dp5Var);
        if (iO2 >= 0) {
            return iO2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iO2);
    }

    public int hashCode() {
        if (C()) {
            return n();
        }
        if (y()) {
            R(n());
        }
        return w();
    }

    public Object j() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    public void l() {
        this.memoizedHashCode = 0;
    }

    public void m() {
        S(IntCompanionObject.MAX_VALUE);
    }

    public int n() {
        return dx4.a().d(this).j(this);
    }

    public final int o(dp5 dp5Var) {
        return dp5Var == null ? dx4.a().d(this).h(this) : dp5Var.h(this);
    }

    public final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    public Object q(d dVar) {
        return s(dVar, null, null);
    }

    public Object r(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return ct3.f(this, super.toString());
    }

    public final ri2 v() {
        return (ri2) q(d.GET_DEFAULT_INSTANCE);
    }

    public int w() {
        return this.memoizedHashCode;
    }

    public int x() {
        return this.memoizedSerializedSize & IntCompanionObject.MAX_VALUE;
    }

    public boolean y() {
        return w() == 0;
    }
}
