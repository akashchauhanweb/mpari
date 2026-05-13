package com.zepto;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ip3 {
    public static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
