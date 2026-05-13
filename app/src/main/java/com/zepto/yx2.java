package com.zepto;

import android.graphics.PointF;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class yx2 implements Serializable {
    public final float c;
    public final float e;
    public final float f;
    public final int g;

    public yx2(float f, PointF pointF, int i) {
        this.c = f;
        this.e = pointF.x;
        this.f = pointF.y;
        this.g = i;
    }

    public PointF a() {
        return new PointF(this.e, this.f);
    }

    public int b() {
        return this.g;
    }

    public float c() {
        return this.c;
    }
}
