package com.zepto;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class r62 {
    public static SimpleDateFormat U;
    public static SimpleDateFormat V;
    public static final e[] Z;
    public static final e[] a0;
    public static final e[] b0;
    public static final e[] c0;
    public static final e[] d0;
    public static final e e0;
    public static final e[] f0;
    public static final e[] g0;
    public static final e[] h0;
    public static final e[] i0;
    public static final e[][] j0;
    public static final e[] k0;
    public static final e l0;
    public static final e m0;
    public static final HashMap[] n0;
    public static final HashMap[] o0;
    public static final HashSet p0;
    public static final HashMap q0;
    public static final Charset r0;
    public static final byte[] s0;
    public static final byte[] t0;
    public static final Pattern u0;
    public static final Pattern v0;
    public static final Pattern w0;
    public static final Pattern x0;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public boolean e;
    public final HashMap[] f;
    public Set g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public static final boolean v = Log.isLoggable("ExifInterface", 3);
    public static final List w = Arrays.asList(1, 6, 3, 8);
    public static final List x = Arrays.asList(2, 7, 4, 5);
    public static final int[] y = {8, 8, 8};
    public static final int[] z = {4};
    public static final int[] A = {8};
    public static final byte[] B = {-1, -40, -1};
    public static final byte[] C = {102, 116, 121, 112};
    public static final byte[] D = {109, 105, 102, 49};
    public static final byte[] E = {104, 101, 105, 99};
    public static final byte[] F = {79, 76, 89, 77, 80, 0};
    public static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] I = {101, 88, 73, 102};
    public static final byte[] J = {73, 72, 68, 82};
    public static final byte[] K = {73, 69, 78, 68};
    public static final byte[] L = {82, 73, 70, 70};
    public static final byte[] M = {87, 69, 66, 80};
    public static final byte[] N = {69, 88, 73, 70};
    public static final byte[] O = {-99, 1, 42};
    public static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};

    public class a extends MediaDataSource {
        public long c;
        public final /* synthetic */ b e;

        public a(b bVar) {
            this.e = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.c;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.e.available())) {
                        return -1;
                    }
                    this.e.m(j);
                    this.c = j;
                }
                if (i2 > this.e.available()) {
                    i2 = this.e.available();
                }
                int i3 = this.e.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.c += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.c = -1L;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {
        public static final ByteOrder h = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder i = ByteOrder.BIG_ENDIAN;
        public DataInputStream c;
        public ByteOrder e;
        public final int f;
        public int g;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.c.available();
        }

        public int d() {
            return this.f;
        }

        public int e() {
            return this.g;
        }

        public long j() {
            return ((long) readInt()) & 4294967295L;
        }

        public void m(long j) throws IOException {
            int i2 = this.g;
            if (i2 > j) {
                this.g = 0;
                this.c.reset();
                this.c.mark(this.f);
            } else {
                j -= (long) i2;
            }
            int i3 = (int) j;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.c.mark(i2);
        }

        public void n(ByteOrder byteOrder) {
            this.e = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.g++;
            return this.c.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.g++;
            return this.c.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i2 = this.g + 1;
            this.g = i2;
            if (i2 > this.f) {
                throw new EOFException();
            }
            int i3 = this.c.read();
            if (i3 >= 0) {
                return (byte) i3;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.g += 2;
            return this.c.readChar();
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
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.g + i3;
            this.g = i4;
            if (i4 > this.f) {
                throw new EOFException();
            }
            if (this.c.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i2 = this.g + 4;
            this.g = i2;
            if (i2 > this.f) {
                throw new EOFException();
            }
            int i3 = this.c.read();
            int i4 = this.c.read();
            int i5 = this.c.read();
            int i6 = this.c.read();
            if ((i3 | i4 | i5 | i6) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == h) {
                return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
            }
            if (byteOrder == i) {
                return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i2 = this.g + 8;
            this.g = i2;
            if (i2 > this.f) {
                throw new EOFException();
            }
            int i3 = this.c.read();
            int i4 = this.c.read();
            int i5 = this.c.read();
            int i6 = this.c.read();
            int i7 = this.c.read();
            int i8 = this.c.read();
            int i9 = this.c.read();
            int i10 = this.c.read();
            if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == h) {
                return (((long) i10) << 56) + (((long) i9) << 48) + (((long) i8) << 40) + (((long) i7) << 32) + (((long) i6) << 24) + (((long) i5) << 16) + (((long) i4) << 8) + ((long) i3);
            }
            if (byteOrder == i) {
                return (((long) i3) << 56) + (((long) i4) << 48) + (((long) i5) << 40) + (((long) i6) << 32) + (((long) i7) << 24) + (((long) i8) << 16) + (((long) i9) << 8) + ((long) i10);
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i2 = this.g + 2;
            this.g = i2;
            if (i2 > this.f) {
                throw new EOFException();
            }
            int i3 = this.c.read();
            int i4 = this.c.read();
            if ((i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == h) {
                return (short) ((i4 << 8) + i3);
            }
            if (byteOrder == i) {
                return (short) ((i3 << 8) + i4);
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.g += 2;
            return this.c.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.g++;
            return this.c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i2 = this.g + 2;
            this.g = i2;
            if (i2 > this.f) {
                throw new EOFException();
            }
            int i3 = this.c.read();
            int i4 = this.c.read();
            if ((i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == h) {
                return (i4 << 8) + i3;
            }
            if (byteOrder == i) {
                return (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            int iMin = Math.min(i2, this.f - this.g);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.c.skipBytes(iMin - iSkipBytes);
            }
            this.g += iSkipBytes;
            return iSkipBytes;
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.e = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.c = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f = iAvailable;
            this.g = 0;
            this.c.mark(iAvailable);
            this.e = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.c.read(bArr, i2, i3);
            this.g += i4;
            return i4;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.g + bArr.length;
            this.g = length;
            if (length <= this.f) {
                if (this.c.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    public static class c extends FilterOutputStream {
        public final OutputStream c;
        public ByteOrder e;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.c = outputStream;
            this.e = byteOrder;
        }

        public void d(ByteOrder byteOrder) {
            this.e = byteOrder;
        }

        public void e(int i) throws IOException {
            this.c.write(i);
        }

        public void j(int i) throws IOException {
            ByteOrder byteOrder = this.e;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.c.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.c.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        public void m(short s) throws IOException {
            ByteOrder byteOrder = this.e;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.c.write(s & 255);
                this.c.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.c.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.c.write(s & 255);
            }
        }

        public void n(long j) throws IOException {
            j((int) j);
        }

        public void w(int i) throws IOException {
            m((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.c.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.c.write(bArr, i, i2);
        }
    }

    public static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(r62.r0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r62.X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d : dArr) {
                byteBufferWrap.putDouble(d);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r62.X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putInt(i);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r62.X[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.a);
                byteBufferWrap.putInt((int) fVar.b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(r62.r0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j, ByteOrder byteOrder) {
            return g(new long[]{j}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r62.X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r62.X[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.a);
                byteBufferWrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i, ByteOrder byteOrder) {
            return k(new int[]{i}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r62.X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                if (((long[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                if (((int[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i < fVarArr.length) {
                sb.append(fVarArr[i].a);
                sb.append('/');
                sb.append(fVarArr[i].b);
                i++;
                if (i != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object o(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.r62.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return r62.X[this.a] * this.b;
        }

        public String toString() {
            return "(" + r62.W[this.a] + ", data length:" + this.d.length + ")";
        }

        public d(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public e(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static class f {
        public final long a;
        public final long b;

        public f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }

        public f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        d0 = eVarArr5;
        e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        j0 = eVarArr10;
        k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        l0 = new e("JPEGInterchangeFormat", 513, 4);
        m0 = new e("JPEGInterchangeFormatLength", 514, 4);
        n0 = new HashMap[eVarArr10.length];
        o0 = new HashMap[eVarArr10.length];
        p0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        q0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        r0 = charsetForName;
        s0 = "Exif\u0000\u0000".getBytes(charsetForName);
        t0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr11 = j0;
            if (i >= eVarArr11.length) {
                HashMap map = q0;
                e[] eVarArr12 = k0;
                map.put(Integer.valueOf(eVarArr12[0].a), 5);
                map.put(Integer.valueOf(eVarArr12[1].a), 1);
                map.put(Integer.valueOf(eVarArr12[2].a), 2);
                map.put(Integer.valueOf(eVarArr12[3].a), 3);
                map.put(Integer.valueOf(eVarArr12[4].a), 7);
                map.put(Integer.valueOf(eVarArr12[5].a), 8);
                u0 = Pattern.compile(".*[1-9].*");
                v0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                w0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                x0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            n0[i] = new HashMap();
            o0[i] = new HashMap();
            for (e eVar : eVarArr11[i]) {
                n0[i].put(Integer.valueOf(eVar.a), eVar);
                o0[i].put(eVar.b, eVar);
            }
            i++;
        }
    }

    public r62(File file) throws Throwable {
        e[][] eVarArr = j0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        B(file.getAbsolutePath());
    }

    public static boolean D(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean I(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static boolean b0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterface", "Error closing fd.");
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] e(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static int f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return i;
            }
            i += i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    public static void g(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        while (i > 0) {
            int iMin = Math.min(i, ConstantsKt.DEFAULT_BUFFER_SIZE);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    public static Pair y(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairY = y(strArrSplit[0]);
            if (((Integer) pairY.first).intValue() == 2) {
                return pairY;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairY2 = y(strArrSplit[i]);
                int iIntValue = (((Integer) pairY2.first).equals(pairY.first) || ((Integer) pairY2.second).equals(pairY.first)) ? ((Integer) pairY.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairY.second).intValue() == -1 || !(((Integer) pairY2.first).equals(pairY.second) || ((Integer) pairY2.second).equals(pairY.second))) ? -1 : ((Integer) pairY.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairY = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairY = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairY;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    return (lValueOf.longValue() < 0 || lValueOf.longValue() > 65535) ? lValueOf.longValue() < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j = (long) Double.parseDouble(strArrSplit2[0]);
                long j2 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j >= 0 && j2 >= 0) {
                    if (j <= 2147483647L && j2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void A(b bVar, HashMap map) {
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrE = e(dVar.o(this.h));
        long[] jArrE2 = e(dVar2.o(this.h));
        if (jArrE == null || jArrE.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrE2 == null || jArrE2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrE.length != jArrE2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : jArrE2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.k = true;
        this.j = true;
        this.i = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrE.length; i4++) {
            int i5 = (int) jArrE[i4];
            int i6 = (int) jArrE2[i4];
            if (i4 < jArrE.length - 1 && i5 + i6 != jArrE[i4 + 1]) {
                this.k = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j3 = i7;
            if (bVar.skip(j3) != j3) {
                Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (bVar.read(bArr2) != i6) {
                Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.n = bArr;
        if (this.k) {
            this.l = (int) jArrE[0];
            this.m = i;
        }
    }

    public final void B(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (I(fileInputStream2.getFD())) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                N(fileInputStream2);
                d(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                d(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean C(byte[] bArr) throws Throwable {
        long j;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, C)) {
                        bVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j = 16;
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j2 = length - j;
                    if (j2 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z2 = false;
                    boolean z3 = false;
                    for (long j3 = 0; j3 < j2 / 4; j3++) {
                        if (bVar2.read(bArr3) != 4) {
                            bVar2.close();
                            return false;
                        }
                        if (j3 != 1) {
                            if (Arrays.equals(bArr3, D)) {
                                z2 = true;
                            } else if (Arrays.equals(bArr3, E)) {
                                z3 = true;
                            }
                            if (z2 && z3) {
                                bVar2.close();
                                return true;
                            }
                        }
                    }
                    bVar2.close();
                } catch (Exception e2) {
                    e = e2;
                    bVar = bVar2;
                    if (v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return false;
    }

    public final boolean E(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderQ = Q(bVar);
            this.h = byteOrderQ;
            bVar.n(byteOrderQ);
            short s = bVar.readShort();
            boolean z2 = s == 20306 || s == 21330;
            bVar.close();
            return z2;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean F(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public final boolean G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean H(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderQ = Q(bVar);
            this.h = byteOrderQ;
            bVar.n(byteOrderQ);
            boolean z2 = bVar.readShort() == 85;
            bVar.close();
            return z2;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean J(HashMap map) {
        d dVar;
        int iM;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.h);
            int[] iArr2 = y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.h)) == 1 && Arrays.equals(iArr, A)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean K() {
        int i = this.d;
        return i == 4 || i == 13 || i == 14;
    }

    public final boolean L(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.h) <= 512 && dVar2.m(this.h) <= 512;
    }

    public final boolean M(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public final void N(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < j0.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException e2) {
                    boolean z2 = v;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                    }
                    a();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (v) {
                    P();
                }
                throw th;
            }
        }
        if (!this.e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = o(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (this.e) {
            u(bVar);
        } else {
            switch (this.d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    s(bVar);
                    break;
                case 4:
                    n(bVar, 0, 0);
                    a();
                    if (v) {
                        P();
                        return;
                    }
                    return;
                case 7:
                    p(bVar);
                    break;
                case 9:
                    r(bVar);
                    a();
                    if (v) {
                        P();
                        return;
                    }
                    return;
                case 10:
                    t(bVar);
                    a();
                    if (v) {
                        P();
                        return;
                    }
                    return;
                case 12:
                    m(bVar);
                    break;
                case 13:
                    q(bVar);
                    a();
                    if (v) {
                        P();
                        return;
                    }
                    return;
                case 14:
                    x(bVar);
                    a();
                    if (v) {
                        P();
                        return;
                    }
                    return;
            }
        }
        bVar.m(this.p);
        a0(bVar);
        a();
        if (!v) {
            return;
        }
        P();
    }

    public final void O(b bVar, int i) throws IOException {
        ByteOrder byteOrderQ = Q(bVar);
        this.h = byteOrderQ;
        bVar.n(byteOrderQ);
        int unsignedShort = bVar.readUnsignedShort();
        int i2 = this.d;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i3 = bVar.readInt();
        if (i3 < 8 || i3 >= i) {
            throw new IOException("Invalid first Ifd offset: " + i3);
        }
        int i4 = i3 - 8;
        if (i4 <= 0 || bVar.skipBytes(i4) == i4) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i4);
    }

    public final void P() {
        for (int i = 0; i < this.f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f[i].size());
            for (Map.Entry entry : this.f[i].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.h) + "'");
            }
        }
    }

    public final ByteOrder Q(b bVar) throws IOException {
        short s = bVar.readShort();
        if (s == 18761) {
            if (v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    public final void R(byte[] bArr, int i) throws IOException {
        b bVar = new b(bArr);
        O(bVar, bArr.length);
        S(bVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(com.zepto.r62.b r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.r62.S(com.zepto.r62$b, int):void");
    }

    public final void T(String str) {
        for (int i = 0; i < j0.length; i++) {
            this.f[i].remove(str);
        }
    }

    public final void U(b bVar, int i) throws Throwable {
        d dVar = (d) this.f[i].get("ImageLength");
        d dVar2 = (d) this.f[i].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f[i].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f[i].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.h);
            int iM2 = dVar3.m(this.h);
            bVar.m(iM);
            byte[] bArr = new byte[iM2];
            bVar.read(bArr);
            n(new b(bArr), iM, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00da A[Catch: all -> 0x00ea, Exception -> 0x00ed, TryCatch #20 {Exception -> 0x00ed, all -> 0x00ea, blocks: (B:59:0x00d6, B:61:0x00da, B:68:0x00f7, B:67:0x00ef), top: B:111:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef A[Catch: all -> 0x00ea, Exception -> 0x00ed, TryCatch #20 {Exception -> 0x00ed, all -> 0x00ea, blocks: (B:59:0x00d6, B:61:0x00da, B:68:0x00f7, B:67:0x00ef), top: B:111:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.r62.V():void");
    }

    public final void W(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.e(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.e(-40);
        d dVar = (j("Xmp") == null || !this.u) ? null : (d) this.f[0].remove("Xmp");
        cVar.e(-1);
        cVar.e(-31);
        f0(cVar);
        if (dVar != null) {
            this.f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        while (dataInputStream.readByte() == -1) {
            byte b2 = dataInputStream.readByte();
            if (b2 == -39 || b2 == -38) {
                cVar.e(-1);
                cVar.e(b2);
                f(dataInputStream, cVar);
                return;
            }
            if (b2 != -31) {
                cVar.e(-1);
                cVar.e(b2);
                int unsignedShort = dataInputStream.readUnsignedShort();
                cVar.w(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = dataInputStream.read(bArr, 0, Math.min(i, ConstantsKt.DEFAULT_BLOCK_SIZE));
                    if (i2 >= 0) {
                        cVar.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, s0)) {
                        int i4 = unsignedShort2 - 8;
                        if (dataInputStream.skipBytes(i4) != i4) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                cVar.e(-1);
                cVar.e(b2);
                cVar.w(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i3 > 0) {
                    int i5 = dataInputStream.read(bArr, 0, Math.min(i3, ConstantsKt.DEFAULT_BLOCK_SIZE));
                    if (i5 >= 0) {
                        cVar.write(bArr, 0, i5);
                        i3 -= i5;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void X(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        g(dataInputStream, cVar, H.length);
        if (this.p == 0) {
            int i = dataInputStream.readInt();
            cVar.j(i);
            g(dataInputStream, cVar, i + 8);
        } else {
            g(dataInputStream, cVar, (r2 - r7.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                f0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.c).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.j((int) crc32.getValue());
                d(byteArrayOutputStream2);
                f(dataInputStream, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void Y(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        if (v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = L;
        g(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i5 = this.p;
                    if (i5 != 0) {
                        g(bVar, cVar2, (i5 - ((bArr.length + 4) + bArr2.length)) - 8);
                        bVar.skipBytes(4);
                        bVar.skipBytes(bVar.readInt());
                        f0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = P;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i6 = bVar.readInt();
                            byte[] bArr5 = new byte[i6 % 2 == 1 ? i6 + 1 : i6];
                            bVar.read(bArr5);
                            byte b2 = (byte) (8 | bArr5[0]);
                            bArr5[0] = b2;
                            boolean z2 = ((b2 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.j(i6);
                            cVar2.write(bArr5);
                            if (z2) {
                                h(bVar, cVar2, S, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, T)) {
                                        break;
                                    } else {
                                        i(bVar, cVar2, bArr6);
                                    }
                                }
                                f0(cVar2);
                            } else {
                                h(bVar, cVar2, R, Q);
                                f0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = R;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, Q)) {
                                int i7 = bVar.readInt();
                                int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(O, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = bVar.readInt();
                                    i2 = (i << 18) >> 18;
                                    i3 = (i << 2) >> 18;
                                    i8 -= 10;
                                    i4 = 0;
                                } else if (!Arrays.equals(bArr3, Q)) {
                                    i = 0;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i = bVar.readInt();
                                    i4 = i & 8;
                                    i8 -= 5;
                                    i3 = ((i << 4) >> 18) + 1;
                                    i2 = ((i << 18) >> 18) + 1;
                                }
                                cVar2.write(bArr4);
                                cVar2.j(10);
                                byte[] bArr10 = new byte[10];
                                byte b3 = (byte) (bArr10[0] | 8);
                                bArr10[0] = b3;
                                bArr10[0] = (byte) (b3 | (i4 << 4));
                                int i9 = i2 - 1;
                                int i10 = i3 - 1;
                                bArr10[4] = (byte) i9;
                                bArr10[5] = (byte) (i9 >> 8);
                                bArr10[6] = (byte) (i9 >> 16);
                                bArr10[7] = (byte) i10;
                                bArr10[8] = (byte) (i10 >> 8);
                                bArr10[9] = (byte) (i10 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.j(i7);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(O);
                                    cVar2.j(i);
                                } else if (Arrays.equals(bArr3, Q)) {
                                    cVar2.write(47);
                                    cVar2.j(i);
                                }
                                g(bVar, cVar2, i8);
                                f0(cVar2);
                            }
                        }
                    }
                    f(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = M;
                    cVar.j(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    d(byteArrayOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void Z(String str, String str2) {
        e eVar;
        int i;
        int i2;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = w0.matcher(strReplaceAll).find();
            boolean zFind2 = x0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i3 = 2;
        int i4 = 1;
        if (strReplaceAll != null && p0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = v0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < j0.length) {
            if ((i6 != 4 || this.i) && (eVar = (e) o0[i6].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair pairY = y(strReplaceAll);
                    int i7 = -1;
                    if (eVar.c == ((Integer) pairY.first).intValue() || eVar.c == ((Integer) pairY.second).intValue()) {
                        i = eVar.c;
                    } else {
                        int i8 = eVar.d;
                        if (i8 == -1 || !(i8 == ((Integer) pairY.first).intValue() || eVar.d == ((Integer) pairY.second).intValue())) {
                            int i9 = eVar.c;
                            if (i9 == i4 || i9 == 7 || i9 == i3) {
                                i = i9;
                            } else if (v) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str3);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb.append(strArr[eVar.c]);
                                sb.append(eVar.d == -1 ? "" : ", " + strArr[eVar.d]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) pairY.first).intValue()]);
                                sb.append(((Integer) pairY.second).intValue() != -1 ? ", " + strArr[((Integer) pairY.second).intValue()] : "");
                                sb.append(")");
                                Log.d("ExifInterface", sb.toString());
                            }
                        } else {
                            i = eVar.d;
                        }
                    }
                    switch (i) {
                        case 1:
                            i2 = i4;
                            this.f[i6].put(str3, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i2 = i4;
                            this.f[i6].put(str3, d.e(strReplaceAll));
                            break;
                        case 3:
                            i2 = i4;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                                iArr[i10] = Integer.parseInt(strArrSplit[i10]);
                            }
                            this.f[i6].put(str3, d.k(iArr, this.h));
                            break;
                        case 4:
                            i2 = i4;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i11 = 0; i11 < strArrSplit2.length; i11++) {
                                jArr[i11] = Long.parseLong(strArrSplit2[i11]);
                            }
                            this.f[i6].put(str3, d.g(jArr, this.h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i12 = 0;
                            while (i12 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i12].split("/", i7);
                                fVarArr[i12] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                i12++;
                                i7 = -1;
                            }
                            i2 = 1;
                            this.f[i6].put(str3, d.i(fVarArr, this.h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i13 = 0; i13 < strArrSplit5.length; i13++) {
                                iArr2[i13] = Integer.parseInt(strArrSplit5[i13]);
                            }
                            this.f[i6].put(str3, d.c(iArr2, this.h));
                            i2 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i14 = i5;
                            while (i14 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i14].split("/", -1);
                                fVarArr2[i14] = new f((long) Double.parseDouble(strArrSplit7[i5]), (long) Double.parseDouble(strArrSplit7[i4]));
                                i14++;
                                strArrSplit6 = strArrSplit6;
                                i5 = 0;
                                i4 = 1;
                            }
                            this.f[i6].put(str3, d.d(fVarArr2, this.h));
                            i2 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i15 = i5; i15 < strArrSplit8.length; i15++) {
                                dArr[i15] = Double.parseDouble(strArrSplit8[i15]);
                            }
                            this.f[i6].put(str3, d.b(dArr, this.h));
                            break;
                    }
                } else {
                    this.f[i6].remove(str3);
                }
                i2 = i4;
            } else {
                i2 = i4;
            }
            i6++;
            i4 = i2;
            i3 = 2;
            i5 = 0;
        }
    }

    public final void a() {
        String strJ = j("DateTimeOriginal");
        if (strJ != null && j("DateTime") == null) {
            this.f[0].put("DateTime", d.e(strJ));
        }
        if (j("ImageWidth") == null) {
            this.f[0].put("ImageWidth", d.f(0L, this.h));
        }
        if (j("ImageLength") == null) {
            this.f[0].put("ImageLength", d.f(0L, this.h));
        }
        if (j("Orientation") == null) {
            this.f[0].put("Orientation", d.f(0L, this.h));
        }
        if (j("LightSource") == null) {
            this.f[1].put("LightSource", d.f(0L, this.h));
        }
    }

    public final void a0(b bVar) throws Throwable {
        HashMap map = this.f[4];
        d dVar = (d) map.get("Compression");
        if (dVar == null) {
            this.o = 6;
            z(bVar, map);
            return;
        }
        int iM = dVar.m(this.h);
        this.o = iM;
        if (iM != 1) {
            if (iM == 6) {
                z(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (J(map)) {
            A(bVar, map);
        }
    }

    public final void c0(int i, int i2) throws Throwable {
        if (this.f[i].isEmpty() || this.f[i2].isEmpty()) {
            if (v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f[i].get("ImageLength");
        d dVar2 = (d) this.f[i].get("ImageWidth");
        d dVar3 = (d) this.f[i2].get("ImageLength");
        d dVar4 = (d) this.f[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = dVar.m(this.h);
        int iM2 = dVar2.m(this.h);
        int iM3 = dVar3.m(this.h);
        int iM4 = dVar4.m(this.h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap[] mapArr = this.f;
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void d0(b bVar, int i) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = (d) this.f[i].get("DefaultCropSize");
        d dVar2 = (d) this.f[i].get("SensorTopBorder");
        d dVar3 = (d) this.f[i].get("SensorLeftBorder");
        d dVar4 = (d) this.f[i].get("SensorBottomBorder");
        d dVar5 = (d) this.f[i].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                U(bVar, i);
                return;
            }
            int iM = dVar2.m(this.h);
            int iM2 = dVar4.m(this.h);
            int iM3 = dVar5.m(this.h);
            int iM4 = dVar3.m(this.h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.h);
            d dVarJ4 = d.j(iM3 - iM4, this.h);
            this.f[i].put("ImageLength", dVarJ3);
            this.f[i].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.h);
            dVarJ2 = d.h(fVarArr[1], this.h);
        } else {
            int[] iArr = (int[]) dVar.o(this.h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.h);
            dVarJ2 = d.j(iArr[1], this.h);
        }
        this.f[i].put("ImageWidth", dVarJ);
        this.f[i].put("ImageLength", dVarJ2);
    }

    public final void e0() throws Throwable {
        c0(0, 5);
        c0(0, 4);
        c0(5, 4);
        d dVar = (d) this.f[1].get("PixelXDimension");
        d dVar2 = (d) this.f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f[0].put("ImageWidth", dVar);
            this.f[0].put("ImageLength", dVar2);
        }
        if (this.f[4].isEmpty() && L(this.f[5])) {
            HashMap[] mapArr = this.f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (L(this.f[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    public final int f0(c cVar) throws IOException {
        e[][] eVarArr = j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : k0) {
            T(eVar.b);
        }
        T(l0.b);
        T(m0.b);
        for (int i = 0; i < j0.length; i++) {
            for (Object obj : this.f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f[1].isEmpty()) {
            this.f[0].put(k0[1].b, d.f(0L, this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(k0[2].b, d.f(0L, this.h));
        }
        if (!this.f[3].isEmpty()) {
            this.f[1].put(k0[3].b, d.f(0L, this.h));
        }
        if (this.i) {
            this.f[4].put(l0.b, d.f(0L, this.h));
            this.f[4].put(m0.b, d.f(this.m, this.h));
        }
        for (int i2 = 0; i2 < j0.length; i2++) {
            Iterator it = this.f[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int iP = ((d) ((Map.Entry) it.next()).getValue()).p();
                if (iP > 4) {
                    i3 += iP;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i4 = 0; i4 < j0.length; i4++) {
            if (!this.f[i4].isEmpty()) {
                iArr[i4] = size;
                size += (this.f[i4].size() * 12) + 6 + iArr2[i4];
            }
        }
        if (this.i) {
            this.f[4].put(l0.b, d.f(size, this.h));
            this.l = size;
            size += this.m;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (v) {
            for (int i5 = 0; i5 < j0.length; i5++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(this.f[i5].size()), Integer.valueOf(iArr2[i5]), Integer.valueOf(size)));
            }
        }
        if (!this.f[1].isEmpty()) {
            this.f[0].put(k0[1].b, d.f(iArr[1], this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(k0[2].b, d.f(iArr[2], this.h));
        }
        if (!this.f[3].isEmpty()) {
            this.f[1].put(k0[3].b, d.f(iArr[3], this.h));
        }
        int i6 = this.d;
        if (i6 == 4) {
            cVar.w(size);
            cVar.write(s0);
        } else if (i6 == 13) {
            cVar.j(size);
            cVar.write(I);
        } else if (i6 == 14) {
            cVar.write(N);
            cVar.j(size);
        }
        cVar.m(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.d(this.h);
        cVar.w(42);
        cVar.n(8L);
        for (int i7 = 0; i7 < j0.length; i7++) {
            if (!this.f[i7].isEmpty()) {
                cVar.w(this.f[i7].size());
                int size2 = iArr[i7] + 2 + (this.f[i7].size() * 12) + 4;
                for (Map.Entry entry2 : this.f[i7].entrySet()) {
                    int i8 = ((e) o0[i7].get(entry2.getKey())).a;
                    d dVar = (d) entry2.getValue();
                    int iP2 = dVar.p();
                    cVar.w(i8);
                    cVar.w(dVar.a);
                    cVar.j(dVar.b);
                    if (iP2 > 4) {
                        cVar.n(size2);
                        size2 += iP2;
                    } else {
                        cVar.write(dVar.d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.e(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i7 != 0 || this.f[4].isEmpty()) {
                    cVar.n(0L);
                } else {
                    cVar.n(iArr[4]);
                }
                Iterator it2 = this.f[i7].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.i) {
            cVar.write(w());
        }
        if (this.d == 14 && size % 2 == 1) {
            cVar.e(0);
        }
        cVar.d(ByteOrder.BIG_ENDIAN);
        return size;
    }

    public final void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = r0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final void i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i = bVar.readInt();
        cVar.write(bArr);
        cVar.j(i);
        if (i % 2 == 1) {
            i++;
        }
        g(bVar, cVar, i);
    }

    public String j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL != null) {
            if (!p0.contains(str)) {
                return dVarL.n(this.h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = dVarL.a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarL.a);
                    return null;
                }
                f[] fVarArr = (f[]) dVarL.o(this.h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.a / fVar.b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.a / fVar2.b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.a / fVar3.b)));
            }
            try {
                return Double.toString(dVarL.l(this.h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int k(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL == null) {
            return i;
        }
        try {
            return dVarL.m(this.h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final d l(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < j0.length; i++) {
            d dVar = (d) this.f[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void m(b bVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new a(bVar));
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata7)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
                strExtractMetadata3 = null;
            }
            if (strExtractMetadata != null) {
                this.f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.h));
            }
            if (strExtractMetadata2 != null) {
                this.f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata2), this.h));
            }
            if (strExtractMetadata3 != null) {
                int i = Integer.parseInt(strExtractMetadata3);
                this.f[0].put("Orientation", d.j(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.h));
            }
            if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                int i2 = Integer.parseInt(strExtractMetadata4);
                int i3 = Integer.parseInt(strExtractMetadata5);
                if (i3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.m(i2);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i4 = i2 + 6;
                int i5 = i3 - 6;
                if (!Arrays.equals(bArr, s0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i5];
                if (bVar.read(bArr2) != i5) {
                    throw new IOException("Can't read exif");
                }
                this.p = i4;
                R(bArr2, 0);
            }
            if (v) {
                Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(com.zepto.r62.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.r62.n(com.zepto.r62$b, int, int):void");
    }

    public final int o(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (D(bArr)) {
            return 4;
        }
        if (G(bArr)) {
            return 9;
        }
        if (C(bArr)) {
            return 12;
        }
        if (E(bArr)) {
            return 7;
        }
        if (H(bArr)) {
            return 10;
        }
        if (F(bArr)) {
            return 13;
        }
        return M(bArr) ? 14 : 0;
    }

    public final void p(b bVar) throws Throwable {
        int i;
        int i2;
        s(bVar);
        d dVar = (d) this.f[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.d);
            bVar2.n(this.h);
            byte[] bArr = F;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.m(0L);
            byte[] bArr3 = G;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.m(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.m(12L);
            }
            S(bVar2, 6);
            d dVar2 = (d) this.f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f[5].put("JPEGInterchangeFormat", dVar2);
                this.f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                d dVarJ = d.j(i5, this.h);
                d dVarJ2 = d.j(i6, this.h);
                this.f[0].put("ImageWidth", dVarJ);
                this.f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    public final void q(b bVar) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.n(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, K)) {
                    return;
                }
                if (Arrays.equals(bArr2, I)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.p = i2;
                        R(bArr3, 0);
                        e0();
                        a0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                bVar.skipBytes(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void r(b bVar) throws Throwable {
        boolean z2 = v;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.m(i);
        bVar.read(bArr4);
        n(new b(bArr4), i, 5);
        bVar.m(i3);
        bVar.n(ByteOrder.BIG_ENDIAN);
        int i4 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == e0.a) {
                short s = bVar.readShort();
                short s2 = bVar.readShort();
                d dVarJ = d.j(s, this.h);
                d dVarJ2 = d.j(s2, this.h);
                this.f[0].put("ImageLength", dVarJ);
                this.f[0].put("ImageWidth", dVarJ2);
                if (v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            bVar.skipBytes(unsignedShort2);
        }
    }

    public final void s(b bVar) throws Throwable {
        d dVar;
        O(bVar, bVar.available());
        S(bVar, 0);
        d0(bVar, 0);
        d0(bVar, 5);
        d0(bVar, 4);
        e0();
        if (this.d != 8 || (dVar = (d) this.f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(dVar.d);
        bVar2.n(this.h);
        bVar2.m(6L);
        S(bVar2, 9);
        d dVar2 = (d) this.f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f[1].put("ColorSpace", dVar2);
        }
    }

    public final void t(b bVar) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        s(bVar);
        d dVar = (d) this.f[0].get("JpgFromRaw");
        if (dVar != null) {
            n(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = (d) this.f[0].get("ISO");
        d dVar3 = (d) this.f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f[1].put("PhotographicSensitivity", dVar2);
    }

    public final void u(b bVar) throws IOException {
        byte[] bArr = s0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.p = bArr.length;
        R(bArr2, 0);
    }

    public byte[] v() {
        int i = this.o;
        if (i == 6 || i == 7) {
            return w();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] w() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r9.n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r9.c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L59
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto Lab
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L9d
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            d(r1)
            return r2
        L2f:
            java.lang.String r1 = r9.a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            if (r1 == 0) goto L44
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.lang.String r3 = r9.a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto Lab
        L3f:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L9d
        L44:
            java.io.FileDescriptor r1 = r9.b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r8 = r3
            r3 = r1
            r1 = r8
        L59:
            int r4 = r9.l     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r5 = r9.p     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            long r4 = r1.skip(r4)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r6 = r9.l     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r7 = r9.p     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L90
            int r4 = r9.m     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r6 = r1.read(r4)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            int r7 = r9.m     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r6 != r7) goto L8a
            r9.n = r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            d(r1)
            if (r3 == 0) goto L85
            c(r3)
        L85:
            return r4
        L86:
            r0 = move-exception
            goto L1e
        L88:
            r4 = move-exception
            goto L9d
        L8a:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            throw r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L90:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            throw r4     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L96:
            r0 = move-exception
            r3 = r1
            goto Lab
        L99:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L9d:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L86
            d(r1)
            if (r3 == 0) goto Laa
            c(r3)
        Laa:
            return r2
        Lab:
            d(r2)
            if (r3 == 0) goto Lb3
            c(r3)
        Lb3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.r62.w():byte[]");
    }

    public final void x(b bVar) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.n(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(L.length);
        int i = bVar.readInt() + 8;
        int iSkipBytes = bVar.skipBytes(M.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = bVar.readInt();
                int i3 = iSkipBytes + 8;
                if (Arrays.equals(N, bArr)) {
                    byte[] bArr2 = new byte[i2];
                    if (bVar.read(bArr2) == i2) {
                        this.p = i3;
                        R(bArr2, 0);
                        a0(new b(bArr2));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                int i4 = i3 + i2;
                if (i4 == i) {
                    return;
                }
                if (i4 > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = bVar.skipBytes(i2);
                if (iSkipBytes2 != i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i3 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void z(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.h);
        int iM2 = dVar2.m(this.h);
        if (this.d == 7) {
            iM += this.q;
        }
        int iMin = Math.min(iM2, bVar.d() - iM);
        if (iM > 0 && iMin > 0) {
            this.i = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[iMin];
                bVar.skip(iM);
                bVar.read(bArr);
                this.n = bArr;
            }
            this.l = iM;
            this.m = iMin;
        }
        if (v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iMin);
        }
    }

    public r62(String str) throws Throwable {
        e[][] eVarArr = j0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            B(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }
}
