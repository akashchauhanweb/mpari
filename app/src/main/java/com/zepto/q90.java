package com.zepto;

import com.zepto.ld5;
import com.zepto.pl2;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class q90 {
    public static final a c = new a(null);
    public final kc5 a;
    public final ld5 b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(com.zepto.ld5 r5, com.zepto.kc5 r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.n()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = com.zepto.ld5.P(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                com.zepto.k90 r0 = r5.e()
                int r0 = r0.c()
                r1 = -1
                if (r0 != r1) goto L65
                com.zepto.k90 r0 = r5.e()
                boolean r0 = r0.b()
                if (r0 != 0) goto L65
                com.zepto.k90 r0 = r5.e()
                boolean r0 = r0.a()
                if (r0 != 0) goto L65
                return r2
            L65:
                com.zepto.k90 r5 = r5.e()
                boolean r5 = r5.h()
                if (r5 != 0) goto L7a
                com.zepto.k90 r5 = r6.b()
                boolean r5 = r5.h()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.q90.a.a(com.zepto.ld5, com.zepto.kc5):boolean");
        }
    }

    public static final class b {
        public Date a;
        public String b;
        public Date c;
        public String d;
        public Date e;
        public long f;
        public long g;
        public String h;
        public int i;
        public final long j;
        public final kc5 k;
        public final ld5 l;

        public b(long j, kc5 request, ld5 ld5Var) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.j = j;
            this.k = request;
            this.l = ld5Var;
            this.i = -1;
            if (ld5Var != null) {
                this.f = ld5Var.A0();
                this.g = ld5Var.y0();
                pl2 pl2VarU = ld5Var.U();
                int size = pl2VarU.size();
                for (int i = 0; i < size; i++) {
                    String strM = pl2VarU.m(i);
                    String strU = pl2VarU.u(i);
                    if (StringsKt__StringsJVMKt.equals(strM, "Date", true)) {
                        this.a = fe1.a(strU);
                        this.b = strU;
                    } else if (StringsKt__StringsJVMKt.equals(strM, "Expires", true)) {
                        this.e = fe1.a(strU);
                    } else if (StringsKt__StringsJVMKt.equals(strM, "Last-Modified", true)) {
                        this.c = fe1.a(strU);
                        this.d = strU;
                    } else if (StringsKt__StringsJVMKt.equals(strM, "ETag", true)) {
                        this.h = strU;
                    } else if (StringsKt__StringsJVMKt.equals(strM, "Age", true)) {
                        this.i = et6.S(strU, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.a;
            long jMax = date != null ? Math.max(0L, this.g - date.getTime()) : 0L;
            int i = this.i;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.g;
            return jMax + (j - this.f) + (this.j - j);
        }

        public final q90 b() {
            q90 q90VarC = c();
            return (q90VarC.b() == null || !this.k.b().i()) ? q90VarC : new q90(null, null);
        }

        public final q90 c() {
            String str;
            if (this.l == null) {
                return new q90(this.k, null);
            }
            if ((!this.k.g() || this.l.B() != null) && q90.c.a(this.l, this.k)) {
                k90 k90VarB = this.k.b();
                if (k90VarB.g() || e(this.k)) {
                    return new q90(this.k, null);
                }
                k90 k90VarE = this.l.e();
                long jA = a();
                long jD = d();
                if (k90VarB.c() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(k90VarB.c()));
                }
                long millis = 0;
                long millis2 = k90VarB.e() != -1 ? TimeUnit.SECONDS.toMillis(k90VarB.e()) : 0L;
                if (!k90VarE.f() && k90VarB.d() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(k90VarB.d());
                }
                if (!k90VarE.g()) {
                    long j = millis2 + jA;
                    if (j < millis + jD) {
                        ld5.a aVarM0 = this.l.m0();
                        if (j >= jD) {
                            aVarM0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarM0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new q90(null, aVarM0.c());
                    }
                }
                String str2 = this.h;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.c != null) {
                        str2 = this.d;
                    } else {
                        if (this.a == null) {
                            return new q90(this.k, null);
                        }
                        str2 = this.b;
                    }
                    str = "If-Modified-Since";
                }
                pl2.a aVarN = this.k.e().n();
                Intrinsics.checkNotNull(str2);
                aVarN.d(str, str2);
                return new q90(this.k.i().e(aVarN.e()).b(), this.l);
            }
            return new q90(this.k, null);
        }

        public final long d() {
            ld5 ld5Var = this.l;
            Intrinsics.checkNotNull(ld5Var);
            if (ld5Var.e().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.e;
            if (date != null) {
                Date date2 = this.a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.c == null || this.l.z0().k().o() != null) {
                return 0L;
            }
            Date date3 = this.a;
            long time2 = date3 != null ? date3.getTime() : this.f;
            Date date4 = this.c;
            Intrinsics.checkNotNull(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        public final boolean e(kc5 kc5Var) {
            return (kc5Var.d("If-Modified-Since") == null && kc5Var.d("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            ld5 ld5Var = this.l;
            Intrinsics.checkNotNull(ld5Var);
            return ld5Var.e().c() == -1 && this.e == null;
        }
    }

    public q90(kc5 kc5Var, ld5 ld5Var) {
        this.a = kc5Var;
        this.b = ld5Var;
    }

    public final ld5 a() {
        return this.b;
    }

    public final kc5 b() {
        return this.a;
    }
}
