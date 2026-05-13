package com.zepto;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class c80 {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    public static final class a {
        public static final int a = SdkExtensions.getExtensionVersion(30);
        public static final int b = SdkExtensions.getExtensionVersion(31);
        public static final int c = SdkExtensions.getExtensionVersion(33);
        public static final int d = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 30 ? a.a : 0;
        b = i >= 30 ? a.b : 0;
        c = i >= 30 ? a.c : 0;
        d = i >= 30 ? a.d : 0;
    }

    public static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
