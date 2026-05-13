package com.zepto;

import android.os.Build;
import com.zepto.k60;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class yz {
    public static String a(int i) {
        return i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    public static int b(int i) {
        return i & 32767;
    }

    public static int c(k60.d dVar, k60.c cVar) {
        if (dVar.a() != 0) {
            return dVar.a();
        }
        int i = cVar != null ? 15 : KotlinVersion.MAX_COMPONENT_VALUE;
        return dVar.g() ? 32768 | i : i;
    }

    public static boolean d(int i) {
        return (i & 32768) != 0;
    }

    public static boolean e(int i) {
        return b(i) != 0;
    }

    public static boolean f(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }

    public static boolean g(int i) {
        return (i & KotlinVersion.MAX_COMPONENT_VALUE) == 255;
    }
}
