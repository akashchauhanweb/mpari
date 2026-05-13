package com.zepto;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xc0 {
    public final Map a;
    public final String b;

    public xc0(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.b = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.a.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.a.get("realm");
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof xc0) {
            xc0 xc0Var = (xc0) obj;
            if (Intrinsics.areEqual(xc0Var.b, this.b) && Intrinsics.areEqual(xc0Var.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        return this.b + " authParams=" + this.a;
    }
}
