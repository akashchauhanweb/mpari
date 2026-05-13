package com.zepto;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
public final class x75 extends by2 {
    public static final by2 k = new x75(null, new Object[0], 0);
    public final transient Object h;
    public final transient Object[] i;
    public final transient int j;

    public static class a extends cy2 {
        public final transient by2 f;
        public final transient Object[] g;
        public final transient int h;
        public final transient int i;

        /* JADX INFO: renamed from: com.zepto.x75$a$a, reason: collision with other inner class name */
        public class C0130a extends ay2 {
            public C0130a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i) {
                ju4.h(i, a.this.i);
                int i2 = i * 2;
                Object obj = a.this.g[a.this.h + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.g[i2 + (a.this.h ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.i;
            }
        }

        public a(by2 by2Var, Object[] objArr, int i, int i2) {
            this.f = by2Var;
            this.g = objArr;
            this.h = i;
            this.i = i2;
        }

        @Override // com.zepto.cy2
        public ay2 P() {
            return new C0130a();
        }

        @Override // com.zepto.zx2, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public yp6 iterator() {
            return z().iterator();
        }

        @Override // com.zepto.zx2
        public int j(Object[] objArr, int i) {
            return z().j(objArr, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.i;
        }
    }

    public static final class b extends cy2 {
        public final transient by2 f;
        public final transient ay2 g;

        public b(by2 by2Var, ay2 ay2Var) {
            this.f = by2Var;
            this.g = ay2Var;
        }

        @Override // com.zepto.zx2, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public yp6 iterator() {
            return z().iterator();
        }

        @Override // com.zepto.zx2
        public int j(Object[] objArr, int i) {
            return z().j(objArr, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f.size();
        }

        @Override // com.zepto.cy2
        public ay2 z() {
            return this.g;
        }
    }

    public static final class c extends ay2 {
        public final transient Object[] f;
        public final transient int g;
        public final transient int h;

        public c(Object[] objArr, int i, int i2) {
            this.f = objArr;
            this.g = i;
            this.h = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            ju4.h(i, this.h);
            Object obj = this.f[(i * 2) + this.g];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.h;
        }
    }

    public x75(Object obj, Object[] objArr, int i) {
        this.h = obj;
        this.i = objArr;
        this.j = i;
    }

    public static x75 h(int i, Object[] objArr) {
        if (i == 0) {
            return (x75) k;
        }
        if (i != 1) {
            ju4.k(i, objArr.length >> 1);
            return new x75(i(objArr, i, cy2.D(i), 0), objArr, i);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        lr0.a(obj, obj2);
        return new x75(null, objArr, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object i(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x75.i(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static IllegalArgumentException j(Object obj, Object obj2, Object[] objArr, int i) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i]);
        String strValueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    public static Object k(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = jl2.a(obj2.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & UByte.MAX_VALUE;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iA = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = jl2.a(obj2.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                int i6 = sArr[i5] & UShort.MAX_VALUE;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = jl2.a(obj2.hashCode());
            while (true) {
                int i7 = iA3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iA3 = i7 + 1;
            }
        }
    }

    @Override // com.zepto.by2
    public cy2 b() {
        return new a(this, this.i, 0, this.j);
    }

    @Override // com.zepto.by2
    public cy2 c() {
        return new b(this, new c(this.i, 0, this.j));
    }

    @Override // com.zepto.by2
    public zx2 d() {
        return new c(this.i, 1, this.j);
    }

    @Override // com.zepto.by2, java.util.Map
    public Object get(Object obj) {
        Object objK = k(this.h, this.i, this.j, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public int size() {
        return this.j;
    }
}
