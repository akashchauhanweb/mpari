package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class av5 {
    public static final int a(int[] binarySearch, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = binarySearch[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int b(zu5 segment, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$segment");
        int iA = a(segment.y(), i + 1, 0, segment.z().length);
        return iA >= 0 ? iA : ~iA;
    }
}
