package com.zepto;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fo3 implements wj1 {
    public static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int n;
    public byte[] a = new byte[8];
    public long[] m = new long[80];
    public int b = 0;

    public fo3() {
        r();
    }

    @Override // com.zepto.wj1
    public void d(byte[] bArr, int i, int i2) {
        while (this.b != 0 && i2 > 0) {
            e(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.a.length) {
            q(bArr, i);
            byte[] bArr2 = this.a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.c += (long) bArr2.length;
        }
        while (i2 > 0) {
            e(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // com.zepto.wj1
    public void e(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            q(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    public final long g(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    public final long h(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public final long i(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    public final long j(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    public final long k(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public final long l(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    public final void m() {
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
    }

    public void n() {
        m();
        long j = this.c << 3;
        long j2 = this.d;
        byte b = ByteCompanionObject.MIN_VALUE;
        while (true) {
            e(b);
            if (this.b == 0) {
                p(j, j2);
                o();
                return;
            }
            b = 0;
        }
    }

    public void o() {
        m();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.m;
            long j = j(jArr[i - 2]);
            long[] jArr2 = this.m;
            jArr[i] = j + jArr2[i - 7] + i(jArr2[i - 15]) + this.m[i - 16];
        }
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        long j6 = this.i;
        long j7 = this.j;
        long j8 = this.k;
        long j9 = j7;
        long j10 = j5;
        int i2 = 0;
        long jK = j3;
        long j11 = j4;
        long j12 = j6;
        int i3 = 0;
        long j13 = this.l;
        long j14 = j2;
        long j15 = j8;
        while (i3 < 10) {
            long j16 = j12;
            long jL = l(j12) + g(j12, j9, j15);
            long[] jArr3 = o;
            int i4 = i2 + 1;
            long j17 = j13 + jL + jArr3[i2] + this.m[i2];
            long j18 = j10 + j17;
            long jK2 = j17 + k(j14) + h(j14, jK, j11);
            int i5 = i2 + 2;
            long jL2 = j15 + l(j18) + g(j18, j16, j9) + jArr3[i4] + this.m[i4];
            long j19 = j11 + jL2;
            long jK3 = jL2 + k(jK2) + h(jK2, j14, jK);
            int i6 = i2 + 3;
            long jL3 = j9 + l(j19) + g(j19, j18, j16) + jArr3[i5] + this.m[i5];
            long j20 = jK + jL3;
            long jK4 = jL3 + k(jK3) + h(jK3, jK2, j14);
            int i7 = i2 + 4;
            long jL4 = j16 + l(j20) + g(j20, j19, j18) + jArr3[i6] + this.m[i6];
            long j21 = j14 + jL4;
            long jK5 = jL4 + k(jK4) + h(jK4, jK3, jK2);
            int i8 = i2 + 5;
            long jL5 = j18 + l(j21) + g(j21, j20, j19) + jArr3[i7] + this.m[i7];
            long j22 = jK2 + jL5;
            long jK6 = jL5 + k(jK5) + h(jK5, jK4, jK3);
            int i9 = i2 + 6;
            long jL6 = j19 + l(j22) + g(j22, j21, j20) + jArr3[i8] + this.m[i8];
            long j23 = jK3 + jL6;
            long jK7 = jL6 + k(jK6) + h(jK6, jK5, jK4);
            j15 = j23;
            int i10 = i2 + 7;
            long jL7 = j20 + l(j23) + g(j23, j22, j21) + jArr3[i9] + this.m[i9];
            long j24 = jK4 + jL7;
            j9 = j24;
            jK = jL7 + k(jK7) + h(jK7, jK6, jK5);
            i2 += 8;
            long jL8 = j21 + l(j24) + g(j24, j15, j22) + jArr3[i10] + this.m[i10];
            long jK8 = jL8 + k(jK) + h(jK, jK7, jK6);
            i3++;
            j12 = jK5 + jL8;
            j11 = jK7;
            j13 = j22;
            j10 = jK6;
            j14 = jK8;
        }
        this.e += j14;
        this.f += jK;
        this.g += j11;
        this.h += j10;
        this.i += j12;
        this.j += j9;
        this.k += j15;
        this.l += j13;
        this.n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.m[i11] = 0;
        }
    }

    public void p(long j, long j2) {
        if (this.n > 14) {
            o();
        }
        long[] jArr = this.m;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void q(byte[] bArr, int i) {
        this.m[this.n] = vk4.b(bArr, i);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            o();
        }
    }

    public void r() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }
}
