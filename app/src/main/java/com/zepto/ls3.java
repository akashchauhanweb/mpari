package com.zepto;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class ls3 {
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;
    public static final a g = new a(null);
    public static final Pattern e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ls3 a(String toMediaType) {
            Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            Matcher matcher = ls3.e.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + Typography.quote).toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strGroup.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (strGroup2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strGroup2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = ls3.f.matcher(toMediaType);
            int iEnd = matcher.end();
            while (iEnd < toMediaType.length()) {
                matcher2.region(iEnd, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = toMediaType.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(toMediaType);
                    sb.append(Typography.quote);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt__StringsJVMKt.startsWith$default(strGroup4, "'", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new ls3(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final ls3 b(String toMediaTypeOrNull) {
            Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public ls3(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public static /* synthetic */ Charset d(ls3 ls3Var, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return ls3Var.c(charset);
    }

    public static final ls3 e(String str) {
        return g.a(str);
    }

    public static final ls3 g(String str) {
        return g.b(str);
    }

    public final Charset c(Charset charset) {
        String strF = f("charset");
        if (strF == null) {
            return charset;
        }
        try {
            return Charset.forName(strF);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ls3) && Intrinsics.areEqual(((ls3) obj).a, this.a);
    }

    public final String f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        IntProgression intProgressionStep = RangesKt___RangesKt.step(ArraysKt___ArraysKt.getIndices(this.d), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step >= 0) {
            if (first > last) {
                return null;
            }
        } else if (first < last) {
            return null;
        }
        while (!StringsKt__StringsJVMKt.equals(this.d[first], name, true)) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return this.d[first + 1];
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ ls3(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
