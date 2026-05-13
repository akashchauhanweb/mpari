package com.zepto;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class b32 {
    public static String a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(v05.d);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(v05.h);
                case 11:
                    return context.getString(v05.g);
                case 12:
                    return context.getString(v05.e);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(v05.b);
            }
        }
        return context.getString(v05.f);
    }

    public static boolean b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    public static boolean c(int i) {
        return i == 7 || i == 9;
    }
}
