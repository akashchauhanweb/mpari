package com.zepto;

import com.zepto.s40;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class ko6 extends s40 {
    public static ke2 X;
    public static final int[] Y = {1, 2, 1};
    public String A;
    public String B;
    public String F;
    public String M;
    public int R;
    public String V;
    public boolean W;
    public byte[] y;
    public String z;
    public String C = "";
    public float D = 0.0f;
    public boolean E = false;
    public int G = -50;
    public int H = -200;
    public int I = 1000;
    public int J = 900;
    public int K = -100;
    public int L = 50;
    public int N = 700;
    public int O = 480;
    public int P = 800;
    public int Q = -200;
    public int S = 80;
    public HashMap T = new HashMap();
    public HashMap U = new HashMap();

    /* JADX WARN: Finally extract failed */
    public ko6(String str, String str2, boolean z, byte[] bArr, byte[] bArr2, boolean z2) throws Throwable {
        i45 i45Var;
        this.M = "FontSpecific";
        this.W = false;
        if (z && bArr != null && bArr2 == null) {
            throw new cu1(dt3.b("two.byte.arrays.are.needed.if.the.type1.font.is.embedded", new Object[0]));
        }
        if (z && bArr != null) {
            this.y = bArr2;
        }
        this.j = str2;
        this.k = z;
        this.V = str;
        this.e = 0;
        i45 i45Var2 = null;
        i45 i45Var3 = null;
        InputStream inputStream = null;
        i45 i45Var4 = null;
        try {
            if (s40.x.containsKey(str)) {
                this.k = false;
                this.W = true;
                byte[] bArr3 = new byte[1024];
                try {
                    if (X == null) {
                        X = new ke2();
                    }
                    InputStream inputStreamR = s40.r("com/itextpdf/text/pdf/fonts/" + str + ".afm", X.getClass().getClassLoader());
                    try {
                        if (inputStreamR == null) {
                            String strB = dt3.b("1.not.found.as.resource", str);
                            System.err.println(strB);
                            throw new cu1(strB);
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i = inputStreamR.read(bArr3);
                            if (i < 0) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr3, 0, i);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStreamR.close();
                        } catch (Exception unused) {
                        }
                        try {
                            i45Var = new i45(byteArray);
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            F(i45Var);
                            i45Var.close();
                        } catch (Throwable th2) {
                            th = th2;
                            i45Var3 = i45Var;
                            if (i45Var3 != null) {
                                try {
                                    i45Var3.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStreamR;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else if (str.toLowerCase().endsWith(".afm")) {
                try {
                    i45Var2 = bArr == null ? new i45(str, z2, bu1.q) : new i45(bArr);
                    F(i45Var2);
                    i45Var2.close();
                } catch (Throwable th5) {
                    if (i45Var2 != null) {
                        try {
                            i45Var2.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th5;
                }
            } else {
                if (!str.toLowerCase().endsWith(".pfm")) {
                    throw new cu1(dt3.b("1.is.not.an.afm.or.pfm.font.file", str));
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    i45Var4 = bArr == null ? new i45(str, z2, bu1.q) : new i45(bArr);
                    zr4.a(i45Var4, byteArrayOutputStream2);
                    i45Var4.close();
                    i45 i45Var5 = new i45(byteArrayOutputStream2.toByteArray());
                    try {
                        F(i45Var5);
                        i45Var5.close();
                    } catch (Throwable th6) {
                        i45Var4 = i45Var5;
                        th = th6;
                        if (i45Var4 == null) {
                            throw th;
                        }
                        try {
                            i45Var4.close();
                            throw th;
                        } catch (Exception unused5) {
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        } catch (Exception unused6) {
        }
        String strTrim = this.M.trim();
        this.M = strTrim;
        if (strTrim.equals("AdobeStandardEncoding") || this.M.equals("StandardEncoding")) {
            this.m = false;
        }
        if (!this.j.startsWith("#")) {
            xo4.c(" ", str2);
        }
        c();
    }

    @Override // com.zepto.s40
    public void B(pq4 pq4Var, gp4 gp4Var, Object[] objArr) {
        int i = 0;
        int iIntValue = ((Integer) objArr[0]).intValue();
        int iIntValue2 = ((Integer) objArr[1]).intValue();
        byte[] bArr = (byte[]) objArr[2];
        if (((Boolean) objArr[3]).booleanValue() && this.p) {
            i = iIntValue;
        } else {
            iIntValue2 = bArr.length - 1;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = 1;
            }
        }
        gq4 gq4VarE = E();
        gp4 gp4VarA = gq4VarE != null ? pq4Var.n(gq4VarE).a() : null;
        uo4 uo4VarD = D(gp4VarA);
        if (uo4VarD != null) {
            gp4VarA = pq4Var.n(uo4VarD).a();
        }
        pq4Var.o(C(gp4VarA, i, iIntValue2, bArr), gp4Var);
    }

    public final uo4 C(gp4 gp4Var, int i, int i2, byte[] bArr) {
        uo4 uo4Var = new uo4(lp4.u3);
        uo4Var.r(lp4.v9, lp4.ua);
        uo4Var.r(lp4.Y, new lp4(this.z));
        boolean z = this.j.equals("Cp1252") || this.j.equals("MacRoman");
        if (!this.m || this.r != null) {
            int i3 = i;
            while (true) {
                if (i3 > i2) {
                    break;
                }
                if (!this.g[i3].equals(".notdef")) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (z) {
                uo4Var.r(lp4.E2, this.j.equals("Cp1252") ? lp4.lb : lp4.B5);
            } else {
                uo4 uo4Var2 = new uo4(lp4.E2);
                ko4 ko4Var = new ko4();
                boolean z2 = true;
                for (int i4 = i; i4 <= i2; i4++) {
                    if (bArr[i4] != 0) {
                        if (z2) {
                            ko4Var.m(new op4(i4));
                            z2 = false;
                        }
                        ko4Var.m(new lp4(this.g[i4]));
                    } else {
                        z2 = true;
                    }
                }
                uo4Var2.r(lp4.a2, ko4Var);
                uo4Var.r(lp4.E2, uo4Var2);
            }
        }
        if (this.r != null || this.n || !this.W || (!this.m && !z)) {
            uo4Var.r(lp4.e3, new op4(i));
            uo4Var.r(lp4.g5, new op4(i2));
            ko4 ko4Var2 = new ko4();
            while (i <= i2) {
                if (bArr[i] == 0) {
                    ko4Var2.m(new op4(0));
                } else {
                    ko4Var2.m(new op4(this.f[i]));
                }
                i++;
            }
            uo4Var.r(lp4.jb, ko4Var2);
        }
        if (!this.W && gp4Var != null) {
            uo4Var.r(lp4.w3, gp4Var);
        }
        return uo4Var;
    }

    public final uo4 D(gp4 gp4Var) {
        if (this.W) {
            return null;
        }
        uo4 uo4Var = new uo4(lp4.w3);
        uo4Var.r(lp4.N, new op4(this.P));
        uo4Var.r(lp4.D0, new op4(this.N));
        uo4Var.r(lp4.S1, new op4(this.Q));
        uo4Var.r(lp4.v3, new cq4(this.G, this.H, this.I, this.J));
        uo4Var.r(lp4.B3, new lp4(this.z));
        uo4Var.r(lp4.Q4, new op4(this.D));
        uo4Var.r(lp4.j9, new op4(this.S));
        if (gp4Var != null) {
            uo4Var.r(lp4.x3, gp4Var);
        }
        int i = (this.E ? 1 : 0) | (this.m ? 4 : 32);
        if (this.D < 0.0f) {
            i |= 64;
        }
        if (this.z.indexOf("Caps") >= 0 || this.z.endsWith("SC")) {
            i |= 131072;
        }
        if (this.C.equals("Bold")) {
            i |= 262144;
        }
        uo4Var.r(lp4.p3, new op4(i));
        return uo4Var;
    }

    public gq4 E() {
        i45 i45Var = null;
        if (!this.W) {
            try {
                if (this.k) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        String str = this.V;
                        sb.append(str.substring(0, str.length() - 3));
                        sb.append("pfb");
                        String string = sb.toString();
                        byte[] bArr = this.y;
                        i45 i45Var2 = bArr == null ? new i45(string, true, bu1.q) : new i45(bArr);
                        byte[] bArr2 = new byte[i45Var2.e() - 18];
                        int[] iArr = new int[3];
                        int i = 0;
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (i45Var2.read() != 128) {
                                throw new cu1(dt3.b("start.marker.missing.in.1", string));
                            }
                            if (i45Var2.read() != Y[i2]) {
                                throw new cu1(dt3.b("incorrect.segment.type.in.1", string));
                            }
                            int i3 = i45Var2.read() + (i45Var2.read() << 8) + (i45Var2.read() << 16) + (i45Var2.read() << 24);
                            iArr[i2] = i3;
                            while (i3 != 0) {
                                int i4 = i45Var2.read(bArr2, i, i3);
                                if (i4 < 0) {
                                    throw new cu1(dt3.b("premature.end.in.1", string));
                                }
                                i += i4;
                                i3 -= i4;
                            }
                        }
                        s40.a aVar = new s40.a(bArr2, iArr, this.l);
                        try {
                            i45Var2.close();
                        } catch (Exception unused) {
                        }
                        return aVar;
                    } catch (Exception e) {
                        throw new cu1(e);
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        i45Var.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        }
        return null;
    }

    public void F(i45 i45Var) throws cu1, IOException {
        boolean z;
        Object[] objArr;
        while (true) {
            String line = i45Var.readLine();
            if (line == null) {
                z = false;
                break;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line, " ,\n\r\t\f");
            if (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.equals("FontName")) {
                    this.z = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (strNextToken.equals("FullName")) {
                    this.A = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (strNextToken.equals("FamilyName")) {
                    this.B = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (strNextToken.equals("Weight")) {
                    this.C = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (strNextToken.equals("ItalicAngle")) {
                    this.D = Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("IsFixedPitch")) {
                    this.E = stringTokenizer.nextToken().equals("true");
                } else if (strNextToken.equals("CharacterSet")) {
                    this.F = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (strNextToken.equals("FontBBox")) {
                    this.G = (int) Float.parseFloat(stringTokenizer.nextToken());
                    this.H = (int) Float.parseFloat(stringTokenizer.nextToken());
                    this.I = (int) Float.parseFloat(stringTokenizer.nextToken());
                    this.J = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("UnderlinePosition")) {
                    this.K = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("UnderlineThickness")) {
                    this.L = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("EncodingScheme")) {
                    this.M = stringTokenizer.nextToken("ÿ").substring(1);
                } else if (strNextToken.equals("CapHeight")) {
                    this.N = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("XHeight")) {
                    this.O = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("Ascender")) {
                    this.P = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("Descender")) {
                    this.Q = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("StdHW")) {
                    this.R = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("StdVW")) {
                    this.S = (int) Float.parseFloat(stringTokenizer.nextToken());
                } else if (strNextToken.equals("StartCharMetrics")) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            throw new cu1(dt3.b("missing.startcharmetrics.in.1", this.V));
        }
        while (true) {
            String line2 = i45Var.readLine();
            if (line2 == null) {
                break;
            }
            StringTokenizer stringTokenizer2 = new StringTokenizer(line2);
            if (stringTokenizer2.hasMoreTokens()) {
                if (stringTokenizer2.nextToken().equals("EndCharMetrics")) {
                    z = false;
                    break;
                }
                Integer numValueOf = -1;
                int iValueOf = 250;
                StringTokenizer stringTokenizer3 = new StringTokenizer(line2, ";");
                String strNextToken2 = "";
                int[] iArr = null;
                while (stringTokenizer3.hasMoreTokens()) {
                    StringTokenizer stringTokenizer4 = new StringTokenizer(stringTokenizer3.nextToken());
                    if (stringTokenizer4.hasMoreTokens()) {
                        String strNextToken3 = stringTokenizer4.nextToken();
                        if (strNextToken3.equals("C")) {
                            numValueOf = Integer.valueOf(stringTokenizer4.nextToken());
                        } else if (strNextToken3.equals("WX")) {
                            iValueOf = Integer.valueOf((int) Float.parseFloat(stringTokenizer4.nextToken()));
                        } else if (strNextToken3.equals("N")) {
                            strNextToken2 = stringTokenizer4.nextToken();
                        } else if (strNextToken3.equals("B")) {
                            iArr = new int[]{Integer.parseInt(stringTokenizer4.nextToken()), Integer.parseInt(stringTokenizer4.nextToken()), Integer.parseInt(stringTokenizer4.nextToken()), Integer.parseInt(stringTokenizer4.nextToken())};
                        }
                    }
                }
                Object[] objArr2 = {numValueOf, iValueOf, strNextToken2, iArr};
                if (numValueOf.intValue() >= 0) {
                    this.T.put(numValueOf, objArr2);
                }
                this.T.put(strNextToken2, objArr2);
            }
        }
        if (z) {
            throw new cu1(dt3.b("missing.endcharmetrics.in.1", this.V));
        }
        if (!this.T.containsKey("nonbreakingspace") && (objArr = (Object[]) this.T.get("space")) != null) {
            this.T.put("nonbreakingspace", objArr);
        }
        while (true) {
            String line3 = i45Var.readLine();
            if (line3 == null) {
                break;
            }
            StringTokenizer stringTokenizer5 = new StringTokenizer(line3);
            if (stringTokenizer5.hasMoreTokens()) {
                String strNextToken4 = stringTokenizer5.nextToken();
                if (strNextToken4.equals("EndFontMetrics")) {
                    return;
                }
                if (strNextToken4.equals("StartKernPairs")) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            throw new cu1(dt3.b("missing.endfontmetrics.in.1", this.V));
        }
        while (true) {
            String line4 = i45Var.readLine();
            if (line4 != null) {
                StringTokenizer stringTokenizer6 = new StringTokenizer(line4);
                if (stringTokenizer6.hasMoreTokens()) {
                    String strNextToken5 = stringTokenizer6.nextToken();
                    if (strNextToken5.equals("KPX")) {
                        String strNextToken6 = stringTokenizer6.nextToken();
                        String strNextToken7 = stringTokenizer6.nextToken();
                        Integer numValueOf2 = Integer.valueOf((int) Float.parseFloat(stringTokenizer6.nextToken()));
                        Object[] objArr3 = (Object[]) this.U.get(strNextToken6);
                        if (objArr3 == null) {
                            this.U.put(strNextToken6, new Object[]{strNextToken7, numValueOf2});
                        } else {
                            int length = objArr3.length;
                            Object[] objArr4 = new Object[length + 2];
                            System.arraycopy(objArr3, 0, objArr4, 0, length);
                            objArr4[length] = strNextToken7;
                            objArr4[length + 1] = numValueOf2;
                            this.U.put(strNextToken6, objArr4);
                        }
                    } else if (strNextToken5.equals("EndKernPairs")) {
                        break;
                    }
                }
            } else if (z) {
                throw new cu1(dt3.b("missing.endkernpairs.in.1", this.V));
            }
        }
        i45Var.close();
    }

    @Override // com.zepto.s40
    public String[][] k() {
        return new String[][]{new String[]{"", "", "", this.B}};
    }

    @Override // com.zepto.s40
    public float l(int i, float f) {
        int i2;
        switch (i) {
            case 1:
            case 9:
                i2 = this.P;
                break;
            case 2:
                i2 = this.N;
                break;
            case 3:
            case 10:
                i2 = this.Q;
                break;
            case 4:
                return this.D;
            case 5:
                i2 = this.G;
                break;
            case 6:
                i2 = this.H;
                break;
            case 7:
                i2 = this.I;
                break;
            case 8:
                i2 = this.J;
                break;
            case 11:
            default:
                return 0.0f;
            case 12:
                i2 = this.I - this.G;
                break;
            case 13:
                i2 = this.K;
                break;
            case 14:
                i2 = this.L;
                break;
        }
        return (i2 * f) / 1000.0f;
    }

    @Override // com.zepto.s40
    public String n() {
        return this.z;
    }

    @Override // com.zepto.s40
    public int[] o(int i, String str) {
        Object[] objArr;
        if (str == null) {
            objArr = (Object[]) this.T.get(Integer.valueOf(i));
        } else {
            if (str.equals(".notdef")) {
                return null;
            }
            objArr = (Object[]) this.T.get(str);
        }
        if (objArr != null) {
            return (int[]) objArr[3];
        }
        return null;
    }

    @Override // com.zepto.s40
    public int p(int i, String str) {
        Object[] objArr;
        if (str == null) {
            objArr = (Object[]) this.T.get(Integer.valueOf(i));
        } else {
            if (str.equals(".notdef")) {
                return 0;
            }
            objArr = (Object[]) this.T.get(str);
        }
        if (objArr != null) {
            return ((Integer) objArr[1]).intValue();
        }
        return 0;
    }
}
