package com.zepto;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u76 {
    public static final u76 a = new u76();

    public final boolean a(FileChannel fileChannel, FileChannel fileChannel2) throws Exception {
        ByteBuffer byteBuffer;
        ByteBuffer atomBytes = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long jE = 0;
        ByteBuffer byteBuffer2 = null;
        long jPosition = 0;
        int i = 0;
        while (true) {
            Intrinsics.checkNotNullExpressionValue(atomBytes, "atomBytes");
            if (!b(fileChannel, atomBytes)) {
                break;
            }
            jE = me4.e(atomBytes.getInt());
            i = atomBytes.getInt();
            if (i == ny.e()) {
                int iD = me4.d(jE);
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(iD).order(ByteOrder.BIG_ENDIAN);
                atomBytes.rewind();
                byteBufferOrder.put(atomBytes);
                if (fileChannel.read(byteBufferOrder) < iD - 8) {
                    byteBuffer2 = byteBufferOrder;
                    break;
                }
                byteBufferOrder.flip();
                jPosition = fileChannel.position();
                byteBuffer2 = byteBufferOrder;
            } else {
                if (jE == 1) {
                    atomBytes.clear();
                    if (!b(fileChannel, atomBytes)) {
                        break;
                    }
                    jE = me4.f(atomBytes.getLong());
                    byteBuffer = byteBuffer2;
                    fileChannel.position((fileChannel.position() + jE) - ((long) 16));
                } else {
                    byteBuffer = byteBuffer2;
                    fileChannel.position((fileChannel.position() + jE) - ((long) 8));
                }
                byteBuffer2 = byteBuffer;
            }
            if (i != ny.d() && i != ny.f() && i != ny.g() && i != ny.h() && i != ny.j() && i != ny.k() && i != ny.n() && i != ny.i() && i != ny.m() && i != ny.e()) {
                Log.wtf("StreamableVideo", "encountered non-QT top-level atom (is this a QuickTime file?)");
                break;
            }
            if (jE < 8) {
                break;
            }
        }
        if (i != ny.h()) {
            Log.wtf("StreamableVideo", "last atom in file was not a moov atom");
            return false;
        }
        int iD2 = me4.d(jE);
        long j = iD2;
        long size = fileChannel.size() - j;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(iD2).order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder2, "allocate(moovAtomSize).order(ByteOrder.BIG_ENDIAN)");
        if (!c(fileChannel, byteBufferOrder2, size)) {
            throw new Exception("failed to read moov atom");
        }
        if (byteBufferOrder2.getInt(12) == ny.b()) {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        for (int i2 = 8; byteBufferOrder2.remaining() >= i2; i2 = 8) {
            int iPosition = byteBufferOrder2.position();
            int i3 = byteBufferOrder2.getInt(iPosition + 4);
            if (i3 == ny.l() || i3 == ny.c()) {
                long j2 = size;
                if (me4.e(byteBufferOrder2.getInt(iPosition)) > byteBufferOrder2.remaining()) {
                    throw new Exception("bad atom size");
                }
                byteBufferOrder2.position(iPosition + 12);
                if (byteBufferOrder2.remaining() < 4) {
                    throw new Exception("malformed atom");
                }
                int iC = me4.c(byteBufferOrder2.getInt());
                if (i3 == ny.l()) {
                    Log.i("StreamableVideo", "patching stco atom...");
                    if (byteBufferOrder2.remaining() < iC * 4) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (int i4 = 0; i4 < iC; i4++) {
                        int i5 = byteBufferOrder2.getInt(byteBufferOrder2.position());
                        int i6 = i5 + iD2;
                        if (i5 < 0 && i6 >= 0) {
                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                        }
                        byteBufferOrder2.putInt(i6);
                    }
                } else if (i3 == ny.c()) {
                    Log.wtf("StreamableVideo", "patching co64 atom...");
                    if (byteBufferOrder2.remaining() < iC * 8) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (int i7 = 0; i7 < iC; i7++) {
                        byteBufferOrder2.putLong(byteBufferOrder2.getLong(byteBufferOrder2.position()) + j);
                    }
                }
                size = j2;
            } else {
                byteBufferOrder2.position(byteBufferOrder2.position() + 1);
            }
        }
        long j3 = size;
        fileChannel.position(jPosition);
        if (byteBuffer2 != null) {
            Log.i("StreamableVideo", "writing ftyp atom...");
            byteBuffer2.rewind();
            fileChannel2.write(byteBuffer2);
        }
        Log.i("StreamableVideo", "writing moov atom...");
        byteBufferOrder2.rewind();
        fileChannel2.write(byteBufferOrder2);
        Log.i("StreamableVideo", "copying rest of file...");
        fileChannel.transferTo(jPosition, j3 - jPosition, fileChannel2);
        return true;
    }

    public final boolean b(FileChannel fileChannel, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.clear();
        int i = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return i == byteBuffer.capacity();
    }

    public final boolean c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        byteBuffer.clear();
        int i = fileChannel.read(byteBuffer, j);
        byteBuffer.flip();
        return i == byteBuffer.capacity();
    }

    public final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf("StreamableVideo", "Failed to close file: ");
            }
        }
    }

    public final boolean e(File file, File out) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileChannel infile;
        Intrinsics.checkNotNullParameter(out, "out");
        Closeable closeable = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                infile = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(out);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            FileChannel outfile = fileOutputStream.getChannel();
            Intrinsics.checkNotNullExpressionValue(infile, "infile");
            Intrinsics.checkNotNullExpressionValue(outfile, "outfile");
            boolean zA = a(infile, outfile);
            d(fileInputStream);
            d(fileOutputStream);
            if (!zA) {
                out.delete();
            }
            return zA;
        } catch (Throwable th3) {
            th = th3;
            closeable = fileInputStream;
            d(closeable);
            d(fileOutputStream);
            out.delete();
            throw th;
        }
    }
}
