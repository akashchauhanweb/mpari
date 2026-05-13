package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class l00 implements aw0 {
    public static final aw0 a = new l00();

    public static final class a implements we4 {
        public static final a a = new a();
        public static final fb2 b = fb2.a("projectNumber").b(iy.b().c(1).a()).a();
        public static final fb2 c = fb2.a("messageId").b(iy.b().c(2).a()).a();
        public static final fb2 d = fb2.a("instanceId").b(iy.b().c(3).a()).a();
        public static final fb2 e = fb2.a("messageType").b(iy.b().c(4).a()).a();
        public static final fb2 f = fb2.a("sdkPlatform").b(iy.b().c(5).a()).a();
        public static final fb2 g = fb2.a("packageName").b(iy.b().c(6).a()).a();
        public static final fb2 h = fb2.a("collapseKey").b(iy.b().c(7).a()).a();
        public static final fb2 i = fb2.a("priority").b(iy.b().c(8).a()).a();
        public static final fb2 j = fb2.a("ttl").b(iy.b().c(9).a()).a();
        public static final fb2 k = fb2.a("topic").b(iy.b().c(10).a()).a();
        public static final fb2 l = fb2.a("bulkId").b(iy.b().c(11).a()).a();
        public static final fb2 m = fb2.a("event").b(iy.b().c(12).a()).a();
        public static final fb2 n = fb2.a("analyticsLabel").b(iy.b().c(13).a()).a();
        public static final fb2 o = fb2.a("campaignId").b(iy.b().c(14).a()).a();
        public static final fb2 p = fb2.a("composerLabel").b(iy.b().c(15).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(it3 it3Var, xe4 xe4Var) {
            xe4Var.b(b, it3Var.l());
            xe4Var.a(c, it3Var.h());
            xe4Var.a(d, it3Var.g());
            xe4Var.a(e, it3Var.i());
            xe4Var.a(f, it3Var.m());
            xe4Var.a(g, it3Var.j());
            xe4Var.a(h, it3Var.d());
            xe4Var.d(i, it3Var.k());
            xe4Var.d(j, it3Var.o());
            xe4Var.a(k, it3Var.n());
            xe4Var.b(l, it3Var.b());
            xe4Var.a(m, it3Var.f());
            xe4Var.a(n, it3Var.a());
            xe4Var.b(o, it3Var.c());
            xe4Var.a(p, it3Var.e());
        }
    }

    public static final class b implements we4 {
        public static final b a = new b();
        public static final fb2 b = fb2.a("messagingClientEvent").b(iy.b().c(1).a()).a();

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(jt3 jt3Var, xe4 xe4Var) {
            xe4Var.a(b, jt3Var.a());
        }
    }

    public static final class c implements we4 {
        public static final c a = new c();
        public static final fb2 b = fb2.d("messagingClientEventExtension");

        @Override // com.zepto.we4
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            wb0.a(obj);
            b(null, (xe4) obj2);
        }

        public void b(ww4 ww4Var, xe4 xe4Var) {
            throw null;
        }
    }

    @Override // com.zepto.aw0
    public void a(a22 a22Var) {
        a22Var.a(ww4.class, c.a);
        a22Var.a(jt3.class, b.a);
        a22Var.a(it3.class, a.a);
    }
}
