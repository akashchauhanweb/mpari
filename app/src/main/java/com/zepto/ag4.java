package com.zepto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ag4 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final d36 b(File appendingSink) {
        Intrinsics.checkNotNullParameter(appendingSink, "$this$appendingSink");
        return zf4.g(new FileOutputStream(appendingSink, true));
    }

    public static final boolean c(AssertionError isAndroidGetsocknameError) {
        String message;
        Intrinsics.checkNotNullParameter(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        return (isAndroidGetsocknameError.getCause() == null || (message = isAndroidGetsocknameError.getMessage()) == null || !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null)) ? false : true;
    }

    public static final d36 d(File sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        return zf4.g(new FileOutputStream(sink, z));
    }

    public static final d36 e(OutputStream sink) {
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        return new tj4(sink, new cg6());
    }

    public static final d36 f(Socket sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        g46 g46Var = new g46(sink);
        OutputStream outputStream = sink.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        return g46Var.v(new tj4(outputStream, g46Var));
    }

    public static /* synthetic */ d36 g(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return zf4.f(file, z);
    }

    public static final y46 h(File source) {
        Intrinsics.checkNotNullParameter(source, "$this$source");
        return zf4.k(new FileInputStream(source));
    }

    public static final y46 i(InputStream source) {
        Intrinsics.checkNotNullParameter(source, "$this$source");
        return new gz2(source, new cg6());
    }

    public static final y46 j(Socket source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "$this$source");
        g46 g46Var = new g46(source);
        InputStream inputStream = source.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        return g46Var.w(new gz2(inputStream, g46Var));
    }
}
