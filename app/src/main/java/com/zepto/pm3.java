package com.zepto;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class pm3 implements xm6 {
    public final Pattern a = Pattern.compile("_");

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Locale b(String str) throws a13 {
        String[] strArrSplit = this.a.split(str);
        if (strArrSplit.length >= 1) {
            return d(strArrSplit);
        }
        throw new a13("Invalid locale %s", str);
    }

    public final Locale d(String[] strArr) {
        String[] strArr2 = {"", "", ""};
        for (int i = 0; i < 3; i++) {
            if (i < strArr.length) {
                strArr2[i] = strArr[i];
            }
        }
        return new Locale(strArr2[0], strArr2[1], strArr2[2]);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String a(Locale locale) {
        return locale.toString();
    }
}
