package com.zepto;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.h;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf2 implements ComponentCallbacks, View.OnCreateContextMenuListener, df3, dr7, androidx.lifecycle.f, em5 {
    public static final Object c0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean G;
    public ViewGroup H;
    public View I;
    public boolean J;
    public j L;
    public Handler M;
    public boolean O;
    public LayoutInflater P;
    public boolean Q;
    public String R;
    public androidx.lifecycle.m T;
    public jh2 U;
    public z.b W;
    public dm5 X;
    public int Y;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public Boolean e;
    public Bundle g;
    public sf2 h;
    public int j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public mg2 t;
    public eg2 u;
    public sf2 w;
    public int x;
    public int y;
    public String z;
    public int a = -1;
    public String f = UUID.randomUUID().toString();
    public String i = null;
    public Boolean k = null;
    public mg2 v = new ng2();
    public boolean F = true;
    public boolean K = true;
    public Runnable N = new b();
    public h.b S = h.b.RESUMED;
    public oy3 V = new oy3();
    public final AtomicInteger Z = new AtomicInteger();
    public final ArrayList a0 = new ArrayList();
    public final m b0 = new c();

    public class a extends of {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ Cif b;

        public a(AtomicReference atomicReference, Cif cif) {
            this.a = atomicReference;
            this.b = cif;
        }

        @Override // com.zepto.of
        public void b(Object obj, ke keVar) {
            of ofVar = (of) this.a.get();
            if (ofVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            ofVar.b(obj, keVar);
        }

        @Override // com.zepto.of
        public void c() {
            of ofVar = (of) this.a.getAndSet(null);
            if (ofVar != null) {
                ofVar.c();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            sf2.this.U1();
        }
    }

    public class c extends m {
        public c() {
            super(null);
        }

        @Override // com.zepto.sf2.m
        public void a() {
            sf2.this.X.c();
            androidx.lifecycle.v.c(sf2.this);
            Bundle bundle = sf2.this.b;
            sf2.this.X.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            sf2.this.g(false);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ i56 c;

        public e(i56 i56Var) {
            this.c = i56Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.k();
        }
    }

    public class f extends bg2 {
        public f() {
        }

        @Override // com.zepto.bg2
        public View c(int i) {
            View view = sf2.this.I;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + sf2.this + " does not have a view");
        }

        @Override // com.zepto.bg2
        public boolean d() {
            return sf2.this.I != null;
        }
    }

    public class g implements androidx.lifecycle.k {
        public g() {
        }

        @Override // androidx.lifecycle.k
        public void e(df3 df3Var, h.a aVar) {
            View view;
            if (aVar != h.a.ON_STOP || (view = sf2.this.I) == null) {
                return;
            }
            k.a(view);
        }
    }

    public class h implements yh2 {
        public h() {
        }

        @Override // com.zepto.yh2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public pf a(Void r3) {
            sf2 sf2Var = sf2.this;
            Object obj = sf2Var.u;
            return obj instanceof qf ? ((qf) obj).R() : sf2Var.E1().R();
        }
    }

    public class i extends m {
        public final /* synthetic */ yh2 a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ Cif c;
        public final /* synthetic */ hf d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(yh2 yh2Var, AtomicReference atomicReference, Cif cif, hf hfVar) {
            super(null);
            this.a = yh2Var;
            this.b = atomicReference;
            this.c = cif;
            this.d = hfVar;
        }

        @Override // com.zepto.sf2.m
        public void a() {
            String strL = sf2.this.l();
            this.b.set(((pf) this.a.a(null)).j(strL, sf2.this, this.c, this.d));
        }
    }

    public static class j {
        public View a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public ArrayList h;
        public ArrayList i;
        public Object j = null;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Object o;
        public Boolean p;
        public Boolean q;
        public float r;
        public View s;
        public boolean t;

        public j() {
            Object obj = sf2.c0;
            this.k = obj;
            this.l = null;
            this.m = obj;
            this.n = null;
            this.o = obj;
            this.r = 1.0f;
            this.s = null;
        }
    }

    public static class k {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class m {
        public m() {
        }

        public /* synthetic */ m(b bVar) {
            this();
        }

        public abstract void a();
    }

    public sf2() {
        k0();
    }

    public static sf2 m0(Context context, String str, Bundle bundle) {
        try {
            sf2 sf2Var = (sf2) dg2.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(sf2Var.getClass().getClassLoader());
                sf2Var.L1(bundle);
            }
            return sf2Var;
        } catch (IllegalAccessException e2) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public void A0(sf2 sf2Var) {
    }

    public void A1() {
        Bundle bundle = this.b;
        b1(this.I, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.v.T();
    }

    public boolean B0(MenuItem menuItem) {
        return false;
    }

    public final of B1(Cif cif, yh2 yh2Var, hf hfVar) {
        if (this.a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            D1(new i(yh2Var, atomicReference, cif, hfVar));
            return new a(atomicReference, cif);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public Object C() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        return jVar.l;
    }

    public void C0(Bundle bundle) {
        this.G = true;
        H1();
        if (this.v.P0(1)) {
            return;
        }
        this.v.A();
    }

    public final of C1(Cif cif, hf hfVar) {
        return B1(cif, new h(), hfVar);
    }

    public m06 D() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public Animation D0(int i2, boolean z, int i3) {
        return null;
    }

    public final void D1(m mVar) {
        if (this.a >= 0) {
            mVar.a();
        } else {
            this.a0.add(mVar);
        }
    }

    public View E() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        return jVar.s;
    }

    public Animator E0(int i2, boolean z, int i3) {
        return null;
    }

    public final yf2 E1() {
        yf2 yf2VarN = n();
        if (yf2VarN != null) {
            return yf2VarN;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object F() {
        eg2 eg2Var = this.u;
        if (eg2Var == null) {
            return null;
        }
        return eg2Var.i();
    }

    public void F0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context F1() {
        Context contextV = v();
        if (contextV != null) {
            return contextV;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final int G() {
        return this.x;
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.Y;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public final View G1() {
        View viewH0 = h0();
        if (viewH0 != null) {
            return viewH0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public LayoutInflater H(Bundle bundle) {
        eg2 eg2Var = this.u;
        if (eg2Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterJ = eg2Var.j();
        hb3.a(layoutInflaterJ, this.v.x0());
        return layoutInflaterJ;
    }

    public void H0() {
        this.G = true;
    }

    public void H1() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.v.m1(bundle);
        this.v.A();
    }

    public final int I() {
        h.b bVar = this.S;
        return (bVar == h.b.INITIALIZED || this.w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.w.I());
    }

    public void I0() {
    }

    public final void I1() {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.I != null) {
            Bundle bundle = this.b;
            J1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.b = null;
    }

    public int J() {
        j jVar = this.L;
        if (jVar == null) {
            return 0;
        }
        return jVar.g;
    }

    public void J0() {
        this.G = true;
    }

    public final void J1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.c;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.c = null;
        }
        this.G = false;
        c1(bundle);
        if (this.G) {
            if (this.I != null) {
                this.U.a(h.a.ON_CREATE);
            }
        } else {
            throw new z86("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @Override // androidx.lifecycle.f
    public z.b K() {
        Application application;
        if (this.t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.W == null) {
            Context applicationContext = F1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && mg2.J0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + F1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.W = new androidx.lifecycle.w(application, this, t());
        }
        return this.W;
    }

    public void K0() {
        this.G = true;
    }

    public void K1(int i2, int i3, int i4, int i5) {
        if (this.L == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        j().c = i2;
        j().d = i3;
        j().e = i4;
        j().f = i5;
    }

    @Override // androidx.lifecycle.f
    public h31 L() {
        Application application;
        Context applicationContext = F1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && mg2.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + F1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ny3 ny3Var = new ny3();
        if (application != null) {
            ny3Var.c(z.a.h, application);
        }
        ny3Var.c(androidx.lifecycle.v.a, this);
        ny3Var.c(androidx.lifecycle.v.b, this);
        if (t() != null) {
            ny3Var.c(androidx.lifecycle.v.c, t());
        }
        return ny3Var;
    }

    public LayoutInflater L0(Bundle bundle) {
        return H(bundle);
    }

    public void L1(Bundle bundle) {
        if (this.t != null && t0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }

    public final sf2 M() {
        return this.w;
    }

    public void M0(boolean z) {
    }

    public void M1(View view) {
        j().s = view;
    }

    public final mg2 N() {
        mg2 mg2Var = this.t;
        if (mg2Var != null) {
            return mg2Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void N0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public void N1(int i2) {
        if (this.L == null && i2 == 0) {
            return;
        }
        j();
        this.L.g = i2;
    }

    public boolean O() {
        j jVar = this.L;
        if (jVar == null) {
            return false;
        }
        return jVar.b;
    }

    public void O0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        eg2 eg2Var = this.u;
        Activity activityE = eg2Var == null ? null : eg2Var.e();
        if (activityE != null) {
            this.G = false;
            N0(activityE, attributeSet, bundle);
        }
    }

    public void O1(boolean z) {
        if (this.L == null) {
            return;
        }
        j().b = z;
    }

    public int P() {
        j jVar = this.L;
        if (jVar == null) {
            return 0;
        }
        return jVar.e;
    }

    public void P0(boolean z) {
    }

    public void P1(float f2) {
        j().r = f2;
    }

    public boolean Q0(MenuItem menuItem) {
        return false;
    }

    public void Q1(ArrayList arrayList, ArrayList arrayList2) {
        j();
        j jVar = this.L;
        jVar.h = arrayList;
        jVar.i = arrayList2;
    }

    public int R() {
        j jVar = this.L;
        if (jVar == null) {
            return 0;
        }
        return jVar.f;
    }

    public void R0(Menu menu) {
    }

    public void R1(Intent intent) {
        S1(intent, null);
    }

    public void S0() {
        this.G = true;
    }

    public void S1(Intent intent, Bundle bundle) {
        eg2 eg2Var = this.u;
        if (eg2Var != null) {
            eg2Var.k(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public float T() {
        j jVar = this.L;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.r;
    }

    public void T0(boolean z) {
    }

    public void T1(Intent intent, int i2, Bundle bundle) {
        if (this.u != null) {
            N().W0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object U() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.m;
        return obj == c0 ? C() : obj;
    }

    public void U0(Menu menu) {
    }

    public void U1() {
        if (this.L == null || !j().t) {
            return;
        }
        if (this.u == null) {
            j().t = false;
        } else if (Looper.myLooper() != this.u.g().getLooper()) {
            this.u.g().postAtFrontOfQueue(new d());
        } else {
            g(true);
        }
    }

    public final Resources V() {
        return F1().getResources();
    }

    public void V0(boolean z) {
    }

    public Object W() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.k;
        return obj == c0 ? x() : obj;
    }

    public void W0(int i2, String[] strArr, int[] iArr) {
    }

    public Object X() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        return jVar.n;
    }

    public void X0() {
        this.G = true;
    }

    public Object Y() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.o;
        return obj == c0 ? X() : obj;
    }

    public void Y0(Bundle bundle) {
    }

    public ArrayList Z() {
        ArrayList arrayList;
        j jVar = this.L;
        return (jVar == null || (arrayList = jVar.h) == null) ? new ArrayList() : arrayList;
    }

    public void Z0() {
        this.G = true;
    }

    public ArrayList a0() {
        ArrayList arrayList;
        j jVar = this.L;
        return (jVar == null || (arrayList = jVar.i) == null) ? new ArrayList() : arrayList;
    }

    public void a1() {
        this.G = true;
    }

    @Override // com.zepto.dr7
    public cr7 b0() {
        if (this.t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (I() != h.b.INITIALIZED.ordinal()) {
            return this.t.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void b1(View view, Bundle bundle) {
    }

    public final String c0(int i2) {
        return V().getString(i2);
    }

    public void c1(Bundle bundle) {
        this.G = true;
    }

    public final String d0() {
        return this.z;
    }

    public void d1(Bundle bundle) {
        this.v.Y0();
        this.a = 3;
        this.G = false;
        w0(bundle);
        if (this.G) {
            I1();
            this.v.w();
        } else {
            throw new z86("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public final sf2 e0(boolean z) {
        String str;
        if (z) {
            bh2.h(this);
        }
        sf2 sf2Var = this.h;
        if (sf2Var != null) {
            return sf2Var;
        }
        mg2 mg2Var = this.t;
        if (mg2Var == null || (str = this.i) == null) {
            return null;
        }
        return mg2Var.e0(str);
    }

    public void e1() {
        Iterator it = this.a0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a();
        }
        this.a0.clear();
        this.v.l(this.u, h(), this);
        this.a = 0;
        this.G = false;
        z0(this.u.f());
        if (this.G) {
            this.t.G(this);
            this.v.x();
        } else {
            throw new z86("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void g(boolean z) {
        ViewGroup viewGroup;
        mg2 mg2Var;
        j jVar = this.L;
        if (jVar != null) {
            jVar.t = false;
        }
        if (this.I == null || (viewGroup = this.H) == null || (mg2Var = this.t) == null) {
            return;
        }
        i56 i56VarR = i56.r(viewGroup, mg2Var);
        i56VarR.t();
        if (z) {
            this.u.g().post(new e(i56VarR));
        } else {
            i56VarR.k();
        }
        Handler handler = this.M;
        if (handler != null) {
            handler.removeCallbacks(this.N);
            this.M = null;
        }
    }

    @Override // com.zepto.df3
    public androidx.lifecycle.h g0() {
        return this.T;
    }

    public boolean g1(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (B0(menuItem)) {
            return true;
        }
        return this.v.z(menuItem);
    }

    public bg2 h() {
        return new f();
    }

    public View h0() {
        return this.I;
    }

    public void h1(Bundle bundle) {
        this.v.Y0();
        this.a = 1;
        this.G = false;
        this.T.a(new g());
        C0(bundle);
        this.Q = true;
        if (this.G) {
            this.T.i(h.a.ON_CREATE);
            return;
        }
        throw new z86("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        sf2 sf2VarE0 = e0(false);
        if (sf2VarE0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(sf2VarE0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(O());
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(w());
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(z());
        }
        if (P() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(P());
        }
        if (R() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(R());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (s() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(s());
        }
        if (v() != null) {
            gm3.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.v + ":");
        this.v.V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public df3 i0() {
        jh2 jh2Var = this.U;
        if (jh2Var != null) {
            return jh2Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public boolean i1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            F0(menu, menuInflater);
            z = true;
        }
        return z | this.v.B(menu, menuInflater);
    }

    public final j j() {
        if (this.L == null) {
            this.L = new j();
        }
        return this.L;
    }

    public androidx.lifecycle.n j0() {
        return this.V;
    }

    public void j1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.Y0();
        this.r = true;
        this.U = new jh2(this, b0(), new Runnable() { // from class: com.zepto.rf2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.u0();
            }
        });
        View viewG0 = G0(layoutInflater, viewGroup, bundle);
        this.I = viewG0;
        if (viewG0 == null) {
            if (this.U.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
            return;
        }
        this.U.b();
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.I + " for Fragment " + this);
        }
        ur7.a(this.I, this.U);
        xr7.a(this.I, this.U);
        wr7.a(this.I, this.U);
        this.V.m(this.U);
    }

    public sf2 k(String str) {
        return str.equals(this.f) ? this : this.v.i0(str);
    }

    public final void k0() {
        this.T = new androidx.lifecycle.m(this);
        this.X = dm5.a(this);
        this.W = null;
        if (this.a0.contains(this.b0)) {
            return;
        }
        D1(this.b0);
    }

    public void k1() {
        this.v.C();
        this.T.i(h.a.ON_DESTROY);
        this.a = 0;
        this.G = false;
        this.Q = false;
        H0();
        if (this.G) {
            return;
        }
        throw new z86("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public String l() {
        return "fragment_" + this.f + "_rq#" + this.Z.getAndIncrement();
    }

    public void l0() {
        k0();
        this.R = this.f;
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = new ng2();
        this.u = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
    }

    public void l1() {
        this.v.D();
        if (this.I != null && this.U.g0().b().b(h.b.CREATED)) {
            this.U.a(h.a.ON_DESTROY);
        }
        this.a = 1;
        this.G = false;
        J0();
        if (this.G) {
            gm3.b(this).c();
            this.r = false;
        } else {
            throw new z86("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void m1() {
        this.a = -1;
        this.G = false;
        K0();
        this.P = null;
        if (this.G) {
            if (this.v.I0()) {
                return;
            }
            this.v.C();
            this.v = new ng2();
            return;
        }
        throw new z86("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final yf2 n() {
        eg2 eg2Var = this.u;
        if (eg2Var == null) {
            return null;
        }
        return (yf2) eg2Var.e();
    }

    public final boolean n0() {
        return this.u != null && this.l;
    }

    public LayoutInflater n1(Bundle bundle) {
        LayoutInflater layoutInflaterL0 = L0(bundle);
        this.P = layoutInflaterL0;
        return layoutInflaterL0;
    }

    @Override // com.zepto.em5
    public final cm5 o() {
        return this.X.b();
    }

    public final boolean o0() {
        mg2 mg2Var;
        return this.A || ((mg2Var = this.t) != null && mg2Var.M0(this.w));
    }

    public void o1() {
        onLowMemory();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        E1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.G = true;
    }

    public final boolean p0() {
        return this.s > 0;
    }

    public void p1(boolean z) {
        P0(z);
    }

    public boolean q() {
        Boolean bool;
        j jVar = this.L;
        if (jVar == null || (bool = jVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean q0() {
        mg2 mg2Var;
        return this.F && ((mg2Var = this.t) == null || mg2Var.N0(this.w));
    }

    public boolean q1(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (this.E && this.F && Q0(menuItem)) {
            return true;
        }
        return this.v.I(menuItem);
    }

    public boolean r() {
        Boolean bool;
        j jVar = this.L;
        if (jVar == null || (bool = jVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean r0() {
        j jVar = this.L;
        if (jVar == null) {
            return false;
        }
        return jVar.t;
    }

    public void r1(Menu menu) {
        if (this.A) {
            return;
        }
        if (this.E && this.F) {
            R0(menu);
        }
        this.v.J(menu);
    }

    public View s() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        return jVar.a;
    }

    public final boolean s0() {
        return this.m;
    }

    public void s1() {
        this.v.L();
        if (this.I != null) {
            this.U.a(h.a.ON_PAUSE);
        }
        this.T.i(h.a.ON_PAUSE);
        this.a = 6;
        this.G = false;
        S0();
        if (this.G) {
            return;
        }
        throw new z86("Fragment " + this + " did not call through to super.onPause()");
    }

    public void startActivityForResult(Intent intent, int i2) {
        T1(intent, i2, null);
    }

    public final Bundle t() {
        return this.g;
    }

    public final boolean t0() {
        mg2 mg2Var = this.t;
        if (mg2Var == null) {
            return false;
        }
        return mg2Var.Q0();
    }

    public void t1(boolean z) {
        T0(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f);
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" tag=");
            sb.append(this.z);
        }
        sb.append(")");
        return sb.toString();
    }

    public final mg2 u() {
        if (this.u != null) {
            return this.v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final /* synthetic */ void u0() {
        this.U.d(this.d);
        this.d = null;
    }

    public boolean u1(Menu menu) {
        boolean z = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            U0(menu);
            z = true;
        }
        return z | this.v.N(menu);
    }

    public Context v() {
        eg2 eg2Var = this.u;
        if (eg2Var == null) {
            return null;
        }
        return eg2Var.f();
    }

    public void v0() {
        this.v.Y0();
    }

    public void v1() {
        boolean zO0 = this.t.O0(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != zO0) {
            this.k = Boolean.valueOf(zO0);
            V0(zO0);
            this.v.O();
        }
    }

    public int w() {
        j jVar = this.L;
        if (jVar == null) {
            return 0;
        }
        return jVar.c;
    }

    public void w0(Bundle bundle) {
        this.G = true;
    }

    public void w1() {
        this.v.Y0();
        this.v.Z(true);
        this.a = 7;
        this.G = false;
        X0();
        if (!this.G) {
            throw new z86("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.m mVar = this.T;
        h.a aVar = h.a.ON_RESUME;
        mVar.i(aVar);
        if (this.I != null) {
            this.U.a(aVar);
        }
        this.v.P();
    }

    public Object x() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        return jVar.j;
    }

    public void x0(int i2, int i3, Intent intent) {
        if (mg2.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void x1(Bundle bundle) {
        Y0(bundle);
    }

    public m06 y() {
        j jVar = this.L;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public void y0(Activity activity) {
        this.G = true;
    }

    public void y1() {
        this.v.Y0();
        this.v.Z(true);
        this.a = 5;
        this.G = false;
        Z0();
        if (!this.G) {
            throw new z86("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.m mVar = this.T;
        h.a aVar = h.a.ON_START;
        mVar.i(aVar);
        if (this.I != null) {
            this.U.a(aVar);
        }
        this.v.Q();
    }

    public int z() {
        j jVar = this.L;
        if (jVar == null) {
            return 0;
        }
        return jVar.d;
    }

    public void z0(Context context) {
        this.G = true;
        eg2 eg2Var = this.u;
        Activity activityE = eg2Var == null ? null : eg2Var.e();
        if (activityE != null) {
            this.G = false;
            y0(activityE);
        }
    }

    public void z1() {
        this.v.S();
        if (this.I != null) {
            this.U.a(h.a.ON_STOP);
        }
        this.T.i(h.a.ON_STOP);
        this.a = 4;
        this.G = false;
        a1();
        if (this.G) {
            return;
        }
        throw new z86("Fragment " + this + " did not call through to super.onStop()");
    }
}
