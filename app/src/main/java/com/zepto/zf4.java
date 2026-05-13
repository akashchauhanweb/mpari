package com.zepto;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zf4 {
    public static final d36 a(File file) {
        return ag4.b(file);
    }

    public static final d36 b() {
        return bg4.a();
    }

    public static final z70 c(d36 d36Var) {
        return bg4.b(d36Var);
    }

    public static final a80 d(y46 y46Var) {
        return bg4.c(y46Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return ag4.c(assertionError);
    }

    public static final d36 f(File file, boolean z) {
        return ag4.d(file, z);
    }

    public static final d36 g(OutputStream outputStream) {
        return ag4.e(outputStream);
    }

    public static final d36 h(Socket socket) {
        return ag4.f(socket);
    }

    public static final y46 j(File file) {
        return ag4.h(file);
    }

    public static final y46 k(InputStream inputStream) {
        return ag4.i(inputStream);
    }

    public static final y46 l(Socket socket) {
        return ag4.j(socket);
    }
}
