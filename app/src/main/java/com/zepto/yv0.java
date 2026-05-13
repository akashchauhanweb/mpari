package com.zepto;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yv0 {

    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static lm3 a(Configuration configuration) {
        return lm3.h(a.a(configuration));
    }
}
