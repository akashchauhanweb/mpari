package com.zepto;

import android.util.Base64;
import com.zepto.n10;

/* JADX INFO: loaded from: classes.dex */
public abstract class qn6 {

    public static abstract class a {
        public abstract qn6 a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(mv4 mv4Var);
    }

    public static a a() {
        return new n10.b().d(mv4.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract mv4 d();

    public boolean e() {
        return c() != null;
    }

    public qn6 f(mv4 mv4Var) {
        return a().b(b()).d(mv4Var).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
