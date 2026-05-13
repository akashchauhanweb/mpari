package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kq4 {
    public ArrayList a = new ArrayList();
    public String b;
    public Float c;

    public kq4(String str) {
        b(str);
    }

    public void a(float f) {
        if (f != 0.0f) {
            Float f2 = this.c;
            if (f2 != null) {
                Float f3 = new Float(f + f2.floatValue());
                this.c = f3;
                if (f3.floatValue() != 0.0f) {
                    d(this.c);
                } else {
                    this.a.remove(r4.size() - 1);
                }
            } else {
                Float f4 = new Float(f);
                this.c = f4;
                this.a.add(f4);
            }
            this.b = null;
        }
    }

    public void b(String str) {
        if (str.length() > 0) {
            if (this.b != null) {
                String str2 = this.b + str;
                this.b = str2;
                d(str2);
            } else {
                this.b = str;
                this.a.add(str);
            }
            this.c = null;
        }
    }

    public ArrayList c() {
        return this.a;
    }

    public final void d(Object obj) {
        this.a.set(r0.size() - 1, obj);
    }

    public kq4() {
    }
}
