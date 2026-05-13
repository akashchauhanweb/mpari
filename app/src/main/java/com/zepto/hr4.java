package com.zepto;

import com.zepto.g10;
import com.zepto.gr4;

/* JADX INFO: loaded from: classes.dex */
public abstract class hr4 {
    public static hr4 a = a().a();

    public static abstract class a {
        public abstract hr4 a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(gr4.a aVar);

        public abstract a h(long j);
    }

    public static a a() {
        return new g10.b().h(0L).g(gr4.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract gr4.a g();

    public abstract long h();

    public boolean i() {
        return g() == gr4.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == gr4.a.NOT_GENERATED || g() == gr4.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == gr4.a.REGISTERED;
    }

    public boolean l() {
        return g() == gr4.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == gr4.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public hr4 o(String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    public hr4 p() {
        return n().b(null).a();
    }

    public hr4 q(String str) {
        return n().e(str).g(gr4.a.REGISTER_ERROR).a();
    }

    public hr4 r() {
        return n().g(gr4.a.NOT_GENERATED).a();
    }

    public hr4 s(String str, String str2, long j, String str3, long j2) {
        return n().d(str).g(gr4.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    public hr4 t(String str) {
        return n().d(str).g(gr4.a.UNREGISTERED).a();
    }
}
