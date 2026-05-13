package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ip4 {
    public ArrayList a;
    public float b;
    public float c;
    public int d;
    public float e;
    public fk0 f;
    public float g;
    public boolean h;
    public float i;
    public boolean j;

    public ip4(float f, float f2, int i, float f3) {
        this.f = null;
        this.h = false;
        this.j = false;
        this.b = f;
        float f4 = f2 - f;
        this.c = f4;
        this.i = f4;
        this.d = i;
        this.e = f3;
        this.a = new ArrayList();
    }

    public no4 a(no4 no4Var) {
        if (no4Var == null || no4Var.toString().equals("")) {
            return null;
        }
        no4 no4VarW = no4Var.w(this.c);
        this.h = no4Var.o() || no4VarW == null;
        if (no4Var.s()) {
            Object[] objArr = (Object[]) no4Var.d("TAB");
            float fFloatValue = ((Float) objArr[1]).floatValue();
            if (((Boolean) objArr[2]).booleanValue() && fFloatValue < this.i - this.c) {
                return no4Var;
            }
            this.c = this.i - fFloatValue;
            no4Var.a(this.b);
            b(no4Var);
        } else if (no4Var.t() > 0 || no4Var.n()) {
            if (no4VarW != null) {
                no4Var.z();
            }
            this.c -= no4Var.B();
            b(no4Var);
        } else {
            if (this.a.size() < 1) {
                no4 no4VarA = no4VarW.A(this.c);
                this.c -= no4VarW.B();
                if (no4VarW.t() > 0) {
                    b(no4VarW);
                    return no4VarA;
                }
                if (no4VarA != null) {
                    b(no4VarA);
                }
                return null;
            }
            float f = this.c;
            ArrayList arrayList = this.a;
            this.c = f + ((no4) arrayList.get(arrayList.size() - 1)).z();
        }
        return no4VarW;
    }

    public final void b(no4 no4Var) {
        if (no4Var.k && no4Var.n()) {
            no4Var.f();
            throw null;
        }
        this.a.add(no4Var);
    }

    public float c() {
        float fMax = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            no4 no4Var = (no4) this.a.get(i);
            if (no4Var.n()) {
                no4Var.f();
                throw null;
            }
            bp4 bp4VarC = no4Var.c();
            fMax = Math.max(fMax, bp4VarC.b().l(1, bp4VarC.e()));
        }
        return fMax;
    }

    public no4 d(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (no4) this.a.get(i);
    }

    public float e() {
        float fMin = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            no4 no4Var = (no4) this.a.get(i);
            if (no4Var.n()) {
                fMin = Math.min(fMin, no4Var.g());
            } else {
                bp4 bp4VarC = no4Var.c();
                fMin = Math.min(fMin, bp4VarC.b().l(3, bp4VarC.e()));
            }
        }
        return fMin;
    }

    public int f() {
        int size = this.a.size() - 1;
        while (size >= 0 && !((no4) this.a.get(size)).r()) {
            size--;
        }
        return size;
    }

    public int g() {
        Iterator it = this.a.iterator();
        int iU = 0;
        while (it.hasNext()) {
            iU += ((no4) it.next()).u();
        }
        return iU;
    }

    public float[] h() {
        float fMax = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            no4 no4Var = (no4) this.a.get(i);
            if (no4Var.n()) {
                no4Var.f();
                throw null;
            }
            fMax = Math.max(no4Var.c().e(), fMax);
        }
        return new float[]{fMax, -10000.0f};
    }

    public float i() {
        return this.i;
    }

    public int j() {
        int i = 0;
        for (no4 no4Var : this.a) {
            if (no4Var.s()) {
                return -1;
            }
            if (no4Var.m()) {
                i++;
            }
        }
        return i;
    }

    public boolean k() {
        int i = this.d;
        return (i == 3 || i == 8) && this.c != 0.0f;
    }

    public float l() {
        return this.e;
    }

    public float m() {
        if (this.j) {
            int i = this.d;
            return i != 0 ? i != 1 ? this.b : this.b + (this.c / 2.0f) : this.b + this.c;
        }
        if (j() <= 0) {
            int i2 = this.d;
            if (i2 == 1) {
                return this.b + (this.c / 2.0f);
            }
            if (i2 == 2) {
                return this.b + this.c;
            }
        }
        return this.b;
    }

    public boolean n() {
        return this.h && this.d != 8;
    }

    public boolean o() {
        return this.j;
    }

    public Iterator p() {
        return this.a.iterator();
    }

    public float q() {
        return this.g;
    }

    public fk0 r() {
        return this.f;
    }

    public int s() {
        String string = toString();
        int length = string.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (string.charAt(i2) == ' ') {
                i++;
            }
        }
        return i;
    }

    public void t() {
        if (this.d == 3) {
            this.d = 0;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((no4) it.next()).toString());
        }
        return stringBuffer.toString();
    }

    public void u(float f) {
        this.b += f;
        this.c -= f;
    }

    public void v(sf3 sf3Var) {
        this.f = sf3Var.I0();
        this.g = sf3Var.q0();
    }

    public int w() {
        return this.a.size();
    }

    public float x() {
        return this.c;
    }

    public ip4(float f, float f2, float f3, int i, boolean z, ArrayList arrayList, boolean z2) {
        this.f = null;
        this.b = f;
        this.i = f2;
        this.c = f3;
        this.d = i;
        this.a = arrayList;
        this.h = z;
        this.j = z2;
    }
}
