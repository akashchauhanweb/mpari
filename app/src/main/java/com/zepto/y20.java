package com.zepto;

import com.zepto.pe4;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class y20 implements Serializable {
    public final Map c = new TreeMap();
    public transient long e;

    public y20(long j) {
        this.e = j;
    }

    public x20 a(int i) {
        return (x20) this.c.get(r03.a(i));
    }

    public long b() {
        return this.e;
    }

    public void c(int i, x20 x20Var) {
        this.c.put(r03.a(i), x20Var);
    }

    public x20 d(int i, byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        return (x20) this.c.put(r03.a(i), ((x20) this.c.get(r03.a(i))).d(bArr, bArr2, pe4Var));
    }

    public void e(i08 i08Var, long j, byte[] bArr, byte[] bArr2) {
        q08 q08VarH = i08Var.h();
        int iB = q08VarH.b();
        long j2 = v08.j(j, iB);
        int i = v08.i(j, iB);
        pe4 pe4Var = (pe4) ((pe4.b) new pe4.b().h(j2)).p(i).l();
        int i2 = (1 << iB) - 1;
        if (i < i2) {
            if (a(0) == null || i == 0) {
                c(0, new x20(q08VarH, bArr, bArr2, pe4Var));
            }
            d(0, bArr, bArr2, pe4Var);
        }
        for (int i3 = 1; i3 < i08Var.b(); i3++) {
            int i4 = v08.i(j2, iB);
            j2 = v08.j(j2, iB);
            pe4 pe4Var2 = (pe4) ((pe4.b) ((pe4.b) new pe4.b().g(i3)).h(j2)).p(i4).l();
            if (this.c.get(Integer.valueOf(i3)) == null || v08.n(j, iB, i3)) {
                this.c.put(Integer.valueOf(i3), new x20(q08VarH, bArr, bArr2, pe4Var2));
            }
            if (i4 < i2 && v08.m(j, iB, i3)) {
                d(i3, bArr, bArr2, pe4Var2);
            }
        }
    }

    public y20 f(p0 p0Var) {
        y20 y20Var = new y20(this.e);
        for (Integer num : this.c.keySet()) {
            y20Var.c.put(num, ((x20) this.c.get(num)).h(p0Var));
        }
        return y20Var;
    }

    public y20(y20 y20Var, long j) {
        for (Integer num : y20Var.c.keySet()) {
            this.c.put(num, new x20((x20) y20Var.c.get(num)));
        }
        this.e = j;
    }

    public y20(i08 i08Var, long j, byte[] bArr, byte[] bArr2) {
        this.e = (1 << i08Var.a()) - 1;
        for (long j2 = 0; j2 < j; j2++) {
            e(i08Var, j2, bArr, bArr2);
        }
    }
}
