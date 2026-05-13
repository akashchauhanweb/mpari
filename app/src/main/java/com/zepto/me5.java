package com.zepto;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class me5 implements q96, p96 {
    public static final a l = new a(null);
    public static final TreeMap m = new TreeMap();
    public final int c;
    public volatile String e;
    public final long[] f;
    public final double[] g;
    public final String[] h;
    public final byte[][] i;
    public final int[] j;
    public int k;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final me5 a(String query, int i) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap treeMap = me5.m;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.INSTANCE;
                    me5 me5Var = new me5(i, null);
                    me5Var.n(query, i);
                    return me5Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                me5 sqliteQuery = (me5) entryCeilingEntry.getValue();
                sqliteQuery.n(query, i);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = me5.m;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }
    }

    public /* synthetic */ me5(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static final me5 j(String str, int i) {
        return l.a(str, i);
    }

    @Override // com.zepto.p96
    public void C(int i) {
        this.j[i] = 1;
    }

    @Override // com.zepto.p96
    public void F(int i, double d) {
        this.j[i] = 3;
        this.g[i] = d;
    }

    @Override // com.zepto.p96
    public void X(int i, long j) {
        this.j[i] = 2;
        this.f[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.zepto.q96
    public String d() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // com.zepto.q96
    public void e(p96 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int iM = m();
        if (1 > iM) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.j[i];
            if (i2 == 1) {
                statement.C(i);
            } else if (i2 == 2) {
                statement.X(i, this.f[i]);
            } else if (i2 == 3) {
                statement.F(i, this.g[i]);
            } else if (i2 == 4) {
                String str = this.h[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.s(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.i[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.f0(i, bArr);
            }
            if (i == iM) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.zepto.p96
    public void f0(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.j[i] = 5;
        this.i[i] = value;
    }

    public int m() {
        return this.k;
    }

    public final void n(String query, int i) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.e = query;
        this.k = i;
    }

    @Override // com.zepto.p96
    public void s(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.j[i] = 4;
        this.h[i] = value;
    }

    public final void w() {
        TreeMap treeMap = m;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.c), this);
            l.b();
            Unit unit = Unit.INSTANCE;
        }
    }

    public me5(int i) {
        this.c = i;
        int i2 = i + 1;
        this.j = new int[i2];
        this.f = new long[i2];
        this.g = new double[i2];
        this.h = new String[i2];
        this.i = new byte[i2][];
    }
}
