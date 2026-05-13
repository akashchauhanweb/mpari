package com.zepto;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class lx2 {
    public static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final b a;

    public static class a {
        public final ByteBuffer a;

        public a(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public short a(int i) {
            return this.a.getShort(i);
        }

        public int b(int i) {
            return this.a.getInt(i);
        }

        public int c() {
            return this.a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    public interface b {
        int a(byte[] bArr, int i);

        short b();

        int c();

        long skip(long j);
    }

    public static class c implements b {
        public final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.zepto.lx2.b
        public int a(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.a.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }

        @Override // com.zepto.lx2.b
        public short b() {
            return (short) (this.a.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.zepto.lx2.b
        public int c() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.zepto.lx2.b
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.a.skip(j2);
                if (jSkip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    public lx2(InputStream inputStream) {
        this.a = new c(inputStream);
    }

    public static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public static void b(r62 r62Var, int i, int i2, String str) throws Throwable {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            r62 r62Var2 = new r62(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String strJ = r62Var.j(str2);
                if (!TextUtils.isEmpty(strJ)) {
                    r62Var2.Z(str2, strJ);
                }
            }
            r62Var2.Z("ImageWidth", String.valueOf(i));
            r62Var2.Z("ImageLength", String.valueOf(i2));
            r62Var2.Z("Orientation", "0");
            r62Var2.V();
        } catch (IOException e) {
            Log.d("ImageHeaderParser", e.getMessage());
        }
    }

    public static boolean d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    public static int g(a aVar) {
        ByteOrder byteOrder;
        short sA = aVar.a(6);
        if (sA == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sA == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.d(byteOrder);
        int iB = aVar.b(10) + 6;
        short sA2 = aVar.a(iB);
        for (int i = 0; i < sA2; i++) {
            int iA = a(iB, i);
            short sA3 = aVar.a(iA);
            if (sA3 == 274) {
                short sA4 = aVar.a(iA + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = aVar.b(iA + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i2 = iB2 + c[sA4];
                        if (i2 <= 4) {
                            int i3 = iA + 8;
                            if (i3 >= 0 && i3 <= aVar.c()) {
                                if (i2 >= 0 && i2 + i3 <= aVar.c()) {
                                    return aVar.a(i3);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    Log.d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    public int c() {
        int iC = this.a.c();
        if (d(iC)) {
            int iF = f();
            if (iF != -1) {
                return h(new byte[iF], iF);
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + iC);
        }
        return -1;
    }

    public final boolean e(byte[] bArr, int i) {
        boolean z = bArr != null && i > b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = b;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    public final int f() {
        short sB;
        int iC;
        long j;
        long jSkip;
        do {
            short sB2 = this.a.b();
            if (sB2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) sB2));
                }
                return -1;
            }
            sB = this.a.b();
            if (sB == 218) {
                return -1;
            }
            if (sB == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iC = this.a.c() - 2;
            if (sB == 225) {
                return iC;
            }
            j = iC;
            jSkip = this.a.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) sB) + ", wanted to skip: " + iC + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    public final int h(byte[] bArr, int i) {
        int iA = this.a.a(bArr, i);
        if (iA == i) {
            if (e(bArr, i)) {
                return g(new a(bArr, i));
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iA);
        }
        return -1;
    }
}
