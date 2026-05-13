package com.zepto;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final byte[] a(String asUtf8ToByteArray) {
        Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] toUtf8String) {
        Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, Charsets.UTF_8);
    }
}
