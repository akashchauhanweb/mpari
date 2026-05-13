package com.zepto;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.zepto.ki6;
import com.zepto.vc2;
import com.zepto.zz2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class tc2 implements uc2 {
    public static final Object m = new Object();
    public static final ThreadFactory n = new a();
    public final hc2 a;
    public final oc2 b;
    public final gr4 c;
    public final pt6 d;
    public final lb3 e;
    public final j45 f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public Set k;
    public final List l;

    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ki6.b.values().length];
            b = iArr;
            try {
                iArr[ki6.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ki6.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ki6.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[zz2.b.values().length];
            a = iArr2;
            try {
                iArr2[zz2.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[zz2.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public tc2(final hc2 hc2Var, nx4 nx4Var, ExecutorService executorService, Executor executor) {
        this(executorService, executor, hc2Var, new oc2(hc2Var.j(), nx4Var), new gr4(hc2Var), pt6.c(), new lb3(new nx4() { // from class: com.zepto.pc2
            @Override // com.zepto.nx4
            public final Object get() {
                return tc2.y(hc2Var);
            }
        }), new j45());
    }

    public static tc2 q(hc2 hc2Var) {
        iu4.b(hc2Var != null, "Null is not a valid value of FirebaseApp.");
        return (tc2) hc2Var.i(uc2.class);
    }

    public static /* synthetic */ fx2 y(hc2 hc2Var) {
        return new fx2(hc2Var);
    }

    public final String A(hr4 hr4Var) {
        if ((!this.a.l().equals("CHIME_ANDROID_SDK") && !this.a.t()) || !hr4Var.m()) {
            return this.f.a();
        }
        String strF = p().f();
        return TextUtils.isEmpty(strF) ? this.f.a() : strF;
    }

    public final hr4 B(hr4 hr4Var) throws vc2 {
        zz2 zz2VarD = this.b.d(m(), hr4Var.d(), t(), n(), (hr4Var.d() == null || hr4Var.d().length() != 11) ? null : p().i());
        int i = b.a[zz2VarD.e().ordinal()];
        if (i == 1) {
            return hr4Var.s(zz2VarD.c(), zz2VarD.d(), this.d.b(), zz2VarD.b().c(), zz2VarD.b().d());
        }
        if (i == 2) {
            return hr4Var.q("BAD CONFIG");
        }
        throw new vc2("Firebase Installations Service is unavailable. Please try again later.", vc2.a.UNAVAILABLE);
    }

    public final void C(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((a76) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(hr4 hr4Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((a76) it.next()).a(hr4Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void E(String str) {
        this.j = str;
    }

    public final synchronized void F(hr4 hr4Var, hr4 hr4Var2) {
        if (this.k.size() != 0 && !TextUtils.equals(hr4Var.d(), hr4Var2.d())) {
            Iterator it = this.k.iterator();
            if (it.hasNext()) {
                wb0.a(it.next());
                hr4Var2.d();
                throw null;
            }
        }
    }

    @Override // com.zepto.uc2
    public Task a(final boolean z) {
        z();
        Task taskG = g();
        this.h.execute(new Runnable() { // from class: com.zepto.qc2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.x(z);
            }
        });
        return taskG;
    }

    @Override // com.zepto.uc2
    public Task c() {
        z();
        String strO = o();
        if (strO != null) {
            return gd6.e(strO);
        }
        Task taskH = h();
        this.h.execute(new Runnable() { // from class: com.zepto.rc2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.w();
            }
        });
        return taskH;
    }

    public final Task g() {
        rc6 rc6Var = new rc6();
        i(new dj2(this.d, rc6Var));
        return rc6Var.a();
    }

    public final Task h() {
        rc6 rc6Var = new rc6();
        i(new fj2(rc6Var));
        return rc6Var.a();
    }

    public final void i(a76 a76Var) {
        synchronized (this.g) {
            this.l.add(a76Var);
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void v(boolean z) {
        hr4 hr4VarB;
        hr4 hr4VarR = r();
        try {
            if (hr4VarR.i() || hr4VarR.l()) {
                hr4VarB = B(hr4VarR);
            } else {
                if (!z && !this.d.f(hr4VarR)) {
                    return;
                }
                hr4VarB = l(hr4VarR);
            }
            u(hr4VarB);
            F(hr4VarR, hr4VarB);
            if (hr4VarB.k()) {
                E(hr4VarB.d());
            }
            if (hr4VarB.i()) {
                C(new vc2(vc2.a.BAD_CONFIG));
            } else if (hr4VarB.j()) {
                C(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                D(hr4VarB);
            }
        } catch (vc2 e) {
            C(e);
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z) {
        hr4 hr4VarS = s();
        if (z) {
            hr4VarS = hr4VarS.p();
        }
        D(hr4VarS);
        this.i.execute(new Runnable() { // from class: com.zepto.sc2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.v(z);
            }
        });
    }

    public final hr4 l(hr4 hr4Var) throws vc2 {
        ki6 ki6VarE = this.b.e(m(), hr4Var.d(), t(), hr4Var.f());
        int i = b.b[ki6VarE.b().ordinal()];
        if (i == 1) {
            return hr4Var.o(ki6VarE.c(), ki6VarE.d(), this.d.b());
        }
        if (i == 2) {
            return hr4Var.q("BAD CONFIG");
        }
        if (i != 3) {
            throw new vc2("Firebase Installations Service is unavailable. Please try again later.", vc2.a.UNAVAILABLE);
        }
        E(null);
        return hr4Var.r();
    }

    public String m() {
        return this.a.m().b();
    }

    public String n() {
        return this.a.m().c();
    }

    public final synchronized String o() {
        return this.j;
    }

    public final fx2 p() {
        return (fx2) this.e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final hr4 r() {
        hr4 hr4VarD;
        synchronized (m) {
            try {
                p31 p31VarA = p31.a(this.a.j(), "generatefid.lock");
                try {
                    hr4VarD = this.c.d();
                    if (p31VarA != null) {
                        p31VarA.b();
                    }
                } catch (Throwable th) {
                    if (p31VarA != null) {
                        p31VarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hr4VarD;
    }

    /* JADX WARN: Finally extract failed */
    public final hr4 s() {
        hr4 hr4VarD;
        synchronized (m) {
            try {
                p31 p31VarA = p31.a(this.a.j(), "generatefid.lock");
                try {
                    hr4VarD = this.c.d();
                    if (hr4VarD.j()) {
                        hr4VarD = this.c.b(hr4VarD.t(A(hr4VarD)));
                    }
                    if (p31VarA != null) {
                        p31VarA.b();
                    }
                } catch (Throwable th) {
                    if (p31VarA != null) {
                        p31VarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hr4VarD;
    }

    public String t() {
        return this.a.m().e();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(hr4 hr4Var) {
        synchronized (m) {
            try {
                p31 p31VarA = p31.a(this.a.j(), "generatefid.lock");
                try {
                    this.c.b(hr4Var);
                    if (p31VarA != null) {
                        p31VarA.b();
                    }
                } catch (Throwable th) {
                    if (p31VarA != null) {
                        p31VarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void w() {
        x(false);
    }

    public final void z() {
        iu4.f(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iu4.f(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iu4.f(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iu4.b(pt6.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iu4.b(pt6.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public tc2(ExecutorService executorService, Executor executor, hc2 hc2Var, oc2 oc2Var, gr4 gr4Var, pt6 pt6Var, lb3 lb3Var, j45 j45Var) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hc2Var;
        this.b = oc2Var;
        this.c = gr4Var;
        this.d = pt6Var;
        this.e = lb3Var;
        this.f = j45Var;
        this.h = executorService;
        this.i = executor;
    }
}
