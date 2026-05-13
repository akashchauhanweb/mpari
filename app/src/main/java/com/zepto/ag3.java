package com.zepto;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ag3 {
    public static final SparseArray a = new SparseArray();

    public static Object a(View view, Object obj, int i) {
        Object tag = view.getTag(i);
        view.setTag(i, obj);
        return tag;
    }
}
