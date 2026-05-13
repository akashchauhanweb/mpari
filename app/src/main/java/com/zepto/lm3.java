package com.zepto;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lm3 {
    public static final lm3 b = a(new Locale[0]);
    public final mm3 a;

    public static class a {
        public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strA = lw2.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(lw2.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public lm3(mm3 mm3Var) {
        this.a = mm3Var;
    }

    public static lm3 a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static lm3 b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(strArrSplit[i]);
        }
        return a(localeArr);
    }

    public static lm3 d() {
        return b;
    }

    public static lm3 h(LocaleList localeList) {
        return new lm3(new nm3(localeList));
    }

    public Locale c(int i) {
        return this.a.get(i);
    }

    public boolean e() {
        return this.a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof lm3) && this.a.equals(((lm3) obj).a);
    }

    public int f() {
        return this.a.size();
    }

    public String g() {
        return this.a.a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
