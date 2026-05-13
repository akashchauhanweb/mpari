package com.zepto;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j31 {
    public static final j31 a = new j31();

    public static final String a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + t80.h.c(username + ':' + password, charset).a();
    }
}
