package com.zepto;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class pp4 {
    public static uo4 a(HashMap map, pq4 pq4Var) {
        if (map.isEmpty()) {
            return null;
        }
        Integer[] numArr = (Integer[]) map.keySet().toArray(new Integer[map.size()]);
        Arrays.sort(numArr);
        if (numArr.length <= 64) {
            uo4 uo4Var = new uo4();
            ko4 ko4Var = new ko4();
            for (int i = 0; i < numArr.length; i++) {
                ko4Var.m(new op4(numArr[i].intValue()));
                ko4Var.m((rp4) map.get(numArr[i]));
            }
            uo4Var.r(lp4.o6, ko4Var);
            return uo4Var;
        }
        int length = (numArr.length + 63) / 64;
        gp4[] gp4VarArr = new gp4[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 64;
            int iMin = Math.min(i3 + 64, numArr.length);
            uo4 uo4Var2 = new uo4();
            ko4 ko4Var2 = new ko4();
            ko4Var2.m(new op4(numArr[i3].intValue()));
            ko4Var2.m(new op4(numArr[iMin - 1].intValue()));
            uo4Var2.r(lp4.o5, ko4Var2);
            ko4 ko4Var3 = new ko4();
            while (i3 < iMin) {
                ko4Var3.m(new op4(numArr[i3].intValue()));
                ko4Var3.m((rp4) map.get(numArr[i3]));
                i3++;
            }
            uo4Var2.r(lp4.o6, ko4Var3);
            gp4VarArr[i2] = pq4Var.n(uo4Var2).a();
        }
        int i4 = 64;
        while (length > 64) {
            i4 *= 64;
            int length2 = ((numArr.length + i4) - 1) / i4;
            int i5 = 0;
            while (i5 < length2) {
                int i6 = i5 * 64;
                int iMin2 = Math.min(i6 + 64, length);
                uo4 uo4Var3 = new uo4();
                ko4 ko4Var4 = new ko4();
                ko4Var4.m(new op4(numArr[i5 * i4].intValue()));
                int i7 = i5 + 1;
                ko4Var4.m(new op4(numArr[Math.min(i7 * i4, numArr.length) - 1].intValue()));
                uo4Var3.r(lp4.o5, ko4Var4);
                ko4 ko4Var5 = new ko4();
                while (i6 < iMin2) {
                    ko4Var5.m(gp4VarArr[i6]);
                    i6++;
                }
                uo4Var3.r(lp4.a5, ko4Var5);
                gp4VarArr[i5] = pq4Var.n(uo4Var3).a();
                i5 = i7;
            }
            length = length2;
        }
        ko4 ko4Var6 = new ko4();
        for (int i8 = 0; i8 < length; i8++) {
            ko4Var6.m(gp4VarArr[i8]);
        }
        uo4 uo4Var4 = new uo4();
        uo4Var4.r(lp4.a5, ko4Var6);
        return uo4Var4;
    }
}
