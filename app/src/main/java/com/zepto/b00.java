package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class b00 implements aw0 {
    public static final aw0 a = new b00();

    public static final class a implements we4 {
        public static final a a = new a();
        public static final fb2 b = fb2.d("sdkVersion");
        public static final fb2 c = fb2.d("model");
        public static final fb2 d = fb2.d("hardware");
        public static final fb2 e = fb2.d("device");
        public static final fb2 f = fb2.d("product");
        public static final fb2 g = fb2.d("osBuild");
        public static final fb2 h = fb2.d("manufacturer");
        public static final fb2 i = fb2.d("fingerprint");
        public static final fb2 j = fb2.d("locale");
        public static final fb2 k = fb2.d("country");
        public static final fb2 l = fb2.d("mccMnc");
        public static final fb2 m = fb2.d("applicationBuild");

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(zo zoVar, xe4 xe4Var) {
            xe4Var.a(b, zoVar.m());
            xe4Var.a(c, zoVar.j());
            xe4Var.a(d, zoVar.f());
            xe4Var.a(e, zoVar.d());
            xe4Var.a(f, zoVar.l());
            xe4Var.a(g, zoVar.k());
            xe4Var.a(h, zoVar.h());
            xe4Var.a(i, zoVar.e());
            xe4Var.a(j, zoVar.g());
            xe4Var.a(k, zoVar.c());
            xe4Var.a(l, zoVar.i());
            xe4Var.a(m, zoVar.b());
        }
    }

    public static final class b implements we4 {
        public static final b a = new b();
        public static final fb2 b = fb2.d("logRequest");

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h50 h50Var, xe4 xe4Var) {
            xe4Var.a(b, h50Var.c());
        }
    }

    public static final class c implements we4 {
        public static final c a = new c();
        public static final fb2 b = fb2.d("clientType");
        public static final fb2 c = fb2.d("androidClientInfo");

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(rq0 rq0Var, xe4 xe4Var) {
            xe4Var.a(b, rq0Var.c());
            xe4Var.a(c, rq0Var.b());
        }
    }

    public static final class d implements we4 {
        public static final d a = new d();
        public static final fb2 b = fb2.d("eventTimeMs");
        public static final fb2 c = fb2.d("eventCode");
        public static final fb2 d = fb2.d("eventUptimeMs");
        public static final fb2 e = fb2.d("sourceExtension");
        public static final fb2 f = fb2.d("sourceExtensionJsonProto3");
        public static final fb2 g = fb2.d("timezoneOffsetSeconds");
        public static final fb2 h = fb2.d("networkConnectionInfo");

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(in3 in3Var, xe4 xe4Var) {
            xe4Var.b(b, in3Var.c());
            xe4Var.a(c, in3Var.b());
            xe4Var.b(d, in3Var.d());
            xe4Var.a(e, in3Var.f());
            xe4Var.a(f, in3Var.g());
            xe4Var.b(g, in3Var.h());
            xe4Var.a(h, in3Var.e());
        }
    }

    public static final class e implements we4 {
        public static final e a = new e();
        public static final fb2 b = fb2.d("requestTimeMs");
        public static final fb2 c = fb2.d("requestUptimeMs");
        public static final fb2 d = fb2.d("clientInfo");
        public static final fb2 e = fb2.d("logSource");
        public static final fb2 f = fb2.d("logSourceName");
        public static final fb2 g = fb2.d("logEvent");
        public static final fb2 h = fb2.d("qosTier");

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(kn3 kn3Var, xe4 xe4Var) {
            xe4Var.b(b, kn3Var.g());
            xe4Var.b(c, kn3Var.h());
            xe4Var.a(d, kn3Var.b());
            xe4Var.a(e, kn3Var.d());
            xe4Var.a(f, kn3Var.e());
            xe4Var.a(g, kn3Var.c());
            xe4Var.a(h, kn3Var.f());
        }
    }

    public static final class f implements we4 {
        public static final f a = new f();
        public static final fb2 b = fb2.d("networkType");
        public static final fb2 c = fb2.d("mobileSubtype");

        @Override // com.zepto.we4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f44 f44Var, xe4 xe4Var) {
            xe4Var.a(b, f44Var.c());
            xe4Var.a(c, f44Var.b());
        }
    }

    @Override // com.zepto.aw0
    public void a(a22 a22Var) {
        b bVar = b.a;
        a22Var.a(h50.class, bVar);
        a22Var.a(r00.class, bVar);
        e eVar = e.a;
        a22Var.a(kn3.class, eVar);
        a22Var.a(c10.class, eVar);
        c cVar = c.a;
        a22Var.a(rq0.class, cVar);
        a22Var.a(s00.class, cVar);
        a aVar = a.a;
        a22Var.a(zo.class, aVar);
        a22Var.a(o00.class, aVar);
        d dVar = d.a;
        a22Var.a(in3.class, dVar);
        a22Var.a(b10.class, dVar);
        f fVar = f.a;
        a22Var.a(f44.class, fVar);
        a22Var.a(e10.class, fVar);
    }
}
