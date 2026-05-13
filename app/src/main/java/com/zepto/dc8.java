package com.zepto;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class dc8 {
    public static long a(gc8 gc8Var, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        int i = dataInputStream.readInt();
        if (i != -771763713) {
            String strValueOf = String.valueOf(String.format("%x", Integer.valueOf(i)));
            throw new ac8(strValueOf.length() != 0 ? "Unexpected magic=".concat(strValueOf) : new String("Unexpected magic="));
        }
        int i2 = dataInputStream.read();
        if (i2 != 4) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(i2);
            throw new ac8(sb.toString());
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    outputStream.flush();
                    return j2;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, gc8Var, outputStream, unsignedShort2, unsignedShort, j3);
                        break;
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, gc8Var, outputStream, unsignedShort3, unsignedShort, j3);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, gc8Var, outputStream, unsignedShort4, unsignedShort, j3);
                        break;
                    case 252:
                        long j4 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, gc8Var, outputStream, j4, unsignedShort, j3);
                        break;
                        break;
                    case 253:
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, gc8Var, outputStream, j5, unsignedShort, j3);
                        break;
                    case 254:
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, gc8Var, outputStream, j6, unsignedShort, j3);
                        break;
                    case KotlinVersion.MAX_COMPONENT_VALUE /* 255 */:
                        long j7 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, gc8Var, outputStream, j7, unsignedShort, j3);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                }
                j2 += (long) unsignedShort;
            } catch (Throwable th) {
                outputStream.flush();
                throw th;
            }
        }
    }

    public static void b(byte[] bArr, gc8 gc8Var, OutputStream outputStream, long j, int i, long j2) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 > j2) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream inputStreamJ = new jc8(gc8Var, j, j3).j();
            while (i > 0) {
                try {
                    int iMin = Math.min(i, 16384);
                    int i2 = 0;
                    while (i2 < iMin) {
                        int i3 = inputStreamJ.read(bArr, i2, iMin - i2);
                        if (i3 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i2 += i3;
                    }
                    outputStream.write(bArr, 0, iMin);
                    i -= iMin;
                } finally {
                    try {
                        inputStreamJ.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            inputStreamJ.close();
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int iMin = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
