package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.zepto.f13;
import com.zepto.px3;
import com.zepto.sw2;
import com.zepto.tw2;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class px3 {
    public final String a;
    public final f13 b;
    public final Executor c;
    public final Context d;
    public int e;
    public f13.c f;
    public tw2 g;
    public final sw2 h;
    public final AtomicBoolean i;
    public final ServiceConnection j;
    public final Runnable k;
    public final Runnable l;

    public static final class a extends f13.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // com.zepto.f13.c
        public boolean b() {
            return true;
        }

        @Override // com.zepto.f13.c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (px3.this.j().get()) {
                return;
            }
            try {
                tw2 tw2VarH = px3.this.h();
                if (tw2VarH != null) {
                    int iC = px3.this.c();
                    Object[] array = tables.toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    tw2VarH.g0(iC, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    public static final class b extends sw2.a {
        public b() {
        }

        public static final void j(px3 this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.e().j((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // com.zepto.sw2
        public void C(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor executorD = px3.this.d();
            final px3 px3Var = px3.this;
            executorD.execute(new Runnable() { // from class: com.zepto.qx3
                @Override // java.lang.Runnable
                public final void run() {
                    px3.b.j(px3Var, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            px3.this.m(tw2.a.c(service));
            px3.this.d().execute(px3.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            px3.this.d().execute(px3.this.g());
            px3.this.m(null);
        }
    }

    public px3(Context context, String name, Intent serviceIntent, f13 invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = name;
        this.b = invalidationTracker;
        this.c = executor;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.h = new b();
        this.i = new AtomicBoolean(false);
        c cVar = new c();
        this.j = cVar;
        this.k = new Runnable() { // from class: com.zepto.nx3
            @Override // java.lang.Runnable
            public final void run() {
                px3.n(this.c);
            }
        };
        this.l = new Runnable() { // from class: com.zepto.ox3
            @Override // java.lang.Runnable
            public final void run() {
                px3.k(this.c);
            }
        };
        Object[] array = invalidationTracker.h().keySet().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void k(px3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b.m(this$0.f());
    }

    public static final void n(px3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            tw2 tw2Var = this$0.g;
            if (tw2Var != null) {
                this$0.e = tw2Var.o(this$0.h, this$0.a);
                this$0.b.b(this$0.f());
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    public final int c() {
        return this.e;
    }

    public final Executor d() {
        return this.c;
    }

    public final f13 e() {
        return this.b;
    }

    public final f13.c f() {
        f13.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    public final Runnable g() {
        return this.l;
    }

    public final tw2 h() {
        return this.g;
    }

    public final Runnable i() {
        return this.k;
    }

    public final AtomicBoolean j() {
        return this.i;
    }

    public final void l(f13.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    public final void m(tw2 tw2Var) {
        this.g = tw2Var;
    }
}
