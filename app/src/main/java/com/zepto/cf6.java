package com.zepto;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf6 {
    public static final Locale a = new Locale("", "");

    public static class a {
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
