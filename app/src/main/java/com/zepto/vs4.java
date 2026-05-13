package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class vs4 extends ByteArrayOutputStream {
    private static final int DEFAULT_SIZE = 256;
    private final n80 mPool;

    public vs4(n80 n80Var) {
        this(n80Var, DEFAULT_SIZE);
    }

    private void expand(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] buf = this.mPool.getBuf((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, buf, 0, ((ByteArrayOutputStream) this).count);
        this.mPool.returnBuf(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = buf;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mPool.returnBuf(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.mPool.returnBuf(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        expand(i2);
        super.write(bArr, i, i2);
    }

    public vs4(n80 n80Var, int i) {
        this.mPool = n80Var;
        ((ByteArrayOutputStream) this).buf = n80Var.getBuf(Math.max(i, DEFAULT_SIZE));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        expand(1);
        super.write(i);
    }
}
