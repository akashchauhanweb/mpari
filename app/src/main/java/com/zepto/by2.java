package com.zepto;

import com.zepto.zx2;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class by2 implements Map, Serializable {
    public static final Map.Entry[] g = new Map.Entry[0];
    public transient cy2 c;
    public transient cy2 e;
    public transient zx2 f;

    public static class a {
        public Comparator a;
        public Object[] b;
        public int c;
        public boolean d;

        public a() {
            this(4);
        }

        public by2 a() {
            return b();
        }

        public by2 b() {
            e();
            this.d = true;
            return x75.h(this.c, this.b);
        }

        public final void c(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, zx2.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        public a d(Object obj, Object obj2) {
            c(this.c + 1);
            lr0.a(obj, obj2);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = obj;
            objArr[(i * 2) + 1] = obj2;
            this.c = i + 1;
            return this;
        }

        public void e() {
            int i;
            if (this.a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, this.c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    int i3 = i2 * 2;
                    Object obj = this.b[i3];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.b[i3 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, vh4.a(this.a).b(up3.c()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        public a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    public static a a() {
        return new a();
    }

    public abstract cy2 b();

    public abstract cy2 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract zx2 d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public cy2 entrySet() {
        cy2 cy2Var = this.c;
        if (cy2Var != null) {
            return cy2Var;
        }
        cy2 cy2VarB = b();
        this.c = cy2VarB;
        return cy2VarB;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return up3.a(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public cy2 keySet() {
        cy2 cy2Var = this.e;
        if (cy2Var != null) {
            return cy2Var;
        }
        cy2 cy2VarC = c();
        this.e = cy2VarC;
        return cy2VarC;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public zx2 values() {
        zx2 zx2Var = this.f;
        if (zx2Var != null) {
            return zx2Var;
        }
        zx2 zx2VarD = d();
        this.f = zx2VarD;
        return zx2VarD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return mz5.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return up3.b(this);
    }
}
