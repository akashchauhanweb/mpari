package com.zepto;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public abstract class s80 implements Iterable, Serializable {
    public static final s80 e = new j(x03.d);
    public static final f f;
    public static final Comparator g;
    public int c = 0;

    public class a extends c {
        public int c = 0;
        public final int e;

        public a() {
            this.e = s80.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.e;
        }

        @Override // com.zepto.s80.g
        public byte nextByte() {
            int i = this.c;
            if (i >= this.e) {
                throw new NoSuchElementException();
            }
            this.c = i + 1;
            return s80.this.D(i);
        }
    }

    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(s80 s80Var, s80 s80Var2) {
            g gVarP = s80Var.P();
            g gVarP2 = s80Var2.P();
            while (gVarP.hasNext() && gVarP2.hasNext()) {
                int iCompareTo = Integer.valueOf(s80.h0(gVarP.nextByte())).compareTo(Integer.valueOf(s80.h0(gVarP2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(s80Var.size()).compareTo(Integer.valueOf(s80Var2.size()));
        }
    }

    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.zepto.s80.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class e extends j {
        public final int i;
        public final int j;

        public e(byte[] bArr, int i, int i2) {
            super(bArr);
            s80.r(i, i + i2, bArr.length);
            this.i = i;
            this.j = i2;
        }

        @Override // com.zepto.s80.j, com.zepto.s80
        public void B(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.h, q0() + i, bArr, i2, i3);
        }

        @Override // com.zepto.s80.j, com.zepto.s80
        public byte D(int i) {
            return this.h[this.i + i];
        }

        @Override // com.zepto.s80.j, com.zepto.s80
        public byte m(int i) {
            s80.n(i, size());
            return this.h[this.i + i];
        }

        @Override // com.zepto.s80.j
        public int q0() {
            return this.i;
        }

        @Override // com.zepto.s80.j, com.zepto.s80
        public int size() {
            return this.j;
        }
    }

    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public interface g extends Iterator {
        byte nextByte();
    }

    public static final class h {
        public final hr0 a;
        public final byte[] b;

        public /* synthetic */ h(int i, a aVar) {
            this(i);
        }

        public s80 a() {
            this.a.c();
            return new j(this.b);
        }

        public hr0 b() {
            return this.a;
        }

        public h(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = hr0.U(bArr);
        }
    }

    public static abstract class i extends s80 {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.P();
        }
    }

    public static class j extends i {
        public final byte[] h;

        public j(byte[] bArr) {
            bArr.getClass();
            this.h = bArr;
        }

        @Override // com.zepto.s80
        public void B(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.h, i, bArr, i2, i3);
        }

        @Override // com.zepto.s80
        public byte D(int i) {
            return this.h[i];
        }

        @Override // com.zepto.s80
        public final boolean O() {
            int iQ0 = q0();
            return zs6.n(this.h, iQ0, size() + iQ0);
        }

        @Override // com.zepto.s80
        public final fr0 a0() {
            return fr0.j(this.h, q0(), size(), true);
        }

        @Override // com.zepto.s80
        public final int d0(int i, int i2, int i3) {
            return x03.h(i, this.h, q0() + i2, i3);
        }

        @Override // com.zepto.s80
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s80) || size() != ((s80) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iE0 = e0();
            int iE02 = jVar.e0();
            if (iE0 == 0 || iE02 == 0 || iE0 == iE02) {
                return p0(jVar, 0, size());
            }
            return false;
        }

        @Override // com.zepto.s80
        public final s80 f0(int i, int i2) {
            int iR = s80.r(i, i2, size());
            return iR == 0 ? s80.e : new e(this.h, q0() + i, iR);
        }

        @Override // com.zepto.s80
        public final String j0(Charset charset) {
            return new String(this.h, q0(), size(), charset);
        }

        @Override // com.zepto.s80
        public byte m(int i) {
            return this.h[i];
        }

        @Override // com.zepto.s80
        public final void o0(q80 q80Var) {
            q80Var.a(this.h, q0(), size());
        }

        public final boolean p0(s80 s80Var, int i, int i2) {
            if (i2 > s80Var.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > s80Var.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + s80Var.size());
            }
            if (!(s80Var instanceof j)) {
                return s80Var.f0(i, i3).equals(f0(0, i2));
            }
            j jVar = (j) s80Var;
            byte[] bArr = this.h;
            byte[] bArr2 = jVar.h;
            int iQ0 = q0() + i2;
            int iQ02 = q0();
            int iQ03 = jVar.q0() + i;
            while (iQ02 < iQ0) {
                if (bArr[iQ02] != bArr2[iQ03]) {
                    return false;
                }
                iQ02++;
                iQ03++;
            }
            return true;
        }

        public int q0() {
            return 0;
        }

        @Override // com.zepto.s80
        public int size() {
            return this.h.length;
        }
    }

    public static final class k implements f {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.zepto.s80.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f = xo.c() ? new k(aVar) : new d(aVar);
        g = new b();
    }

    public static h T(int i2) {
        return new h(i2, null);
    }

    public static int h0(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    public static s80 m0(byte[] bArr) {
        return new j(bArr);
    }

    public static void n(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    public static s80 n0(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public static int r(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static s80 u(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    public static s80 w(byte[] bArr, int i2, int i3) {
        r(i2, i2 + i3, bArr.length);
        return new j(f.a(bArr, i2, i3));
    }

    public static s80 z(String str) {
        return new j(str.getBytes(x03.b));
    }

    public abstract void B(byte[] bArr, int i2, int i3, int i4);

    public abstract byte D(int i2);

    public abstract boolean O();

    public g P() {
        return new a();
    }

    public abstract fr0 a0();

    public abstract int d0(int i2, int i3, int i4);

    public final int e0() {
        return this.c;
    }

    public abstract boolean equals(Object obj);

    public abstract s80 f0(int i2, int i3);

    public final byte[] g0() {
        int size = size();
        if (size == 0) {
            return x03.d;
        }
        byte[] bArr = new byte[size];
        B(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int iD0 = this.c;
        if (iD0 == 0) {
            int size = size();
            iD0 = d0(size, 0, size);
            if (iD0 == 0) {
                iD0 = 1;
            }
            this.c = iD0;
        }
        return iD0;
    }

    public final String i0(Charset charset) {
        return size() == 0 ? "" : j0(charset);
    }

    public abstract String j0(Charset charset);

    public final String k0() {
        return i0(x03.b);
    }

    public final String l0() {
        if (size() <= 50) {
            return we6.a(this);
        }
        return we6.a(f0(0, 47)) + "...";
    }

    public abstract byte m(int i2);

    public abstract void o0(q80 q80Var);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), l0());
    }
}
