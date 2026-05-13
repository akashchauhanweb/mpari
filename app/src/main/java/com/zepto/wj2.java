package com.zepto;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.zepto.tq0;
import com.zepto.yf3;
import com.zepto.yp;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class wj2 {
    public final Context a;
    public final String b;
    public final yp c;
    public final yp.d d;
    public final iq e;
    public final Looper f;
    public final int g;
    public final zj2 h;
    public final i76 i;
    public final ak2 j;

    public static class a {
        public static final a c = new C0128a().a();
        public final i76 a;
        public final Looper b;

        /* JADX INFO: renamed from: com.zepto.wj2$a$a, reason: collision with other inner class name */
        public static class C0128a {
            public i76 a;
            public Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new fq();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        public a(i76 i76Var, Account account, Looper looper) {
            this.a = i76Var;
            this.b = looper;
        }
    }

    public wj2(Activity activity, yp ypVar, yp.d dVar, a aVar) {
        this(activity, activity, ypVar, dVar, aVar);
    }

    public tq0.a f() {
        tq0.a aVar = new tq0.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public Task g(qc6 qc6Var) {
        return p(2, qc6Var);
    }

    public Task h(qc6 qc6Var) {
        return p(0, qc6Var);
    }

    public Task i(t75 t75Var) {
        iu4.i(t75Var);
        iu4.j(t75Var.a.b(), "Listener has already been released.");
        iu4.j(t75Var.b.a(), "Listener has already been released.");
        return this.j.z(this, t75Var.a, t75Var.b, t75Var.c);
    }

    public Task j(yf3.a aVar, int i) {
        iu4.j(aVar, "Listener key cannot be null.");
        return this.j.A(this, aVar, i);
    }

    public final iq k() {
        return this.e;
    }

    public String l() {
        return this.b;
    }

    public final int m() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yp.f n(Looper looper, i28 i28Var) {
        yp.f fVarB = ((yp.a) iu4.i(this.c.a())).b(this.a, looper, f().a(), this.d, i28Var, i28Var);
        String strL = l();
        if (strL != null && (fVarB instanceof t40)) {
            ((t40) fVarB).M(strL);
        }
        if (strL == null || !(fVarB instanceof ac4)) {
            return fVarB;
        }
        throw null;
    }

    public final j38 o(Context context, Handler handler) {
        return new j38(context, handler, f().a());
    }

    public final Task p(int i, qc6 qc6Var) {
        rc6 rc6Var = new rc6();
        this.j.F(this, i, qc6Var, rc6Var, this.i);
        return rc6Var.a();
    }

    public wj2(Context context, Activity activity, yp ypVar, yp.d dVar, a aVar) {
        iu4.j(context, "Null context is not permitted.");
        iu4.j(ypVar, "Api must not be null.");
        iu4.j(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (ls4.j()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = ypVar;
        this.d = dVar;
        this.f = aVar.b;
        iq iqVarA = iq.a(ypVar, dVar, str);
        this.e = iqVarA;
        this.h = new n28(this);
        ak2 ak2VarX = ak2.x(this.a);
        this.j = ak2VarX;
        this.g = ak2VarX.m();
        this.i = aVar.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            w18.u(activity, ak2VarX, iqVarA);
        }
        ak2VarX.b(this);
    }

    public wj2(Context context, yp ypVar, yp.d dVar, a aVar) {
        this(context, null, ypVar, dVar, aVar);
    }
}
