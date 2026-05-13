package androidx.work;

import com.zepto.aa6;
import com.zepto.az2;
import com.zepto.hz7;
import com.zepto.lf5;
import com.zepto.p94;
import com.zepto.uf1;
import com.zepto.ux0;
import com.zepto.xq0;
import com.zepto.zv0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final b p = new b(null);
    public final Executor a;
    public final Executor b;
    public final xq0 c;
    public final hz7 d;
    public final az2 e;
    public final lf5 f;
    public final ux0 g;
    public final ux0 h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0027a {
        public Executor a;
        public hz7 b;
        public az2 c;
        public Executor d;
        public xq0 e;
        public lf5 f;
        public ux0 g;
        public ux0 h;
        public String i;
        public int k;
        public int j = 4;
        public int l = IntCompanionObject.MAX_VALUE;
        public int m = 20;
        public int n = zv0.c();

        public final a a() {
            return new a(this);
        }

        public final xq0 b() {
            return this.e;
        }

        public final int c() {
            return this.n;
        }

        public final String d() {
            return this.i;
        }

        public final Executor e() {
            return this.a;
        }

        public final ux0 f() {
            return this.g;
        }

        public final az2 g() {
            return this.c;
        }

        public final int h() {
            return this.j;
        }

        public final int i() {
            return this.l;
        }

        public final int j() {
            return this.m;
        }

        public final int k() {
            return this.k;
        }

        public final lf5 l() {
            return this.f;
        }

        public final ux0 m() {
            return this.h;
        }

        public final Executor n() {
            return this.d;
        }

        public final hz7 o() {
            return this.b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(C0027a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Executor executorE = builder.e();
        this.a = executorE == null ? zv0.b(false) : executorE;
        this.o = builder.n() == null;
        Executor executorN = builder.n();
        this.b = executorN == null ? zv0.b(true) : executorN;
        xq0 xq0VarB = builder.b();
        this.c = xq0VarB == null ? new aa6() : xq0VarB;
        hz7 hz7VarO = builder.o();
        if (hz7VarO == null) {
            hz7VarO = hz7.c();
            Intrinsics.checkNotNullExpressionValue(hz7VarO, "getDefaultWorkerFactory()");
        }
        this.d = hz7VarO;
        az2 az2VarG = builder.g();
        this.e = az2VarG == null ? p94.a : az2VarG;
        lf5 lf5VarL = builder.l();
        this.f = lf5VarL == null ? new uf1() : lf5VarL;
        this.j = builder.h();
        this.k = builder.k();
        this.l = builder.i();
        this.n = builder.j();
        this.g = builder.f();
        this.h = builder.m();
        this.i = builder.d();
        this.m = builder.c();
    }

    public final xq0 a() {
        return this.c;
    }

    public final int b() {
        return this.m;
    }

    public final String c() {
        return this.i;
    }

    public final Executor d() {
        return this.a;
    }

    public final ux0 e() {
        return this.g;
    }

    public final az2 f() {
        return this.e;
    }

    public final int g() {
        return this.l;
    }

    public final int h() {
        return this.n;
    }

    public final int i() {
        return this.k;
    }

    public final int j() {
        return this.j;
    }

    public final lf5 k() {
        return this.f;
    }

    public final ux0 l() {
        return this.h;
    }

    public final Executor m() {
        return this.b;
    }

    public final hz7 n() {
        return this.d;
    }
}
