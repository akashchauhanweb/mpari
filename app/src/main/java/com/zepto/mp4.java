package com.zepto;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mp4 {
    public static uo4 a(HashMap map, pq4 pq4Var) {
        if (map.isEmpty()) {
            return null;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strArr);
        int i = 64;
        if (strArr.length <= 64) {
            uo4 uo4Var = new uo4();
            ko4 ko4Var = new ko4();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                ko4Var.m(new hq4(strArr[i2], null));
                ko4Var.m((rp4) map.get(strArr[i2]));
            }
            uo4Var.r(lp4.Z5, ko4Var);
            return uo4Var;
        }
        int length = (strArr.length + 63) / 64;
        gp4[] gp4VarArr = new gp4[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 64;
            int iMin = Math.min(i4 + 64, strArr.length);
            uo4 uo4Var2 = new uo4();
            ko4 ko4Var2 = new ko4();
            ko4Var2.m(new hq4(strArr[i4], null));
            ko4Var2.m(new hq4(strArr[iMin - 1], null));
            uo4Var2.r(lp4.o5, ko4Var2);
            ko4 ko4Var3 = new ko4();
            while (i4 < iMin) {
                ko4Var3.m(new hq4(strArr[i4], null));
                ko4Var3.m((rp4) map.get(strArr[i4]));
                i4++;
            }
            uo4Var2.r(lp4.Z5, ko4Var3);
            gp4VarArr[i3] = pq4Var.n(uo4Var2).a();
        }
        int i5 = 64;
        while (length > i) {
            i5 *= i;
            int length2 = ((strArr.length + i5) - 1) / i5;
            int i6 = 0;
            while (i6 < length2) {
                int i7 = i6 * 64;
                int iMin2 = Math.min(i7 + 64, length);
                uo4 uo4Var3 = new uo4();
                ko4 ko4Var4 = new ko4();
                ko4Var4.m(new hq4(strArr[i6 * i5], null));
                int i8 = i6 + 1;
                ko4Var4.m(new hq4(strArr[Math.min(i8 * i5, strArr.length) - 1], null));
                uo4Var3.r(lp4.o5, ko4Var4);
                ko4 ko4Var5 = new ko4();
                while (i7 < iMin2) {
                    ko4Var5.m(gp4VarArr[i7]);
                    i7++;
                }
                uo4Var3.r(lp4.a5, ko4Var5);
                gp4VarArr[i6] = pq4Var.n(uo4Var3).a();
                i6 = i8;
                i = 64;
            }
            length = length2;
        }
        ko4 ko4Var6 = new ko4();
        for (int i9 = 0; i9 < length; i9++) {
            ko4Var6.m(gp4VarArr[i9]);
        }
        uo4 uo4Var4 = new uo4();
        uo4Var4.r(lp4.a5, ko4Var6);
        return uo4Var4;
    }
}
