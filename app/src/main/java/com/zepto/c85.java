package com.zepto;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c85 implements oz0 {
    public final float a;

    public c85(float f) {
        this.a = f;
    }

    public static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // com.zepto.oz0
    public float a(RectF rectF) {
        return this.a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c85) && this.a == ((c85) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
