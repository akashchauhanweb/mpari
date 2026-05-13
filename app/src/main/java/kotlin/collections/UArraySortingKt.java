package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m461partitionnroSd4(long[] jArr, int i, int i2) {
        long jM240getsVKNKU = ULongArray.m240getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(ULongArray.m240getsVKNKU(jArr, i), jM240getsVKNKU) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ULongArray.m240getsVKNKU(jArr, i2), jM240getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM240getsVKNKU2 = ULongArray.m240getsVKNKU(jArr, i);
                ULongArray.m245setk8EXiF4(jArr, i, ULongArray.m240getsVKNKU(jArr, i2));
                ULongArray.m245setk8EXiF4(jArr, i2, jM240getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m462partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM82getw2LRezQ = UByteArray.m82getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM82getw2LRezQ = UByteArray.m82getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i3 = bM82getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM82getw2LRezQ, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m82getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM82getw2LRezQ2 = UByteArray.m82getw2LRezQ(bArr, i);
                UByteArray.m87setVurrAj0(bArr, i, UByteArray.m82getw2LRezQ(bArr, i2));
                UByteArray.m87setVurrAj0(bArr, i2, bM82getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m463partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM345getMh2AYeg = UShortArray.m345getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM345getMh2AYeg = UShortArray.m345getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM345getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM345getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m345getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM345getMh2AYeg2 = UShortArray.m345getMh2AYeg(sArr, i);
                UShortArray.m350set01HTLdE(sArr, i, UShortArray.m345getMh2AYeg(sArr, i2));
                UShortArray.m350set01HTLdE(sArr, i2, sM345getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m464partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM161getpVg5ArA = UIntArray.m161getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(UIntArray.m161getpVg5ArA(iArr, i), iM161getpVg5ArA) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(UIntArray.m161getpVg5ArA(iArr, i2), iM161getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM161getpVg5ArA2 = UIntArray.m161getpVg5ArA(iArr, i);
                UIntArray.m166setVXSXFK8(iArr, i, UIntArray.m161getpVg5ArA(iArr, i2));
                UIntArray.m166setVXSXFK8(iArr, i2, iM161getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m465quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM461partitionnroSd4 = m461partitionnroSd4(jArr, i, i2);
        int i3 = iM461partitionnroSd4 - 1;
        if (i < i3) {
            m465quickSortnroSd4(jArr, i, i3);
        }
        if (iM461partitionnroSd4 < i2) {
            m465quickSortnroSd4(jArr, iM461partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m466quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM462partition4UcCI2c = m462partition4UcCI2c(bArr, i, i2);
        int i3 = iM462partition4UcCI2c - 1;
        if (i < i3) {
            m466quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM462partition4UcCI2c < i2) {
            m466quickSort4UcCI2c(bArr, iM462partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m467quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM463partitionAa5vz7o = m463partitionAa5vz7o(sArr, i, i2);
        int i3 = iM463partitionAa5vz7o - 1;
        if (i < i3) {
            m467quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM463partitionAa5vz7o < i2) {
            m467quickSortAa5vz7o(sArr, iM463partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m468quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM464partitionoBK06Vg = m464partitionoBK06Vg(iArr, i, i2);
        int i3 = iM464partitionoBK06Vg - 1;
        if (i < i3) {
            m468quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM464partitionoBK06Vg < i2) {
            m468quickSortoBK06Vg(iArr, iM464partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m469sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m465quickSortnroSd4(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m470sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m466quickSort4UcCI2c(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m471sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m467quickSortAa5vz7o(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m472sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m468quickSortoBK06Vg(array, i, i2 - 1);
    }
}
