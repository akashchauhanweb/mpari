package com.zepto;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nl implements oz0 {
    public final oz0 a;
    public final float b;

    public nl(float f, oz0 oz0Var) {
        while (oz0Var instanceof nl) {
            oz0Var = ((nl) oz0Var).a;
            f += ((nl) oz0Var).b;
        }
        this.a = oz0Var;
        this.b = f;
    }

    @Override // com.zepto.oz0
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl)) {
            return false;
        }
        nl nlVar = (nl) obj;
        return this.a.equals(nlVar.a) && this.b == nlVar.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
