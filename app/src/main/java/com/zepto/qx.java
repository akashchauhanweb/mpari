package com.zepto;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qx implements Collection, Set {
    public static final int[] h = new int[0];
    public static final Object[] i = new Object[0];
    public static Object[] j;
    public static int k;
    public static Object[] l;
    public static int m;
    public int[] c;
    public Object[] e;
    public int f;
    public jp3 g;

    public class a extends jp3 {
        public a() {
        }

        @Override // com.zepto.jp3
        public void a() {
            qx.this.clear();
        }

        @Override // com.zepto.jp3
        public Object b(int i, int i2) {
            return qx.this.e[i];
        }

        @Override // com.zepto.jp3
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.zepto.jp3
        public int d() {
            return qx.this.f;
        }

        @Override // com.zepto.jp3
        public int e(Object obj) {
            return qx.this.indexOf(obj);
        }

        @Override // com.zepto.jp3
        public int f(Object obj) {
            return qx.this.indexOf(obj);
        }

        @Override // com.zepto.jp3
        public void g(Object obj, Object obj2) {
            qx.this.add(obj);
        }

        @Override // com.zepto.jp3
        public void h(int i) {
            qx.this.z(i);
        }

        @Override // com.zepto.jp3
        public Object i(int i, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public qx() {
        this(0);
    }

    public static void n(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (qx.class) {
                try {
                    if (m < 10) {
                        objArr[0] = l;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        l = objArr;
                        m++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (qx.class) {
                try {
                    if (k < 10) {
                        objArr[0] = j;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        j = objArr;
                        k++;
                    }
                } finally {
                }
            }
        }
    }

    public Object B(int i2) {
        return this.e[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i2;
        int iU;
        if (obj == null) {
            iU = w();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iU = u(obj, iHashCode);
        }
        if (iU >= 0) {
            return false;
        }
        int i3 = ~iU;
        int i4 = this.f;
        int[] iArr = this.c;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.e;
            j(i5);
            int[] iArr2 = this.c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.e, 0, objArr.length);
            }
            n(iArr, objArr, this.f);
        }
        int i6 = this.f;
        if (i3 < i6) {
            int[] iArr3 = this.c;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.e;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f - i3);
        }
        this.c[i3] = i2;
        this.e[i3] = obj;
        this.f++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m(this.f + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f;
        if (i2 != 0) {
            n(this.c, this.e, i2);
            this.c = h;
            this.e = i;
            this.f = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f; i2++) {
                try {
                    if (!set.contains(B(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.c;
        int i2 = this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? w() : u(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return r().m().iterator();
    }

    public final void j(int i2) {
        if (i2 == 8) {
            synchronized (qx.class) {
                try {
                    Object[] objArr = l;
                    if (objArr != null) {
                        this.e = objArr;
                        l = (Object[]) objArr[0];
                        this.c = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        m--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (qx.class) {
                try {
                    Object[] objArr2 = j;
                    if (objArr2 != null) {
                        this.e = objArr2;
                        j = (Object[]) objArr2[0];
                        this.c = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        k--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.c = new int[i2];
        this.e = new Object[i2];
    }

    public void m(int i2) {
        int[] iArr = this.c;
        if (iArr.length < i2) {
            Object[] objArr = this.e;
            j(i2);
            int i3 = this.f;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.c, 0, i3);
                System.arraycopy(objArr, 0, this.e, 0, this.f);
            }
            n(iArr, objArr, this.f);
        }
    }

    public final jp3 r() {
        if (this.g == null) {
            this.g = new a();
        }
        return this.g;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        z(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.f - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.e[i2])) {
                z(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.e, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objB = B(i2);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int u(Object obj, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return -1;
        }
        int iA = iy0.a(this.c, i3, i2);
        if (iA < 0 || obj.equals(this.e[iA])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.c[i4] == i2) {
            if (obj.equals(this.e[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.c[i5] == i2; i5--) {
            if (obj.equals(this.e[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int w() {
        int i2 = this.f;
        if (i2 == 0) {
            return -1;
        }
        int iA = iy0.a(this.c, i2, 0);
        if (iA < 0 || this.e[iA] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.c[i3] == 0) {
            if (this.e[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.c[i4] == 0; i4--) {
            if (this.e[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public Object z(int i2) {
        Object[] objArr = this.e;
        Object obj = objArr[i2];
        int i3 = this.f;
        if (i3 <= 1) {
            n(this.c, objArr, i3);
            this.c = h;
            this.e = i;
            this.f = 0;
        } else {
            int[] iArr = this.c;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.e;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f - i2);
                }
                this.e[this.f] = null;
            } else {
                j(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.c, 0, i2);
                    System.arraycopy(objArr, 0, this.e, 0, i2);
                }
                int i6 = this.f;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.c, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.e, i2, this.f - i2);
                }
            }
        }
        return obj;
    }

    public qx(int i2) {
        if (i2 == 0) {
            this.c = h;
            this.e = i;
        } else {
            j(i2);
        }
        this.f = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f);
        }
        System.arraycopy(this.e, 0, objArr, 0, this.f);
        int length = objArr.length;
        int i2 = this.f;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
