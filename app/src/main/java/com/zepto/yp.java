package com.zepto;

import android.content.Context;
import android.os.Looper;
import com.zepto.t40;
import com.zepto.zj2;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yp {
    public final a a;
    public final g b;
    public final String c;

    public static abstract class a extends e {
        public f a(Context context, Looper looper, tq0 tq0Var, Object obj, jw0 jw0Var, lg4 lg4Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        public f b(Context context, Looper looper, tq0 tq0Var, Object obj, zj2.a aVar, zj2.b bVar) {
            return a(context, looper, tq0Var, obj, aVar, bVar);
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {
        public static final a a = new a(null);

        public static final class a implements d {
            public /* synthetic */ a(q18 q18Var) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        void a(t40.e eVar);

        Set b();

        void c(String str);

        void d(kw2 kw2Var, Set set);

        void disconnect();

        boolean e();

        int f();

        boolean g();

        w82[] h();

        String i();

        boolean isConnected();

        String j();

        boolean k();

        void n(t40.c cVar);
    }

    public static final class g extends c {
    }

    public yp(String str, a aVar, g gVar) {
        iu4.j(aVar, "Cannot construct an Api with a null ClientBuilder");
        iu4.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }
}
