package com.zepto;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class s40 {
    public static final int[] s = {0, 383, ConstantsKt.DEFAULT_BUFFER_SIZE, 8303, 8352, 8399, 64256, 64262};
    public static final int[] t = {0, 127, 1536, 1663, 8352, 8399, 64336, 64511, 65136, 65279};
    public static final int[] u = {0, 127, 1424, 1535, 8352, 8399, 64285, 64335};
    public static final int[] v = {0, 127, 1024, 1327, ConstantsKt.DEFAULT_BUFFER_SIZE, 8303, 8352, 8399};
    public static HashMap w = new HashMap();
    public static final HashMap x;
    public ArrayList c;
    public int e;
    public String j;
    public boolean k;
    public k03 r;
    public int[] f = new int[256];
    public String[] g = new String[256];
    public char[] h = new char[256];
    public int[][] i = new int[256][];
    public int l = -1;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;
    public boolean p = true;
    public boolean q = false;

    static {
        HashMap map = new HashMap();
        x = map;
        map.put("Courier", lp4.r1);
        map.put("Courier-Bold", lp4.s1);
        map.put("Courier-BoldOblique", lp4.u1);
        map.put("Courier-Oblique", lp4.t1);
        map.put("Helvetica", lp4.i4);
        map.put("Helvetica-Bold", lp4.j4);
        map.put("Helvetica-BoldOblique", lp4.l4);
        map.put("Helvetica-Oblique", lp4.k4);
        map.put("Symbol", lp4.z9);
        map.put("Times-Roman", lp4.P9);
        map.put("Times-Bold", lp4.Q9);
        map.put("Times-BoldItalic", lp4.S9);
        map.put("Times-Italic", lp4.R9);
        map.put("ZapfDingbats", lp4.Eb);
    }

    public static String A(String str) {
        return (str.equals("winansi") || str.equals("")) ? "Cp1252" : str.equals("macroman") ? "MacRoman" : str;
    }

    public static s40 d(String str, String str2, boolean z) {
        return f(str, str2, z, true, null, null, false);
    }

    public static s40 e(String str, String str2, boolean z, boolean z2, byte[] bArr, byte[] bArr2) {
        return f(str, str2, z, z2, bArr, bArr2, false);
    }

    public static s40 f(String str, String str2, boolean z, boolean z2, byte[] bArr, byte[] bArr2, boolean z3) {
        return g(str, str2, z, z2, bArr, bArr2, z3, false);
    }

    public static s40 g(String str, String str2, boolean z, boolean z2, byte[] bArr, byte[] bArr2, boolean z3, boolean z4) throws cu1 {
        boolean z5;
        s40 d90Var;
        s40 go6Var;
        s40 s40Var;
        String strI = i(str);
        String strA = A(str2);
        boolean zContainsKey = x.containsKey(str);
        boolean zM = zContainsKey ? false : d90.M(strI, strA);
        if (zContainsKey || zM) {
            z5 = false;
        } else {
            if (strA.equals("Identity-H") || strA.equals("Identity-V")) {
                z = true;
            }
            z5 = z;
        }
        String str3 = str + "\n" + strA + "\n" + z5;
        if (z2) {
            synchronized (w) {
                s40Var = (s40) w.get(str3);
            }
            if (s40Var != null) {
                return s40Var;
            }
        }
        if (zContainsKey || str.toLowerCase().endsWith(".afm") || str.toLowerCase().endsWith(".pfm")) {
            ko6 ko6Var = new ko6(str, strA, z5, bArr, bArr2, z4);
            ko6Var.q = strA.equals("Cp1252");
            d90Var = ko6Var;
        } else if (strI.toLowerCase().endsWith(".ttf") || strI.toLowerCase().endsWith(".otf") || strI.toLowerCase().indexOf(".ttc,") > 0) {
            if (strA.equals("Identity-H") || strA.equals("Identity-V")) {
                go6Var = new go6(str, strA, z5, bArr, z4);
            } else {
                go6Var = new eo6(str, strA, z5, bArr, false, z4);
                go6Var.q = strA.equals("Cp1252");
            }
            d90Var = go6Var;
        } else {
            if (!zM) {
                if (z3) {
                    return null;
                }
                throw new cu1(dt3.b("font.1.with.2.is.not.recognized", str, strA));
            }
            d90Var = new d90(str, strA, z5);
        }
        if (z2) {
            synchronized (w) {
                try {
                    s40 s40Var2 = (s40) w.get(str3);
                    if (s40Var2 != null) {
                        return s40Var2;
                    }
                    w.put(str3, d90Var);
                } finally {
                }
            }
        }
        return d90Var;
    }

    public static String h() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 6; i++) {
            sb.append((char) ((Math.random() * 26.0d) + 65.0d));
        }
        return ((Object) sb) + "+";
    }

    public static String i(String str) {
        return str.endsWith(",Bold") ? str.substring(0, str.length() - 5) : str.endsWith(",Italic") ? str.substring(0, str.length() - 7) : str.endsWith(",BoldItalic") ? str.substring(0, str.length() - 11) : str;
    }

    public static InputStream q(String str) {
        return r(str, null);
    }

    public static InputStream r(String str, ClassLoader classLoader) {
        InputStream resourceAsStream;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (classLoader != null) {
            resourceAsStream = classLoader.getResourceAsStream(str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
        } else {
            resourceAsStream = null;
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                resourceAsStream = contextClassLoader.getResourceAsStream(str);
            }
        } catch (Throwable unused) {
        }
        if (resourceAsStream == null) {
            resourceAsStream = s40.class.getResourceAsStream("/" + str);
        }
        return resourceAsStream == null ? ClassLoader.getSystemResourceAsStream(str) : resourceAsStream;
    }

    public abstract void B(pq4 pq4Var, gp4 gp4Var, Object[] objArr);

    public byte[] a(int i) {
        if (this.o) {
            return xo4.b((char) i, null);
        }
        k03 k03Var = this.r;
        return k03Var != null ? k03Var.a(i) ? new byte[]{(byte) this.r.b(i)} : new byte[0] : xo4.b((char) i, this.j);
    }

    public byte[] b(String str) {
        if (this.o) {
            return xo4.c(str, null);
        }
        if (this.r == null) {
            return xo4.c(str, this.j);
        }
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (this.r.a(cCharAt)) {
                bArr[i] = (byte) this.r.b(cCharAt);
                i++;
            }
        }
        if (i >= length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public void c() {
        int i = 0;
        if (!this.j.startsWith("#")) {
            if (this.m) {
                while (i < 256) {
                    this.f[i] = p(i, null);
                    this.i[i] = o(i, null);
                    i++;
                }
                return;
            }
            byte[] bArr = new byte[1];
            for (int i2 = 0; i2 < 256; i2++) {
                bArr[0] = (byte) i2;
                String strD = xo4.d(bArr, this.j);
                char cCharAt = strD.length() > 0 ? strD.charAt(0) : '?';
                String strB = rj2.b(cCharAt);
                if (strB == null) {
                    strB = ".notdef";
                }
                this.g[i2] = strB;
                this.h[i2] = cCharAt;
                this.f[i2] = p(cCharAt, strB);
                this.i[i2] = o(cCharAt, strB);
            }
            return;
        }
        this.r = new k03();
        StringTokenizer stringTokenizer = new StringTokenizer(this.j.substring(1), " ,\t\n\r\f");
        if (stringTokenizer.nextToken().equals("full")) {
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                String strNextToken2 = stringTokenizer.nextToken();
                char c = (char) Integer.parseInt(stringTokenizer.nextToken(), 16);
                int iCharAt = (strNextToken.startsWith("'") ? strNextToken.charAt(1) : Integer.parseInt(strNextToken)) % 256;
                this.r.d(c, iCharAt);
                this.g[iCharAt] = strNextToken2;
                this.h[iCharAt] = c;
                this.f[iCharAt] = p(c, strNextToken2);
                this.i[iCharAt] = o(c, strNextToken2);
            }
        } else {
            int i3 = stringTokenizer.hasMoreTokens() ? Integer.parseInt(stringTokenizer.nextToken()) : 0;
            while (stringTokenizer.hasMoreTokens() && i3 < 256) {
                int i4 = Integer.parseInt(stringTokenizer.nextToken(), 16) % 65536;
                String strB2 = rj2.b(i4);
                if (strB2 != null) {
                    this.r.d(i4, i3);
                    this.g[i3] = strB2;
                    this.h[i3] = (char) i4;
                    this.f[i3] = p(i4, strB2);
                    this.i[i3] = o(i4, strB2);
                    i3++;
                }
            }
        }
        while (i < 256) {
            String[] strArr = this.g;
            if (strArr[i] == null) {
                strArr[i] = ".notdef";
            }
            i++;
        }
    }

    public String j() {
        return this.j;
    }

    public abstract String[][] k();

    public abstract float l(int i, float f);

    public int m() {
        return this.e;
    }

    public abstract String n();

    public abstract int[] o(int i, String str);

    public abstract int p(int i, String str);

    public char s(int i) {
        return this.h[i];
    }

    public int t(int i) {
        return i;
    }

    public int u(int i) {
        if (this.q) {
            return (i < 128 || (i >= 160 && i <= 255)) ? this.f[i] : this.f[xo4.c.b(i)];
        }
        int i2 = 0;
        for (byte b : a((char) i)) {
            i2 += this.f[b & UByte.MAX_VALUE];
        }
        return i2;
    }

    public int v(String str) {
        int i = 0;
        if (!this.q) {
            byte[] bArrB = b(str);
            int i2 = 0;
            while (i < bArrB.length) {
                i2 += this.f[bArrB[i] & UByte.MAX_VALUE];
                i++;
            }
            return i2;
        }
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            i3 += (cCharAt < 128 || (cCharAt >= 160 && cCharAt <= 255)) ? this.f[cCharAt] : this.f[xo4.c.b(cCharAt)];
            i++;
        }
        return i3;
    }

    public float w(int i, float f) {
        return u(i) * 0.001f * f;
    }

    public float x(String str, float f) {
        return v(str) * 0.001f * f;
    }

    public boolean y() {
        return this.k;
    }

    public boolean z() {
        return this.m;
    }

    public static class a extends gq4 {
        public a(byte[] bArr, int[] iArr, int i) throws cu1 {
            try {
                this.c = bArr;
                r(lp4.l5, new op4(bArr.length));
                int i2 = 0;
                while (i2 < iArr.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Length");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    r(new lp4(sb.toString()), new op4(iArr[i2]));
                    i2 = i3;
                }
                v(i);
            } catch (Exception e) {
                throw new cu1(e);
            }
        }

        public a(byte[] bArr, String str, int i) throws cu1 {
            try {
                this.c = bArr;
                r(lp4.l5, new op4(bArr.length));
                if (str != null) {
                    r(lp4.v9, new lp4(str));
                }
                v(i);
            } catch (Exception e) {
                throw new cu1(e);
            }
        }
    }
}
