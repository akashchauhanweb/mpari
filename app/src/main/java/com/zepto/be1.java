package com.zepto;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public enum be1 {
    FULL("yyyy-MM-dd HH:mm:ss.S z"),
    LONG("yyyy-MM-dd HH:mm:ss z"),
    NORMAL("yyyy-MM-dd z"),
    SHORT("yyyy-MM-dd");

    public a c;

    public static class a {
        public SimpleDateFormat a;

        public a(String str) {
            this.a = new SimpleDateFormat(str);
        }

        public synchronized Date a(String str) {
            return this.a.parse(str);
        }

        public synchronized String b(Date date) {
            return this.a.format(date);
        }
    }

    be1(String str) {
        this.c = new a(str);
    }

    public static Date a(String str) {
        return d(str).b().a(str);
    }

    public static String c(Date date) {
        return FULL.b().b(date);
    }

    public static be1 d(String str) {
        int length = str.length();
        return length > 23 ? FULL : length > 20 ? LONG : length > 11 ? NORMAL : SHORT;
    }

    public final a b() {
        return this.c;
    }
}
