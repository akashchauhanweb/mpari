package com.zepto;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w26 {
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;
    public int[] c;
    public Object[] e;
    public int f;

    public w26() {
        this.c = iy0.a;
        this.e = iy0.c;
        this.f = 0;
    }

    public static int b(int[] iArr, int i2, int i3) {
        try {
            return iy0.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (w26.class) {
                try {
                    if (j < 10) {
                        objArr[0] = i;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        i = objArr;
                        j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (w26.class) {
                try {
                    if (h < 10) {
                        objArr[0] = g;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        g = objArr;
                        h++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (w26.class) {
                try {
                    Object[] objArr = i;
                    if (objArr != null) {
                        this.e = objArr;
                        i = (Object[]) objArr[0];
                        this.c = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (w26.class) {
                try {
                    Object[] objArr2 = g;
                    if (objArr2 != null) {
                        this.e = objArr2;
                        g = (Object[]) objArr2[0];
                        this.c = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.c = new int[i2];
        this.e = new Object[i2 << 1];
    }

    public void c(int i2) {
        int i3 = this.f;
        int[] iArr = this.c;
        if (iArr.length < i2) {
            Object[] objArr = this.e;
            a(i2);
            if (this.f > 0) {
                System.arraycopy(iArr, 0, this.c, 0, i3);
                System.arraycopy(objArr, 0, this.e, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.f != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f;
        if (i2 > 0) {
            int[] iArr = this.c;
            Object[] objArr = this.e;
            this.c = iy0.a;
            this.e = iy0.c;
            this.f = 0;
            d(iArr, objArr, i2);
        }
        if (this.f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return -1;
        }
        int iB = b(this.c, i3, i2);
        if (iB < 0 || obj.equals(this.e[iB << 1])) {
            return iB;
        }
        int i4 = iB + 1;
        while (i4 < i3 && this.c[i4] == i2) {
            if (obj.equals(this.e[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iB - 1; i5 >= 0 && this.c[i5] == i2; i5--) {
            if (obj.equals(this.e[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w26) {
            w26 w26Var = (w26) obj;
            if (size() != w26Var.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f; i2++) {
                try {
                    Object objI = i(i2);
                    Object objM = m(i2);
                    Object obj2 = w26Var.get(objI);
                    if (objM == null) {
                        if (obj2 != null || !w26Var.containsKey(objI)) {
                            return false;
                        }
                    } else if (!objM.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f; i3++) {
                try {
                    Object objI2 = i(i3);
                    Object objM2 = m(i3);
                    Object obj3 = map.get(objI2);
                    if (objM2 == null) {
                        if (obj3 != null || !map.containsKey(objI2)) {
                            return false;
                        }
                    } else if (!objM2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i2 = this.f;
        if (i2 == 0) {
            return -1;
        }
        int iB = b(this.c, i2, 0);
        if (iB < 0 || this.e[iB << 1] == null) {
            return iB;
        }
        int i3 = iB + 1;
        while (i3 < i2 && this.c[i3] == 0) {
            if (this.e[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iB - 1; i4 >= 0 && this.c[i4] == 0; i4--) {
            if (this.e[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iF = f(obj);
        return iF >= 0 ? this.e[(iF << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        int i2 = this.f * 2;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.c;
        Object[] objArr = this.e;
        int i2 = this.f;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public Object i(int i2) {
        return this.e[i2 << 1];
    }

    public boolean isEmpty() {
        return this.f <= 0;
    }

    public void j(w26 w26Var) {
        int i2 = w26Var.f;
        c(this.f + i2);
        if (this.f != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(w26Var.i(i3), w26Var.m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(w26Var.c, 0, this.c, 0, i2);
            System.arraycopy(w26Var.e, 0, this.e, 0, i2 << 1);
            this.f = i2;
        }
    }

    public Object k(int i2) {
        Object[] objArr = this.e;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.c, objArr, i4);
            this.c = iy0.a;
            this.e = iy0.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.c;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.e;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.e;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.c, 0, i2);
                    System.arraycopy(objArr, 0, this.e, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.c, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.e, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i5;
        return obj;
    }

    public Object l(int i2, Object obj) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public Object m(int i2) {
        return this.e[(i2 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i2;
        int iE;
        int i3 = this.f;
        if (obj == null) {
            iE = g();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iE = e(obj, iHashCode);
        }
        if (iE >= 0) {
            int i4 = (iE << 1) + 1;
            Object[] objArr = this.e;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iE;
        int[] iArr = this.c;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.e;
            a(i6);
            if (i3 != this.f) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.e, 0, objArr2.length);
            }
            d(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.c;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.e;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f - i5) << 1);
        }
        int i8 = this.f;
        if (i3 == i8) {
            int[] iArr4 = this.c;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.e;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF >= 0) {
            return l(iF, obj2);
        }
        return null;
    }

    public int size() {
        return this.f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objI = i(i2);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM = m(i2);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (obj2 != objM && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        k(iF);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (objM != obj2 && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        l(iF, obj3);
        return true;
    }

    public w26(int i2) {
        if (i2 == 0) {
            this.c = iy0.a;
            this.e = iy0.c;
        } else {
            a(i2);
        }
        this.f = 0;
    }

    public w26(w26 w26Var) {
        this();
        if (w26Var != null) {
            j(w26Var);
        }
    }
}
