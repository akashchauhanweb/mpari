package com.zepto;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.z;

/* JADX INFO: loaded from: classes.dex */
public class jh2 implements androidx.lifecycle.f, em5, dr7 {
    public final sf2 a;
    public final cr7 b;
    public final Runnable c;
    public z.b d;
    public androidx.lifecycle.m e = null;
    public dm5 f = null;

    public jh2(sf2 sf2Var, cr7 cr7Var, Runnable runnable) {
        this.a = sf2Var;
        this.b = cr7Var;
        this.c = runnable;
    }

    @Override // androidx.lifecycle.f
    public z.b K() {
        Application application;
        z.b bVarK = this.a.K();
        if (!bVarK.equals(this.a.W)) {
            this.d = bVarK;
            return bVarK;
        }
        if (this.d == null) {
            Context applicationContext = this.a.F1().getApplicationContext();
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
            sf2 sf2Var = this.a;
            this.d = new androidx.lifecycle.w(application, sf2Var, sf2Var.t());
        }
        return this.d;
    }

    @Override // androidx.lifecycle.f
    public h31 L() {
        Application application;
        Context applicationContext = this.a.F1().getApplicationContext();
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
        ny3 ny3Var = new ny3();
        if (application != null) {
            ny3Var.c(z.a.h, application);
        }
        ny3Var.c(androidx.lifecycle.v.a, this.a);
        ny3Var.c(androidx.lifecycle.v.b, this);
        if (this.a.t() != null) {
            ny3Var.c(androidx.lifecycle.v.c, this.a.t());
        }
        return ny3Var;
    }

    public void a(h.a aVar) {
        this.e.i(aVar);
    }

    public void b() {
        if (this.e == null) {
            this.e = new androidx.lifecycle.m(this);
            dm5 dm5VarA = dm5.a(this);
            this.f = dm5VarA;
            dm5VarA.c();
            this.c.run();
        }
    }

    @Override // com.zepto.dr7
    public cr7 b0() {
        b();
        return this.b;
    }

    public boolean c() {
        return this.e != null;
    }

    public void d(Bundle bundle) {
        this.f.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f.e(bundle);
    }

    public void f(h.b bVar) {
        this.e.o(bVar);
    }

    @Override // com.zepto.df3
    public androidx.lifecycle.h g0() {
        b();
        return this.e;
    }

    @Override // com.zepto.em5
    public cm5 o() {
        b();
        return this.f.b();
    }
}
