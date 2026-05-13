package com.zepto;

import com.zepto.b90;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.KotlinVersion;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public class c90 extends b90 {
    public static final String[] H = {"RESERVED_0", "hstem", "RESERVED_2", "vstem", "vmoveto", "rlineto", "hlineto", "vlineto", "rrcurveto", "RESERVED_9", "callsubr", "return", "escape", "RESERVED_13", "endchar", "RESERVED_15", "RESERVED_16", "RESERVED_17", "hstemhm", "hintmask", "cntrmask", "rmoveto", "hmoveto", "vstemhm", "rcurveline", "rlinecurve", "vvcurveto", "hhcurveto", "shortint", "callgsubr", "vhcurveto", "hvcurveto"};
    public static final String[] I = {"RESERVED_0", "RESERVED_1", "RESERVED_2", "and", "or", "not", "RESERVED_6", "RESERVED_7", "RESERVED_8", "abs", "add", "sub", "div", "RESERVED_13", "neg", "eq", "RESERVED_16", "RESERVED_17", "drop", "RESERVED_19", "put", "get", "ifelse", "random", "mul", "RESERVED_25", "sqrt", "dup", "exch", "index", "roll", "RESERVED_31", "RESERVED_32", "RESERVED_33", "hflex", "flex", "hflex1", "flex1", "RESERVED_REST"};
    public byte[][] A;
    public byte[] B;
    public byte[] C;
    public byte[] D;
    public int E;
    public LinkedList F;
    public int G;
    public HashMap r;
    public ArrayList s;
    public HashSet t;
    public HashMap[] u;
    public ArrayList[] v;
    public HashMap w;
    public ArrayList x;
    public HashMap y;
    public ArrayList z;

    public c90(i45 i45Var, HashMap map) {
        super(i45Var);
        this.t = new HashSet();
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = new HashMap();
        this.z = new ArrayList();
        int i = 0;
        this.E = 0;
        this.G = 0;
        this.r = map;
        this.s = new ArrayList(map.keySet());
        while (true) {
            b90.c[] cVarArr = this.o;
            if (i >= cVarArr.length) {
                return;
            }
            m(cVarArr[i].g);
            this.o[i].n = b();
            m(this.i);
            this.o[i].o = b() + b90.q.length;
            b90.c cVar = this.o[i];
            cVar.q = f(cVar.g);
            if (this.o[i].k >= 0) {
                X(i);
                o(i);
            }
            if (this.o[i].c) {
                R(i);
            }
            b90.c cVar2 = this.o[i];
            cVar2.p = B(cVar2.i, cVar2.n);
            i++;
        }
    }

    public void A() {
        m(0);
        c();
        c();
        char c = c();
        c();
        this.a = c;
        this.F.addLast(new b90.j(this.e, 0, c));
    }

    public int B(int i, int i2) {
        int iC;
        m(i);
        char c = c();
        if (c == 0) {
            return (i2 * 2) + 1;
        }
        if (c == 1) {
            iC = C(i2, 1) * 3;
        } else {
            if (c != 2) {
                return 0;
            }
            iC = C(i2, 2) * 4;
        }
        return iC + 1;
    }

    public int C(int i, int i2) {
        int i3 = 0;
        int iC = 1;
        while (iC < i) {
            i3++;
            b();
            iC += (i2 == 1 ? c() : b()) + 1;
        }
        return i3;
    }

    public void D(b90.i iVar, int i) {
        this.F.addLast(new b90.h(iVar));
        this.F.addLast(new b90.p((char) 2));
        this.F.addLast(new b90.m((char) 1));
        this.F.addLast(new b90.m((char) (i - 1)));
    }

    public void E(b90.i iVar, b90.i iVar2, int i) {
        this.F.addLast(new b90.h(iVar));
        r(1, 1, 1);
        b90.f fVar = new b90.f(1);
        this.F.addLast(fVar);
        b90.d dVar = new b90.d();
        this.F.addLast(dVar);
        b90.c cVar = this.o[i];
        int i2 = cVar.e;
        int iZ = z(cVar.d, i2);
        if (iZ != 0) {
            i2 += 5 - iZ;
        }
        this.F.addLast(new b90.a(i2));
        this.F.addLast(iVar2);
        this.F.addLast(new b90.p((char) 18));
        this.F.addLast(new b90.e(fVar, dVar));
    }

    public void F(b90.i iVar, int i) {
        this.F.addLast(new b90.h(iVar));
        this.F.addLast(new b90.p((char) 3));
        this.F.addLast(new b90.m((char) 1));
        this.F.addLast(new b90.m((char) 0));
        this.F.addLast(new b90.p((char) 0));
        this.F.addLast(new b90.m((char) i));
    }

    public void G(b90.i iVar, b90.i iVar2, b90.i iVar3, b90.i iVar4) {
        this.F.addLast(iVar);
        this.F.addLast(new b90.p('\f'));
        this.F.addLast(new b90.p(Typography.dollar));
        this.F.addLast(iVar2);
        this.F.addLast(new b90.p('\f'));
        this.F.addLast(new b90.p('%'));
        this.F.addLast(iVar3);
        this.F.addLast(new b90.p((char) 15));
        this.F.addLast(iVar4);
        this.F.addLast(new b90.p((char) 17));
    }

    public void H(int i) {
        String strSubstring = this.o[i].a + "-OneRange";
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        String str = "AdobeIdentity" + strSubstring;
        int[] iArr = this.m;
        int i2 = iArr[iArr.length - 1];
        int i3 = iArr[0];
        int i4 = i2 - i3;
        int i5 = i3 - 1;
        int i6 = str.length() + i4 <= 255 ? 1 : str.length() + i4 <= 65535 ? 2 : str.length() + i4 <= 16777215 ? 3 : 4;
        this.F.addLast(new b90.m((char) (this.m.length + 2)));
        this.F.addLast(new b90.p((char) i6));
        for (int i7 : this.m) {
            this.F.addLast(new b90.f(i6, i7 - i5));
        }
        int[] iArr2 = this.m;
        int i8 = iArr2[iArr2.length - 1] - i5;
        this.F.addLast(new b90.f(i6, i8 + 5));
        int i9 = i8 + 13;
        this.F.addLast(new b90.f(i6, i9));
        this.F.addLast(new b90.f(i6, i9 + strSubstring.length()));
        this.F.addLast(new b90.j(this.e, this.m[0], i4));
        this.F.addLast(new b90.k(str));
    }

    public void I(int i, b90.i iVar) {
        m(this.o[i].d);
        while (true) {
            int iJ = j();
            b90.c cVar = this.o[i];
            if (iJ >= cVar.d + cVar.e) {
                return;
            }
            int iJ2 = j();
            d();
            int iJ3 = j();
            if (this.b == "Subrs") {
                this.F.addLast(iVar);
                this.F.addLast(new b90.p((char) 19));
            } else {
                this.F.addLast(new b90.j(this.e, iJ2, iJ3 - iJ2));
            }
        }
    }

    public void J(int i, b90.d dVar, b90.i iVar) {
        this.F.addLast(new b90.l(iVar, dVar));
        byte[] bArr = this.B;
        if (bArr != null) {
            this.F.addLast(new b90.j(new i45(bArr), 0, this.B.length));
        }
    }

    public void K() {
        for (int i = 0; i < this.d; i++) {
            this.c[i] = null;
        }
        this.d = 0;
    }

    public void L() {
        int iW = W();
        if (iW >= 2) {
            K();
            return;
        }
        if (iW == 1) {
            O();
            return;
        }
        int i = iW * (-1);
        for (int i2 = 0; i2 < i; i2++) {
            M();
        }
    }

    public void M() {
        int i = this.d;
        if (i > 0) {
            this.c[i - 1] = null;
            this.d = i - 1;
        }
    }

    public byte[] N(String str) {
        try {
            this.e.f();
            int i = 0;
            while (true) {
                b90.c[] cVarArr = this.o;
                if (i >= cVarArr.length || str.equals(cVarArr[i].a)) {
                    break;
                }
                i++;
            }
            if (i == this.o.length) {
                try {
                    this.e.close();
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
            int i2 = this.j;
            if (i2 >= 0) {
                this.E = x(i2, i);
            }
            s(i);
            v(i);
            byte[] bArrT = t(i);
            try {
                this.e.close();
            } catch (Exception unused2) {
            }
            return bArrT;
        } catch (Throwable th) {
            try {
                this.e.close();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public void O() {
        this.d++;
    }

    public void P(int i, int i2, int i3, int i4, HashMap map, ArrayList arrayList, int[] iArr) {
        K();
        this.G = 0;
        m(i);
        while (j() < i2) {
            Q();
            int iJ = j();
            int i5 = this.d;
            Object obj = i5 > 0 ? this.c[i5 - 1] : null;
            L();
            String str = this.b;
            if (str == "callsubr") {
                if (i5 > 0) {
                    int iIntValue = ((Integer) obj).intValue() + i4;
                    if (!map.containsKey(Integer.valueOf(iIntValue))) {
                        map.put(Integer.valueOf(iIntValue), null);
                        arrayList.add(Integer.valueOf(iIntValue));
                    }
                    y(iArr[iIntValue], iArr[iIntValue + 1], i4, i3, iArr);
                    m(iJ);
                }
            } else if (str == "callgsubr") {
                if (i5 > 0) {
                    int iIntValue2 = ((Integer) obj).intValue() + i3;
                    if (!this.w.containsKey(Integer.valueOf(iIntValue2))) {
                        this.w.put(Integer.valueOf(iIntValue2), null);
                        this.x.add(Integer.valueOf(iIntValue2));
                    }
                    int[] iArr2 = this.n;
                    y(iArr2[iIntValue2], iArr2[iIntValue2 + 1], i4, i3, iArr);
                    m(iJ);
                }
            } else if (str == "hstem" || str == "vstem" || str == "hstemhm" || str == "vstemhm") {
                this.G += i5 / 2;
            } else if (str == "hintmask" || str == "cntrmask") {
                int i6 = this.G;
                int i7 = i6 / 8;
                if (i6 % 8 != 0 || i7 == 0) {
                    i7++;
                }
                for (int i8 = 0; i8 < i7; i8++) {
                    c();
                }
            }
        }
    }

    public void Q() {
        this.b = null;
        boolean z = false;
        while (!z) {
            char c = c();
            if (c == 28) {
                this.c[this.d] = Integer.valueOf((c() << '\b') | c());
                this.d++;
            } else if (c >= ' ' && c <= 246) {
                this.c[this.d] = Integer.valueOf(c - 139);
                this.d++;
            } else if (c >= 247 && c <= 250) {
                this.c[this.d] = Integer.valueOf(((c - 247) * 256) + c() + 108);
                this.d++;
            } else if (c >= 251 && c <= 254) {
                this.c[this.d] = Integer.valueOf((((-(c - 251)) * 256) - c()) - 108);
                this.d++;
            } else if (c == 255) {
                this.c[this.d] = Integer.valueOf((c() << 24) | (c() << 16) | (c() << '\b') | c());
                this.d++;
            } else if (c <= 31 && c != 28) {
                if (c == '\f') {
                    int iC = c();
                    String[] strArr = I;
                    if (iC > strArr.length - 1) {
                        iC = strArr.length - 1;
                    }
                    this.b = strArr[iC];
                } else {
                    this.b = H[c];
                }
                z = true;
            }
        }
    }

    public void R(int i) {
        m(this.o[i].j);
        this.o[i].v = b();
        this.o[i].w = c();
        b90.c cVar = this.o[i];
        int i2 = cVar.w;
        if (i2 < 4) {
            cVar.w = i2 + 1;
        }
        cVar.x = f(cVar.j);
    }

    public void S(int i) {
        b90.b[] bVarArr = new b90.b[r0.x.length - 1];
        int[] iArr = this.o[i].l;
        b90.d[] dVarArr = new b90.d[iArr.length];
        b90.b[] bVarArr2 = new b90.b[iArr.length];
        T(i, bVarArr);
        U(i, bVarArr, dVarArr, bVarArr2);
        V(i, dVarArr, bVarArr2);
    }

    public void T(int i, b90.i[] iVarArr) {
        b90.c cVar = this.o[i];
        r(cVar.v, cVar.w, 1);
        b90.f[] fVarArr = new b90.f[this.o[i].x.length - 1];
        int i2 = 0;
        while (true) {
            b90.c cVar2 = this.o[i];
            if (i2 >= cVar2.x.length - 1) {
                break;
            }
            b90.f fVar = new b90.f(cVar2.w);
            fVarArr[i2] = fVar;
            this.F.addLast(fVar);
            i2++;
        }
        b90.d dVar = new b90.d();
        this.F.addLast(dVar);
        for (int i3 = 0; i3 < this.o[i].x.length - 1; i3++) {
            if (this.t.contains(Integer.valueOf(i3))) {
                m(this.o[i].x[i3]);
                while (j() < this.o[i].x[i3 + 1]) {
                    int iJ = j();
                    d();
                    int iJ2 = j();
                    if (this.b == "Private") {
                        int iIntValue = ((Integer) this.c[0]).intValue();
                        b90.c cVar3 = this.o[i];
                        int iZ = z(cVar3.l[i3], cVar3.m[i3]);
                        if (iZ != 0) {
                            iIntValue += 5 - iZ;
                        }
                        this.F.addLast(new b90.a(iIntValue));
                        b90.b bVar = new b90.b();
                        iVarArr[i3] = bVar;
                        this.F.addLast(bVar);
                        this.F.addLast(new b90.p((char) 18));
                        m(iJ2);
                    } else {
                        this.F.addLast(new b90.j(this.e, iJ, iJ2 - iJ));
                    }
                }
            }
            this.F.addLast(new b90.e(fVarArr[i3], dVar));
        }
    }

    public void U(int i, b90.i[] iVarArr, b90.d[] dVarArr, b90.i[] iVarArr2) {
        for (int i2 = 0; i2 < this.o[i].l.length; i2++) {
            if (this.t.contains(Integer.valueOf(i2))) {
                this.F.addLast(new b90.h(iVarArr[i2]));
                b90.d dVar = new b90.d();
                dVarArr[i2] = dVar;
                this.F.addLast(dVar);
                m(this.o[i].l[i2]);
                while (true) {
                    int iJ = j();
                    b90.c cVar = this.o[i];
                    if (iJ < cVar.l[i2] + cVar.m[i2]) {
                        int iJ2 = j();
                        d();
                        int iJ3 = j();
                        if (this.b == "Subrs") {
                            b90.b bVar = new b90.b();
                            iVarArr2[i2] = bVar;
                            this.F.addLast(bVar);
                            this.F.addLast(new b90.p((char) 19));
                        } else {
                            this.F.addLast(new b90.j(this.e, iJ2, iJ3 - iJ2));
                        }
                    }
                }
            }
        }
    }

    public void V(int i, b90.d[] dVarArr, b90.i[] iVarArr) {
        int i2 = 0;
        while (true) {
            b90.c cVar = this.o[i];
            if (i2 >= cVar.m.length) {
                return;
            }
            b90.i iVar = iVarArr[i2];
            if (iVar != null && cVar.y[i2] >= 0) {
                this.F.addLast(new b90.l(iVar, dVarArr[i2]));
                this.F.addLast(new b90.j(new i45(this.A[i2]), 0, this.A[i2].length));
            }
            i2++;
        }
    }

    public int W() {
        String str = this.b;
        if (str == "ifelse") {
            return -3;
        }
        if (str == "roll" || str == "put") {
            return -2;
        }
        if (str == "callsubr" || str == "callgsubr" || str == "add" || str == "sub" || str == "div" || str == "mul" || str == "drop" || str == "and" || str == "or" || str == "eq") {
            return -1;
        }
        if (str == "abs" || str == "neg" || str == "sqrt" || str == "exch" || str == "index" || str == "get" || str == "not" || str == "return") {
            return 0;
        }
        return (str == "random" || str == "dup") ? 1 : 2;
    }

    public void X(int i) {
        b90.c cVar = this.o[i];
        int i2 = cVar.n;
        int[] iArr = new int[i2];
        m(cVar.k);
        this.o[i].t = c();
        int i3 = this.o[i].t;
        if (i3 == 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = c();
            }
            b90.c cVar2 = this.o[i];
            cVar2.s = cVar2.n + 1;
        } else if (i3 == 3) {
            char cB = b();
            char cB2 = b();
            int i5 = 0;
            int i6 = 0;
            while (i5 < cB) {
                char c = c();
                char cB3 = b();
                int i7 = cB3 - cB2;
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i6] = c;
                    i6++;
                }
                i5++;
                cB2 = cB3;
            }
            this.o[i].s = (cB * 3) + 5;
        }
        this.o[i].r = iArr;
    }

    public byte[] n(int[] iArr, byte[] bArr) {
        char length = (char) (iArr.length - 1);
        int i = iArr[iArr.length - 1];
        byte b = i <= 255 ? (byte) 1 : i <= 65535 ? (byte) 2 : i <= 16777215 ? (byte) 3 : (byte) 4;
        byte[] bArr2 = new byte[((length + 1) * b) + 3 + bArr.length];
        int i2 = 0;
        bArr2[0] = (byte) ((length >>> '\b') & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr2[1] = (byte) (length & 255);
        bArr2[2] = b;
        int i3 = 3;
        for (int i4 : iArr) {
            int i5 = (i4 - iArr[0]) + 1;
            if (b == 1) {
                bArr2[i3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
                i3++;
            } else {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            bArr2[i3] = (byte) ((i5 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                            i3++;
                        }
                    }
                    bArr2[i3] = (byte) ((i5 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i3++;
                }
                bArr2[i3] = (byte) ((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i3++;
                bArr2[i3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
                i3++;
            }
        }
        int length2 = bArr.length;
        while (i2 < length2) {
            bArr2[i3] = bArr[i2];
            i2++;
            i3++;
        }
        return bArr2;
    }

    public void o(int i) {
        int[] iArr = this.o[i].r;
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            this.t.add(Integer.valueOf(iArr[((Integer) this.s.get(i2)).intValue()]));
        }
    }

    public void p(int i, int i2) {
        b90.c cVar;
        b90.c cVar2 = this.o[i];
        cVar2.y[i2] = -1;
        m(cVar2.l[i2]);
        while (true) {
            int iJ = j();
            cVar = this.o[i];
            if (iJ >= cVar.l[i2] + cVar.m[i2]) {
                break;
            }
            d();
            if (this.b == "Subrs") {
                this.o[i].y[i2] = ((Integer) this.c[0]).intValue() + this.o[i].l[i2];
            }
        }
        int i3 = cVar.y[i2];
        if (i3 >= 0) {
            cVar.z[i2] = f(i3);
        }
    }

    public void q(int i) {
        int iX;
        int size;
        int i2 = this.o[i].f;
        if (i2 >= 0) {
            iX = x(i2, i);
            size = this.z.size();
        } else {
            iX = 0;
            size = 0;
        }
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            int iIntValue = ((Integer) this.x.get(i3)).intValue();
            int[] iArr = this.n;
            if (iIntValue < iArr.length - 1 && iIntValue >= 0) {
                int i4 = iArr[iIntValue];
                int i5 = iArr[iIntValue + 1];
                b90.c cVar = this.o[i];
                if (cVar.c) {
                    P(i4, i5, this.E, 0, this.w, this.x, null);
                } else {
                    P(i4, i5, this.E, iX, this.y, this.z, cVar.A);
                    if (size < this.z.size()) {
                        while (size < this.z.size()) {
                            int iIntValue2 = ((Integer) this.z.get(size)).intValue();
                            int[] iArr2 = this.o[i].A;
                            if (iIntValue2 < iArr2.length - 1 && iIntValue2 >= 0) {
                                P(iArr2[iIntValue2], iArr2[iIntValue2 + 1], this.E, iX, this.y, this.z, iArr2);
                            }
                            size++;
                        }
                        size = this.z.size();
                    }
                }
            }
        }
    }

    public void r(int i, int i2, int i3) {
        this.F.addLast(new b90.m((char) i));
        this.F.addLast(new b90.p((char) i2));
        if (i2 == 1) {
            this.F.addLast(new b90.p((char) i3));
            return;
        }
        if (i2 == 2) {
            this.F.addLast(new b90.m((char) i3));
        } else if (i2 == 3) {
            this.F.addLast(new b90.n((char) i3));
        } else {
            if (i2 != 4) {
                return;
            }
            this.F.addLast(new b90.o((char) i3));
        }
    }

    public void s(int i) {
        this.D = u(this.o[i].q, this.r, (byte) 14);
    }

    public byte[] t(int i) {
        this.F = new LinkedList();
        A();
        r(1, 1, 1);
        this.F.addLast(new b90.p((char) (this.o[i].a.length() + 1)));
        this.F.addLast(new b90.k(this.o[i].a));
        r(1, 2, 1);
        b90.f fVar = new b90.f(2);
        this.F.addLast(fVar);
        b90.d dVar = new b90.d();
        this.F.addLast(dVar);
        b90.b bVar = new b90.b();
        b90.b bVar2 = new b90.b();
        b90.b bVar3 = new b90.b();
        b90.b bVar4 = new b90.b();
        b90.b bVar5 = new b90.b();
        b90.c cVar = this.o[i];
        if (!cVar.c) {
            this.F.addLast(new b90.a(cVar.o));
            this.F.addLast(new b90.a(this.o[i].o + 1));
            this.F.addLast(new b90.a(0));
            this.F.addLast(new b90.p('\f'));
            this.F.addLast(new b90.p((char) 30));
            this.F.addLast(new b90.a(this.o[i].n));
            this.F.addLast(new b90.p('\f'));
            this.F.addLast(new b90.p(Typography.quote));
        }
        m(this.l[i]);
        while (j() < this.l[i + 1]) {
            int iJ = j();
            d();
            int iJ2 = j();
            String str = this.b;
            if (str != "Encoding" && str != "Private" && str != "FDSelect" && str != "FDArray" && str != "charset" && str != "CharStrings") {
                this.F.add(new b90.j(this.e, iJ, iJ2 - iJ));
            }
        }
        G(bVar3, bVar4, bVar, bVar2);
        this.F.addLast(new b90.e(fVar, dVar));
        if (this.o[i].c) {
            this.F.addLast(e(this.i));
        } else {
            H(i);
        }
        this.F.addLast(new b90.j(new i45(this.C), 0, this.C.length));
        b90.c cVar2 = this.o[i];
        if (cVar2.c) {
            this.F.addLast(new b90.h(bVar4));
            b90.c cVar3 = this.o[i];
            int i2 = cVar3.k;
            if (i2 >= 0) {
                this.F.addLast(new b90.j(this.e, i2, cVar3.s));
            } else {
                F(bVar4, cVar3.n);
            }
            this.F.addLast(new b90.h(bVar));
            LinkedList linkedList = this.F;
            i45 i45Var = this.e;
            b90.c cVar4 = this.o[i];
            linkedList.addLast(new b90.j(i45Var, cVar4.i, cVar4.p));
            if (this.o[i].j >= 0) {
                this.F.addLast(new b90.h(bVar3));
                S(i);
            } else {
                E(bVar3, bVar5, i);
            }
        } else {
            F(bVar4, cVar2.n);
            D(bVar, this.o[i].n);
            E(bVar3, bVar5, i);
        }
        if (this.o[i].d >= 0) {
            b90.d dVar2 = new b90.d();
            this.F.addLast(dVar2);
            this.F.addLast(new b90.h(bVar5));
            b90.b bVar6 = new b90.b();
            I(i, bVar6);
            J(i, dVar2, bVar6);
        }
        this.F.addLast(new b90.h(bVar2));
        this.F.addLast(new b90.j(new i45(this.D), 0, this.D.length));
        int[] iArr = {0};
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((b90.g) it.next()).b(iArr);
        }
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((b90.g) it2.next()).c();
        }
        byte[] bArr = new byte[iArr[0]];
        Iterator it3 = this.F.iterator();
        while (it3.hasNext()) {
            ((b90.g) it3.next()).a(bArr);
        }
        return bArr;
    }

    public byte[] u(int[] iArr, HashMap map, byte b) throws IOException {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = i2;
            if (map.containsKey(Integer.valueOf(i4))) {
                i2 += iArr[i4 + 1] - iArr[i4];
            } else {
                i3++;
            }
        }
        byte[] bArr = new byte[i2 + i3];
        int i5 = 0;
        while (i < iArr.length - 1) {
            int i6 = iArr2[i];
            int i7 = i + 1;
            int i8 = iArr2[i7];
            int i9 = i6 + i5;
            iArr2[i] = i9;
            if (i6 != i8) {
                this.e.j(iArr[i]);
                this.e.readFully(bArr, i9, i8 - i6);
            } else {
                bArr[i9] = b;
                i5++;
            }
            i = i7;
        }
        int length = iArr.length - 1;
        iArr2[length] = iArr2[length] + i5;
        return n(iArr2, bArr);
    }

    public void v(int i) {
        b90.c cVar = this.o[i];
        if (cVar.c) {
            int[] iArr = cVar.l;
            this.u = new HashMap[iArr.length];
            this.v = new ArrayList[iArr.length];
            this.A = new byte[iArr.length][];
            cVar.y = new int[iArr.length];
            cVar.z = new int[iArr.length][];
            ArrayList arrayList = new ArrayList(this.t);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                int iIntValue = ((Integer) arrayList.get(i2)).intValue();
                this.u[iIntValue] = new HashMap();
                this.v[iIntValue] = new ArrayList();
                p(i, iIntValue);
                b90.c cVar2 = this.o[i];
                int i3 = cVar2.y[iIntValue];
                if (i3 >= 0) {
                    w(i, iIntValue, i3, cVar2.z[iIntValue], this.u[iIntValue], this.v[iIntValue]);
                    this.A[iIntValue] = u(this.o[i].z[iIntValue], this.u[iIntValue], (byte) 11);
                }
            }
        } else {
            int i4 = cVar.f;
            if (i4 >= 0) {
                cVar.A = f(i4);
                b90.c cVar3 = this.o[i];
                w(i, -1, cVar3.f, cVar3.A, this.y, this.z);
            }
        }
        q(i);
        b90.c cVar4 = this.o[i];
        if (cVar4.f >= 0) {
            this.B = u(cVar4.A, this.y, (byte) 11);
        }
        this.C = u(this.n, this.w, (byte) 11);
    }

    public void w(int i, int i2, int i3, int[] iArr, HashMap map, ArrayList arrayList) {
        int iX = x(i3, i);
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            int iIntValue = ((Integer) this.s.get(i4)).intValue();
            int[] iArr2 = this.o[i].q;
            int i5 = iArr2[iIntValue];
            int i6 = iArr2[iIntValue + 1];
            if (i2 >= 0) {
                K();
                this.G = 0;
                if (this.o[i].r[iIntValue] == i2) {
                    P(i5, i6, this.E, iX, map, arrayList, iArr);
                }
            } else {
                P(i5, i6, this.E, iX, map, arrayList, iArr);
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int iIntValue2 = ((Integer) arrayList.get(i7)).intValue();
            if (iIntValue2 < iArr.length - 1 && iIntValue2 >= 0) {
                P(iArr[iIntValue2], iArr[iIntValue2 + 1], this.E, iX, map, arrayList, iArr);
            }
        }
    }

    public int x(int i, int i2) {
        m(i);
        char cB = b();
        if (this.o[i2].u == 1) {
            return 0;
        }
        if (cB < 1240) {
            return 107;
        }
        return cB < 33900 ? 1131 : 32768;
    }

    public int y(int i, int i2, int i3, int i4, int[] iArr) {
        m(i);
        while (j() < i2) {
            Q();
            int iJ = j();
            int i5 = this.d;
            Object obj = i5 > 0 ? this.c[i5 - 1] : null;
            L();
            String str = this.b;
            if (str == "callsubr") {
                if (i5 > 0) {
                    int iIntValue = ((Integer) obj).intValue() + i3;
                    y(iArr[iIntValue], iArr[iIntValue + 1], i3, i4, iArr);
                    m(iJ);
                }
            } else if (str == "callgsubr") {
                if (i5 > 0) {
                    int iIntValue2 = ((Integer) obj).intValue() + i4;
                    int[] iArr2 = this.n;
                    y(iArr2[iIntValue2], iArr2[iIntValue2 + 1], i3, i4, iArr);
                    m(iJ);
                }
            } else if (str == "hstem" || str == "vstem" || str == "hstemhm" || str == "vstemhm") {
                this.G += i5 / 2;
            } else if (str == "hintmask" || str == "cntrmask") {
                int i6 = this.G;
                int i7 = i6 / 8;
                if (i6 % 8 != 0 || i7 == 0) {
                    i7++;
                }
                for (int i8 = 0; i8 < i7; i8++) {
                    c();
                }
            }
        }
        return this.G;
    }

    public int z(int i, int i2) {
        m(i);
        int i3 = 0;
        while (j() < i + i2) {
            int iJ = j();
            d();
            int iJ2 = j();
            if (this.b == "Subrs") {
                i3 = (iJ2 - iJ) - 1;
            }
        }
        return i3;
    }
}
