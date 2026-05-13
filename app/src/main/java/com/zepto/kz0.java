package com.zepto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class kz0 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public static final a n = new a(null);
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public final boolean b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !et6.f(str);
        }

        public final kz0 c(ds2 url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[PHI: r1
          0x00d7: PHI (r1v24 long) = (r1v7 long), (r1v11 long) binds: [B:42:0x00d5, B:53:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.zepto.kz0 d(long r26, com.zepto.ds2 r28, java.lang.String r29) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.kz0.a.d(long, com.zepto.ds2, java.lang.String):com.zepto.kz0");
        }

        public final List e(ds2 url, pl2 headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listW = headers.w("Set-Cookie");
            int size = listW.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                kz0 kz0VarC = c(url, (String) listW.get(i));
                if (kz0VarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(kz0VarC);
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }

        public final String f(String str) {
            if (!(!StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strE = hr2.e(StringsKt__StringsKt.removePrefix(str, (CharSequence) "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        public final long g(String str, int i, int i2) {
            int iA = a(str, i, i2, false);
            Matcher matcher = kz0.m.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int iIndexOf$default = -1;
            int i6 = -1;
            int i7 = -1;
            while (iA < i2) {
                int iA2 = a(str, iA + 1, i2, true);
                matcher.region(iA, iA2);
                if (i4 == -1 && matcher.usePattern(kz0.m).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i6 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i7 = Integer.parseInt(strGroup3);
                } else if (i5 == -1 && matcher.usePattern(kz0.l).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(kz0.k).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                    if (strGroup5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strGroup5.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = kz0.k.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i3 == -1 && matcher.usePattern(kz0.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (!(i3 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i5 && 31 >= i5)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i4 >= 0 && 23 >= i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && 59 >= i6)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && 59 >= i7)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(et6.f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long h(String str) {
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                if (!new Regex("-?\\d+").matches(str)) {
                    throw e;
                }
                if (StringsKt__StringsJVMKt.startsWith$default(str, "-", false, 2, null)) {
                    return Long.MIN_VALUE;
                }
                return LongCompanionObject.MAX_VALUE;
            }
        }
    }

    public kz0(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof kz0) {
            kz0 kz0Var = (kz0) obj;
            if (Intrinsics.areEqual(kz0Var.a, this.a) && Intrinsics.areEqual(kz0Var.b, this.b) && kz0Var.c == this.c && Intrinsics.areEqual(kz0Var.d, this.d) && Intrinsics.areEqual(kz0Var.e, this.e) && kz0Var.f == this.f && kz0Var.g == this.g && kz0Var.h == this.h && kz0Var.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(fe1.b(new Date(this.c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.i);
    }

    public String toString() {
        return f(false);
    }

    public /* synthetic */ kz0(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }
}
