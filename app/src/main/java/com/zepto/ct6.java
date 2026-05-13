package com.zepto;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ct6 {
    public static final boolean a(u70 isProbablyUtf8) {
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            u70 u70Var = new u70();
            isProbablyUtf8.m0(u70Var, 0L, RangesKt___RangesKt.coerceAtMost(isProbablyUtf8.L0(), 64L));
            for (int i = 0; i < 16; i++) {
                if (u70Var.I()) {
                    return true;
                }
                int iJ0 = u70Var.J0();
                if (Character.isISOControl(iJ0) && !Character.isWhitespace(iJ0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
