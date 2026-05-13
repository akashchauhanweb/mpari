package com.zepto;

import com.zepto.tr2;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class rr2 implements Closeable {
    public static final vz5 F;
    public static final c G = new c(null);
    public long A;
    public final Socket B;
    public final vr2 C;
    public final e D;
    public final Set E;
    public final boolean c;
    public final d e;
    public final Map f;
    public final String g;
    public int h;
    public int i;
    public boolean j;
    public final cd6 k;
    public final bd6 l;
    public final bd6 m;
    public final bd6 n;
    public final ay4 o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public final vz5 v;
    public vz5 w;
    public long x;
    public long y;
    public long z;

    public static final class a extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ rr2 f;
        public final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, rr2 rr2Var, long j) {
            super(str2, false, 2, null);
            this.e = str;
            this.f = rr2Var;
            this.g = j;
        }

        @Override // com.zepto.oc6
        public long f() {
            boolean z;
            synchronized (this.f) {
                if (this.f.q < this.f.p) {
                    z = true;
                } else {
                    this.f.p++;
                    z = false;
                }
            }
            if (z) {
                this.f.B0(null);
                return -1L;
            }
            this.f.f1(false, 1, 0);
            return this.g;
        }
    }

    public static final class b {
        public Socket a;
        public String b;
        public a80 c;
        public z70 d;
        public d e;
        public ay4 f;
        public int g;
        public boolean h;
        public final cd6 i;

        public b(boolean z, cd6 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.h = z;
            this.i = taskRunner;
            this.e = d.a;
            this.f = ay4.a;
        }

        public final rr2 a() {
            return new rr2(this);
        }

        public final boolean b() {
            return this.h;
        }

        public final String c() {
            String str = this.b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.e;
        }

        public final int e() {
            return this.g;
        }

        public final ay4 f() {
            return this.f;
        }

        public final z70 g() {
            z70 z70Var = this.d;
            if (z70Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
            }
            return z70Var;
        }

        public final Socket h() {
            Socket socket = this.a;
            if (socket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socket");
            }
            return socket;
        }

        public final a80 i() {
            a80 a80Var = this.c;
            if (a80Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
            }
            return a80Var;
        }

        public final cd6 j() {
            return this.i;
        }

        public final b k(d listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.e = listener;
            return this;
        }

        public final b l(int i) {
            this.g = i;
            return this;
        }

        public final b m(Socket socket, String peerName, a80 source, z70 sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.a = socket;
            if (this.h) {
                str = et6.i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            this.b = str;
            this.c = source;
            this.d = sink;
            return this;
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vz5 a() {
            return rr2.F;
        }
    }

    public static abstract class d {
        public static final b b = new b(null);
        public static final d a = new a();

        public static final class a extends d {
            @Override // com.zepto.rr2.d
            public void c(ur2 stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.d(y22.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void b(rr2 connection, vz5 settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void c(ur2 ur2Var);
    }

    public final class e implements tr2.c, Function0 {
        public final tr2 c;
        public final /* synthetic */ rr2 e;

        public static final class a extends oc6 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ e g;
            public final /* synthetic */ Ref.ObjectRef h;
            public final /* synthetic */ boolean i;
            public final /* synthetic */ vz5 j;
            public final /* synthetic */ Ref.LongRef k;
            public final /* synthetic */ Ref.ObjectRef l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, e eVar, Ref.ObjectRef objectRef, boolean z3, vz5 vz5Var, Ref.LongRef longRef, Ref.ObjectRef objectRef2) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = eVar;
                this.h = objectRef;
                this.i = z3;
                this.j = vz5Var;
                this.k = longRef;
                this.l = objectRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.zepto.oc6
            public long f() {
                this.g.e.F0().b(this.g.e, (vz5) this.h.element);
                return -1L;
            }
        }

        public static final class b extends oc6 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ ur2 g;
            public final /* synthetic */ e h;
            public final /* synthetic */ ur2 i;
            public final /* synthetic */ int j;
            public final /* synthetic */ List k;
            public final /* synthetic */ boolean l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, ur2 ur2Var, e eVar, ur2 ur2Var2, int i, List list, boolean z3) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = ur2Var;
                this.h = eVar;
                this.i = ur2Var2;
                this.j = i;
                this.k = list;
                this.l = z3;
            }

            @Override // com.zepto.oc6
            public long f() {
                try {
                    this.h.e.F0().c(this.g);
                    return -1L;
                } catch (IOException e) {
                    is4.c.g().k("Http2Connection.Listener failure for " + this.h.e.D0(), 4, e);
                    try {
                        this.g.d(y22.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends oc6 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ e g;
            public final /* synthetic */ int h;
            public final /* synthetic */ int i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, e eVar, int i, int i2) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = eVar;
                this.h = i;
                this.i = i2;
            }

            @Override // com.zepto.oc6
            public long f() {
                this.g.e.f1(true, this.h, this.i);
                return -1L;
            }
        }

        public static final class d extends oc6 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ e g;
            public final /* synthetic */ boolean h;
            public final /* synthetic */ vz5 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z, String str2, boolean z2, e eVar, boolean z3, vz5 vz5Var) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = eVar;
                this.h = z3;
                this.i = vz5Var;
            }

            @Override // com.zepto.oc6
            public long f() {
                this.g.k(this.h, this.i);
                return -1L;
            }
        }

        public e(rr2 rr2Var, tr2 reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.e = rr2Var;
            this.c = reader;
        }

        @Override // com.zepto.tr2.c
        public void a() {
        }

        @Override // com.zepto.tr2.c
        public void b(boolean z, int i, a80 source, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.e.U0(i)) {
                this.e.Q0(i, source, i2, z);
                return;
            }
            ur2 ur2VarJ0 = this.e.J0(i);
            if (ur2VarJ0 == null) {
                this.e.h1(i, y22.PROTOCOL_ERROR);
                long j = i2;
                this.e.c1(j);
                source.skip(j);
                return;
            }
            ur2VarJ0.w(source, i2);
            if (z) {
                ur2VarJ0.x(et6.b, true);
            }
        }

        @Override // com.zepto.tr2.c
        public void c(boolean z, int i, int i2) {
            if (!z) {
                bd6 bd6Var = this.e.l;
                String str = this.e.D0() + " ping";
                bd6Var.i(new c(str, true, str, true, this, i, i2), 0L);
                return;
            }
            synchronized (this.e) {
                try {
                    if (i == 1) {
                        this.e.q++;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.e.t++;
                            rr2 rr2Var = this.e;
                            if (rr2Var == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            rr2Var.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        this.e.s++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.tr2.c
        public void d(int i, int i2, int i3, boolean z) {
        }

        @Override // com.zepto.tr2.c
        public void e(int i, y22 errorCode, t80 debugData) {
            int i2;
            ur2[] ur2VarArr;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.t();
            synchronized (this.e) {
                Object[] array = this.e.K0().values().toArray(new ur2[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                ur2VarArr = (ur2[]) array;
                this.e.j = true;
                Unit unit = Unit.INSTANCE;
            }
            for (ur2 ur2Var : ur2VarArr) {
                if (ur2Var.j() > i && ur2Var.t()) {
                    ur2Var.y(y22.REFUSED_STREAM);
                    this.e.V0(ur2Var.j());
                }
            }
        }

        @Override // com.zepto.tr2.c
        public void f(boolean z, vz5 settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            bd6 bd6Var = this.e.l;
            String str = this.e.D0() + " applyAndAckSettings";
            bd6Var.i(new d(str, true, str, true, this, z, settings), 0L);
        }

        @Override // com.zepto.tr2.c
        public void g(boolean z, int i, int i2, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.e.U0(i)) {
                this.e.R0(i, headerBlock, z);
                return;
            }
            synchronized (this.e) {
                ur2 ur2VarJ0 = this.e.J0(i);
                if (ur2VarJ0 != null) {
                    Unit unit = Unit.INSTANCE;
                    ur2VarJ0.x(et6.M(headerBlock), z);
                    return;
                }
                if (this.e.j) {
                    return;
                }
                if (i <= this.e.E0()) {
                    return;
                }
                if (i % 2 == this.e.G0() % 2) {
                    return;
                }
                ur2 ur2Var = new ur2(i, this.e, false, z, et6.M(headerBlock));
                this.e.X0(i);
                this.e.K0().put(Integer.valueOf(i), ur2Var);
                bd6 bd6VarI = this.e.k.i();
                String str = this.e.D0() + '[' + i + "] onStream";
                bd6VarI.i(new b(str, true, str, true, ur2Var, this, ur2VarJ0, i, headerBlock, z), 0L);
            }
        }

        @Override // com.zepto.tr2.c
        public void h(int i, y22 errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.e.U0(i)) {
                this.e.T0(i, errorCode);
                return;
            }
            ur2 ur2VarV0 = this.e.V0(i);
            if (ur2VarV0 != null) {
                ur2VarV0.y(errorCode);
            }
        }

        @Override // com.zepto.tr2.c
        public void i(int i, long j) {
            if (i != 0) {
                ur2 ur2VarJ0 = this.e.J0(i);
                if (ur2VarJ0 != null) {
                    synchronized (ur2VarJ0) {
                        ur2VarJ0.a(j);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                return;
            }
            synchronized (this.e) {
                rr2 rr2Var = this.e;
                rr2Var.A = rr2Var.L0() + j;
                rr2 rr2Var2 = this.e;
                if (rr2Var2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                rr2Var2.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            l();
            return Unit.INSTANCE;
        }

        @Override // com.zepto.tr2.c
        public void j(int i, int i2, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.e.S0(i2, requestHeaders);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.zepto.vz5] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        public final void k(boolean z, vz5 settings) {
            rr2 rr2Var;
            ?? r2;
            T t;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref.LongRef longRef = new Ref.LongRef();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            synchronized (this.e.M0()) {
                rr2 rr2Var2 = this.e;
                synchronized (rr2Var2) {
                    try {
                        vz5 vz5VarI0 = this.e.I0();
                        if (z) {
                            r2 = settings;
                        } else {
                            vz5 vz5Var = new vz5();
                            vz5Var.g(vz5VarI0);
                            vz5Var.g(settings);
                            Unit unit = Unit.INSTANCE;
                            r2 = vz5Var;
                        }
                        objectRef2.element = r2;
                        long jC = ((long) r2.c()) - ((long) vz5VarI0.c());
                        longRef.element = jC;
                        if (jC == 0 || this.e.K0().isEmpty()) {
                            t = 0;
                        } else {
                            Object[] array = this.e.K0().values().toArray(new ur2[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            t = (ur2[]) array;
                        }
                        objectRef.element = t;
                        this.e.Y0((vz5) objectRef2.element);
                        bd6 bd6Var = this.e.n;
                        String str = this.e.D0() + " onSettings";
                        rr2Var = rr2Var2;
                        try {
                            bd6Var.i(new a(str, true, str, true, this, objectRef2, z, settings, longRef, objectRef), 0L);
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                this.e.M0().d((vz5) objectRef2.element);
                            } catch (IOException e) {
                                this.e.B0(e);
                            }
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        rr2Var = rr2Var2;
                    }
                }
            }
            T t2 = objectRef.element;
            if (((ur2[]) t2) != null) {
                ur2[] ur2VarArr = (ur2[]) t2;
                Intrinsics.checkNotNull(ur2VarArr);
                for (ur2 ur2Var : ur2VarArr) {
                    synchronized (ur2Var) {
                        ur2Var.a(longRef.element);
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.zepto.y22] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.zepto.tr2, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void l() throws Throwable {
            y22 y22Var;
            y22 y22Var2;
            y22 y22Var3 = y22.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.c.j(this);
                    while (this.c.e(false, this)) {
                    }
                    y22Var2 = y22.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    y22Var = y22Var3;
                    this.e.A0(y22Var, y22Var3, e);
                    et6.j(this.c);
                    throw th;
                }
                try {
                    this.e.A0(y22Var2, y22.CANCEL, null);
                    y22Var = y22Var2;
                } catch (IOException e3) {
                    e = e3;
                    y22 y22Var4 = y22.PROTOCOL_ERROR;
                    rr2 rr2Var = this.e;
                    rr2Var.A0(y22Var4, y22Var4, e);
                    y22Var = rr2Var;
                }
                y22Var3 = this.c;
                et6.j(y22Var3);
            } catch (Throwable th2) {
                th = th2;
                this.e.A0(y22Var, y22Var3, e);
                et6.j(this.c);
                throw th;
            }
        }
    }

    public static final class f extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ u70 i;
        public final /* synthetic */ int j;
        public final /* synthetic */ boolean k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, rr2 rr2Var, int i, u70 u70Var, int i2, boolean z3) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
            this.h = i;
            this.i = u70Var;
            this.j = i2;
            this.k = z3;
        }

        @Override // com.zepto.oc6
        public long f() {
            try {
                boolean zC = this.g.o.c(this.h, this.i, this.j, this.k);
                if (zC) {
                    this.g.M0().d0(this.h, y22.CANCEL);
                }
                if (!zC && !this.k) {
                    return -1L;
                }
                synchronized (this.g) {
                    this.g.E.remove(Integer.valueOf(this.h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class g extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ List i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, String str2, boolean z2, rr2 rr2Var, int i, List list, boolean z3) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
            this.h = i;
            this.i = list;
            this.j = z3;
        }

        @Override // com.zepto.oc6
        public long f() {
            boolean zB = this.g.o.b(this.h, this.i, this.j);
            if (zB) {
                try {
                    this.g.M0().d0(this.h, y22.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zB && !this.j) {
                return -1L;
            }
            synchronized (this.g) {
                this.g.E.remove(Integer.valueOf(this.h));
            }
            return -1L;
        }
    }

    public static final class h extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z, String str2, boolean z2, rr2 rr2Var, int i, List list) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
            this.h = i;
            this.i = list;
        }

        @Override // com.zepto.oc6
        public long f() {
            if (!this.g.o.a(this.h, this.i)) {
                return -1L;
            }
            try {
                this.g.M0().d0(this.h, y22.CANCEL);
                synchronized (this.g) {
                    this.g.E.remove(Integer.valueOf(this.h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class i extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ y22 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z, String str2, boolean z2, rr2 rr2Var, int i, y22 y22Var) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
            this.h = i;
            this.i = y22Var;
        }

        @Override // com.zepto.oc6
        public long f() {
            this.g.o.d(this.h, this.i);
            synchronized (this.g) {
                this.g.E.remove(Integer.valueOf(this.h));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }
    }

    public static final class j extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z, String str2, boolean z2, rr2 rr2Var) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
        }

        @Override // com.zepto.oc6
        public long f() {
            this.g.f1(false, 2, 0);
            return -1L;
        }
    }

    public static final class k extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ y22 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z, String str2, boolean z2, rr2 rr2Var, int i, y22 y22Var) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
            this.h = i;
            this.i = y22Var;
        }

        @Override // com.zepto.oc6
        public long f() {
            try {
                this.g.g1(this.h, this.i);
                return -1L;
            } catch (IOException e) {
                this.g.B0(e);
                return -1L;
            }
        }
    }

    public static final class l extends oc6 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ rr2 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z, String str2, boolean z2, rr2 rr2Var, int i, long j) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = rr2Var;
            this.h = i;
            this.i = j;
        }

        @Override // com.zepto.oc6
        public long f() {
            try {
                this.g.M0().k0(this.h, this.i);
                return -1L;
            } catch (IOException e) {
                this.g.B0(e);
                return -1L;
            }
        }
    }

    static {
        vz5 vz5Var = new vz5();
        vz5Var.h(7, 65535);
        vz5Var.h(5, 16384);
        F = vz5Var;
    }

    public rr2(b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zB = builder.b();
        this.c = zB;
        this.e = builder.d();
        this.f = new LinkedHashMap();
        String strC = builder.c();
        this.g = strC;
        this.i = builder.b() ? 3 : 2;
        cd6 cd6VarJ = builder.j();
        this.k = cd6VarJ;
        bd6 bd6VarI = cd6VarJ.i();
        this.l = bd6VarI;
        this.m = cd6VarJ.i();
        this.n = cd6VarJ.i();
        this.o = builder.f();
        vz5 vz5Var = new vz5();
        if (builder.b()) {
            vz5Var.h(7, 16777216);
        }
        Unit unit = Unit.INSTANCE;
        this.v = vz5Var;
        this.w = F;
        this.A = r2.c();
        this.B = builder.h();
        this.C = new vr2(builder.g(), zB);
        this.D = new e(this, new tr2(builder.i(), zB));
        this.E = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            String str = strC + " ping";
            bd6VarI.i(new a(str, str, this, nanos), nanos);
        }
    }

    public static /* synthetic */ void b1(rr2 rr2Var, boolean z, cd6 cd6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            cd6Var = cd6.h;
        }
        rr2Var.a1(z, cd6Var);
    }

    public final void A0(y22 connectionCode, y22 streamCode, IOException iOException) {
        int i2;
        ur2[] ur2VarArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (et6.h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            Z0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f.isEmpty()) {
                    Object[] array = this.f.values().toArray(new ur2[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    ur2VarArr = (ur2[]) array;
                    this.f.clear();
                } else {
                    ur2VarArr = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ur2VarArr != null) {
            for (ur2 ur2Var : ur2VarArr) {
                try {
                    ur2Var.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.C.close();
        } catch (IOException unused3) {
        }
        try {
            this.B.close();
        } catch (IOException unused4) {
        }
        this.l.n();
        this.m.n();
        this.n.n();
    }

    public final void B0(IOException iOException) {
        y22 y22Var = y22.PROTOCOL_ERROR;
        A0(y22Var, y22Var, iOException);
    }

    public final boolean C0() {
        return this.c;
    }

    public final String D0() {
        return this.g;
    }

    public final int E0() {
        return this.h;
    }

    public final d F0() {
        return this.e;
    }

    public final int G0() {
        return this.i;
    }

    public final vz5 H0() {
        return this.v;
    }

    public final vz5 I0() {
        return this.w;
    }

    public final synchronized ur2 J0(int i2) {
        return (ur2) this.f.get(Integer.valueOf(i2));
    }

    public final Map K0() {
        return this.f;
    }

    public final long L0() {
        return this.A;
    }

    public final vr2 M0() {
        return this.C;
    }

    public final synchronized boolean N0(long j2) {
        if (this.j) {
            return false;
        }
        if (this.s < this.r) {
            if (j2 >= this.u) {
                return false;
            }
        }
        return true;
    }

    public final ur2 O0(int i2, List list, boolean z) {
        int i3;
        ur2 ur2Var;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.C) {
            try {
                synchronized (this) {
                    try {
                        if (this.i > 1073741823) {
                            Z0(y22.REFUSED_STREAM);
                        }
                        if (this.j) {
                            throw new mw0();
                        }
                        i3 = this.i;
                        this.i = i3 + 2;
                        ur2Var = new ur2(i3, this, z3, false, null);
                        z2 = !z || this.z >= this.A || ur2Var.r() >= ur2Var.q();
                        if (ur2Var.u()) {
                            this.f.put(Integer.valueOf(i3), ur2Var);
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (i2 == 0) {
                    this.C.B(z3, i3, list);
                } else {
                    if (!(true ^ this.c)) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                    }
                    this.C.U(i2, i3, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.C.flush();
        }
        return ur2Var;
    }

    public final ur2 P0(List requestHeaders, boolean z) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return O0(0, requestHeaders, z);
    }

    public final void Q0(int i2, a80 source, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        u70 u70Var = new u70();
        long j2 = i3;
        source.j0(j2);
        source.read(u70Var, j2);
        bd6 bd6Var = this.m;
        String str = this.g + '[' + i2 + "] onData";
        bd6Var.i(new f(str, true, str, true, this, i2, u70Var, i3, z), 0L);
    }

    public final void R0(int i2, List requestHeaders, boolean z) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        bd6 bd6Var = this.m;
        String str = this.g + '[' + i2 + "] onHeaders";
        bd6Var.i(new g(str, true, str, true, this, i2, requestHeaders, z), 0L);
    }

    public final void S0(int i2, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.E.contains(Integer.valueOf(i2))) {
                h1(i2, y22.PROTOCOL_ERROR);
                return;
            }
            this.E.add(Integer.valueOf(i2));
            bd6 bd6Var = this.m;
            String str = this.g + '[' + i2 + "] onRequest";
            bd6Var.i(new h(str, true, str, true, this, i2, requestHeaders), 0L);
        }
    }

    public final void T0(int i2, y22 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        bd6 bd6Var = this.m;
        String str = this.g + '[' + i2 + "] onReset";
        bd6Var.i(new i(str, true, str, true, this, i2, errorCode), 0L);
    }

    public final boolean U0(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized ur2 V0(int i2) {
        ur2 ur2Var;
        ur2Var = (ur2) this.f.remove(Integer.valueOf(i2));
        notifyAll();
        return ur2Var;
    }

    public final void W0() {
        synchronized (this) {
            long j2 = this.s;
            long j3 = this.r;
            if (j2 < j3) {
                return;
            }
            this.r = j3 + 1;
            this.u = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.INSTANCE;
            bd6 bd6Var = this.l;
            String str = this.g + " ping";
            bd6Var.i(new j(str, true, str, true, this), 0L);
        }
    }

    public final void X0(int i2) {
        this.h = i2;
    }

    public final void Y0(vz5 vz5Var) {
        Intrinsics.checkNotNullParameter(vz5Var, "<set-?>");
        this.w = vz5Var;
    }

    public final void Z0(y22 statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.C) {
            synchronized (this) {
                if (this.j) {
                    return;
                }
                this.j = true;
                int i2 = this.h;
                Unit unit = Unit.INSTANCE;
                this.C.w(i2, statusCode, et6.a);
            }
        }
    }

    public final void a1(boolean z, cd6 taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z) {
            this.C.e();
            this.C.e0(this.v);
            if (this.v.c() != 65535) {
                this.C.k0(0, r7 - 65535);
            }
        }
        bd6 bd6VarI = taskRunner.i();
        String str = this.g;
        bd6VarI.i(new ad6(this.D, str, true, str, true), 0L);
    }

    public final synchronized void c1(long j2) {
        long j3 = this.x + j2;
        this.x = j3;
        long j4 = j3 - this.y;
        if (j4 >= this.v.c() / 2) {
            i1(0, j4);
            this.y += j4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A0(y22.NO_ERROR, y22.CANCEL, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.C.D());
        r6 = r2;
        r8.z += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(int r9, boolean r10, com.zepto.u70 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.zepto.vr2 r12 = r8.C
            r12.j(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.z     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            long r6 = r8.A     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.Map r2 = r8.f     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            r9 = move-exception
            goto L6a
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            com.zepto.vr2 r4 = r8.C     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.D()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.z     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.z = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            com.zepto.vr2 r4 = r8.C
            if (r10 == 0) goto L58
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L58
            r5 = 1
            goto L59
        L58:
            r5 = r3
        L59:
            r4.j(r5, r9, r11, r2)
            goto Ld
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.rr2.d1(int, boolean, com.zepto.u70, long):void");
    }

    public final void e1(int i2, boolean z, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.C.B(z, i2, alternating);
    }

    public final void f1(boolean z, int i2, int i3) {
        try {
            this.C.P(z, i2, i3);
        } catch (IOException e2) {
            B0(e2);
        }
    }

    public final void flush() {
        this.C.flush();
    }

    public final void g1(int i2, y22 statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.C.d0(i2, statusCode);
    }

    public final void h1(int i2, y22 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        bd6 bd6Var = this.l;
        String str = this.g + '[' + i2 + "] writeSynReset";
        bd6Var.i(new k(str, true, str, true, this, i2, errorCode), 0L);
    }

    public final void i1(int i2, long j2) {
        bd6 bd6Var = this.l;
        String str = this.g + '[' + i2 + "] windowUpdate";
        bd6Var.i(new l(str, true, str, true, this, i2, j2), 0L);
    }
}
