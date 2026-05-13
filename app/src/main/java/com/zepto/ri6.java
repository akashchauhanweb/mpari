package com.zepto;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ri6 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public ri6(String str, String str2) {
        this.a = d(str2, str);
        this.b = str;
        this.c = str + "!" + str2;
    }

    public static ri6 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new ri6(strArrSplit[0], strArrSplit[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ri6)) {
            return false;
        }
        ri6 ri6Var = (ri6) obj;
        return this.a.equals(ri6Var.a) && this.b.equals(ri6Var.b);
    }

    public int hashCode() {
        return if4.b(this.b, this.a);
    }
}
