package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class he5 {
    public static final String a(int i) {
        return b(i);
    }

    public static final String b(int i) {
        int i2 = 0;
        int i3 = 1;
        if (i < 1) {
            throw new NumberFormatException(dt3.b("you.can.t.translate.a.negative.number.into.an.alphabetical.value", new Object[0]));
        }
        int i4 = i - 1;
        int i5 = 26;
        while (true) {
            int i6 = i5 + i2;
            if (i4 < i6) {
                break;
            }
            i3++;
            i5 *= 26;
            i2 = i6;
        }
        int i7 = i4 - i2;
        char[] cArr = new char[i3];
        while (i3 > 0) {
            i3--;
            cArr[i3] = (char) ((i7 % 26) + 97);
            i7 /= 26;
        }
        return new String(cArr);
    }

    public static final String c(int i, boolean z) {
        return z ? a(i) : d(i);
    }

    public static final String d(int i) {
        return b(i).toUpperCase();
    }
}
