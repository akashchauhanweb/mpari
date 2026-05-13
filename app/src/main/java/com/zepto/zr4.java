package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zr4 {
    public short A;
    public int B;
    public int C;
    public int D;
    public int E;
    public short F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public short M;
    public short N;
    public short O;
    public short P;
    public boolean Q;
    public int[] R = {0, 0, 0, 0, 197, 198, 199, 0, 202, 0, 205, 206, 207, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 33, 34, 35, 36, 37, 38, 169, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 193, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 0, 184, 166, 185, 188, 178, 179, 195, 189, 0, 172, 234, 0, 0, 0, 0, 96, 0, 170, 186, 183, 177, 208, 196, 0, 0, 173, 250, 0, 0, 0, 0, 161, 162, 163, 168, 165, 0, 167, 200, 0, 227, 171, 0, 0, 0, 197, 0, 0, 0, 0, 194, 0, 182, 180, 203, 0, 235, 187, 0, 0, 0, 191, 0, 0, 0, 0, 0, 0, 225, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 233, 0, 0, 0, 0, 0, 0, 251, 0, 0, 0, 0, 0, 0, 241, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 249, 0, 0, 0, 0, 0, 0, 0};
    public int[] S = {0, 0, 0, 0, 2, 2, 2, 0, 2, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 0, 2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public String[] T = {"W00", "W01", "W02", "W03", "macron", "breve", "dotaccent", "W07", "ring", "W09", "W0a", "W0b", "W0c", "W0d", "W0e", "W0f", "hungarumlaut", "ogonek", "caron", "W13", "W14", "W15", "W16", "W17", "W18", "W19", "W1a", "W1b", "W1c", "W1d", "W1e", "W1f", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "W7f", "euro", "W81", "quotesinglbase", "florin", "quotedblbase", "ellipsis", "dagger", "daggerdbl", "circumflex", "perthousand", "Scaron", "guilsinglleft", "OE", "W8d", "Zcaron", "W8f", "W90", "quoteleft", "quoteright", "quotedblleft", "quotedblright", "bullet", "endash", "emdash", "tilde", "trademark", "scaron", "guilsinglright", "oe", "W9d", "zcaron", "Ydieresis", "reqspace", "exclamdown", "cent", "sterling", "currency", "yen", "brokenbar", "section", "dieresis", "copyright", "ordfeminine", "guillemotleft", "logicalnot", "syllable", "registered", "macron", "degree", "plusminus", "twosuperior", "threesuperior", "acute", "mu", "paragraph", "periodcentered", "cedilla", "onesuperior", "ordmasculine", "guillemotright", "onequarter", "onehalf", "threequarters", "questiondown", "Agrave", "Aacute", "Acircumflex", "Atilde", "Adieresis", "Aring", "AE", "Ccedilla", "Egrave", "Eacute", "Ecircumflex", "Edieresis", "Igrave", "Iacute", "Icircumflex", "Idieresis", "Eth", "Ntilde", "Ograve", "Oacute", "Ocircumflex", "Otilde", "Odieresis", "multiply", "Oslash", "Ugrave", "Uacute", "Ucircumflex", "Udieresis", "Yacute", "Thorn", "germandbls", "agrave", "aacute", "acircumflex", "atilde", "adieresis", "aring", "ae", "ccedilla", "egrave", "eacute", "ecircumflex", "edieresis", "igrave", "iacute", "icircumflex", "idieresis", "eth", "ntilde", "ograve", "oacute", "ocircumflex", "otilde", "odieresis", "divide", "oslash", "ugrave", "uacute", "ucircumflex", "udieresis", "yacute", "thorn", "ydieresis"};
    public i45 a;
    public PrintWriter b;
    public short c;
    public int d;
    public String e;
    public short f;
    public short g;
    public short h;
    public short i;
    public short j;
    public short k;
    public short l;
    public byte m;
    public byte n;
    public byte o;
    public short p;
    public byte q;
    public short r;
    public short s;
    public byte t;
    public short u;
    public short v;
    public int w;
    public int x;
    public byte y;
    public byte z;

    public zr4(i45 i45Var, OutputStream outputStream) {
        this.a = i45Var;
        this.b = new PrintWriter(new OutputStreamWriter(outputStream, "ISO-8859-1"));
    }

    public static void a(i45 i45Var, OutputStream outputStream) throws IOException {
        zr4 zr4Var = new zr4(i45Var, outputStream);
        zr4Var.b();
        zr4Var.f();
        zr4Var.e();
        zr4Var.g();
        zr4Var.h();
        zr4Var.b.flush();
    }

    public final void b() throws IOException {
        int i;
        this.a.j(0);
        this.c = this.a.h();
        this.d = this.a.g();
        this.e = j(60);
        this.f = this.a.h();
        this.g = this.a.h();
        this.h = this.a.h();
        this.i = this.a.h();
        this.j = this.a.h();
        this.k = this.a.h();
        this.l = this.a.h();
        this.m = (byte) this.a.read();
        this.n = (byte) this.a.read();
        this.o = (byte) this.a.read();
        this.p = this.a.h();
        this.q = (byte) this.a.read();
        this.r = this.a.h();
        this.s = this.a.h();
        this.t = (byte) this.a.read();
        this.u = this.a.h();
        this.v = this.a.h();
        this.w = this.a.read();
        this.x = this.a.read();
        this.y = (byte) this.a.read();
        this.z = (byte) this.a.read();
        this.A = this.a.h();
        this.B = this.a.g();
        this.C = this.a.g();
        this.D = this.a.g();
        this.E = this.a.g();
        this.F = this.a.h();
        this.G = this.a.g();
        this.H = this.a.g();
        this.I = this.a.g();
        this.J = this.a.g();
        this.K = this.a.g();
        this.L = this.a.g();
        if (this.d != this.a.e() || this.F != 30 || (i = this.L) < 75 || i > 512) {
            throw new IOException(dt3.b("not.a.valid.pfm.file", new Object[0]));
        }
        this.a.j(this.G + 14);
        this.M = this.a.h();
        this.N = this.a.h();
        this.O = this.a.h();
        this.P = this.a.h();
    }

    public final void c(int i, int i2, String str) {
        this.b.print("C ");
        d(i);
        this.b.print(" ; WX ");
        d(i2);
        if (str != null) {
            this.b.print(" ; N ");
            this.b.print(str);
        }
        this.b.print(" ;\n");
    }

    public final void d(int i) {
        this.b.print(' ');
        this.b.print(i);
    }

    public final void e() throws IOException {
        int i = (this.x - this.w) + 1;
        int[] iArr = new int[i];
        this.a.j(this.H);
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = this.a.i();
        }
        int[] iArr2 = new int[256];
        if (this.q == 0) {
            for (int i3 = this.w; i3 <= this.x; i3++) {
                int i4 = this.R[i3];
                if (i4 != 0) {
                    iArr2[i4] = i3;
                }
            }
        }
        this.b.print("StartCharMetrics");
        d(i);
        this.b.print('\n');
        if (this.q != 0) {
            for (int i5 = this.w; i5 <= this.x; i5++) {
                int i6 = this.w;
                if (iArr[i5 - i6] != 0) {
                    c(i5, iArr[i5 - i6], null);
                }
            }
        } else {
            for (int i7 = 0; i7 < 256; i7++) {
                int i8 = iArr2[i7];
                if (i8 != 0) {
                    c(i7, iArr[i8 - this.w], this.T[i8]);
                    iArr[i8 - this.w] = 0;
                }
            }
            for (int i9 = this.w; i9 <= this.x; i9++) {
                int i10 = this.w;
                if (iArr[i9 - i10] != 0) {
                    c(-1, iArr[i9 - i10], this.T[i9]);
                }
            }
        }
        this.b.print("EndCharMetrics\n");
    }

    public final void f() throws IOException {
        this.b.print("StartFontMetrics 2.0\n");
        if (this.e.length() > 0) {
            this.b.print("Comment " + this.e + '\n');
        }
        this.b.print("FontName ");
        this.a.j(this.L);
        String strI = i();
        this.b.print(strI);
        this.b.print("\nEncodingScheme ");
        if (this.q != 0) {
            this.b.print("FontSpecific\n");
        } else {
            this.b.print("AdobeStandardEncoding\n");
        }
        this.b.print("FullName " + strI.replace('-', ' '));
        int i = this.C;
        if (i != 0) {
            this.a.j(i);
            this.b.print("\nFamilyName " + i());
        }
        this.b.print("\nWeight ");
        if (this.p > 475 || strI.toLowerCase().indexOf("bold") >= 0) {
            this.b.print("Bold");
        } else {
            short s = this.p;
            if ((s < 325 && s != 0) || strI.toLowerCase().indexOf("light") >= 0) {
                this.b.print("Light");
            } else if (strI.toLowerCase().indexOf("black") >= 0) {
                this.b.print("Black");
            } else {
                this.b.print("Medium");
            }
        }
        this.b.print("\nItalicAngle ");
        if (this.m != 0 || strI.toLowerCase().indexOf("italic") >= 0) {
            this.b.print("-12.00");
        } else {
            this.b.print("0");
        }
        this.b.print("\nIsFixedPitch ");
        if ((this.t & 1) == 0 || this.u == this.v) {
            this.b.print("true");
            this.Q = true;
        } else {
            this.b.print("false");
            this.Q = false;
        }
        this.b.print("\nFontBBox");
        if (this.Q) {
            d(-20);
        } else {
            d(-100);
        }
        d(-(this.P + 5));
        d(this.v + 10);
        d(this.j + 5);
        this.b.print("\nCapHeight");
        d(this.M);
        this.b.print("\nXHeight");
        d(this.N);
        this.b.print("\nDescender");
        d(-this.P);
        this.b.print("\nAscender");
        d(this.O);
        this.b.print('\n');
    }

    public final void g() throws IOException {
        int i = this.J;
        if (i == 0) {
            return;
        }
        this.a.j(i);
        int i2 = this.a.i() * 3;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            iArr[i3] = this.a.read();
            int i5 = i3 + 2;
            iArr[i3 + 1] = this.a.read();
            i3 += 3;
            short sH = this.a.h();
            iArr[i5] = sH;
            if (sH != 0) {
                i4++;
            }
        }
        if (i4 == 0) {
            return;
        }
        this.b.print("StartKernData\nStartKernPairs");
        d(i4);
        this.b.print('\n');
        for (int i6 = 0; i6 < i2; i6 += 3) {
            int i7 = i6 + 2;
            if (iArr[i7] != 0) {
                this.b.print("KPX ");
                this.b.print(this.T[iArr[i6]]);
                this.b.print(' ');
                this.b.print(this.T[iArr[i6 + 1]]);
                d(iArr[i7]);
                this.b.print('\n');
            }
        }
        this.b.print("EndKernPairs\nEndKernData\n");
    }

    public final void h() {
        this.b.print("EndFontMetrics\n");
    }

    public final String i() {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i = this.a.read();
            if (i <= 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append((char) i);
        }
    }

    public final String j(int i) throws EOFException {
        byte[] bArr = new byte[i];
        this.a.readFully(bArr);
        int i2 = 0;
        while (i2 < i && bArr[i2] != 0) {
            i2++;
        }
        return new String(bArr, 0, i2, "ISO-8859-1");
    }
}
