package com.zepto;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract class el4 {
    public static final ThreadLocal a = new ThreadLocal();

    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
