package com.zepto;

import java.io.Reader;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s94 {
    public static mx4 a = qx4.a();

    public static cz2 a(c52 c52Var) {
        return new x94(c52Var).d();
    }

    public static cz2 b(Reader reader) {
        return a(a.a(reader));
    }

    public static oj4 c(Writer writer, hf2 hf2Var) {
        return new z94(writer, hf2Var).i();
    }
}
