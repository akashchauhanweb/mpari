package com.zepto;

import com.zepto.o96;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dh5 implements o96.c {
    public final String a;
    public final File b;
    public final Callable c;
    public final o96.c d;

    public dh5(String str, File file, Callable callable, o96.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.a = str;
        this.b = file;
        this.c = callable;
        this.d = mDelegate;
    }

    @Override // com.zepto.o96.c
    public o96 a(o96.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new ch5(configuration.a, this.a, this.b, this.c, configuration.c.a, this.d.a(configuration));
    }
}
