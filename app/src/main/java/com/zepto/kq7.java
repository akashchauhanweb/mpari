package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq7 {

    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    public static float a(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    public static boolean c(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
