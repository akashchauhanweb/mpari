package com.zepto;

import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public abstract class b90 {
    public static final String[] p = {"version", "Notice", "FullName", "FamilyName", "Weight", "FontBBox", "BlueValues", "OtherBlues", "FamilyBlues", "FamilyOtherBlues", "StdHW", "StdVW", "UNKNOWN_12", "UniqueID", "XUID", "charset", "Encoding", "CharStrings", "Private", "Subrs", "defaultWidthX", "nominalWidthX", "UNKNOWN_22", "UNKNOWN_23", "UNKNOWN_24", "UNKNOWN_25", "UNKNOWN_26", "UNKNOWN_27", "UNKNOWN_28", "UNKNOWN_29", "UNKNOWN_30", "UNKNOWN_31", "Copyright", "isFixedPitch", "ItalicAngle", "UnderlinePosition", "UnderlineThickness", "PaintType", "CharstringType", "FontMatrix", "StrokeWidth", "BlueScale", "BlueShift", "BlueFuzz", "StemSnapH", "StemSnapV", "ForceBold", "UNKNOWN_12_15", "UNKNOWN_12_16", "LanguageGroup", "ExpansionFactor", "initialRandomSeed", "SyntheticBase", "PostScript", "BaseFontName", "BaseFontBlend", "UNKNOWN_12_24", "UNKNOWN_12_25", "UNKNOWN_12_26", "UNKNOWN_12_27", "UNKNOWN_12_28", "UNKNOWN_12_29", "ROS", "CIDFontVersion", "CIDFontRevision", "CIDFontType", "CIDCount", "UIDBase", "FDArray", "FDSelect", "FontName"};
    public static final String[] q = {".notdef", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quoteright", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "quoteleft", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "exclamdown", "cent", "sterling", "fraction", "yen", "florin", "section", "currency", "quotesingle", "quotedblleft", "guillemotleft", "guilsinglleft", "guilsinglright", "fi", "fl", "endash", "dagger", "daggerdbl", "periodcentered", "paragraph", "bullet", "quotesinglbase", "quotedblbase", "quotedblright", "guillemotright", "ellipsis", "perthousand", "questiondown", "grave", "acute", "circumflex", "tilde", "macron", "breve", "dotaccent", "dieresis", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "emdash", "AE", "ordfeminine", "Lslash", "Oslash", "OE", "ordmasculine", "ae", "dotlessi", "lslash", "oslash", "oe", "germandbls", "onesuperior", "logicalnot", "mu", "trademark", "Eth", "onehalf", "plusminus", "Thorn", "onequarter", "divide", "brokenbar", "degree", "thorn", "threequarters", "twosuperior", "registered", "minus", "eth", "multiply", "threesuperior", "copyright", "Aacute", "Acircumflex", "Adieresis", "Agrave", "Aring", "Atilde", "Ccedilla", "Eacute", "Ecircumflex", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Ntilde", "Oacute", "Ocircumflex", "Odieresis", "Ograve", "Otilde", "Scaron", "Uacute", "Ucircumflex", "Udieresis", "Ugrave", "Yacute", "Ydieresis", "Zcaron", "aacute", "acircumflex", "adieresis", "agrave", "aring", "atilde", "ccedilla", "eacute", "ecircumflex", "edieresis", "egrave", "iacute", "icircumflex", "idieresis", "igrave", "ntilde", "oacute", "ocircumflex", "odieresis", "ograve", "otilde", "scaron", "uacute", "ucircumflex", "udieresis", "ugrave", "yacute", "ydieresis", "zcaron", "exclamsmall", "Hungarumlautsmall", "dollaroldstyle", "dollarsuperior", "ampersandsmall", "Acutesmall", "parenleftsuperior", "parenrightsuperior", "twodotenleader", "onedotenleader", "zerooldstyle", "oneoldstyle", "twooldstyle", "threeoldstyle", "fouroldstyle", "fiveoldstyle", "sixoldstyle", "sevenoldstyle", "eightoldstyle", "nineoldstyle", "commasuperior", "threequartersemdash", "periodsuperior", "questionsmall", "asuperior", "bsuperior", "centsuperior", "dsuperior", "esuperior", "isuperior", "lsuperior", "msuperior", "nsuperior", "osuperior", "rsuperior", "ssuperior", "tsuperior", "ff", "ffi", "ffl", "parenleftinferior", "parenrightinferior", "Circumflexsmall", "hyphensuperior", "Gravesmall", "Asmall", "Bsmall", "Csmall", "Dsmall", "Esmall", "Fsmall", "Gsmall", "Hsmall", "Ismall", "Jsmall", "Ksmall", "Lsmall", "Msmall", "Nsmall", "Osmall", "Psmall", "Qsmall", "Rsmall", "Ssmall", "Tsmall", "Usmall", "Vsmall", "Wsmall", "Xsmall", "Ysmall", "Zsmall", "colonmonetary", "onefitted", "rupiah", "Tildesmall", "exclamdownsmall", "centoldstyle", "Lslashsmall", "Scaronsmall", "Zcaronsmall", "Dieresissmall", "Brevesmall", "Caronsmall", "Dotaccentsmall", "Macronsmall", "figuredash", "hypheninferior", "Ogoneksmall", "Ringsmall", "Cedillasmall", "questiondownsmall", "oneeighth", "threeeighths", "fiveeighths", "seveneighths", "onethird", "twothirds", "zerosuperior", "foursuperior", "fivesuperior", "sixsuperior", "sevensuperior", "eightsuperior", "ninesuperior", "zeroinferior", "oneinferior", "twoinferior", "threeinferior", "fourinferior", "fiveinferior", "sixinferior", "seveninferior", "eightinferior", "nineinferior", "centinferior", "dollarinferior", "periodinferior", "commainferior", "Agravesmall", "Aacutesmall", "Acircumflexsmall", "Atildesmall", "Adieresissmall", "Aringsmall", "AEsmall", "Ccedillasmall", "Egravesmall", "Eacutesmall", "Ecircumflexsmall", "Edieresissmall", "Igravesmall", "Iacutesmall", "Icircumflexsmall", "Idieresissmall", "Ethsmall", "Ntildesmall", "Ogravesmall", "Oacutesmall", "Ocircumflexsmall", "Otildesmall", "Odieresissmall", "OEsmall", "Oslashsmall", "Ugravesmall", "Uacutesmall", "Ucircumflexsmall", "Udieresissmall", "Yacutesmall", "Thornsmall", "Ydieresissmall", "001.000", "001.001", "001.002", "001.003", "Black", "Bold", "Book", "Light", "Medium", "Regular", "Roman", "Semibold"};
    public int a;
    public String b;
    public Object[] c = new Object[48];
    public int d = 0;
    public i45 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public int[] l;
    public int[] m;
    public int[] n;
    public c[] o;

    public static final class a extends g {
        public final int b;
        public int c = 5;

        public a(int i) {
            this.b = i;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            if (this.c == 5) {
                int i = this.a;
                bArr[i] = 29;
                int i2 = this.b;
                bArr[i + 1] = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 2] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 3] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 4] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.c;
        }
    }

    public static final class b extends i {
        public final int c = 5;

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            if (this.c == 5) {
                int i = this.a;
                bArr[i] = 29;
                int i2 = this.b;
                bArr[i + 1] = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 2] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 3] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 4] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.c;
        }
    }

    public final class c {
        public int[] A;
        public String a;
        public String b;
        public int[] l;
        public int[] m;
        public int n;
        public int o;
        public int p;
        public int[] q;
        public int[] r;
        public int s;
        public int t;
        public int v;
        public int w;
        public int[] x;
        public int[] y;
        public int[][] z;
        public boolean c = false;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public int g = -1;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int u = 2;

        public c() {
        }
    }

    public static final class d extends g {
    }

    public static final class e extends g {
        public i b;
        public d c;

        public e(i iVar, d dVar) {
            this.b = iVar;
            this.c = dVar;
        }

        @Override // com.zepto.b90.g
        public void c() {
            this.b.d((this.a - this.c.a) + 1);
        }
    }

    public static final class f extends i {
        public final int c;

        public f(int i, int i2) {
            this.c = i;
            this.b = i2;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            int i = this.c;
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        bArr[this.a] = (byte) ((this.b >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                        i2 = 1;
                    }
                    bArr[this.a + i2] = (byte) ((this.b >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i2++;
                }
                bArr[this.a + i2] = (byte) ((this.b >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i2++;
            }
            bArr[this.a + i2] = (byte) (this.b & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.c;
        }

        public f(int i) {
            this.c = i;
        }
    }

    public static abstract class g {
        public int a = -1;

        public void a(byte[] bArr) {
        }

        public void b(int[] iArr) {
            this.a = iArr[0];
        }

        public void c() {
        }
    }

    public static final class h extends g {
        public i b;

        public h(i iVar) {
            this.b = iVar;
        }

        @Override // com.zepto.b90.g
        public void c() {
            this.b.d(this.a);
        }
    }

    public static abstract class i extends g {
        public int b;

        public void d(int i) {
            this.b = i;
        }
    }

    public static final class j extends g {
        public int b;
        public int c;
        public i45 d;

        public j(i45 i45Var, int i, int i2) {
            this.b = i;
            this.c = i2;
            this.d = i45Var;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            try {
                this.d.j(this.b);
                for (int i = this.a; i < this.a + this.c; i++) {
                    bArr[i] = this.d.readByte();
                }
            } catch (Exception e) {
                throw new p52(e);
            }
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.c;
        }
    }

    public static final class k extends g {
        public String b;

        public k(String str) {
            this.b = str;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            for (int i = 0; i < this.b.length(); i++) {
                bArr[this.a + i] = (byte) (this.b.charAt(i) & 255);
            }
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.b.length();
        }
    }

    public static final class l extends g {
        public i b;
        public d c;

        public l(i iVar, d dVar) {
            this.b = iVar;
            this.c = dVar;
        }

        @Override // com.zepto.b90.g
        public void c() {
            this.b.d(this.a - this.c.a);
        }
    }

    public static final class m extends g {
        public char b;

        public m(char c) {
            this.b = c;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            int i = this.a;
            char c = this.b;
            bArr[i] = (byte) ((c >>> '\b') & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 1] = (byte) (c & 255);
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 2;
        }
    }

    public static final class n extends g {
        public int b;

        public n(int i) {
            this.b = i;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            int i = this.a;
            int i2 = this.b;
            bArr[i] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 1] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 2] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 3;
        }
    }

    public static final class o extends g {
        public int b;

        public o(int i) {
            this.b = i;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            int i = this.a;
            int i2 = this.b;
            bArr[i] = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 1] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 2] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 4;
        }
    }

    public static final class p extends g {
        public char b;

        public p(char c) {
            this.b = c;
        }

        @Override // com.zepto.b90.g
        public void a(byte[] bArr) {
            bArr[this.a] = (byte) (this.b & 255);
        }

        @Override // com.zepto.b90.g
        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 1;
        }
    }

    public b90(i45 i45Var) {
        int i2;
        int i3;
        int i4;
        this.e = i45Var;
        m(0);
        c();
        c();
        char c2 = c();
        this.f = c();
        this.g = c2;
        int[] iArrF = f(c2);
        this.k = iArrF;
        int i5 = iArrF[iArrF.length - 1];
        this.h = i5;
        int[] iArrF2 = f(i5);
        this.l = iArrF2;
        int i6 = iArrF2[iArrF2.length - 1];
        this.i = i6;
        int[] iArrF3 = f(i6);
        this.m = iArrF3;
        int i7 = iArrF3[iArrF3.length - 1];
        this.j = i7;
        this.n = f(i7);
        this.o = new c[this.k.length - 1];
        int i8 = 0;
        while (i8 < this.k.length - 1) {
            this.o[i8] = new c();
            m(this.k[i8]);
            this.o[i8].a = "";
            int i9 = this.k[i8];
            while (true) {
                i4 = i8 + 1;
                if (i9 < this.k[i4]) {
                    StringBuilder sb = new StringBuilder();
                    c cVar = this.o[i8];
                    sb.append(cVar.a);
                    sb.append(c());
                    cVar.a = sb.toString();
                    i9++;
                }
            }
            i8 = i4;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i10 >= iArr.length - 1) {
                return;
            }
            m(iArr[i10]);
            while (true) {
                i2 = i10 + 1;
                if (j() >= this.l[i2]) {
                    break;
                }
                d();
                String str = this.b;
                if (str == "FullName") {
                    this.o[i10].b = l((char) ((Integer) this.c[0]).intValue());
                } else if (str == "ROS") {
                    this.o[i10].c = true;
                } else if (str == "Private") {
                    this.o[i10].e = ((Integer) this.c[0]).intValue();
                    this.o[i10].d = ((Integer) this.c[1]).intValue();
                } else if (str == "charset") {
                    this.o[i10].i = ((Integer) this.c[0]).intValue();
                } else if (str == "Encoding") {
                    this.o[i10].h = ((Integer) this.c[0]).intValue();
                    a(this.o[i10].h);
                } else if (str == "CharStrings") {
                    this.o[i10].g = ((Integer) this.c[0]).intValue();
                    int iJ = j();
                    c cVar2 = this.o[i10];
                    cVar2.q = f(cVar2.g);
                    m(iJ);
                } else if (str == "FDArray") {
                    this.o[i10].j = ((Integer) this.c[0]).intValue();
                } else if (str == "FDSelect") {
                    this.o[i10].k = ((Integer) this.c[0]).intValue();
                } else if (str == "CharstringType") {
                    this.o[i10].u = ((Integer) this.c[0]).intValue();
                }
            }
            int i11 = this.o[i10].d;
            if (i11 >= 0) {
                m(i11);
                while (true) {
                    int iJ2 = j();
                    c cVar3 = this.o[i10];
                    if (iJ2 >= cVar3.d + cVar3.e) {
                        break;
                    }
                    d();
                    if (this.b == "Subrs") {
                        this.o[i10].f = ((Integer) this.c[0]).intValue() + this.o[i10].d;
                    }
                }
            }
            int i12 = this.o[i10].j;
            if (i12 >= 0) {
                int[] iArrF4 = f(i12);
                c cVar4 = this.o[i10];
                cVar4.l = new int[iArrF4.length - 1];
                cVar4.m = new int[iArrF4.length - 1];
                int i13 = 0;
                while (i13 < iArrF4.length - 1) {
                    m(iArrF4[i13]);
                    while (true) {
                        i3 = i13 + 1;
                        if (j() >= iArrF4[i3]) {
                            break;
                        } else {
                            d();
                        }
                    }
                    if (this.b == "Private") {
                        this.o[i10].m[i13] = ((Integer) this.c[0]).intValue();
                        this.o[i10].l[i13] = ((Integer) this.c[1]).intValue();
                    }
                    i13 = i3;
                }
            }
            i10 = i2;
        }
    }

    public void a(int i2) {
        m(i2);
        c();
    }

    public char b() {
        try {
            return this.e.readChar();
        } catch (Exception e2) {
            throw new p52(e2);
        }
    }

    public char c() {
        try {
            return (char) (this.e.readByte() & UByte.MAX_VALUE);
        } catch (Exception e2) {
            throw new p52(e2);
        }
    }

    public void d() {
        for (int i2 = 0; i2 < this.d; i2++) {
            this.c[i2] = null;
        }
        this.d = 0;
        this.b = null;
        boolean z = false;
        while (!z) {
            char c2 = c();
            if (c2 == 29) {
                this.c[this.d] = Integer.valueOf(g());
                this.d++;
            } else if (c2 == 28) {
                this.c[this.d] = Integer.valueOf(k());
                this.d++;
            } else if (c2 >= ' ' && c2 <= 246) {
                this.c[this.d] = Integer.valueOf((byte) (c2 - 139));
                this.d++;
            } else if (c2 >= 247 && c2 <= 250) {
                this.c[this.d] = Integer.valueOf((short) (((c2 - 247) * 256) + c() + 108));
                this.d++;
            } else if (c2 >= 251 && c2 <= 254) {
                this.c[this.d] = Integer.valueOf((short) ((((-(c2 - 251)) * 256) - c()) - 108));
                this.d++;
            } else if (c2 == 30) {
                StringBuilder sb = new StringBuilder("");
                boolean z2 = false;
                byte b2 = 0;
                char c3 = 0;
                int i3 = 0;
                while (!z2) {
                    if (b2 == 0) {
                        c3 = c();
                        b2 = 2;
                    }
                    if (b2 == 1) {
                        i3 = c3 / 16;
                        b2 = (byte) (b2 - 1);
                    }
                    if (b2 == 2) {
                        i3 = c3 % 16;
                        b2 = (byte) (b2 - 1);
                    }
                    switch (i3) {
                        case 10:
                            sb.append(".");
                            break;
                        case 11:
                            sb.append("E");
                            break;
                        case 12:
                            sb.append("E-");
                            break;
                        case 13:
                        default:
                            if (i3 < 0 || i3 > 9) {
                                sb.append("<NIBBLE ERROR: ");
                                sb.append(i3);
                                sb.append(Typography.greater);
                                z2 = true;
                            } else {
                                sb.append(String.valueOf(i3));
                            }
                            break;
                        case 14:
                            sb.append("-");
                            break;
                        case 15:
                            z2 = true;
                            break;
                    }
                }
                this.c[this.d] = sb.toString();
                this.d++;
            } else if (c2 <= 21) {
                if (c2 != '\f') {
                    this.b = p[c2];
                } else {
                    this.b = p[c() + ' '];
                }
                z = true;
            }
        }
    }

    public j e(int i2) {
        m(i2);
        char cB = b();
        if (cB == 0) {
            return new j(this.e, i2, 2);
        }
        char c2 = c();
        m(i2 + 3 + (cB * c2));
        return new j(this.e, i2, ((cB + 1) * c2) + 3 + (i(c2) - 1));
    }

    public int[] f(int i2) {
        m(i2);
        char cB = b();
        int[] iArr = new int[cB + 1];
        if (cB == 0) {
            iArr[0] = -1;
            return iArr;
        }
        char c2 = c();
        for (int i3 = 0; i3 <= cB; i3++) {
            iArr[i3] = (((i2 + 3) + (r1 * c2)) - 1) + i(c2);
        }
        return iArr;
    }

    public int g() {
        try {
            return this.e.readInt();
        } catch (Exception e2) {
            throw new p52(e2);
        }
    }

    public String[] h() {
        String[] strArr = new String[this.o.length];
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.o;
            if (i2 >= cVarArr.length) {
                return strArr;
            }
            strArr[i2] = cVarArr[i2].a;
            i2++;
        }
    }

    public int i(int i2) {
        int iC = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iC = (iC * 256) + c();
        }
        return iC;
    }

    public int j() {
        try {
            return this.e.c();
        } catch (Exception e2) {
            throw new p52(e2);
        }
    }

    public short k() {
        try {
            return this.e.readShort();
        } catch (Exception e2) {
            throw new p52(e2);
        }
    }

    public String l(char c2) {
        String[] strArr = q;
        if (c2 < strArr.length) {
            return strArr[c2];
        }
        if (c2 >= (strArr.length + this.m.length) - 1) {
            return null;
        }
        int length = c2 - strArr.length;
        int iJ = j();
        m(this.m[length]);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = this.m[length]; i2 < this.m[length + 1]; i2++) {
            stringBuffer.append(c());
        }
        m(iJ);
        return stringBuffer.toString();
    }

    public void m(int i2) {
        try {
            this.e.j(i2);
        } catch (Exception e2) {
            throw new p52(e2);
        }
    }
}
