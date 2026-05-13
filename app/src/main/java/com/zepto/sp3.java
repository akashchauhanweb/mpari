package com.zepto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.AccessController;
import java.security.PrivilegedAction;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public class sp3 {
    public MappedByteBuffer a = null;
    public FileChannel b = null;

    public static class a implements PrivilegedAction {
        public final /* synthetic */ ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean run() {
            Boolean bool = Boolean.FALSE;
            try {
                Method method = this.a.getClass().getMethod("cleaner", null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(this.a, null);
                objInvoke.getClass().getMethod("clean", null).invoke(objInvoke, null);
                return Boolean.TRUE;
            } catch (Exception unused) {
                return bool;
            }
        }
    }

    public sp3(String str, String str2) throws IOException {
        if (str2.equals("rw")) {
            d(new RandomAccessFile(str, str2).getChannel(), FileChannel.MapMode.READ_WRITE);
        } else {
            d(new FileInputStream(str).getChannel(), FileChannel.MapMode.READ_ONLY);
        }
    }

    public static boolean a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.isDirect()) {
            return false;
        }
        return ((Boolean) AccessController.doPrivileged(new a(byteBuffer))).booleanValue();
    }

    public void b() throws IOException {
        a(this.a);
        this.a = null;
        FileChannel fileChannel = this.b;
        if (fileChannel != null) {
            fileChannel.close();
        }
        this.b = null;
    }

    public long c() {
        return this.a.position();
    }

    public final void d(FileChannel fileChannel, FileChannel.MapMode mapMode) throws IOException {
        this.b = fileChannel;
        MappedByteBuffer map = fileChannel.map(mapMode, 0L, fileChannel.size());
        this.a = map;
        map.load();
    }

    public long e() {
        return this.a.limit();
    }

    public int f() {
        try {
            return this.a.get() & UByte.MAX_VALUE;
        } catch (BufferUnderflowException unused) {
            return -1;
        }
    }

    public void finalize() throws Throwable {
        b();
        super.finalize();
    }

    public int g(byte[] bArr, int i, int i2) {
        int iPosition = this.a.position();
        int iLimit = this.a.limit();
        if (iPosition == iLimit) {
            return -1;
        }
        if ((iPosition + i2) - i > iLimit) {
            i2 = iLimit - iPosition;
        }
        this.a.get(bArr, i, i2);
        return i2;
    }

    public void h(long j) {
        this.a.position((int) j);
    }
}
