package com.zepto;

import android.os.Looper;
import com.zepto.yf3;

/* JADX INFO: loaded from: classes.dex */
public abstract class zf3 {
    public static yf3 a(Object obj, Looper looper, String str) {
        iu4.j(obj, "Listener must not be null");
        iu4.j(looper, "Looper must not be null");
        iu4.j(str, "Listener type must not be null");
        return new yf3(looper, obj, str);
    }

    public static yf3.a b(Object obj, String str) {
        iu4.j(obj, "Listener must not be null");
        iu4.j(str, "Listener type must not be null");
        iu4.f(str, "Listener type must not be empty");
        return new yf3.a(obj, str);
    }
}
