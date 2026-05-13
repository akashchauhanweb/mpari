package com.zepto;

import java.security.MessageDigest;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public abstract class yo4 {
    public static final byte[] a = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, ByteCompanionObject.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};
    public static final byte[] b = {115, 65, 108, 84};
    public static final byte[] c = {-1, -1, -1, -1};
    public static long d = System.currentTimeMillis();

    public static byte[] a() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jFreeMemory = Runtime.getRuntime().freeMemory();
            StringBuilder sb = new StringBuilder();
            sb.append(jCurrentTimeMillis);
            sb.append("+");
            sb.append(jFreeMemory);
            sb.append("+");
            long j = d;
            d = 1 + j;
            sb.append(j);
            return messageDigest.digest(sb.toString().getBytes());
        } catch (Exception e) {
            throw new p52(e);
        }
    }

    public static rp4 b(byte[] bArr) {
        o80 o80Var = new o80(90);
        o80Var.e('[').e(Typography.less);
        for (int i = 0; i < 16; i++) {
            o80Var.U(bArr[i]);
        }
        o80Var.e(Typography.greater).e(Typography.less);
        byte[] bArrA = a();
        for (int i2 = 0; i2 < 16; i2++) {
            o80Var.U(bArrA[i2]);
        }
        o80Var.e(Typography.greater).e(']');
        return new jp4(o80Var.y0());
    }
}
