package com.zepto;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wx {

    public static class a implements Iterator {
        public final Object[] c;
        public int e = 0;

        public a(Object[] objArr) {
            this.c = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e < this.c.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i = this.e;
            Object[] objArr = this.c;
            if (i != objArr.length) {
                this.e = i + 1;
                return objArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.e);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean b(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean c(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static short[] e(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return d(bArr2);
        }
        if (bArr2 == null) {
            return d(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean g(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
        int length2 = bArr.length ^ bArr2.length;
        for (int i = 0; i != length; i++) {
            length2 |= bArr[i] ^ bArr2[i];
        }
        while (length < bArr2.length) {
            byte b = bArr2[length];
            length2 |= b ^ (~b);
            length++;
        }
        return length2 == 0;
    }

    public static byte[] h(byte[] bArr, int i, int i2) {
        int iJ = j(i, i2);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, iJ));
        return bArr2;
    }

    public static void i(byte[] bArr, byte b) {
        Arrays.fill(bArr, b);
    }

    public static int j(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int k(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int l(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ bArr[i + i2];
        }
    }

    public static int m(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public static int n(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static int o(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    public static int p(short[][] sArr) {
        int iO = 0;
        for (int i = 0; i != sArr.length; i++) {
            iO = (iO * 257) + o(sArr[i]);
        }
        return iO;
    }

    public static int q(short[][][] sArr) {
        int iP = 0;
        for (int i = 0; i != sArr.length; i++) {
            iP = (iP * 257) + p(sArr[i]);
        }
        return iP;
    }

    public static byte[] r(byte[] bArr, byte b) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b;
        return bArr2;
    }
}
