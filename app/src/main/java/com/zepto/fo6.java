package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public class fo6 {
    public static final String[] s = {"cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "prep"};
    public static final String[] t = {"cmap", "cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "prep"};
    public static final String[] u = {"OS/2", "cmap", "cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "name, prep"};
    public static final int[] v = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};
    public HashMap a;
    public i45 b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int[] g;
    public HashSet h;
    public ArrayList i;
    public int j;
    public int[] k;
    public byte[] l;
    public byte[] m;
    public int n;
    public int o;
    public byte[] p;
    public int q;
    public int r;

    public fo6(String str, i45 i45Var, HashSet hashSet, int i, boolean z, boolean z2) {
        this.c = str;
        this.b = i45Var;
        this.h = hashSet;
        this.d = z;
        this.e = z2;
        this.r = i;
        this.i = new ArrayList(hashSet);
    }

    public void a() throws IOException {
        int i;
        int[] iArr;
        String[] strArr = this.e ? u : this.d ? t : s;
        int i2 = 2;
        int i3 = 0;
        for (String str : strArr) {
            if (!str.equals("glyf") && !str.equals("loca") && (iArr = (int[]) this.a.get(str)) != null) {
                i2++;
                i3 += (iArr[2] + 3) & (-4);
            }
        }
        int i4 = (i2 * 16) + 12;
        this.p = new byte[i3 + this.l.length + this.m.length + i4];
        this.q = 0;
        k(65536);
        l(i2);
        int i5 = v[i2];
        int i6 = 1 << i5;
        l(i6 * 16);
        l(i5);
        l((i2 - i6) * 16);
        for (String str2 : strArr) {
            int[] iArr2 = (int[]) this.a.get(str2);
            if (iArr2 != null) {
                m(str2);
                if (str2.equals("glyf")) {
                    k(b(this.m));
                    i = this.n;
                } else if (str2.equals("loca")) {
                    k(b(this.l));
                    i = this.o;
                } else {
                    k(iArr2[0]);
                    i = iArr2[2];
                }
                k(i4);
                k(i);
                i4 += (i + 3) & (-4);
            }
        }
        for (String str3 : strArr) {
            int[] iArr3 = (int[]) this.a.get(str3);
            if (iArr3 != null) {
                if (str3.equals("glyf")) {
                    byte[] bArr = this.m;
                    System.arraycopy(bArr, 0, this.p, this.q, bArr.length);
                    this.q += this.m.length;
                    this.m = null;
                } else if (str3.equals("loca")) {
                    byte[] bArr2 = this.l;
                    System.arraycopy(bArr2, 0, this.p, this.q, bArr2.length);
                    this.q += this.l.length;
                    this.l = null;
                } else {
                    this.b.j(iArr3[1]);
                    this.b.readFully(this.p, this.q, iArr3[2]);
                    this.q += (iArr3[2] + 3) & (-4);
                }
            }
        }
    }

    public int b(byte[] bArr) {
        int length = bArr.length / 4;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            i4 += bArr[i5] & UByte.MAX_VALUE;
            i3 += bArr[i5 + 1] & UByte.MAX_VALUE;
            int i7 = i5 + 3;
            i2 += bArr[i5 + 2] & UByte.MAX_VALUE;
            i5 += 4;
            i += bArr[i7] & UByte.MAX_VALUE;
        }
        return i + (i2 << 8) + (i3 << 16) + (i4 << 24);
    }

    public void c(int i) throws IOException {
        int[] iArr = this.g;
        int i2 = iArr[i];
        if (i2 == iArr[i + 1]) {
            return;
        }
        this.b.j(this.j + i2);
        if (this.b.readShort() >= 0) {
            return;
        }
        this.b.skipBytes(8);
        while (true) {
            int unsignedShort = this.b.readUnsignedShort();
            Integer numValueOf = Integer.valueOf(this.b.readUnsignedShort());
            if (!this.h.contains(numValueOf)) {
                this.h.add(numValueOf);
                this.i.add(numValueOf);
            }
            if ((unsignedShort & 32) == 0) {
                return;
            }
            int i3 = (unsignedShort & 1) != 0 ? 4 : 2;
            if ((unsignedShort & 8) != 0) {
                i3 += 2;
            } else if ((unsignedShort & 64) != 0) {
                i3 += 4;
            }
            if ((unsignedShort & 128) != 0) {
                i3 += 8;
            }
            this.b.skipBytes(i3);
        }
    }

    public void d() throws IOException {
        this.k = new int[this.g.length];
        int size = this.i.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) this.i.get(i2)).intValue();
        }
        Arrays.sort(iArr);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            int[] iArr2 = this.g;
            i3 += iArr2[i5 + 1] - iArr2[i5];
        }
        this.n = i3;
        this.m = new byte[(i3 + 3) & (-4)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr3 = this.k;
            if (i >= iArr3.length) {
                return;
            }
            iArr3[i] = i6;
            if (i7 < size && iArr[i7] == i) {
                i7++;
                iArr3[i] = i6;
                int[] iArr4 = this.g;
                int i8 = iArr4[i];
                int i9 = iArr4[i + 1] - i8;
                if (i9 > 0) {
                    this.b.j(this.j + i8);
                    this.b.readFully(this.m, i6, i9);
                    i6 += i9;
                }
            }
            i++;
        }
    }

    public void e() throws cu1, IOException {
        this.a = new HashMap();
        this.b.j(this.r);
        if (this.b.readInt() != 65536) {
            throw new cu1(dt3.b("1.is.not.a.true.type.file", this.c));
        }
        int unsignedShort = this.b.readUnsignedShort();
        this.b.skipBytes(6);
        for (int i = 0; i < unsignedShort; i++) {
            this.a.put(j(4), new int[]{this.b.readInt(), this.b.readInt(), this.b.readInt()});
        }
    }

    public void f() throws cu1, IOException {
        int[] iArr = (int[]) this.a.get("glyf");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "glyf", this.c));
        }
        if (!this.h.contains(0)) {
            this.h.add(0);
            this.i.add(0);
        }
        this.j = iArr[1];
        for (int i = 0; i < this.i.size(); i++) {
            c(((Integer) this.i.get(i)).intValue());
        }
    }

    public void g() {
        if (this.f) {
            this.o = this.k.length * 2;
        } else {
            this.o = this.k.length * 4;
        }
        byte[] bArr = new byte[(this.o + 3) & (-4)];
        this.l = bArr;
        this.p = bArr;
        int i = 0;
        this.q = 0;
        while (true) {
            int[] iArr = this.k;
            if (i >= iArr.length) {
                return;
            }
            if (this.f) {
                l(iArr[i] / 2);
            } else {
                k(iArr[i]);
            }
            i++;
        }
    }

    public byte[] h() {
        try {
            this.b.f();
            e();
            i();
            f();
            d();
            g();
            a();
            return this.p;
        } finally {
            try {
                this.b.close();
            } catch (Exception unused) {
            }
        }
    }

    public void i() throws cu1, IOException {
        int[] iArr = (int[]) this.a.get("head");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "head", this.c));
        }
        this.b.j(iArr[1] + 51);
        int i = 0;
        this.f = this.b.readUnsignedShort() == 0;
        int[] iArr2 = (int[]) this.a.get("loca");
        if (iArr2 == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "loca", this.c));
        }
        this.b.j(iArr2[1]);
        if (this.f) {
            int i2 = iArr2[2] / 2;
            this.g = new int[i2];
            while (i < i2) {
                this.g[i] = this.b.readUnsignedShort() * 2;
                i++;
            }
            return;
        }
        int i3 = iArr2[2] / 4;
        this.g = new int[i3];
        while (i < i3) {
            this.g[i] = this.b.readInt();
            i++;
        }
    }

    public String j(int i) throws EOFException {
        byte[] bArr = new byte[i];
        this.b.readFully(bArr);
        try {
            return new String(bArr, "Cp1252");
        } catch (Exception e) {
            throw new p52(e);
        }
    }

    public void k(int i) {
        byte[] bArr = this.p;
        int i2 = this.q;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        this.q = i2 + 4;
        bArr[i2 + 3] = (byte) i;
    }

    public void l(int i) {
        byte[] bArr = this.p;
        int i2 = this.q;
        bArr[i2] = (byte) (i >> 8);
        this.q = i2 + 2;
        bArr[i2 + 1] = (byte) i;
    }

    public void m(String str) {
        byte[] bArrC = xo4.c(str, "Cp1252");
        System.arraycopy(bArrC, 0, this.p, this.q, bArrC.length);
        this.q += bArrC.length;
    }
}
