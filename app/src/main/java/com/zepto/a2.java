package com.zepto;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements oz0 {
    public final float a;

    public a2(float f) {
        this.a = f;
    }

    @Override // com.zepto.oz0
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && this.a == ((a2) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
