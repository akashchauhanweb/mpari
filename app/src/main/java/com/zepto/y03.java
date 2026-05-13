package com.zepto;

import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.zepto.jt;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y03 {
    public static final a e = new a(null);
    public static y03 f;
    public static boolean g;
    public static mt h;
    public Timer b;
    public boolean c;
    public final int a = 1000;
    public final b d = new b();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y03 a(mt mtVar) {
            if (mtVar != null) {
                y03.h = mtVar;
            }
            if (y03.f == null) {
                y03.f = new y03();
            }
            y03 y03Var = y03.f;
            return y03Var == null ? new y03() : y03Var;
        }

        public final boolean b(Context context) {
            NetworkCapabilities networkCapabilities;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(4);
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            nt ntVarH;
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            try {
                jt.a aVar = jt.c;
                if (Intrinsics.areEqual(aVar.h0(), "N") || Intrinsics.areEqual(aVar.h0(), "Y")) {
                    nn3.a.f("RetryCall", "Net Connect...........");
                    ScanUtils scanUtils = ScanUtils.a;
                    if ((scanUtils.s0(aVar.C()) || scanUtils.B0(aVar.C())) && aVar.H() != null && (ntVarH = aVar.H()) != null) {
                        ntVarH.g();
                    }
                }
                y03.this.n();
                if (aVar.d0() && ScanUtils.a.B0(aVar.C())) {
                    z34.a.m(242);
                }
                ScanUtils scanUtils2 = ScanUtils.a;
                if5 if5VarQ = null;
                if (scanUtils2.B0(aVar.C())) {
                    aVar.U0(true);
                    if (aVar.f()) {
                        ScanAlerts scanAlertsL = aVar.L();
                        if5 if5VarQ2 = scanAlertsL == null ? null : scanAlertsL.Q(24);
                        if (if5VarQ2 != null) {
                            scanUtils2.b0(if5VarQ2, "");
                        }
                    }
                }
                ScanAlerts scanAlertsL2 = aVar.L();
                if (scanAlertsL2 != null) {
                    if5VarQ = scanAlertsL2.Q(10);
                }
                if (if5VarQ != null) {
                    scanUtils2.W0(aVar.C(), if5VarQ);
                }
            } catch (Exception e) {
                nn3.c(nn3.a, "InternetCheckerExp", Intrinsics.stringPlus("onAvailable ", e.getMessage()), null, 4, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            try {
                y03.this.o();
                jt.c.J0("N");
            } catch (Exception e) {
                nn3.a.b("InternetCheckerExp", Intrinsics.stringPlus("onAvailable ", e.getMessage()), e);
            }
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return y03.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    y03.this.l();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            jt.a aVar = jt.c;
            String strH0 = aVar.h0();
            Intrinsics.checkNotNull(strH0);
            if (strH0.length() == 0 && !ScanUtils.a.V(aVar.C())) {
                this.c = 2;
                if (bh1.a(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                y03.this.l();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends TimerTask {
        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (y03.this.c) {
                return;
            }
            ScanUtils scanUtils = ScanUtils.a;
            jt.a aVar = jt.c;
            if (scanUtils.V(aVar.C())) {
                aVar.J0("Y");
                if (y03.g) {
                    scanUtils.Y0(233);
                    y03.g = false;
                    mt mtVar = y03.h;
                    if (mtVar != null) {
                        mtVar.a();
                    }
                }
                y03.this.c = true;
                Timer timer = y03.this.b;
                if (timer != null) {
                    timer.cancel();
                }
                y03.this.b = null;
            }
        }
    }

    public final void l() {
        jt.a aVar = jt.c;
        String strH0 = aVar.h0();
        Intrinsics.checkNotNull(strH0);
        if (strH0.length() != 0 || ScanUtils.a.V(aVar.C())) {
            return;
        }
        g = true;
        mt mtVar = h;
        Intrinsics.checkNotNull(mtVar);
        mtVar.j();
    }

    public final void m() {
        Object systemService = jt.c.C().getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        b bVar = this.d;
        if (bVar != null) {
            connectivityManager.registerDefaultNetworkCallback(bVar);
        }
        f80.d(qj2.c, null, null, new c(null), 3, null);
    }

    public final void n() {
        this.b = new Timer();
        d dVar = new d();
        Timer timer = this.b;
        if (timer == null) {
            return;
        }
        timer.scheduleAtFixedRate(dVar, 0L, this.a);
    }

    public final void o() {
        this.c = false;
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
        }
        this.b = null;
    }
}
