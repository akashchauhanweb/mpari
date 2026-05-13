package com.zepto;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class pb2 implements ob2 {
    public final BufferedOutputStream a;
    public final FileDescriptor b;
    public final RandomAccessFile c;

    public pb2(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.c = randomAccessFile;
        this.b = randomAccessFile.getFD();
        this.a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    public static ob2 d(File file) {
        return new pb2(file);
    }

    @Override // com.zepto.ob2
    public void a(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    @Override // com.zepto.ob2
    public void b() throws IOException {
        this.a.flush();
        this.b.sync();
    }

    @Override // com.zepto.ob2
    public void c(long j) throws IOException {
        this.c.seek(j);
    }

    @Override // com.zepto.ob2
    public void close() throws IOException {
        this.a.close();
        this.c.close();
    }
}
