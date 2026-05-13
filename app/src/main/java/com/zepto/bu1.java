package com.zepto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class bu1 implements tt1 {
    public static boolean p = true;
    public static boolean q;
    public ArrayList a;
    public boolean b;
    public boolean c;
    public i65 d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public int n;
    public int o;

    public bu1() {
        this(bl4.k);
    }

    public static final String n() {
        return "5.0.6";
    }

    public static final String o() {
        return "iText 5.0.6 (c) 1T3XT BVBA";
    }

    @Override // com.zepto.tt1
    public void a() {
        if (!this.c) {
            this.b = true;
        }
        for (tt1 tt1Var : this.a) {
            tt1Var.e(this.d);
            tt1Var.c(this.e, this.f, this.g, this.h);
            tt1Var.a();
        }
    }

    @Override // com.zepto.tt1
    public boolean b() {
        if (!this.b || this.c) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tt1) it.next()).b();
        }
        return true;
    }

    @Override // com.zepto.tt1
    public boolean c(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tt1) it.next()).c(f, f2, f3, f4);
        }
        return true;
    }

    @Override // com.zepto.tt1
    public void close() {
        if (!this.c) {
            this.b = false;
            this.c = true;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tt1) it.next()).close();
        }
    }

    @Override // com.zepto.r02
    public boolean d(f02 f02Var) throws cu1 {
        boolean zD = false;
        if (this.c) {
            throw new cu1(dt3.b("the.document.has.been.closed.you.can.t.add.any.elements", new Object[0]));
        }
        if (!this.b && f02Var.O()) {
            throw new cu1(dt3.b("the.document.is.not.open.yet.you.can.only.add.meta.information", new Object[0]));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zD |= ((tt1) it.next()).d(f02Var);
        }
        if (f02Var instanceof ab3) {
            ab3 ab3Var = (ab3) f02Var;
            if (!ab3Var.T()) {
                ab3Var.r();
            }
        }
        return zD;
    }

    @Override // com.zepto.tt1
    public boolean e(i65 i65Var) {
        this.d = i65Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tt1) it.next()).e(i65Var);
        }
        return true;
    }

    public boolean f(String str) {
        try {
            return d(new kt3(4, str));
        } catch (cu1 e) {
            throw new p52(e);
        }
    }

    public boolean g() {
        try {
            return d(new kt3(6, new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").format(new Date())));
        } catch (cu1 e) {
            throw new p52(e);
        }
    }

    public void h(tt1 tt1Var) {
        this.a.add(tt1Var);
    }

    public boolean i() {
        try {
            return d(new kt3(5, o()));
        } catch (cu1 e) {
            throw new p52(e);
        }
    }

    public boolean j(String str) {
        try {
            return d(new kt3(2, str));
        } catch (cu1 e) {
            throw new p52(e);
        }
    }

    public boolean k(String str) {
        try {
            return d(new kt3(1, str));
        } catch (cu1 e) {
            throw new p52(e);
        }
    }

    public float l(float f) {
        return this.d.n(this.h + f);
    }

    public int m() {
        return this.n;
    }

    public float p() {
        return this.d.q(this.e);
    }

    public float q(float f) {
        return this.d.q(this.e + f);
    }

    public float r(float f) {
        return this.d.t(this.f + f);
    }

    public float s() {
        return this.d.x(this.g);
    }

    public float t(float f) {
        return this.d.x(this.g + f);
    }

    public bu1(i65 i65Var) {
        this(i65Var, 36.0f, 36.0f, 36.0f, 36.0f);
    }

    public bu1(i65 i65Var, float f, float f2, float f3, float f4) {
        this.a = new ArrayList();
        this.i = false;
        this.j = false;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = 0;
        this.o = 0;
        this.d = i65Var;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }
}
