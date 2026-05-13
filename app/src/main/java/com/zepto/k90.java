package com.zepto;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class k90 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;
    public static final b p = new b(null);
    public static final k90 n = new a().d().a();
    public static final k90 o = new a().f().c(IntCompanionObject.MAX_VALUE, TimeUnit.SECONDS).a();

    public static final class a {
        public boolean a;
        public boolean b;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public boolean f;
        public boolean g;
        public boolean h;

        public final k90 a() {
            return new k90(this.a, this.b, this.c, -1, false, false, false, this.d, this.e, this.f, this.g, this.h, null, null);
        }

        public final int b(long j) {
            return j > ((long) IntCompanionObject.MAX_VALUE) ? IntCompanionObject.MAX_VALUE : (int) j;
        }

        public final a c(int i, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                this.d = b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        public final a d() {
            this.a = true;
            return this;
        }

        public final a e() {
            this.b = true;
            return this;
        }

        public final a f() {
            this.f = true;
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.zepto.k90 b(com.zepto.pl2 r32) {
            /*
                Method dump skipped, instruction units count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.k90.b.b(com.zepto.pl2):com.zepto.k90");
        }
    }

    public k90(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    public final int e() {
        return this.i;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public final boolean i() {
        return this.j;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        if (this.c != -1) {
            sb.append("max-age=");
            sb.append(this.c);
            sb.append(", ");
        }
        if (this.d != -1) {
            sb.append("s-maxage=");
            sb.append(this.d);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.m = string;
        return string;
    }

    public /* synthetic */ k90(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
