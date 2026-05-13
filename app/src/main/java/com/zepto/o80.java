package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public class o80 extends OutputStream {
    public static int f;
    public static byte[][] g = new byte[0][];
    public static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final byte[] i = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static boolean j = false;
    public static final DecimalFormatSymbols k = new DecimalFormatSymbols(Locale.US);
    public int c;
    public byte[] e;

    public o80() {
        this(128);
    }

    public static String e0(double d) {
        return k0(d, null);
    }

    public static String k0(double d, o80 o80Var) {
        boolean z;
        byte[] bArr;
        double d2 = d;
        if (j) {
            String str = new DecimalFormat("0.######", k).format(d2);
            if (o80Var == null) {
                return str;
            }
            o80Var.B(str);
            return null;
        }
        if (Math.abs(d) < 1.5E-5d) {
            if (o80Var == null) {
                return "0";
            }
            o80Var.d((byte) 48);
            return null;
        }
        int i2 = 0;
        if (d2 < 0.0d) {
            d2 = -d2;
            z = true;
        } else {
            z = false;
        }
        int i3 = 100000;
        if (d2 < 1.0d) {
            double d3 = d2 + 5.0E-6d;
            if (d3 >= 1.0d) {
                if (!z) {
                    if (o80Var == null) {
                        return VContant.MAINSCREEN;
                    }
                    o80Var.d((byte) 49);
                    return null;
                }
                if (o80Var == null) {
                    return "-1";
                }
                o80Var.d((byte) 45);
                o80Var.d((byte) 49);
                return null;
            }
            if (o80Var == null) {
                int i4 = (int) (d3 * ((double) 100000));
                StringBuffer stringBuffer = new StringBuffer();
                if (z) {
                    stringBuffer.append('-');
                }
                stringBuffer.append("0.");
                while (true) {
                    i3 /= 10;
                    if (i4 >= i3) {
                        break;
                    }
                    stringBuffer.append('0');
                }
                stringBuffer.append(i4);
                int length = stringBuffer.length() - 1;
                while (stringBuffer.charAt(length) == '0') {
                    length--;
                }
                stringBuffer.setLength(length + 1);
                return stringBuffer.toString();
            }
            int i5 = (int) (d3 * 100000.0d);
            if (z) {
                o80Var.d((byte) 45);
            }
            o80Var.d((byte) 48);
            o80Var.d((byte) 46);
            o80Var.d((byte) ((i5 / 10000) + 48));
            if (i5 % 10000 != 0) {
                o80Var.d((byte) (((i5 / 1000) % 10) + 48));
                if (i5 % 1000 != 0) {
                    o80Var.d((byte) (((i5 / 100) % 10) + 48));
                    if (i5 % 100 != 0) {
                        o80Var.d((byte) (((i5 / 10) % 10) + 48));
                        int i6 = i5 % 10;
                        if (i6 != 0) {
                            o80Var.d((byte) (i6 + 48));
                        }
                    }
                }
            }
            return null;
        }
        if (d2 > 32767.0d) {
            StringBuffer stringBuffer2 = new StringBuffer();
            if (z) {
                stringBuffer2.append('-');
            }
            stringBuffer2.append((long) (d2 + 0.5d));
            return stringBuffer2.toString();
        }
        int i7 = (int) ((d2 + 0.005d) * 100.0d);
        int i8 = f;
        if (i7 < i8 && (bArr = g[i7]) != null) {
            if (o80Var != null) {
                if (z) {
                    o80Var.d((byte) 45);
                }
                o80Var.D(g[i7]);
                return null;
            }
            String strD = xo4.d(bArr, null);
            if (!z) {
                return strD;
            }
            return "-" + strD;
        }
        if (o80Var == null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            if (z) {
                stringBuffer3.append('-');
            }
            if (i7 >= 1000000) {
                stringBuffer3.append(h[i7 / DurationKt.NANOS_IN_MILLIS]);
            }
            if (i7 >= 100000) {
                stringBuffer3.append(h[(i7 / 100000) % 10]);
            }
            if (i7 >= 10000) {
                stringBuffer3.append(h[(i7 / 10000) % 10]);
            }
            if (i7 >= 1000) {
                stringBuffer3.append(h[(i7 / 1000) % 10]);
            }
            if (i7 >= 100) {
                stringBuffer3.append(h[(i7 / 100) % 10]);
            }
            if (i7 % 100 != 0) {
                stringBuffer3.append('.');
                char[] cArr = h;
                stringBuffer3.append(cArr[(i7 / 10) % 10]);
                int i9 = i7 % 10;
                if (i9 != 0) {
                    stringBuffer3.append(cArr[i9]);
                }
            }
            return stringBuffer3.toString();
        }
        if (i7 < i8) {
            int i10 = i7 >= 1000000 ? 5 : i7 >= 100000 ? 4 : i7 >= 10000 ? 3 : i7 >= 1000 ? 2 : i7 >= 100 ? 1 : 0;
            int i11 = i7 % 100;
            if (i11 != 0) {
                i10 += 2;
            }
            int i12 = i7 % 10;
            if (i12 != 0) {
                i10++;
            }
            byte[] bArr2 = new byte[i10];
            if (i7 >= 1000000) {
                bArr2[0] = i[i7 / DurationKt.NANOS_IN_MILLIS];
                i2 = 1;
            }
            if (i7 >= 100000) {
                bArr2[i2] = i[(i7 / 100000) % 10];
                i2++;
            }
            if (i7 >= 10000) {
                bArr2[i2] = i[(i7 / 10000) % 10];
                i2++;
            }
            if (i7 >= 1000) {
                bArr2[i2] = i[(i7 / 1000) % 10];
                i2++;
            }
            if (i7 >= 100) {
                bArr2[i2] = i[(i7 / 100) % 10];
                i2++;
            }
            if (i11 != 0) {
                int i13 = i2 + 1;
                bArr2[i2] = 46;
                int i14 = i2 + 2;
                byte[] bArr3 = i;
                bArr2[i13] = bArr3[(i7 / 10) % 10];
                if (i12 != 0) {
                    bArr2[i14] = bArr3[i12];
                }
            }
            g[i7] = bArr2;
        }
        if (z) {
            o80Var.d((byte) 45);
        }
        if (i7 >= 1000000) {
            o80Var.d(i[i7 / DurationKt.NANOS_IN_MILLIS]);
        }
        if (i7 >= 100000) {
            o80Var.d(i[(i7 / 100000) % 10]);
        }
        if (i7 >= 10000) {
            o80Var.d(i[(i7 / 10000) % 10]);
        }
        if (i7 >= 1000) {
            o80Var.d(i[(i7 / 1000) % 10]);
        }
        if (i7 >= 100) {
            o80Var.d(i[(i7 / 100) % 10]);
        }
        if (i7 % 100 == 0) {
            return null;
        }
        o80Var.d((byte) 46);
        byte[] bArr4 = i;
        o80Var.d(bArr4[(i7 / 10) % 10]);
        int i15 = i7 % 10;
        if (i15 == 0) {
            return null;
        }
        o80Var.d(bArr4[i15]);
        return null;
    }

    public o80 B(String str) {
        return str != null ? D(wt1.f(str)) : this;
    }

    public o80 D(byte[] bArr) {
        return P(bArr, 0, bArr.length);
    }

    public o80 P(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i4 = i2 + i3) <= bArr.length && i4 >= 0 && i3 != 0) {
            int i5 = this.c + i3;
            byte[] bArr2 = this.e;
            if (i5 > bArr2.length) {
                byte[] bArr3 = new byte[Math.max(bArr2.length << 1, i5)];
                System.arraycopy(this.e, 0, bArr3, 0, this.c);
                this.e = bArr3;
            }
            System.arraycopy(bArr, i2, this.e, this.c, i3);
            this.c = i5;
        }
        return this;
    }

    public o80 U(byte b) {
        byte[] bArr = i;
        d(bArr[(b >> 4) & 15]);
        return d(bArr[b & 15]);
    }

    public o80 d(byte b) {
        return d0(b);
    }

    public o80 d0(int i2) {
        int i3 = this.c + 1;
        byte[] bArr = this.e;
        if (i3 > bArr.length) {
            byte[] bArr2 = new byte[Math.max(bArr.length << 1, i3)];
            System.arraycopy(this.e, 0, bArr2, 0, this.c);
            this.e = bArr2;
        }
        this.e[this.c] = (byte) i2;
        this.c = i3;
        return this;
    }

    public o80 e(char c) {
        return d0(c);
    }

    public o80 j(double d) {
        B(k0(d, this));
        return this;
    }

    public o80 m(float f2) {
        return j(f2);
    }

    public void m0() {
        this.c = 0;
    }

    public o80 n(int i2) {
        return j(i2);
    }

    public void p0(int i2) {
        if (i2 > this.c || i2 < 0) {
            throw new IndexOutOfBoundsException(dt3.b("the.new.size.must.be.positive.and.lt.eq.of.the.current.size", new Object[0]));
        }
        this.c = i2;
    }

    public String toString() {
        return new String(this.e, 0, this.c);
    }

    public o80 w(o80 o80Var) {
        return P(o80Var.e, 0, o80Var.c);
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        d((byte) i2);
    }

    public int x0() {
        return this.c;
    }

    public byte[] y0() {
        int i2 = this.c;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.e, 0, bArr, 0, i2);
        return bArr;
    }

    public void z0(OutputStream outputStream) throws IOException {
        outputStream.write(this.e, 0, this.c);
    }

    public o80(int i2) {
        this.e = new byte[i2 < 1 ? 128 : i2];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        P(bArr, i2, i3);
    }
}
