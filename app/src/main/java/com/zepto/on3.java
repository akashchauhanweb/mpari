package com.zepto;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class on3 extends Writer {
    public final String c;
    public StringBuilder e = new StringBuilder(128);

    public on3(String str) {
        this.c = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.e.length() > 0) {
            Log.d(this.c, this.e.toString());
            StringBuilder sb = this.e;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                d();
            } else {
                this.e.append(c);
            }
        }
    }
}
