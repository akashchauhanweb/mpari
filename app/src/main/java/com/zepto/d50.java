package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class d50 implements di2 {
    public long[] a;

    @Override // com.zepto.di2
    public void a(byte[] bArr) {
        this.a = fi2.d(bArr);
    }

    @Override // com.zepto.di2
    public void b(long j, byte[] bArr) {
        long[] jArrL = fi2.l();
        if (j > 0) {
            long[] jArr = new long[2];
            fi2.f(this.a, jArr);
            do {
                if ((1 & j) != 0) {
                    fi2.j(jArrL, jArr);
                }
                fi2.m(jArr, jArr);
                j >>>= 1;
            } while (j > 0);
        }
        fi2.b(jArrL, bArr);
    }
}
