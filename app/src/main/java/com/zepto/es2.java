package com.zepto;

import kotlin.KotlinVersion;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class es2 {
    public static final int[] a;
    public static final byte[] b;
    public static final a c;
    public static final es2 d;

    public static final class a {
        public final a[] a;
        public final int b;
        public final int c;

        public a() {
            this.a = new a[256];
            this.b = 0;
            this.c = 0;
        }

        public final a[] a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public a(int i, int i2) {
            this.a = null;
            this.b = i;
            int i3 = i2 & 7;
            this.c = i3 == 0 ? 8 : i3;
        }
    }

    static {
        es2 es2Var = new es2();
        d = es2Var;
        a = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        b = bArr;
        c = new a();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            es2Var.a(i, a[i], b[i]);
        }
    }

    public final void a(int i, int i2, int i3) {
        a aVar = new a(i, i3);
        a aVar2 = c;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & KotlinVersion.MAX_COMPONENT_VALUE;
            a[] aVarArrA = aVar2.a();
            Intrinsics.checkNotNull(aVarArrA);
            a aVar3 = aVarArrA[i4];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrA[i4] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & KotlinVersion.MAX_COMPONENT_VALUE;
        a[] aVarArrA2 = aVar2.a();
        Intrinsics.checkNotNull(aVarArrA2);
        ArraysKt___ArraysJvmKt.fill(aVarArrA2, aVar, i6, (1 << i5) + i6);
    }

    public final void b(a80 source, long j, z70 sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = c;
        int iB = 0;
        int iC = 0;
        for (long j2 = 0; j2 < j; j2++) {
            iB = (iB << 8) | et6.b(source.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            iC += 8;
            while (iC >= 8) {
                int i = iC - 8;
                int i2 = (iB >>> i) & KotlinVersion.MAX_COMPONENT_VALUE;
                a[] aVarArrA = aVar.a();
                Intrinsics.checkNotNull(aVarArrA);
                aVar = aVarArrA[i2];
                Intrinsics.checkNotNull(aVar);
                if (aVar.a() == null) {
                    sink.J(aVar.b());
                    iC -= aVar.c();
                    aVar = c;
                } else {
                    iC = i;
                }
            }
        }
        while (iC > 0) {
            int i3 = (iB << (8 - iC)) & KotlinVersion.MAX_COMPONENT_VALUE;
            a[] aVarArrA2 = aVar.a();
            Intrinsics.checkNotNull(aVarArrA2);
            a aVar2 = aVarArrA2[i3];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.a() != null || aVar2.c() > iC) {
                return;
            }
            sink.J(aVar2.b());
            iC -= aVar2.c();
            aVar = c;
        }
    }

    public final void c(t80 source, z70 sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iT = source.t();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < iT; i2++) {
            int iB = et6.b(source.e(i2), KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = a[iB];
            byte b2 = b[iB];
            j = (j << b2) | ((long) i3);
            i += b2;
            while (i >= 8) {
                i -= 8;
                sink.J((int) (j >> i));
            }
        }
        if (i > 0) {
            sink.J((int) ((j << (8 - i)) | (255 >>> i)));
        }
    }

    public final int d(t80 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int iT = bytes.t();
        long j = 0;
        for (int i = 0; i < iT; i++) {
            j += (long) b[et6.b(bytes.e(i), KotlinVersion.MAX_COMPONENT_VALUE)];
        }
        return (int) ((j + ((long) 7)) >> 3);
    }
}
