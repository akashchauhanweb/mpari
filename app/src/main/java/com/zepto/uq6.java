package com.zepto;

import android.R;
import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.h;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.install.InstallState;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class uq6 implements cf3 {
    public static final a k = new a(null);
    public static uq6 l;
    public final WeakReference c;
    public int e;
    public final bv f;
    public final pc6 g;
    public b h;
    public final int i;
    public final yz2 j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final uq6 a(pq activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (uq6.l == null) {
                uq6.l = new uq6(activity, null);
            }
            Log.d("InAppUpdateManager", "Instance created");
            return uq6.l;
        }
    }

    public interface b {
        void a(long j, long j2);
    }

    public interface c {
        void a(int i);

        void b(int i);
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ c c;
        public final /* synthetic */ uq6 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar, uq6 uq6Var) {
            super(1);
            this.c = cVar;
            this.e = uq6Var;
        }

        public final void a(av avVar) {
            Integer numB;
            if (avVar.f() != 2) {
                Log.d("InAppUpdateManager", "No Update available" + avVar.a());
                new ws6(this.e.E()).w(String.valueOf(avVar.a()));
                return;
            }
            Log.d("InAppUpdateManager", "Update available");
            int iA = avVar.a();
            if (avVar.b() != null) {
                numB = avVar.b();
                Intrinsics.checkNotNull(numB);
            } else {
                numB = -1;
            }
            Intrinsics.checkNotNull(numB);
            int iIntValue = numB.intValue();
            this.c.a(iA);
            this.c.b(iIntValue);
            new ws6(this.e.E()).w(String.valueOf(avVar.a()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((av) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(av avVar) {
            if (avVar.f() != 2 || !avVar.d(uq6.this.e)) {
                Log.d("InAppUpdateManager", "No Update available");
                return;
            }
            Log.d("InAppUpdateManager", "Update available");
            uq6 uq6Var = uq6.this;
            Intrinsics.checkNotNull(avVar);
            uq6Var.M(avVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((av) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public static final f c = new f();

        public f() {
            super(1);
        }

        public final void a(av avVar) {
            if (avVar.c() == 11) {
                Log.d("InAppUpdateManager", "An update has been downloaded");
                uq6 uq6Var = uq6.l;
                Intrinsics.checkNotNull(uq6Var);
                uq6Var.I();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((av) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(av avVar) {
            if (avVar.f() == 3) {
                try {
                    uq6 uq6Var = uq6.l;
                    Intrinsics.checkNotNull(uq6Var);
                    bv bvVar = uq6Var.f;
                    Intrinsics.checkNotNull(bvVar);
                    uq6 uq6Var2 = uq6.l;
                    Intrinsics.checkNotNull(uq6Var2);
                    int i = uq6Var2.e;
                    Activity activityE = uq6.this.E();
                    Intrinsics.checkNotNull(activityE);
                    bvVar.a(avVar, i, activityE, uq6.this.F());
                } catch (IntentSender.SendIntentException e) {
                    Log.d("InAppUpdateManager", "" + e.getMessage());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((av) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ uq6(pq pqVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pqVar);
    }

    public static final void B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void G(uq6 this$0, InstallState installState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(installState, "installState");
        if (installState.c() == 2) {
            long jA = installState.a();
            long jE = installState.e();
            b bVar = this$0.h;
            if (bVar != null) {
                Intrinsics.checkNotNull(bVar);
                bVar.a(jA, jE);
            }
        }
        if (installState.c() == 11) {
            Log.d("InAppUpdateManager", "An update has been downloaded");
            this$0.I();
        }
    }

    public static final void J(uq6 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bv bvVar = this$0.f;
        Intrinsics.checkNotNull(bvVar);
        bvVar.b();
    }

    @androidx.lifecycle.o(h.a.ON_DESTROY)
    private final void onDestroy() {
        N();
    }

    @androidx.lifecycle.o(h.a.ON_RESUME)
    private final void onResume() {
        z();
    }

    public static final void w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void A() {
        uq6 uq6Var = l;
        Intrinsics.checkNotNull(uq6Var);
        bv bvVar = uq6Var.f;
        Intrinsics.checkNotNull(bvVar);
        pc6 pc6VarD = bvVar.d();
        final f fVar = f.c;
        pc6VarD.c(new dh4() { // from class: com.zepto.oq6
            @Override // com.zepto.dh4
            public final void b(Object obj) {
                uq6.B(fVar, obj);
            }
        });
    }

    public final void C() {
        uq6 uq6Var = l;
        Intrinsics.checkNotNull(uq6Var);
        bv bvVar = uq6Var.f;
        Intrinsics.checkNotNull(bvVar);
        pc6 pc6VarD = bvVar.d();
        final g gVar = new g();
        pc6VarD.c(new dh4() { // from class: com.zepto.rq6
            @Override // com.zepto.dh4
            public final void b(Object obj) {
                uq6.D(gVar, obj);
            }
        });
    }

    public final Activity E() {
        return (Activity) this.c.get();
    }

    public final int F() {
        return this.i;
    }

    public final uq6 H(int i) {
        Log.d("InAppUpdateManager", "Set update mode to : " + (i == 0 ? "FLEXIBLE" : "IMMEDIATE"));
        this.e = i;
        return this;
    }

    public final void I() {
        Activity activityE = E();
        Intrinsics.checkNotNull(activityE);
        Snackbar snackbarL0 = Snackbar.l0(activityE.getWindow().getDecorView().findViewById(R.id.content), "An update has just been downloaded.", -2);
        Intrinsics.checkNotNullExpressionValue(snackbarL0, "make(...)");
        snackbarL0.n0("RESTART", new View.OnClickListener() { // from class: com.zepto.tq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq6.J(this.a, view);
            }
        });
        snackbarL0.W();
    }

    public final void K() {
        bv bvVar = this.f;
        Intrinsics.checkNotNull(bvVar);
        yz2 yz2Var = this.j;
        Intrinsics.checkNotNull(yz2Var);
        bvVar.e(yz2Var);
    }

    public final void L() {
        if (this.e == 0) {
            K();
        }
        x();
    }

    public final void M(av avVar) {
        try {
            Log.d("InAppUpdateManager", "Starting update");
            bv bvVar = this.f;
            Intrinsics.checkNotNull(bvVar);
            int i = this.e;
            Activity activityE = E();
            Intrinsics.checkNotNull(activityE);
            bvVar.a(avVar, i, activityE, this.i);
        } catch (IntentSender.SendIntentException e2) {
            Log.d("InAppUpdateManager", "" + e2.getMessage());
        }
    }

    public final void N() {
        yz2 yz2Var;
        bv bvVar = this.f;
        if (bvVar == null || (yz2Var = this.j) == null) {
            return;
        }
        bvVar.c(yz2Var);
        Log.d("InAppUpdateManager", "Unregistered the install state listener");
    }

    public final void u(b bVar) {
        this.h = bVar;
    }

    public final void v(c updateInfoListener) {
        Intrinsics.checkNotNullParameter(updateInfoListener, "updateInfoListener");
        pc6 pc6Var = this.g;
        final d dVar = new d(updateInfoListener, this);
        pc6Var.c(new dh4() { // from class: com.zepto.sq6
            @Override // com.zepto.dh4
            public final void b(Object obj) {
                uq6.w(dVar, obj);
            }
        });
    }

    public final void x() {
        Log.d("InAppUpdateManager", "Checking for updates");
        pc6 pc6Var = this.g;
        final e eVar = new e();
        pc6Var.c(new dh4() { // from class: com.zepto.pq6
            @Override // com.zepto.dh4
            public final void b(Object obj) {
                uq6.y(eVar, obj);
            }
        });
    }

    public final void z() {
        uq6 uq6Var = l;
        Intrinsics.checkNotNull(uq6Var);
        if (uq6Var.e == 0) {
            A();
        } else {
            C();
        }
    }

    public uq6(pq pqVar) {
        this.i = 781;
        this.j = new yz2() { // from class: com.zepto.qq6
            @Override // com.zepto.b76
            public final void a(Object obj) {
                uq6.G(this.a, (InstallState) obj);
            }
        };
        this.c = new WeakReference(pqVar);
        bv bvVarA = cv.a(pqVar);
        this.f = bvVarA;
        pc6 pc6VarD = bvVarA.d();
        Intrinsics.checkNotNullExpressionValue(pc6VarD, "getAppUpdateInfo(...)");
        this.g = pc6VarD;
        pqVar.g0().a(this);
    }
}
