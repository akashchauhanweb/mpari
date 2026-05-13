package com.zepto;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq7 {
    public static boolean a = true;

    public static vq7 a(ViewGroup viewGroup) {
        return new uq7(viewGroup);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }
}
