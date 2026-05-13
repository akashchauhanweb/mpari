package com.zepto;

import com.zepto.s40;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class eo6 extends s40 {
    public static final String[] Z = {"1252 Latin 1", "1250 Latin 2: Eastern Europe", "1251 Cyrillic", "1253 Greek", "1254 Turkish", "1255 Hebrew", "1256 Arabic", "1257 Windows Baltic", "1258 Vietnamese", null, null, null, null, null, null, null, "874 Thai", "932 JIS/Japan", "936 Chinese: Simplified chars--PRC and Singapore", "949 Korean Wansung", "950 Chinese: Traditional chars--Taiwan and Hong Kong", "1361 Korean Johab", null, null, null, null, null, null, null, "Macintosh Character Set (US Roman)", "OEM Character Set", "Symbol Character Set", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "869 IBM Greek", "866 MS-DOS Russian", "865 MS-DOS Nordic", "864 Arabic", "863 MS-DOS Canadian French", "862 Hebrew", "861 MS-DOS Icelandic", "860 MS-DOS Portuguese", "857 IBM Turkish", "855 IBM Cyrillic; primarily Russian", "852 Latin 2", "775 MS-DOS Baltic", "737 Greek; former 437 G", "708 Arabic; ASMO 708", "850 WE/Latin 1", "437 US"};
    public i45 A;
    public String B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public String G;
    public String H;
    public a I;
    public b J;
    public c K;
    public int[] L;
    public int[][] M;
    public HashMap N;
    public HashMap O;
    public HashMap P;
    public k03 Q;
    public String R;
    public String[][] S;
    public String[][] T;
    public String[][] U;
    public double V;
    public boolean W;
    public int X;
    public int Y;
    public boolean y;
    public HashMap z;

    public static class a {
        public int a;
        public int b;
        public short c;
        public short d;
        public short e;
        public short f;
        public int g;
    }

    public static class b {
        public short a;
        public short b;
        public short c;
        public int d;
        public short e;
        public short f;
        public short g;
        public short h;
        public short i;
        public int j;
    }

    public static class c {
        public int A;
        public int B;
        public short a;
        public int b;
        public int c;
        public short d;
        public short e;
        public short f;
        public short g;
        public short h;
        public short i;
        public short j;
        public short k;
        public short l;
        public short m;
        public short n;
        public short o;
        public byte[] p = new byte[10];
        public byte[] q = new byte[4];
        public int r;
        public int s;
        public int t;
        public short u;
        public short v;
        public short w;
        public int x;
        public int y;
        public int z;
    }

    public eo6() {
        this.y = false;
        this.C = false;
        this.H = "";
        this.I = new a();
        this.J = new b();
        this.K = new c();
        this.Q = new k03();
        this.W = false;
    }

    public static int[] F(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            int[] iArr = (int[]) arrayList.get(i);
            for (int i2 = 0; i2 < iArr.length; i2 += 2) {
                int i3 = i2 + 1;
                arrayList2.add(new int[]{Math.max(0, Math.min(iArr[i2], iArr[i3])), Math.min(65535, Math.max(iArr[i2], iArr[i3]))});
            }
        }
        int i4 = 0;
        while (i4 < arrayList2.size() - 1) {
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList2.size()) {
                int[] iArr2 = (int[]) arrayList2.get(i4);
                int[] iArr3 = (int[]) arrayList2.get(i6);
                int i7 = iArr2[0];
                int i8 = iArr3[0];
                if ((i7 >= i8 && i7 <= iArr3[1]) || (iArr2[1] >= i8 && i7 <= iArr3[1])) {
                    iArr2[0] = Math.min(i7, i8);
                    iArr2[1] = Math.max(iArr2[1], iArr3[1]);
                    arrayList2.remove(i6);
                    i6--;
                }
                i6++;
            }
            i4 = i5;
        }
        int[] iArr4 = new int[arrayList2.size() * 2];
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            int[] iArr5 = (int[]) arrayList2.get(i9);
            int i10 = i9 * 2;
            iArr4[i10] = iArr5[0];
            iArr4[i10 + 1] = iArr5[1];
        }
        return iArr4;
    }

    public static String P(String str) {
        int iIndexOf = str.toLowerCase().indexOf(".ttc,");
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf + 4);
    }

    @Override // com.zepto.s40
    public void B(pq4 pq4Var, gp4 gp4Var, Object[] objArr) {
        int i;
        int i2;
        String strH;
        gp4 gp4VarA;
        int[] iArrN;
        int iIntValue = ((Integer) objArr[0]).intValue();
        int iIntValue2 = ((Integer) objArr[1]).intValue();
        byte[] bArr = (byte[]) objArr[2];
        boolean z = ((Boolean) objArr[3]).booleanValue() && this.p;
        if (z) {
            i = iIntValue2;
            i2 = iIntValue;
        } else {
            int length = bArr.length - 1;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                bArr[i3] = 1;
            }
            i2 = 0;
            i = length;
        }
        strH = "";
        if (!this.k) {
            gp4VarA = null;
        } else if (this.C) {
            gp4VarA = pq4Var.n(new s40.a(T(), "Type1C", this.l)).a();
        } else {
            strH = z ? s40.h() : "";
            HashSet hashSet = new HashSet();
            for (int i4 = i2; i4 <= i; i4++) {
                if (bArr[i4] != 0) {
                    if (this.r != null) {
                        int[] iArrA = rj2.a(this.g[i4]);
                        iArrN = iArrA != null ? N(iArrA[0]) : null;
                    } else {
                        iArrN = this.m ? N(i4) : N(this.h[i4]);
                    }
                    if (iArrN != null) {
                        hashSet.add(Integer.valueOf(iArrN[0]));
                    }
                }
            }
            D(hashSet, z);
            byte[] bArrL = (!z && this.F == 0 && this.c == null) ? L() : new fo6(this.B, new i45(this.A), hashSet, this.F, true, !z).h();
            gp4VarA = pq4Var.n(new s40.a(bArrL, new int[]{bArrL.length}, this.l)).a();
        }
        String str = strH;
        uo4 uo4VarK = K(gp4VarA, str, null);
        if (uo4VarK != null) {
            gp4VarA = pq4Var.n(uo4VarK).a();
        }
        pq4Var.o(J(gp4VarA, str, i2, i, bArr), gp4Var);
    }

    public void C(HashMap map, boolean z, boolean z2) {
        HashMap map2;
        if (z2) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList != null || this.F > 0) {
            int[] iArrF = (arrayList != null || this.F <= 0) ? F(arrayList) : new int[]{0, 65535};
            boolean z3 = this.m;
            if ((z3 || (map2 = this.O) == null) && ((!z3 || (map2 = this.N) == null) && (map2 = this.O) == null)) {
                map2 = this.N;
            }
            for (Map.Entry entry : map2.entrySet()) {
                int[] iArr = (int[]) entry.getValue();
                Integer numValueOf = Integer.valueOf(iArr[0]);
                if (!map.containsKey(numValueOf)) {
                    int iIntValue = ((Integer) entry.getKey()).intValue();
                    int i = 0;
                    while (true) {
                        if (i >= iArrF.length) {
                            break;
                        }
                        if (iIntValue < iArrF[i] || iIntValue > iArrF[i + 1]) {
                            i += 2;
                        } else {
                            map.put(numValueOf, z ? new int[]{iArr[0], iArr[1], iIntValue} : null);
                        }
                    }
                }
            }
        }
    }

    public void D(HashSet hashSet, boolean z) {
        HashMap map;
        if (z) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList != null || this.F > 0) {
            int[] iArrF = (arrayList != null || this.F <= 0) ? F(arrayList) : new int[]{0, 65535};
            boolean z2 = this.m;
            if ((z2 || (map = this.O) == null) && ((!z2 || (map = this.N) == null) && (map = this.O) == null)) {
                map = this.N;
            }
            for (Map.Entry entry : map.entrySet()) {
                Integer numValueOf = Integer.valueOf(((int[]) entry.getValue())[0]);
                if (!hashSet.contains(numValueOf)) {
                    int iIntValue = ((Integer) entry.getKey()).intValue();
                    int i = 0;
                    while (true) {
                        if (i >= iArrF.length) {
                            break;
                        }
                        if (iIntValue >= iArrF[i] && iIntValue <= iArrF[i + 1]) {
                            hashSet.add(numValueOf);
                            break;
                        }
                        i += 2;
                    }
                }
            }
        }
    }

    public void E() {
        int[] iArr = (int[]) this.z.get("CFF ");
        if (iArr != null) {
            this.C = true;
            this.D = iArr[0];
            this.E = iArr[1];
        }
    }

    public void G() throws cu1, IOException {
        int[] iArr = (int[]) this.z.get("head");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "head", this.B + this.H));
        }
        this.A.j(iArr[0] + 16);
        this.I.a = this.A.readUnsignedShort();
        this.I.b = this.A.readUnsignedShort();
        this.A.skipBytes(16);
        this.I.c = this.A.readShort();
        this.I.d = this.A.readShort();
        this.I.e = this.A.readShort();
        this.I.f = this.A.readShort();
        this.I.g = this.A.readUnsignedShort();
        int[] iArr2 = (int[]) this.z.get("hhea");
        if (iArr2 == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "hhea", this.B + this.H));
        }
        this.A.j(iArr2[0] + 4);
        this.J.a = this.A.readShort();
        this.J.b = this.A.readShort();
        this.J.c = this.A.readShort();
        this.J.d = this.A.readUnsignedShort();
        this.J.e = this.A.readShort();
        this.J.f = this.A.readShort();
        this.J.g = this.A.readShort();
        this.J.h = this.A.readShort();
        this.J.i = this.A.readShort();
        this.A.skipBytes(12);
        this.J.j = this.A.readUnsignedShort();
        int[] iArr3 = (int[]) this.z.get("OS/2");
        if (iArr3 == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "OS/2", this.B + this.H));
        }
        this.A.j(iArr3[0]);
        int unsignedShort = this.A.readUnsignedShort();
        this.K.a = this.A.readShort();
        this.K.b = this.A.readUnsignedShort();
        this.K.c = this.A.readUnsignedShort();
        this.K.d = this.A.readShort();
        this.K.e = this.A.readShort();
        this.K.f = this.A.readShort();
        this.K.g = this.A.readShort();
        this.K.h = this.A.readShort();
        this.K.i = this.A.readShort();
        this.K.j = this.A.readShort();
        this.K.k = this.A.readShort();
        this.K.l = this.A.readShort();
        this.K.m = this.A.readShort();
        this.K.n = this.A.readShort();
        this.K.o = this.A.readShort();
        this.A.readFully(this.K.p);
        this.A.skipBytes(16);
        this.A.readFully(this.K.q);
        this.K.r = this.A.readUnsignedShort();
        this.K.s = this.A.readUnsignedShort();
        this.K.t = this.A.readUnsignedShort();
        this.K.u = this.A.readShort();
        this.K.v = this.A.readShort();
        c cVar = this.K;
        short s = cVar.v;
        if (s > 0) {
            cVar.v = (short) (-s);
        }
        cVar.w = this.A.readShort();
        this.K.x = this.A.readUnsignedShort();
        this.K.y = this.A.readUnsignedShort();
        c cVar2 = this.K;
        cVar2.z = 0;
        cVar2.A = 0;
        if (unsignedShort > 0) {
            cVar2.z = this.A.readInt();
            this.K.A = this.A.readInt();
        }
        if (unsignedShort > 1) {
            this.A.skipBytes(2);
            this.K.B = this.A.readShort();
        } else {
            this.K.B = (int) (((double) this.I.b) * 0.7d);
        }
        int[] iArr4 = (int[]) this.z.get("post");
        if (iArr4 == null) {
            b bVar = this.J;
            this.V = ((-Math.atan2(bVar.i, bVar.h)) * 180.0d) / 3.141592653589793d;
            return;
        }
        this.A.j(iArr4[0] + 4);
        this.V = ((double) this.A.readShort()) + (((double) this.A.readUnsignedShort()) / 16384.0d);
        this.X = this.A.readShort();
        this.Y = this.A.readShort();
        this.W = this.A.readInt() != 0;
    }

    public String[][] H() throws cu1, IOException {
        int[] iArr = (int[]) this.z.get("name");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "name", this.B + this.H));
        }
        this.A.j(iArr[0] + 2);
        int unsignedShort = this.A.readUnsignedShort();
        int unsignedShort2 = this.A.readUnsignedShort();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unsignedShort; i++) {
            int unsignedShort3 = this.A.readUnsignedShort();
            int unsignedShort4 = this.A.readUnsignedShort();
            int unsignedShort5 = this.A.readUnsignedShort();
            int unsignedShort6 = this.A.readUnsignedShort();
            int unsignedShort7 = this.A.readUnsignedShort();
            int unsignedShort8 = this.A.readUnsignedShort();
            int iC = this.A.c();
            this.A.j(iArr[0] + unsignedShort2 + unsignedShort8);
            arrayList.add(new String[]{String.valueOf(unsignedShort6), String.valueOf(unsignedShort3), String.valueOf(unsignedShort4), String.valueOf(unsignedShort5), (unsignedShort3 == 0 || unsignedShort3 == 3 || (unsignedShort3 == 2 && unsignedShort4 == 1)) ? b0(unsignedShort7) : a0(unsignedShort7)});
            this.A.j(iC);
        }
        String[][] strArr = new String[arrayList.size()][];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String[]) arrayList.get(i2);
        }
        return strArr;
    }

    public String I() throws cu1, IOException {
        int[] iArr = (int[]) this.z.get("name");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "name", this.B + this.H));
        }
        this.A.j(iArr[0] + 2);
        int unsignedShort = this.A.readUnsignedShort();
        int unsignedShort2 = this.A.readUnsignedShort();
        for (int i = 0; i < unsignedShort; i++) {
            int unsignedShort3 = this.A.readUnsignedShort();
            this.A.readUnsignedShort();
            this.A.readUnsignedShort();
            int unsignedShort4 = this.A.readUnsignedShort();
            int unsignedShort5 = this.A.readUnsignedShort();
            int unsignedShort6 = this.A.readUnsignedShort();
            if (unsignedShort4 == 6) {
                this.A.j(iArr[0] + unsignedShort2 + unsignedShort6);
                return (unsignedShort3 == 0 || unsignedShort3 == 3) ? b0(unsignedShort5) : a0(unsignedShort5);
            }
        }
        return new File(this.B).getName().replace(' ', '-');
    }

    public uo4 J(gp4 gp4Var, String str, int i, int i2, byte[] bArr) {
        uo4 uo4Var = new uo4(lp4.u3);
        if (this.C) {
            uo4Var.r(lp4.v9, lp4.ua);
            uo4Var.r(lp4.Y, new lp4(this.R + this.H));
        } else {
            uo4Var.r(lp4.v9, lp4.ka);
            uo4Var.r(lp4.Y, new lp4(str + this.R + this.H));
        }
        uo4Var.r(lp4.Y, new lp4(str + this.R + this.H));
        if (!this.m) {
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
            if (this.j.equals("Cp1252") || this.j.equals("MacRoman")) {
                uo4Var.r(lp4.E2, this.j.equals("Cp1252") ? lp4.lb : lp4.B5);
            } else {
                uo4 uo4Var2 = new uo4(lp4.E2);
                ko4 ko4Var = new ko4();
                boolean z = true;
                for (int i4 = i; i4 <= i2; i4++) {
                    if (bArr[i4] != 0) {
                        if (z) {
                            ko4Var.m(new op4(i4));
                            z = false;
                        }
                        ko4Var.m(new lp4(this.g[i4]));
                    } else {
                        z = true;
                    }
                }
                uo4Var2.r(lp4.a2, ko4Var);
                uo4Var.r(lp4.E2, uo4Var2);
            }
        }
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
        if (gp4Var != null) {
            uo4Var.r(lp4.w3, gp4Var);
        }
        return uo4Var;
    }

    public uo4 K(gp4 gp4Var, String str, gp4 gp4Var2) {
        uo4 uo4Var = new uo4(lp4.w3);
        uo4Var.r(lp4.N, new op4((this.K.u * 1000) / this.I.b));
        uo4Var.r(lp4.D0, new op4((this.K.B * 1000) / this.I.b));
        uo4Var.r(lp4.S1, new op4((this.K.v * 1000) / this.I.b));
        lp4 lp4Var = lp4.v3;
        a aVar = this.I;
        int i = aVar.c * 1000;
        int i2 = aVar.b;
        uo4Var.r(lp4Var, new cq4(i / i2, (aVar.d * 1000) / i2, (aVar.e * 1000) / i2, (aVar.f * 1000) / i2));
        if (gp4Var2 != null) {
            uo4Var.r(lp4.T0, gp4Var2);
        }
        if (!this.C) {
            uo4Var.r(lp4.B3, new lp4(str + this.R + this.H));
        } else if (this.j.startsWith("Identity-")) {
            uo4Var.r(lp4.B3, new lp4(str + this.R + "-" + this.j));
        } else {
            uo4Var.r(lp4.B3, new lp4(str + this.R + this.H));
        }
        uo4Var.r(lp4.Q4, new op4(this.V));
        uo4Var.r(lp4.j9, new op4(80));
        if (gp4Var != null) {
            if (this.C) {
                uo4Var.r(lp4.z3, gp4Var);
            } else {
                uo4Var.r(lp4.y3, gp4Var);
            }
        }
        int i3 = (this.W ? 1 : 0) | (this.m ? 4 : 32);
        int i4 = this.I.g;
        if ((i4 & 2) != 0) {
            i3 |= 64;
        }
        if ((i4 & 1) != 0) {
            i3 |= 262144;
        }
        uo4Var.r(lp4.p3, new op4(i3));
        return uo4Var;
    }

    public byte[] L() throws Throwable {
        i45 i45Var;
        Throwable th;
        try {
            i45Var = new i45(this.A);
        } catch (Throwable th2) {
            i45Var = null;
            th = th2;
        }
        try {
            i45Var.f();
            byte[] bArr = new byte[i45Var.e()];
            i45Var.readFully(bArr);
            try {
                i45Var.close();
            } catch (Exception unused) {
            }
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            if (i45Var != null) {
                try {
                    i45Var.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public int M(int i) {
        int[] iArr = this.L;
        if (i >= iArr.length) {
            i = iArr.length - 1;
        }
        return iArr[i];
    }

    public int[] N(int i) {
        HashMap map;
        HashMap map2;
        HashMap map3 = this.P;
        if (map3 != null) {
            return (int[]) map3.get(Integer.valueOf(i));
        }
        boolean z = this.m;
        if (!z && (map2 = this.O) != null) {
            return (int[]) map2.get(Integer.valueOf(i));
        }
        if (z && (map = this.N) != null) {
            return (int[]) map.get(Integer.valueOf(i));
        }
        HashMap map4 = this.O;
        if (map4 != null) {
            return (int[]) map4.get(Integer.valueOf(i));
        }
        HashMap map5 = this.N;
        if (map5 != null) {
            return (int[]) map5.get(Integer.valueOf(i));
        }
        return null;
    }

    public String[][] O(int i) throws cu1, IOException {
        int[] iArr = (int[]) this.z.get("name");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "name", this.B + this.H));
        }
        this.A.j(iArr[0] + 2);
        int unsignedShort = this.A.readUnsignedShort();
        int unsignedShort2 = this.A.readUnsignedShort();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            int unsignedShort3 = this.A.readUnsignedShort();
            int unsignedShort4 = this.A.readUnsignedShort();
            int unsignedShort5 = this.A.readUnsignedShort();
            int unsignedShort6 = this.A.readUnsignedShort();
            int unsignedShort7 = this.A.readUnsignedShort();
            int unsignedShort8 = this.A.readUnsignedShort();
            if (unsignedShort6 == i) {
                int iC = this.A.c();
                this.A.j(iArr[0] + unsignedShort2 + unsignedShort8);
                arrayList.add(new String[]{String.valueOf(unsignedShort3), String.valueOf(unsignedShort4), String.valueOf(unsignedShort5), (unsignedShort3 == 0 || unsignedShort3 == 3 || (unsignedShort3 == 2 && unsignedShort4 == 1)) ? b0(unsignedShort7) : a0(unsignedShort7)});
                this.A.j(iC);
            }
        }
        String[][] strArr = new String[arrayList.size()][];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            strArr[i3] = (String[]) arrayList.get(i3);
        }
        return strArr;
    }

    public void Q(byte[] bArr, boolean z) throws IOException {
        this.z = new HashMap();
        try {
            if (bArr == null) {
                this.A = new i45(this.B, z, bu1.q);
            } else {
                this.A = new i45(bArr);
            }
            if (this.G.length() > 0) {
                int i = Integer.parseInt(this.G);
                if (i < 0) {
                    throw new cu1(dt3.b("the.font.index.for.1.must.be.positive", this.B));
                }
                if (!a0(4).equals("ttcf")) {
                    throw new cu1(dt3.b("1.is.not.a.valid.ttc.file", this.B));
                }
                this.A.skipBytes(4);
                int i2 = this.A.readInt();
                if (i >= i2) {
                    throw new cu1(dt3.b("the.font.index.for.1.must.be.between.0.and.2.it.was.3", this.B, String.valueOf(i2 - 1), String.valueOf(i)));
                }
                this.A.skipBytes(i * 4);
                this.F = this.A.readInt();
            }
            this.A.j(this.F);
            int i3 = this.A.readInt();
            if (i3 != 65536 && i3 != 1330926671) {
                throw new cu1(dt3.b("1.is.not.a.valid.ttf.or.otf.file", this.B));
            }
            int unsignedShort = this.A.readUnsignedShort();
            this.A.skipBytes(6);
            for (int i4 = 0; i4 < unsignedShort; i4++) {
                String strA0 = a0(4);
                this.A.skipBytes(4);
                this.z.put(strA0, new int[]{this.A.readInt(), this.A.readInt()});
            }
            E();
            this.R = I();
            this.S = O(4);
            this.U = O(1);
            this.T = H();
            if (!this.y) {
                G();
                Y();
                S();
                Z();
                R();
                this.L = null;
            }
            i45 i45Var = this.A;
            if (i45Var != null) {
                i45Var.close();
                if (this.k) {
                    return;
                }
                this.A = null;
            }
        } catch (Throwable th) {
            i45 i45Var2 = this.A;
            if (i45Var2 != null) {
                i45Var2.close();
                if (!this.k) {
                    this.A = null;
                }
            }
            throw th;
        }
    }

    public final void R() throws cu1, IOException {
        int[] iArr;
        int[] iArr2 = (int[]) this.z.get("head");
        if (iArr2 == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "head", this.B + this.H));
        }
        int i = 0;
        this.A.j(iArr2[0] + 51);
        boolean z = this.A.readUnsignedShort() == 0;
        int[] iArr3 = (int[]) this.z.get("loca");
        if (iArr3 == null) {
            return;
        }
        this.A.j(iArr3[0]);
        if (z) {
            int i2 = iArr3[1] / 2;
            iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.A.readUnsignedShort() * 2;
            }
        } else {
            int i4 = iArr3[1] / 4;
            iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = this.A.readInt();
            }
        }
        int[] iArr4 = (int[]) this.z.get("glyf");
        if (iArr4 == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "glyf", this.B + this.H));
        }
        int i6 = iArr4[0];
        this.M = new int[iArr.length - 1][];
        while (i < iArr.length - 1) {
            int i7 = iArr[i];
            int i8 = i + 1;
            if (i7 != iArr[i8]) {
                this.A.j(i7 + i6 + 2);
                this.M[i] = new int[]{(this.A.readShort() * 1000) / this.I.b, (this.A.readShort() * 1000) / this.I.b, (this.A.readShort() * 1000) / this.I.b, (this.A.readShort() * 1000) / this.I.b};
            }
            i = i8;
        }
    }

    public void S() throws cu1, IOException {
        int[] iArr = (int[]) this.z.get("cmap");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "cmap", this.B + this.H));
        }
        this.A.j(iArr[0]);
        this.A.skipBytes(2);
        int unsignedShort = this.A.readUnsignedShort();
        this.m = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < unsignedShort; i5++) {
            int unsignedShort2 = this.A.readUnsignedShort();
            int unsignedShort3 = this.A.readUnsignedShort();
            int i6 = this.A.readInt();
            if (unsignedShort2 == 3 && unsignedShort3 == 0) {
                this.m = true;
                i3 = i6;
            } else if (unsignedShort2 == 3 && unsignedShort3 == 1) {
                i2 = i6;
            } else if (unsignedShort2 == 3 && unsignedShort3 == 10) {
                i4 = i6;
            }
            if (unsignedShort2 == 1 && unsignedShort3 == 0) {
                i = i6;
            }
        }
        if (i > 0) {
            this.A.j(iArr[0] + i);
            int unsignedShort4 = this.A.readUnsignedShort();
            if (unsignedShort4 == 0) {
                this.N = U();
            } else if (unsignedShort4 == 4) {
                this.N = W();
            } else if (unsignedShort4 == 6) {
                this.N = X();
            }
        }
        if (i2 > 0) {
            this.A.j(iArr[0] + i2);
            if (this.A.readUnsignedShort() == 4) {
                this.O = W();
            }
        }
        if (i3 > 0) {
            this.A.j(iArr[0] + i3);
            if (this.A.readUnsignedShort() == 4) {
                this.N = W();
            }
        }
        if (i4 > 0) {
            this.A.j(iArr[0] + i4);
            int unsignedShort5 = this.A.readUnsignedShort();
            if (unsignedShort5 == 0) {
                this.P = U();
                return;
            }
            if (unsignedShort5 == 4) {
                this.P = W();
            } else if (unsignedShort5 == 6) {
                this.P = X();
            } else {
                if (unsignedShort5 != 12) {
                    return;
                }
                this.P = V();
            }
        }
    }

    public byte[] T() {
        i45 i45Var = new i45(this.A);
        byte[] bArr = new byte[this.E];
        try {
            i45Var.f();
            i45Var.j(this.D);
            i45Var.readFully(bArr);
            return bArr;
        } finally {
            try {
                i45Var.close();
            } catch (Exception unused) {
            }
        }
    }

    public HashMap U() throws IOException {
        HashMap map = new HashMap();
        this.A.skipBytes(4);
        for (int i = 0; i < 256; i++) {
            int unsignedByte = this.A.readUnsignedByte();
            map.put(Integer.valueOf(i), new int[]{unsignedByte, M(unsignedByte)});
        }
        return map;
    }

    public HashMap V() throws IOException {
        HashMap map = new HashMap();
        this.A.skipBytes(2);
        this.A.readInt();
        this.A.skipBytes(4);
        int i = this.A.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A.readInt();
            int i4 = this.A.readInt();
            for (int i5 = this.A.readInt(); i5 <= i3; i5++) {
                map.put(Integer.valueOf(i5), new int[]{i4, M(i4)});
                i4++;
            }
        }
        return map;
    }

    public HashMap W() throws IOException {
        int i;
        HashMap map = new HashMap();
        int unsignedShort = this.A.readUnsignedShort();
        this.A.skipBytes(2);
        int unsignedShort2 = this.A.readUnsignedShort() / 2;
        this.A.skipBytes(6);
        int[] iArr = new int[unsignedShort2];
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            iArr[i2] = this.A.readUnsignedShort();
        }
        this.A.skipBytes(2);
        int[] iArr2 = new int[unsignedShort2];
        for (int i3 = 0; i3 < unsignedShort2; i3++) {
            iArr2[i3] = this.A.readUnsignedShort();
        }
        int[] iArr3 = new int[unsignedShort2];
        for (int i4 = 0; i4 < unsignedShort2; i4++) {
            iArr3[i4] = this.A.readUnsignedShort();
        }
        int[] iArr4 = new int[unsignedShort2];
        for (int i5 = 0; i5 < unsignedShort2; i5++) {
            iArr4[i5] = this.A.readUnsignedShort();
        }
        int i6 = ((unsignedShort / 2) - 8) - (unsignedShort2 * 4);
        int[] iArr5 = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            iArr5[i7] = this.A.readUnsignedShort();
        }
        for (int i8 = 0; i8 < unsignedShort2; i8++) {
            for (int i9 = iArr2[i8]; i9 <= iArr[i8] && i9 != 65535; i9++) {
                int i10 = iArr4[i8];
                if (i10 == 0) {
                    i = iArr3[i8] + i9;
                } else {
                    int i11 = ((((i10 / 2) + i8) - unsignedShort2) + i9) - iArr2[i8];
                    if (i11 < i6) {
                        i = iArr5[i11] + iArr3[i8];
                    }
                }
                int i12 = 65535 & i;
                map.put(Integer.valueOf((this.m && (65280 & i9) == 61440) ? i9 & KotlinVersion.MAX_COMPONENT_VALUE : i9), new int[]{i12, M(i12)});
            }
        }
        return map;
    }

    public HashMap X() throws IOException {
        HashMap map = new HashMap();
        this.A.skipBytes(4);
        int unsignedShort = this.A.readUnsignedShort();
        int unsignedShort2 = this.A.readUnsignedShort();
        for (int i = 0; i < unsignedShort2; i++) {
            int unsignedShort3 = this.A.readUnsignedShort();
            map.put(Integer.valueOf(i + unsignedShort), new int[]{unsignedShort3, M(unsignedShort3)});
        }
        return map;
    }

    public void Y() throws cu1, IOException {
        int[] iArr = (int[]) this.z.get("hmtx");
        if (iArr == null) {
            throw new cu1(dt3.b("table.1.does.not.exist.in.2", "hmtx", this.B + this.H));
        }
        this.A.j(iArr[0]);
        this.L = new int[this.J.j];
        for (int i = 0; i < this.J.j; i++) {
            this.L[i] = (this.A.readUnsignedShort() * 1000) / this.I.b;
            this.A.readUnsignedShort();
        }
    }

    public void Z() throws IOException {
        int[] iArr = (int[]) this.z.get("kern");
        if (iArr == null) {
            return;
        }
        this.A.j(iArr[0] + 2);
        int unsignedShort = this.A.readUnsignedShort();
        int i = iArr[0] + 4;
        int unsignedShort2 = 0;
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            i += unsignedShort2;
            this.A.j(i);
            this.A.skipBytes(2);
            unsignedShort2 = this.A.readUnsignedShort();
            if ((this.A.readUnsignedShort() & 65527) == 1) {
                int unsignedShort3 = this.A.readUnsignedShort();
                this.A.skipBytes(6);
                for (int i3 = 0; i3 < unsignedShort3; i3++) {
                    this.Q.d(this.A.readInt(), (this.A.readShort() * 1000) / this.I.b);
                }
            }
        }
    }

    public String a0(int i) throws EOFException {
        byte[] bArr = new byte[i];
        this.A.readFully(bArr);
        try {
            return new String(bArr, "Cp1252");
        } catch (Exception e) {
            throw new p52(e);
        }
    }

    public String b0(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = i / 2;
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(this.A.readChar());
        }
        return stringBuffer.toString();
    }

    @Override // com.zepto.s40
    public String[][] k() {
        return this.U;
    }

    @Override // com.zepto.s40
    public float l(int i, float f) {
        float f2;
        int i2;
        switch (i) {
            case 1:
                return (this.K.u * f) / this.I.b;
            case 2:
                return (this.K.B * f) / this.I.b;
            case 3:
                return (this.K.v * f) / this.I.b;
            case 4:
                return (float) this.V;
            case 5:
                f2 = f * r2.c;
                i2 = this.I.b;
                break;
            case 6:
                f2 = f * r2.d;
                i2 = this.I.b;
                break;
            case 7:
                f2 = f * r2.e;
                i2 = this.I.b;
                break;
            case 8:
                f2 = f * r2.f;
                i2 = this.I.b;
                break;
            case 9:
                f2 = f * this.J.a;
                i2 = this.I.b;
                break;
            case 10:
                f2 = f * this.J.b;
                i2 = this.I.b;
                break;
            case 11:
                f2 = f * this.J.c;
                i2 = this.I.b;
                break;
            case 12:
                f2 = f * this.J.d;
                i2 = this.I.b;
                break;
            case 13:
                return ((this.X - (this.Y / 2)) * f) / this.I.b;
            case 14:
                return (this.Y * f) / this.I.b;
            case 15:
                return (this.K.n * f) / this.I.b;
            case 16:
                return (this.K.m * f) / this.I.b;
            case 17:
                return (this.K.f * f) / this.I.b;
            case 18:
                return ((-this.K.h) * f) / this.I.b;
            case 19:
                return (this.K.j * f) / this.I.b;
            case 20:
                return (this.K.l * f) / this.I.b;
            case 21:
                return this.K.b;
            case 22:
                return this.K.c;
            default:
                return 0.0f;
        }
        return f2 / i2;
    }

    @Override // com.zepto.s40
    public String n() {
        return this.R;
    }

    @Override // com.zepto.s40
    public int[] o(int i, String str) {
        HashMap map;
        int[] iArr;
        int[][] iArr2;
        if (str == null || (map = this.O) == null) {
            map = this.N;
        }
        if (map == null || (iArr = (int[]) map.get(Integer.valueOf(i))) == null || (iArr2 = this.M) == null) {
            return null;
        }
        return iArr2[iArr[0]];
    }

    @Override // com.zepto.s40
    public int p(int i, String str) {
        int[] iArrN = N(i);
        if (iArrN == null) {
            return 0;
        }
        return iArrN[1];
    }

    public eo6(String str, String str2, boolean z, byte[] bArr, boolean z2, boolean z3) throws cu1, IOException {
        this.y = false;
        this.C = false;
        this.H = "";
        this.I = new a();
        this.J = new b();
        this.K = new c();
        this.Q = new k03();
        this.W = false;
        this.y = z2;
        String strI = s40.i(str);
        String strP = P(strI);
        if (strI.length() < str.length()) {
            this.H = str.substring(strI.length());
        }
        this.j = str2;
        this.k = z;
        this.B = strP;
        this.e = 1;
        this.G = "";
        if (strP.length() < strI.length()) {
            this.G = strI.substring(strP.length() + 1);
        }
        if (!this.B.toLowerCase().endsWith(".ttf") && !this.B.toLowerCase().endsWith(".otf") && !this.B.toLowerCase().endsWith(".ttc")) {
            throw new cu1(dt3.b("1.is.not.a.ttf.otf.or.ttc.font.file", this.B + this.H));
        }
        Q(bArr, z3);
        if (!z2 && this.k && this.K.d == 2) {
            throw new cu1(dt3.b("1.cannot.be.embedded.due.to.licensing.restrictions", this.B + this.H));
        }
        if (!this.j.startsWith("#")) {
            xo4.c(" ", str2);
        }
        c();
    }
}
