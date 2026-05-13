package com.zepto;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ko4 extends rp4 {
    public ArrayList f;

    public ko4() {
        super(5);
        this.f = new ArrayList();
    }

    @Override // com.zepto.rp4
    public void k(pq4 pq4Var, OutputStream outputStream) throws IOException {
        outputStream.write(91);
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            rp4 rp4Var = (rp4) it.next();
            if (rp4Var == null) {
                rp4Var = np4.f;
            }
            rp4Var.k(pq4Var, outputStream);
        }
        while (it.hasNext()) {
            rp4 rp4Var2 = (rp4) it.next();
            if (rp4Var2 == null) {
                rp4Var2 = np4.f;
            }
            int iL = rp4Var2.l();
            if (iL != 5 && iL != 6 && iL != 4 && iL != 3) {
                outputStream.write(32);
            }
            rp4Var2.k(pq4Var, outputStream);
        }
        outputStream.write(93);
    }

    public boolean m(rp4 rp4Var) {
        return this.f.add(rp4Var);
    }

    public boolean n(float[] fArr) {
        for (float f : fArr) {
            this.f.add(new op4(f));
        }
        return true;
    }

    public boolean o(int[] iArr) {
        for (int i : iArr) {
            this.f.add(new op4(i));
        }
        return true;
    }

    public void p(rp4 rp4Var) {
        this.f.add(0, rp4Var);
    }

    public boolean q(rp4 rp4Var) {
        return this.f.contains(rp4Var);
    }

    public ArrayList r() {
        return this.f;
    }

    public rp4 s(int i) {
        return (rp4) this.f.get(i);
    }

    public int t() {
        return this.f.size();
    }

    @Override // com.zepto.rp4
    public String toString() {
        return this.f.toString();
    }

    public ko4(rp4 rp4Var) {
        super(5);
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add(rp4Var);
    }

    public ko4(float[] fArr) {
        super(5);
        this.f = new ArrayList();
        n(fArr);
    }

    public ko4(int[] iArr) {
        super(5);
        this.f = new ArrayList();
        o(iArr);
    }
}
