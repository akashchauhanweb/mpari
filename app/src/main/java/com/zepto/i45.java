package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class i45 implements DataInput {
    public sp3 c;
    public RandomAccessFile e;
    public boolean f;
    public String g;
    public byte[] h;
    public int i;
    public byte j;
    public boolean k;
    public int l;

    public i45(String str, boolean z, boolean z2) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        this.k = false;
        this.l = 0;
        this.f = z2;
        File file = new File(str);
        if (!file.canRead()) {
            if (str.startsWith("file:/") || str.startsWith("http://") || str.startsWith("https://") || str.startsWith("jar:") || str.startsWith("wsjar:")) {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                try {
                    this.h = a(inputStreamOpenStream);
                    try {
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } finally {
                    try {
                        inputStreamOpenStream.close();
                    } catch (IOException unused2) {
                    }
                }
            }
            InputStream inputStreamQ = s40.q(str);
            if (inputStreamQ == null) {
                throw new IOException(dt3.b("1.not.found.as.file.or.resource", str));
            }
            try {
                this.h = a(inputStreamQ);
                try {
                    return;
                } catch (IOException unused3) {
                    return;
                }
            } finally {
                try {
                    inputStreamQ.close();
                } catch (IOException unused4) {
                }
            }
        }
        if (z) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                this.h = a(fileInputStream);
                try {
                    fileInputStream.close();
                    return;
                } catch (Exception unused5) {
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                throw th;
            }
        }
        this.g = str;
        if (z2) {
            this.e = new RandomAccessFile(str, "r");
            return;
        }
        try {
            this.c = new sp3(str, "r");
        } catch (IOException e) {
            if (!b(e)) {
                throw e;
            }
            this.f = true;
            this.e = new RandomAccessFile(str, "r");
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 1) {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static boolean b(IOException iOException) {
        return iOException.getMessage().indexOf("Map failed") >= 0;
    }

    public int c() throws IOException {
        int filePointer;
        int i;
        d();
        boolean z = this.k;
        if (this.h == null) {
            filePointer = ((int) (this.f ? this.e.getFilePointer() : this.c.c())) - (z ? 1 : 0);
            i = this.l;
        } else {
            filePointer = this.i - (z ? 1 : 0);
            i = this.l;
        }
        return filePointer - i;
    }

    public void close() throws IOException {
        this.k = false;
        sp3 sp3Var = this.c;
        if (sp3Var != null) {
            sp3Var.b();
            this.c = null;
            this.f = true;
        } else {
            RandomAccessFile randomAccessFile = this.e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.e = null;
            }
        }
    }

    public void d() throws IOException {
        if (this.g != null && this.c == null && this.e == null) {
            f();
        }
    }

    public int e() throws IOException {
        int length;
        int i;
        byte[] bArr = this.h;
        if (bArr == null) {
            d();
            length = (int) (this.f ? this.e.length() : this.c.e());
            i = this.l;
        } else {
            length = bArr.length;
            i = this.l;
        }
        return length - i;
    }

    public void f() throws IOException {
        String str = this.g;
        if (str != null && this.c == null && this.e == null) {
            if (this.f) {
                this.e = new RandomAccessFile(this.g, "r");
            } else {
                this.c = new sp3(str, "r");
            }
        }
        j(0);
    }

    public final int g() throws EOFException {
        int i = read();
        int i2 = read();
        int i3 = read();
        int i4 = read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        throw new EOFException();
    }

    public final short h() throws EOFException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (short) ((i2 << 8) + i);
        }
        throw new EOFException();
    }

    public final int i() throws EOFException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (i2 << 8) + i;
        }
        throw new EOFException();
    }

    public void j(int i) throws IOException {
        int i2 = i + this.l;
        this.k = false;
        if (this.h != null) {
            this.i = i2;
            return;
        }
        d();
        if (this.f) {
            this.e.seek(i2);
        } else {
            this.c.h(i2);
        }
    }

    public int read() {
        byte b;
        if (this.k) {
            this.k = false;
            b = this.j;
        } else {
            byte[] bArr = this.h;
            if (bArr == null) {
                return this.f ? this.e.read() : this.c.f();
            }
            int i = this.i;
            if (i >= bArr.length) {
                return -1;
            }
            this.i = i + 1;
            b = bArr[i];
        }
        return b & UByte.MAX_VALUE;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws EOFException {
        int i = read();
        if (i >= 0) {
            return i != 0;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public byte readByte() throws EOFException {
        int i = read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() throws EOFException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (char) ((i << 8) + i2);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws EOFException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public int readInt() throws EOFException {
        int i = read();
        int i2 = read();
        int i3 = read();
        int i4 = read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            i = read();
            if (i != -1 && i != 10) {
                if (i != 13) {
                    stringBuffer.append((char) i);
                } else {
                    int iC = c();
                    if (read() != 10) {
                        j(iC);
                    }
                }
            }
            z = true;
        }
        if (i == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public long readLong() {
        return (((long) readInt()) << 32) + (((long) readInt()) & 4294967295L);
    }

    @Override // java.io.DataInput
    public short readShort() throws EOFException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (short) ((i << 8) + i2);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return DataInputStream.readUTF(this);
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws EOFException {
        int i = read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws EOFException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (i << 8) + i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        int i2 = 0;
        if (i <= 0) {
            return 0;
        }
        if (this.k) {
            this.k = false;
            i2 = 1;
            if (i == 1) {
                return 1;
            }
            i--;
        }
        int iC = c();
        int iE = e();
        int i3 = i + iC;
        if (i3 <= iE) {
            iE = i3;
        }
        j(iE);
        return (iE - iC) + i2;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new EOFException();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.k) {
            this.k = false;
            i3 = 1;
            if (i2 == 1) {
                bArr[i] = this.j;
                return 1;
            }
            bArr[i] = this.j;
            i2--;
            i++;
        }
        byte[] bArr2 = this.h;
        if (bArr2 == null) {
            return (this.f ? this.e.read(bArr, i, i2) : this.c.g(bArr, i, i2)) + i3;
        }
        int i4 = this.i;
        if (i4 >= bArr2.length) {
            return -1;
        }
        if (i4 + i2 > bArr2.length) {
            i2 = bArr2.length - i4;
        }
        System.arraycopy(bArr2, i4, bArr, i, i2);
        this.i += i2;
        return i2 + i3;
    }

    public i45(byte[] bArr) {
        this.k = false;
        this.l = 0;
        this.h = bArr;
    }

    public i45(i45 i45Var) {
        this.k = false;
        this.l = 0;
        this.g = i45Var.g;
        this.h = i45Var.h;
        this.l = i45Var.l;
        this.f = i45Var.f;
    }
}
