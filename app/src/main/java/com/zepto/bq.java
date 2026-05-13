package com.zepto;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bq {
    public static final bq a = new bq();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
