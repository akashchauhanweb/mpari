package com.zepto;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class z76 implements xm6 {
    public final Pattern a;
    public final String b;

    public z76() {
        this(",");
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String[] b(String str) {
        return d(str, this.b);
    }

    public final String[] d(String str, String str2) {
        String[] strArrSplit = this.a.split(str);
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3 != null) {
                strArrSplit[i] = str3.trim();
            }
        }
        return strArrSplit;
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String a(String[] strArr) {
        return f(strArr, this.b);
    }

    public final String f(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(str);
                    sb.append(' ');
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public z76(String str) {
        this.a = Pattern.compile(str);
        this.b = str;
    }
}
