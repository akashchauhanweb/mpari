package com.zepto;

import com.zepto.x03;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class mp5 {
    public static final Class a = A();
    public static final up6 b = B(false);
    public static final up6 c = B(true);
    public static final up6 d = new wp6();

    public static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static up6 B(boolean z) {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (up6) clsC.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(h72 h72Var, Object obj, Object obj2) {
        mb2 mb2VarC = h72Var.c(obj2);
        if (mb2VarC.d()) {
            return;
        }
        h72Var.d(obj).h(mb2VarC);
    }

    public static void E(mp3 mp3Var, Object obj, Object obj2, long j) {
        iq6.R(obj, j, mp3Var.a(iq6.C(obj, j), iq6.C(obj2, j)));
    }

    public static void F(up6 up6Var, Object obj, Object obj2) {
        up6Var.p(obj, up6Var.k(up6Var.g(obj), up6Var.g(obj2)));
    }

    public static up6 G() {
        return b;
    }

    public static up6 H() {
        return c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!ri2.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object K(Object obj, int i, int i2, Object obj2, up6 up6Var) {
        if (obj2 == null) {
            obj2 = up6Var.f(obj);
        }
        up6Var.e(obj2, i, i2);
        return obj2;
    }

    public static up6 L() {
        return d;
    }

    public static void M(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.t(i, list, z);
    }

    public static void N(int i, List list, nz7 nz7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.O(i, list);
    }

    public static void O(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.M(i, list, z);
    }

    public static void P(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.K(i, list, z);
    }

    public static void Q(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.r(i, list, z);
    }

    public static void R(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.l(i, list, z);
    }

    public static void S(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.b(i, list, z);
    }

    public static void T(int i, List list, nz7 nz7Var, dp5 dp5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.J(i, list, dp5Var);
    }

    public static void U(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.a(i, list, z);
    }

    public static void V(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.I(i, list, z);
    }

    public static void W(int i, List list, nz7 nz7Var, dp5 dp5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.k(i, list, dp5Var);
    }

    public static void X(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.m(i, list, z);
    }

    public static void Y(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.q(i, list, z);
    }

    public static void Z(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.E(i, list, z);
    }

    public static int a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? hr0.L(i) + hr0.x(size) : size * hr0.d(i, true);
    }

    public static void a0(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.v(i, list, z);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i, List list, nz7 nz7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.A(i, list);
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = size * hr0.L(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iL += hr0.g((s80) list.get(i2));
        }
        return iL;
    }

    public static void c0(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.u(i, list, z);
    }

    public static int d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z ? hr0.L(i) + hr0.x(iE) : iE + (size * hr0.L(i));
    }

    public static void d0(int i, List list, nz7 nz7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nz7Var.s(i, list, z);
    }

    public static int e(List list) {
        int iK;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j03) {
            j03 j03Var = (j03) list;
            iK = 0;
            while (i < size) {
                iK += hr0.k(j03Var.n(i));
                i++;
            }
        } else {
            iK = 0;
            while (i < size) {
                iK += hr0.k(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iK;
    }

    public static int f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? hr0.L(i) + hr0.x(size * 4) : size * hr0.l(i, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? hr0.L(i) + hr0.x(size * 8) : size * hr0.n(i, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, dp5 dp5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iR += hr0.r(i, (at3) list.get(i2), dp5Var);
        }
        return iR;
    }

    public static int k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z ? hr0.L(i) + hr0.x(iL) : iL + (size * hr0.L(i));
    }

    public static int l(List list) {
        int iU;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j03) {
            j03 j03Var = (j03) list;
            iU = 0;
            while (i < size) {
                iU += hr0.u(j03Var.n(i));
                i++;
            }
        } else {
            iU = 0;
            while (i < size) {
                iU += hr0.u(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iU;
    }

    public static int m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z ? hr0.L(i) + hr0.x(iN) : iN + (list.size() * hr0.L(i));
    }

    public static int n(List list) {
        int iW;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eo3) {
            eo3 eo3Var = (eo3) list;
            iW = 0;
            while (i < size) {
                iW += hr0.w(eo3Var.n(i));
                i++;
            }
        } else {
            iW = 0;
            while (i < size) {
                iW += hr0.w(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iW;
    }

    public static int o(int i, Object obj, dp5 dp5Var) {
        return hr0.y(i, (at3) obj, dp5Var);
    }

    public static int p(int i, List list, dp5 dp5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = hr0.L(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iL += hr0.z((at3) list.get(i2), dp5Var);
        }
        return iL;
    }

    public static int q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z ? hr0.L(i) + hr0.x(iR) : iR + (size * hr0.L(i));
    }

    public static int r(List list) {
        int iG;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j03) {
            j03 j03Var = (j03) list;
            iG = 0;
            while (i < size) {
                iG += hr0.G(j03Var.n(i));
                i++;
            }
        } else {
            iG = 0;
            while (i < size) {
                iG += hr0.G(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iG;
    }

    public static int s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z ? hr0.L(i) + hr0.x(iT) : iT + (size * hr0.L(i));
    }

    public static int t(List list) {
        int I;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eo3) {
            eo3 eo3Var = (eo3) list;
            I = 0;
            while (i < size) {
                I += hr0.I(eo3Var.n(i));
                i++;
            }
        } else {
            I = 0;
            while (i < size) {
                I += hr0.I(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return I;
    }

    public static int u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iL = hr0.L(i) * size;
        if (list instanceof sb3) {
            sb3 sb3Var = (sb3) list;
            while (i2 < size) {
                Object objN = sb3Var.N(i2);
                iL += objN instanceof s80 ? hr0.g((s80) objN) : hr0.K((String) objN);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iL += obj instanceof s80 ? hr0.g((s80) obj) : hr0.K((String) obj);
                i2++;
            }
        }
        return iL;
    }

    public static int v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z ? hr0.L(i) + hr0.x(iW) : iW + (size * hr0.L(i));
    }

    public static int w(List list) {
        int iN;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j03) {
            j03 j03Var = (j03) list;
            iN = 0;
            while (i < size) {
                iN += hr0.N(j03Var.n(i));
                i++;
            }
        } else {
            iN = 0;
            while (i < size) {
                iN += hr0.N(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iN;
    }

    public static int x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z ? hr0.L(i) + hr0.x(iY) : iY + (size * hr0.L(i));
    }

    public static int y(List list) {
        int iP;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eo3) {
            eo3 eo3Var = (eo3) list;
            iP = 0;
            while (i < size) {
                iP += hr0.P(eo3Var.n(i));
                i++;
            }
        } else {
            iP = 0;
            while (i < size) {
                iP += hr0.P(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iP;
    }

    public static Object z(Object obj, int i, List list, x03.c cVar, Object obj2, up6 up6Var) {
        if (cVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (cVar.a(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = K(obj, i, iIntValue, obj2, up6Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!cVar.a(iIntValue2)) {
                    obj2 = K(obj, i, iIntValue2, obj2, up6Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
