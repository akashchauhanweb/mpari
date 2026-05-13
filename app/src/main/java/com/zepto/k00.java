package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class k00 implements aw0 {
    public static final aw0 a = new k00();

    public static final class a implements we4 {
        public static final a a = new a();
        public static final fb2 b = fb2.a("window").b(iy.b().c(1).a()).a();
        public static final fb2 c = fb2.a("logSourceMetrics").b(iy.b().c(2).a()).a();
        public static final fb2 d = fb2.a("globalMetrics").b(iy.b().c(3).a()).a();
        public static final fb2 e = fb2.a("appNamespace").b(iy.b().c(4).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(sq0 sq0Var, xe4 xe4Var) {
            xe4Var.a(b, sq0Var.d());
            xe4Var.a(c, sq0Var.c());
            xe4Var.a(d, sq0Var.b());
            xe4Var.a(e, sq0Var.a());
        }
    }

    public static final class b implements we4 {
        public static final b a = new b();
        public static final fb2 b = fb2.a("storageMetrics").b(iy.b().c(1).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(oj2 oj2Var, xe4 xe4Var) {
            xe4Var.a(b, oj2Var.a());
        }
    }

    public static final class c implements we4 {
        public static final c a = new c();
        public static final fb2 b = fb2.a("eventsDroppedCount").b(iy.b().c(1).a()).a();
        public static final fb2 c = fb2.a("reason").b(iy.b().c(3).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(jn3 jn3Var, xe4 xe4Var) {
            xe4Var.b(b, jn3Var.a());
            xe4Var.a(c, jn3Var.b());
        }
    }

    public static final class d implements we4 {
        public static final d a = new d();
        public static final fb2 b = fb2.a("logSource").b(iy.b().c(1).a()).a();
        public static final fb2 c = fb2.a("logEventDropped").b(iy.b().c(2).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(mn3 mn3Var, xe4 xe4Var) {
            xe4Var.a(b, mn3Var.b());
            xe4Var.a(c, mn3Var.a());
        }
    }

    public static final class e implements we4 {
        public static final e a = new e();
        public static final fb2 b = fb2.d("clientMetrics");

        @Override // com.zepto.we4
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            wb0.a(obj);
            b(null, (xe4) obj2);
        }

        public void b(xw4 xw4Var, xe4 xe4Var) {
            throw null;
        }
    }

    public static final class f implements we4 {
        public static final f a = new f();
        public static final fb2 b = fb2.a("currentCacheSizeBytes").b(iy.b().c(1).a()).a();
        public static final fb2 c = fb2.a("maxCacheSizeBytes").b(iy.b().c(2).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n76 n76Var, xe4 xe4Var) {
            xe4Var.b(b, n76Var.a());
            xe4Var.b(c, n76Var.b());
        }
    }

    public static final class g implements we4 {
        public static final g a = new g();
        public static final fb2 b = fb2.a("startMs").b(iy.b().c(1).a()).a();
        public static final fb2 c = fb2.a("endMs").b(iy.b().c(2).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ag6 ag6Var, xe4 xe4Var) {
            xe4Var.b(b, ag6Var.b());
            xe4Var.b(c, ag6Var.a());
        }
    }

    @Override // com.zepto.aw0
    public void a(a22 a22Var) {
        a22Var.a(xw4.class, e.a);
        a22Var.a(sq0.class, a.a);
        a22Var.a(ag6.class, g.a);
        a22Var.a(mn3.class, d.a);
        a22Var.a(jn3.class, c.a);
        a22Var.a(oj2.class, b.a);
        a22Var.a(n76.class, f.a);
    }
}
