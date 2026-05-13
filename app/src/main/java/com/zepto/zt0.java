package com.zepto;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h;
import androidx.lifecycle.z;
import com.zepto.Cif;
import com.zepto.cm5;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class zt0 extends bu0 implements dr7, androidx.lifecycle.f, em5, gg4, qf, kg4, fh4, vg4, xg4, ps3, uh2 {
    public final xy0 c = new xy0();
    public final qs3 d = new qs3(new Runnable() { // from class: com.zepto.vt0
        @Override // java.lang.Runnable
        public final void run() {
            this.c.w0();
        }
    });
    public final androidx.lifecycle.m e = new androidx.lifecycle.m(this);
    public final dm5 f;
    public cr7 g;
    public z.b h;
    public eg4 i;
    public final j j;
    public final th2 k;
    public int l;
    public final AtomicInteger m;
    public final pf n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public boolean t;
    public boolean u;

    public class a extends pf {

        /* JADX INFO: renamed from: com.zepto.zt0$a$a, reason: collision with other inner class name */
        public class RunnableC0134a implements Runnable {
            public final /* synthetic */ int c;
            public final /* synthetic */ Cif.a e;

            public RunnableC0134a(int i, Cif.a aVar) {
                this.c = i;
                this.e = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.c, this.e.a());
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int c;
            public final /* synthetic */ IntentSender.SendIntentException e;

            public b(int i, IntentSender.SendIntentException sendIntentException) {
                this.c = i;
                this.e = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.e));
            }
        }

        public a() {
        }

        @Override // com.zepto.pf
        public void f(int i, Cif cif, Object obj, ke keVar) {
            Bundle bundle;
            zt0 zt0Var = zt0.this;
            Cif.a aVarB = cif.b(zt0Var, obj);
            if (aVarB != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0134a(i, aVarB));
                return;
            }
            Intent intentA = cif.a(zt0Var, obj);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(zt0Var.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                l8.s(zt0Var, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                l8.v(zt0Var, intentA, i, bundle);
                return;
            }
            t03 t03Var = (t03) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                l8.w(zt0Var, t03Var.f(), i, t03Var.c(), t03Var.d(), t03Var.e(), 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new b(i, e));
            }
        }
    }

    public class b implements androidx.lifecycle.k {
        public b() {
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            if (aVar == h.a.ON_STOP) {
                Window window = zt0.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    g.a(viewPeekDecorView);
                }
            }
        }
    }

    public class c implements androidx.lifecycle.k {
        public c() {
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            if (aVar == h.a.ON_DESTROY) {
                zt0.this.c.b();
                if (!zt0.this.isChangingConfigurations()) {
                    zt0.this.b0().a();
                }
                zt0.this.j.e();
            }
        }
    }

    public class d implements androidx.lifecycle.k {
        public d() {
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            zt0.this.u0();
            zt0.this.g0().d(this);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zt0.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }
    }

    public class f implements androidx.lifecycle.k {
        public f() {
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            if (aVar != h.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            zt0.this.i.n(h.a((zt0) df3Var));
        }
    }

    public static class g {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class h {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class i {
        public Object a;
        public cr7 b;
    }

    public interface j extends Executor {
        void e();

        void m(View view);
    }

    public class k implements j, ViewTreeObserver.OnDrawListener, Runnable {
        public Runnable e;
        public final long c = SystemClock.uptimeMillis() + 10000;
        public boolean f = false;

        public k() {
        }

        public final /* synthetic */ void b() {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }

        @Override // com.zepto.zt0.j
        public void e() {
            zt0.this.getWindow().getDecorView().removeCallbacks(this);
            zt0.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.e = runnable;
            View decorView = zt0.this.getWindow().getDecorView();
            if (!this.f) {
                decorView.postOnAnimation(new Runnable() { // from class: com.zepto.au0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.c.b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // com.zepto.zt0.j
        public void m(View view) {
            if (this.f) {
                return;
            }
            this.f = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.e;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.c) {
                    this.f = false;
                    zt0.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.e = null;
            if (zt0.this.k.c()) {
                this.f = false;
                zt0.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            zt0.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public zt0() {
        dm5 dm5VarA = dm5.a(this);
        this.f = dm5VarA;
        this.i = null;
        j jVarT0 = t0();
        this.j = jVarT0;
        this.k = new th2(jVarT0, new Function0() { // from class: com.zepto.wt0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.c.x0();
            }
        });
        this.m = new AtomicInteger();
        this.n = new a();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = false;
        this.u = false;
        if (g0() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        g0().a(new b());
        g0().a(new c());
        g0().a(new d());
        dm5VarA.c();
        androidx.lifecycle.v.c(this);
        o().h("android:support:activity-result", new cm5.c() { // from class: com.zepto.xt0
            @Override // com.zepto.cm5.c
            public final Bundle a() {
                return this.a.y0();
            }
        });
        r0(new ng4() { // from class: com.zepto.yt0
            @Override // com.zepto.ng4
            public final void a(Context context) {
                this.a.z0(context);
            }
        });
    }

    public Object A0() {
        return null;
    }

    public final of B0(Cif cif, hf hfVar) {
        return C0(cif, this.n, hfVar);
    }

    public final of C0(Cif cif, pf pfVar, hf hfVar) {
        return pfVar.j("activity_rq#" + this.m.getAndIncrement(), this, cif, hfVar);
    }

    @Override // com.zepto.ps3
    public void G(ws3 ws3Var) {
        this.d.a(ws3Var);
    }

    @Override // com.zepto.ps3
    public void H(ws3 ws3Var) {
        this.d.f(ws3Var);
    }

    @Override // androidx.lifecycle.f
    public z.b K() {
        if (this.h == null) {
            this.h = new androidx.lifecycle.w(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.h;
    }

    @Override // androidx.lifecycle.f
    public h31 L() {
        ny3 ny3Var = new ny3();
        if (getApplication() != null) {
            ny3Var.c(z.a.h, getApplication());
        }
        ny3Var.c(androidx.lifecycle.v.a, this);
        ny3Var.c(androidx.lifecycle.v.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            ny3Var.c(androidx.lifecycle.v.c, getIntent().getExtras());
        }
        return ny3Var;
    }

    @Override // com.zepto.fh4
    public final void N(ux0 ux0Var) {
        this.p.remove(ux0Var);
    }

    @Override // com.zepto.vg4
    public final void O(ux0 ux0Var) {
        this.r.add(ux0Var);
    }

    @Override // com.zepto.fh4
    public final void P(ux0 ux0Var) {
        this.p.add(ux0Var);
    }

    @Override // com.zepto.qf
    public final pf R() {
        return this.n;
    }

    @Override // com.zepto.xg4
    public final void T(ux0 ux0Var) {
        this.s.add(ux0Var);
    }

    @Override // com.zepto.kg4
    public final void Y(ux0 ux0Var) {
        this.o.remove(ux0Var);
    }

    @Override // com.zepto.dr7
    public cr7 b0() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        u0();
        return this.g;
    }

    @Override // com.zepto.df3
    public androidx.lifecycle.h g0() {
        return this.e;
    }

    @Override // com.zepto.vg4
    public final void h0(ux0 ux0Var) {
        this.r.remove(ux0Var);
    }

    @Override // com.zepto.gg4
    public final eg4 m() {
        if (this.i == null) {
            this.i = new eg4(new e());
            g0().a(new f());
        }
        return this.i;
    }

    @Override // com.zepto.em5
    public final cm5 o() {
        return this.f.b();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.n.b(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((ux0) it.next()).a(configuration);
        }
    }

    @Override // com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f.d(bundle);
        this.c.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.r.e(this);
        int i2 = this.l;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        this.d.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.d.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((ux0) it.next()).a(new hy3(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((ux0) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        this.d.c(menu);
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((ux0) it.next()).a(new hs4(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.d.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.n.b(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objA0 = A0();
        cr7 cr7Var = this.g;
        if (cr7Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            cr7Var = iVar.b;
        }
        if (cr7Var == null && objA0 == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.a = objA0;
        iVar2.b = cr7Var;
        return iVar2;
    }

    @Override // com.zepto.bu0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.h hVarG0 = g0();
        if (hVarG0 instanceof androidx.lifecycle.m) {
            ((androidx.lifecycle.m) hVarG0).o(h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((ux0) it.next()).a(Integer.valueOf(i2));
        }
    }

    public final void r0(ng4 ng4Var) {
        this.c.a(ng4Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (yi6.d()) {
                yi6.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.k.b();
            yi6.b();
        } catch (Throwable th) {
            yi6.b();
            throw th;
        }
    }

    public final void s0(ux0 ux0Var) {
        this.q.add(ux0Var);
    }

    @Override // android.app.Activity
    public abstract void setContentView(int i2);

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        v0();
        this.j.m(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public final j t0() {
        return new k();
    }

    public void u0() {
        if (this.g == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.g = iVar.b;
            }
            if (this.g == null) {
                this.g = new cr7();
            }
        }
    }

    @Override // com.zepto.kg4
    public final void v(ux0 ux0Var) {
        this.o.add(ux0Var);
    }

    public void v0() {
        ur7.a(getWindow().getDecorView(), this);
        xr7.a(getWindow().getDecorView(), this);
        wr7.a(getWindow().getDecorView(), this);
        vr7.a(getWindow().getDecorView(), this);
        tr7.a(getWindow().getDecorView(), this);
    }

    public void w0() {
        invalidateOptionsMenu();
    }

    public final /* synthetic */ Unit x0() {
        reportFullyDrawn();
        return null;
    }

    public final /* synthetic */ Bundle y0() {
        Bundle bundle = new Bundle();
        this.n.h(bundle);
        return bundle;
    }

    @Override // com.zepto.xg4
    public final void z(ux0 ux0Var) {
        this.s.remove(ux0Var);
    }

    public final /* synthetic */ void z0(Context context) {
        Bundle bundleB = o().b("android:support:activity-result");
        if (bundleB != null) {
            this.n.g(bundleB);
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                ((ux0) it.next()).a(new hy3(z, configuration));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                ((ux0) it.next()).a(new hs4(z, configuration));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }
}
