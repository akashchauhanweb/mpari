package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class op4 extends rp4 {
    public double f;

    public op4(String str) {
        super(2);
        try {
            this.f = Double.parseDouble(str.trim());
            j(str);
        } catch (NumberFormatException e) {
            throw new RuntimeException(dt3.b("1.is.not.a.valid.number.2", str, e.toString()));
        }
    }

    public double m() {
        return this.f;
    }

    public op4(int i) {
        super(2);
        this.f = i;
        j(String.valueOf(i));
    }

    public op4(double d) {
        super(2);
        this.f = d;
        j(o80.e0(d));
    }

    public op4(float f) {
        this(f);
    }
}
