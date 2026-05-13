package com.zepto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lr2 {
    public static final ll2[] a;
    public static final Map b;
    public static final lr2 c;

    public static final class b {
        public int a;
        public boolean b;
        public int c;
        public ll2[] d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final boolean i;
        public final u70 j;

        public b(int i, boolean z, u70 out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.h = i;
            this.i = z;
            this.j = out;
            this.a = IntCompanionObject.MAX_VALUE;
            this.c = i;
            this.d = new ll2[8];
            this.e = r2.length - 1;
        }

        public final void a() {
            int i = this.c;
            int i2 = this.g;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        public final void b() {
            ArraysKt___ArraysJvmKt.fill$default(this.d, (Object) null, 0, 0, 6, (Object) null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
        }

        public final int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    ll2 ll2Var = this.d[length];
                    Intrinsics.checkNotNull(ll2Var);
                    i -= ll2Var.a;
                    int i4 = this.g;
                    ll2 ll2Var2 = this.d[length];
                    Intrinsics.checkNotNull(ll2Var2);
                    this.g = i4 - ll2Var2.a;
                    this.f--;
                    i3++;
                }
                ll2[] ll2VarArr = this.d;
                System.arraycopy(ll2VarArr, i2 + 1, ll2VarArr, i2 + 1 + i3, this.f);
                ll2[] ll2VarArr2 = this.d;
                int i5 = this.e;
                Arrays.fill(ll2VarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.e += i3;
            }
            return i3;
        }

        public final void d(ll2 ll2Var) {
            int i = ll2Var.a;
            int i2 = this.c;
            if (i > i2) {
                b();
                return;
            }
            c((this.g + i) - i2);
            int i3 = this.f + 1;
            ll2[] ll2VarArr = this.d;
            if (i3 > ll2VarArr.length) {
                ll2[] ll2VarArr2 = new ll2[ll2VarArr.length * 2];
                System.arraycopy(ll2VarArr, 0, ll2VarArr2, ll2VarArr.length, ll2VarArr.length);
                this.e = this.d.length - 1;
                this.d = ll2VarArr2;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = ll2Var;
            this.f++;
            this.g += i;
        }

        public final void e(int i) {
            this.h = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.c;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.a = Math.min(this.a, iMin);
            }
            this.b = true;
            this.c = iMin;
            a();
        }

        public final void f(t80 data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.i) {
                es2 es2Var = es2.d;
                if (es2Var.d(data) < data.t()) {
                    u70 u70Var = new u70();
                    es2Var.c(data, u70Var);
                    t80 t80VarP = u70Var.p();
                    h(t80VarP.t(), 127, 128);
                    this.j.h0(t80VarP);
                    return;
                }
            }
            h(data.t(), 127, 0);
            this.j.h0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r13) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.lr2.b.g(java.util.List):void");
        }

        public final void h(int i, int i2, int i3) {
            if (i < i2) {
                this.j.J(i | i3);
                return;
            }
            this.j.J(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.j.J(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.j.J(i4);
        }

        public /* synthetic */ b(int i, boolean z, u70 u70Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ConstantsKt.DEFAULT_BLOCK_SIZE : i, (i2 & 2) != 0 ? true : z, u70Var);
        }
    }

    static {
        lr2 lr2Var = new lr2();
        c = lr2Var;
        ll2 ll2Var = new ll2(ll2.i, "");
        t80 t80Var = ll2.f;
        ll2 ll2Var2 = new ll2(t80Var, "GET");
        ll2 ll2Var3 = new ll2(t80Var, "POST");
        t80 t80Var2 = ll2.g;
        ll2 ll2Var4 = new ll2(t80Var2, "/");
        ll2 ll2Var5 = new ll2(t80Var2, "/index.html");
        t80 t80Var3 = ll2.h;
        ll2 ll2Var6 = new ll2(t80Var3, "http");
        ll2 ll2Var7 = new ll2(t80Var3, "https");
        t80 t80Var4 = ll2.e;
        a = new ll2[]{ll2Var, ll2Var2, ll2Var3, ll2Var4, ll2Var5, ll2Var6, ll2Var7, new ll2(t80Var4, "200"), new ll2(t80Var4, "204"), new ll2(t80Var4, "206"), new ll2(t80Var4, "304"), new ll2(t80Var4, "400"), new ll2(t80Var4, "404"), new ll2(t80Var4, "500"), new ll2("accept-charset", ""), new ll2("accept-encoding", "gzip, deflate"), new ll2("accept-language", ""), new ll2("accept-ranges", ""), new ll2("accept", ""), new ll2("access-control-allow-origin", ""), new ll2("age", ""), new ll2("allow", ""), new ll2("authorization", ""), new ll2("cache-control", ""), new ll2("content-disposition", ""), new ll2("content-encoding", ""), new ll2("content-language", ""), new ll2("content-length", ""), new ll2("content-location", ""), new ll2("content-range", ""), new ll2("content-type", ""), new ll2("cookie", ""), new ll2("date", ""), new ll2("etag", ""), new ll2("expect", ""), new ll2("expires", ""), new ll2("from", ""), new ll2("host", ""), new ll2("if-match", ""), new ll2("if-modified-since", ""), new ll2("if-none-match", ""), new ll2("if-range", ""), new ll2("if-unmodified-since", ""), new ll2("last-modified", ""), new ll2("link", ""), new ll2("location", ""), new ll2("max-forwards", ""), new ll2("proxy-authenticate", ""), new ll2("proxy-authorization", ""), new ll2("range", ""), new ll2("referer", ""), new ll2("refresh", ""), new ll2("retry-after", ""), new ll2("server", ""), new ll2("set-cookie", ""), new ll2("strict-transport-security", ""), new ll2("transfer-encoding", ""), new ll2("user-agent", ""), new ll2("vary", ""), new ll2("via", ""), new ll2("www-authenticate", "")};
        b = lr2Var.d();
    }

    public final t80 a(t80 name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iT = name.t();
        for (int i = 0; i < iT; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bE = name.e(i);
            if (b2 <= bE && b3 >= bE) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.w());
            }
        }
        return name;
    }

    public final Map b() {
        return b;
    }

    public final ll2[] c() {
        return a;
    }

    public final Map d() {
        ll2[] ll2VarArr = a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ll2VarArr.length);
        int length = ll2VarArr.length;
        for (int i = 0; i < length; i++) {
            ll2[] ll2VarArr2 = a;
            if (!linkedHashMap.containsKey(ll2VarArr2[i].b)) {
                linkedHashMap.put(ll2VarArr2[i].b, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public static final class a {
        public final List a;
        public final a80 b;
        public ll2[] c;
        public int d;
        public int e;
        public int f;
        public final int g;
        public int h;

        public a(y46 source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.g = i;
            this.h = i2;
            this.a = new ArrayList();
            this.b = zf4.d(source);
            this.c = new ll2[8];
            this.d = r2.length - 1;
        }

        public final void a() {
            int i = this.h;
            int i2 = this.f;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        public final void b() {
            ArraysKt___ArraysJvmKt.fill$default(this.c, (Object) null, 0, 0, 6, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        public final int c(int i) {
            return this.d + 1 + i;
        }

        public final int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    i2 = this.d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    ll2 ll2Var = this.c[length];
                    Intrinsics.checkNotNull(ll2Var);
                    int i4 = ll2Var.a;
                    i -= i4;
                    this.f -= i4;
                    this.e--;
                    i3++;
                }
                ll2[] ll2VarArr = this.c;
                System.arraycopy(ll2VarArr, i2 + 1, ll2VarArr, i2 + 1 + i3, this.e);
                this.d += i3;
            }
            return i3;
        }

        public final List e() {
            List list = CollectionsKt___CollectionsKt.toList(this.a);
            this.a.clear();
            return list;
        }

        public final t80 f(int i) throws IOException {
            if (h(i)) {
                return lr2.c.c()[i].b;
            }
            int iC = c(i - lr2.c.c().length);
            if (iC >= 0) {
                ll2[] ll2VarArr = this.c;
                if (iC < ll2VarArr.length) {
                    ll2 ll2Var = ll2VarArr[iC];
                    Intrinsics.checkNotNull(ll2Var);
                    return ll2Var.b;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void g(int i, ll2 ll2Var) {
            this.a.add(ll2Var);
            int i2 = ll2Var.a;
            if (i != -1) {
                ll2 ll2Var2 = this.c[c(i)];
                Intrinsics.checkNotNull(ll2Var2);
                i2 -= ll2Var2.a;
            }
            int i3 = this.h;
            if (i2 > i3) {
                b();
                return;
            }
            int iD = d((this.f + i2) - i3);
            if (i == -1) {
                int i4 = this.e + 1;
                ll2[] ll2VarArr = this.c;
                if (i4 > ll2VarArr.length) {
                    ll2[] ll2VarArr2 = new ll2[ll2VarArr.length * 2];
                    System.arraycopy(ll2VarArr, 0, ll2VarArr2, ll2VarArr.length, ll2VarArr.length);
                    this.d = this.c.length - 1;
                    this.c = ll2VarArr2;
                }
                int i5 = this.d;
                this.d = i5 - 1;
                this.c[i5] = ll2Var;
                this.e++;
            } else {
                this.c[i + c(i) + iD] = ll2Var;
            }
            this.f += i2;
        }

        public final boolean h(int i) {
            return i >= 0 && i <= lr2.c.c().length - 1;
        }

        public final int i() {
            return et6.b(this.b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
        }

        public final t80 j() {
            int i = i();
            boolean z = (i & 128) == 128;
            long jM = m(i, 127);
            if (!z) {
                return this.b.q(jM);
            }
            u70 u70Var = new u70();
            es2.d.b(this.b, jM, u70Var);
            return u70Var.p();
        }

        public final void k() throws IOException {
            while (!this.b.I()) {
                int iB = et6.b(this.b.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    l(m(iB, 127) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.h = iM;
                    if (iM < 0 || iM > this.g) {
                        throw new IOException("Invalid dynamic table size update " + this.h);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final void l(int i) throws IOException {
            if (h(i)) {
                this.a.add(lr2.c.c()[i]);
                return;
            }
            int iC = c(i - lr2.c.c().length);
            if (iC >= 0) {
                ll2[] ll2VarArr = this.c;
                if (iC < ll2VarArr.length) {
                    List list = this.a;
                    ll2 ll2Var = ll2VarArr[iC];
                    Intrinsics.checkNotNull(ll2Var);
                    list.add(ll2Var);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final int m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public final void n(int i) {
            g(-1, new ll2(f(i), j()));
        }

        public final void o() {
            g(-1, new ll2(lr2.c.a(j()), j()));
        }

        public final void p(int i) throws IOException {
            this.a.add(new ll2(f(i), j()));
        }

        public final void q() throws IOException {
            this.a.add(new ll2(lr2.c.a(j()), j()));
        }

        public /* synthetic */ a(y46 y46Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(y46Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }
}
