package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class to4 extends ko4 {
    public boolean g;

    public to4(int i, float f, float f2, float f3) {
        super(lp4.Bb);
        this.g = false;
        if (f < 0.0f) {
            m(np4.f);
        } else {
            m(new op4(f));
        }
        if (f2 < 0.0f) {
            m(np4.f);
        } else {
            m(new op4(f2));
        }
        m(new op4(f3));
    }

    public boolean u(gp4 gp4Var) {
        if (this.g) {
            return false;
        }
        p(gp4Var);
        this.g = true;
        return true;
    }

    public boolean v() {
        return this.g;
    }
}
