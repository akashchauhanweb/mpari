package com.zepto;

import android.content.Context;
import android.util.SparseIntArray;
import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public final class n48 {
    public final SparseIntArray a = new SparseIntArray();
    public yj2 b;

    public n48(yj2 yj2Var) {
        iu4.i(yj2Var);
        this.b = yj2Var;
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    public final int b(Context context, yp.f fVar) {
        iu4.i(context);
        iu4.i(fVar);
        int i = 0;
        if (!fVar.e()) {
            return 0;
        }
        int iF = fVar.f();
        int iA = a(context, iF);
        if (iA == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.size()) {
                    i = -1;
                    break;
                }
                int iKeyAt = this.a.keyAt(i2);
                if (iKeyAt > iF && this.a.get(iKeyAt) == 0) {
                    break;
                }
                i2++;
            }
            iA = i == -1 ? this.b.g(context, iF) : i;
            this.a.put(iF, iA);
        }
        return iA;
    }

    public final void c() {
        this.a.clear();
    }
}
