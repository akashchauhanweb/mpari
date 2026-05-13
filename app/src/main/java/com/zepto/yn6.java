package com.zepto;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yn6 implements Closeable {

    public interface a {
        yn6 a();

        a b(Context context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d().close();
    }

    public abstract d52 d();

    public abstract xn6 e();
}
