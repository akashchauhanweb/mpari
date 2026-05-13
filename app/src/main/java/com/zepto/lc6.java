package com.zepto;

import java.lang.reflect.Array;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class lc6 implements ei2 {
    public byte[] a;
    public long[][] b;

    @Override // com.zepto.ei2
    public void a(byte[] bArr) {
        if (this.b == null) {
            this.b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (fi2.a(this.a, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.a = bArr2;
        fi2.e(bArr, bArr2);
        fi2.c(this.a, this.b[1]);
        long[] jArr = this.b[1];
        fi2.k(jArr, jArr);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr2 = this.b;
            fi2.g(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.b;
            fi2.s(jArr3[i], jArr3[1], jArr3[i + 1]);
        }
    }

    @Override // com.zepto.ei2
    public void b(byte[] bArr) {
        long[] jArr = this.b[bArr[15] & UByte.MAX_VALUE];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.b[bArr[i] & UByte.MAX_VALUE];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        vk4.i(j, bArr, 0);
        vk4.i(j2, bArr, 8);
    }
}
