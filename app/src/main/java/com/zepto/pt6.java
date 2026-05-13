package com.zepto;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class pt6 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static pt6 d;
    public final wq0 a;

    public pt6(wq0 wq0Var) {
        this.a = wq0Var;
    }

    public static pt6 c() {
        return d(z96.b());
    }

    public static pt6 d(wq0 wq0Var) {
        if (d == null) {
            d = new pt6(wq0Var);
        }
        return d;
    }

    public static boolean g(String str) {
        return c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(hr4 hr4Var) {
        return TextUtils.isEmpty(hr4Var.b()) || hr4Var.h() + hr4Var.c() < b() + b;
    }
}
