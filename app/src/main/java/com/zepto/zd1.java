package com.zepto;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zd1 {
    public static String a(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strD = d(j);
        if (z) {
            strD = String.format(context.getString(b15.q), strD);
        }
        return z2 ? String.format(context.getString(b15.p), strD) : z3 ? String.format(context.getString(b15.m), strD) : strD;
    }

    public static String b(long j) {
        return c(j, Locale.getDefault());
    }

    public static String c(long j, Locale locale) {
        return xs6.d(locale).format(new Date(j));
    }

    public static String d(long j) {
        return i(j) ? b(j) : g(j);
    }

    public static String e(Context context, int i) {
        return xs6.g().get(1) == i ? String.format(context.getString(b15.n), Integer.valueOf(i)) : String.format(context.getString(b15.o), Integer.valueOf(i));
    }

    public static String f(long j) {
        return xs6.k(Locale.getDefault()).format(new Date(j));
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        return xs6.l(locale).format(new Date(j));
    }

    public static boolean i(long j) {
        Calendar calendarG = xs6.g();
        Calendar calendarI = xs6.i();
        calendarI.setTimeInMillis(j);
        return calendarG.get(1) == calendarI.get(1);
    }
}
