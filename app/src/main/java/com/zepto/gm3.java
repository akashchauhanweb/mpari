package com.zepto;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class gm3 {
    public static gm3 b(df3 df3Var) {
        return new hm3(df3Var, ((dr7) df3Var).b0());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
