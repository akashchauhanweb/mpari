package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class kg1 implements t56 {
    public static final t56 a = new kg1();

    @Override // com.zepto.t56
    public boolean a(int i, int i2, int i3, char[] cArr, no4[] no4VarArr) {
        char cB = b(i2, cArr, no4VarArr);
        if (cB <= ' ' || cB == '-' || cB == 8208) {
            return true;
        }
        if (cB < 8194) {
            return false;
        }
        if (cB >= 8194 && cB <= 8203) {
            return true;
        }
        if (cB >= 11904 && cB < 55200) {
            return true;
        }
        if (cB >= 63744 && cB < 64256) {
            return true;
        }
        if (cB < 65072 || cB >= 65104) {
            return cB >= 65377 && cB < 65440;
        }
        return true;
    }

    public char b(int i, char[] cArr, no4[] no4VarArr) {
        return no4VarArr == null ? cArr[i] : (char) no4VarArr[Math.min(i, no4VarArr.length - 1)].i(cArr[i]);
    }
}
