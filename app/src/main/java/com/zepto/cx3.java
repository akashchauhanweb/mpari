package com.zepto;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class cx3 {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
