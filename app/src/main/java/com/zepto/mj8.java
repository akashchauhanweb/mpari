package com.zepto;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj8 {
    public static final si8 a = new og8(ci8.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    public static final si8 b = new zg8(ci8.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final si8 c = new jh8(ci8.d("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    public static final si8 d = new sh8(ci8.d("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    public static final Object e = new Object();
    public static Context f;

    public static synchronized void a(Context context) {
        if (f != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f = context.getApplicationContext();
        }
    }
}
