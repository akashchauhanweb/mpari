package com.zepto;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q03 {
    public static byte[] a(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE)};
    }
}
