package com.zepto;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qr2 {
    public static final String[] d;
    public static final qr2 e = new qr2();
    public static final t80 a = t80.h.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.checkNotNullExpressionValue(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = StringsKt__StringsJVMKt.replace$default(et6.q("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = Intrinsics.stringPlus(strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + "|" + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + "|" + strArr3[i4] + "|PADDED";
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public final String a(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : d[i2];
            }
            if (i != 7 && i != 8) {
                String[] strArr = c;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = d[i2];
                }
                String str2 = str;
                return (i != 5 || (i2 & 4) == 0) ? (i != 0 || (i2 & 32) == 0) ? str2 : StringsKt__StringsJVMKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt__StringsJVMKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return d[i2];
    }

    public final String b(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : et6.q("0x%02x", Integer.valueOf(i));
    }

    public final String c(boolean z, int i, int i2, int i3, int i4) {
        return et6.q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b(i3), a(i3, i4));
    }
}
