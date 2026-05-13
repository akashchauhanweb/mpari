package com.zepto;

import com.zepto.s40;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class go6 extends eo6 implements Comparator {
    public static final byte[] b0 = {ByteCompanionObject.MIN_VALUE, 64, 32, 16, 8, 4, 2, 1};
    public boolean a0;

    public go6(String str, String str2, boolean z, byte[] bArr, boolean z2) throws cu1, IOException {
        this.a0 = false;
        String strI = s40.i(str);
        String strP = eo6.P(strI);
        if (strI.length() < str.length()) {
            this.H = str.substring(strI.length());
        }
        this.j = str2;
        this.k = z;
        this.B = strP;
        this.G = "";
        if (strP.length() < strI.length()) {
            this.G = strI.substring(strP.length() + 1);
        }
        this.e = 3;
        if ((!this.B.toLowerCase().endsWith(".ttf") && !this.B.toLowerCase().endsWith(".otf") && !this.B.toLowerCase().endsWith(".ttc")) || ((!str2.equals("Identity-H") && !str2.equals("Identity-V")) || !z)) {
            throw new cu1(dt3.b("1.2.is.not.a.ttf.font.file", this.B, this.H));
        }
        Q(bArr, z2);
        if (this.K.d == 2) {
            throw new cu1(dt3.b("1.cannot.be.embedded.due.to.licensing.restrictions", this.B + this.H));
        }
        if ((this.O == null && !this.m) || (this.N == null && this.m)) {
            this.o = true;
        }
        if (this.m) {
            this.m = false;
            String str3 = this.j;
            this.j = "";
            c();
            this.j = str3;
            this.m = true;
        }
        this.a0 = str2.endsWith("V");
    }

    public static String g0(int i) {
        if (i < 65536) {
            return "<" + h0(i) + ">";
        }
        int i2 = i - 65536;
        return "[<" + h0((i2 / 1024) + 55296) + h0((i2 % 1024) + 56320) + ">]";
    }

    public static String h0(int i) {
        return ("0000" + Integer.toHexString(i)).substring(r2.length() - 4);
    }

    @Override // com.zepto.eo6, com.zepto.s40
    public void B(pq4 pq4Var, gp4 gp4Var, Object[] objArr) {
        gq4 gq4Var;
        gp4 gp4VarA;
        gp4 gp4VarA2;
        HashMap map = (HashMap) objArr[0];
        C(map, true, this.p);
        int[][] iArr = (int[][]) map.values().toArray(new int[0][]);
        Arrays.sort(iArr, this);
        if (pq4Var.G() == 3 || pq4Var.G() == 4) {
            if (iArr.length == 0) {
                gq4Var = new gq4(new byte[]{ByteCompanionObject.MIN_VALUE});
            } else {
                byte[] bArr = new byte[(iArr[iArr.length - 1][0] / 8) + 1];
                for (int[] iArr2 : iArr) {
                    int i = iArr2[0];
                    int i2 = i / 8;
                    bArr[i2] = (byte) (b0[i % 8] | bArr[i2]);
                }
                gq4Var = new gq4(bArr);
                gq4Var.v(this.l);
            }
            gp4VarA = pq4Var.n(gq4Var).a();
        } else {
            gp4VarA = null;
        }
        if (this.C) {
            byte[] bArrT = T();
            if (this.p || this.c != null) {
                c90 c90Var = new c90(new i45(bArrT), map);
                bArrT = c90Var.N(c90Var.h()[0]);
            }
            gp4VarA2 = pq4Var.n(new s40.a(bArrT, "CIDFontType0C", this.l)).a();
        } else {
            byte[] bArrH = (this.p || this.F != 0) ? new fo6(this.B, new i45(this.A), new HashSet(map.keySet()), this.F, false, false).h() : L();
            gp4VarA2 = pq4Var.n(new s40.a(bArrH, new int[]{bArrH.length}, this.l)).a();
        }
        String strH = this.p ? s40.h() : "";
        gp4 gp4VarA3 = pq4Var.n(d0(pq4Var.n(K(gp4VarA2, strH, gp4VarA)).a(), strH, iArr)).a();
        rp4 rp4VarF0 = f0(iArr);
        pq4Var.o(e0(gp4VarA3, strH, rp4VarF0 != null ? pq4Var.n(rp4VarF0).a() : null), gp4Var);
    }

    @Override // com.zepto.eo6
    public int[] N(int i) {
        HashMap map = this.P;
        if (map != null) {
            return (int[]) map.get(Integer.valueOf(i));
        }
        boolean z = this.m;
        HashMap map2 = z ? this.N : this.O;
        if (map2 == null) {
            return null;
        }
        if (!z) {
            return (int[]) map2.get(Integer.valueOf(i));
        }
        int i2 = i & (-256);
        if (i2 == 0 || i2 == 61440) {
            return (int[]) map2.get(Integer.valueOf(i & KotlinVersion.MAX_COMPONENT_VALUE));
        }
        return null;
    }

    @Override // com.zepto.s40
    public byte[] a(int i) {
        return null;
    }

    @Override // com.zepto.s40
    public byte[] b(String str) {
        return null;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public int compare(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr2[0];
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final uo4 d0(gp4 gp4Var, String str, Object[] objArr) {
        uo4 uo4Var = new uo4(lp4.u3);
        if (this.C) {
            uo4Var.r(lp4.v9, lp4.R0);
            uo4Var.r(lp4.Y, new lp4(str + this.R + "-" + this.j));
        } else {
            uo4Var.r(lp4.v9, lp4.S0);
            uo4Var.r(lp4.Y, new lp4(str + this.R));
        }
        uo4Var.r(lp4.w3, gp4Var);
        if (!this.C) {
            uo4Var.r(lp4.V0, lp4.x4);
        }
        uo4 uo4Var2 = new uo4();
        uo4Var2.r(lp4.c8, new hq4("Adobe"));
        uo4Var2.r(lp4.K6, new hq4("Identity"));
        uo4Var2.r(lp4.w9, new op4(0));
        uo4Var.r(lp4.U0, uo4Var2);
        if (!this.a0) {
            uo4Var.r(lp4.t2, new op4(1000));
            StringBuffer stringBuffer = new StringBuffer("[");
            int i = -10;
            boolean z = true;
            for (Object obj : objArr) {
                int[] iArr = (int[]) obj;
                if (iArr[1] != 1000) {
                    int i2 = iArr[0];
                    if (i2 == i + 1) {
                        stringBuffer.append(' ');
                        stringBuffer.append(iArr[1]);
                    } else {
                        if (!z) {
                            stringBuffer.append(']');
                        }
                        stringBuffer.append(i2);
                        stringBuffer.append('[');
                        stringBuffer.append(iArr[1]);
                        z = false;
                    }
                    i = i2;
                }
            }
            if (stringBuffer.length() > 1) {
                stringBuffer.append("]]");
                uo4Var.r(lp4.db, new jp4(stringBuffer.toString()));
            }
        }
        return uo4Var;
    }

    public final uo4 e0(gp4 gp4Var, String str, gp4 gp4Var2) {
        uo4 uo4Var = new uo4(lp4.u3);
        uo4Var.r(lp4.v9, lp4.ta);
        if (this.C) {
            uo4Var.r(lp4.Y, new lp4(str + this.R + "-" + this.j));
        } else {
            uo4Var.r(lp4.Y, new lp4(str + this.R));
        }
        uo4Var.r(lp4.E2, new lp4(this.j));
        uo4Var.r(lp4.R1, new ko4(gp4Var));
        if (gp4Var2 != null) {
            uo4Var.r(lp4.aa, gp4Var2);
        }
        return uo4Var;
    }

    public final gq4 f0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer("/CIDInit /ProcSet findresource begin\n12 dict begin\nbegincmap\n/CIDSystemInfo\n<< /Registry (TTX+0)\n/Ordering (T42UV)\n/Supplement 0\n>> def\n/CMapName /TTX+0 def\n/CMapType 2 def\n1 begincodespacerange\n<0000><FFFF>\nendcodespacerange\n");
        int iMin = 0;
        for (int i = 0; i < objArr.length; i++) {
            if (iMin == 0) {
                if (i != 0) {
                    stringBuffer.append("endbfrange\n");
                }
                iMin = Math.min(100, objArr.length - i);
                stringBuffer.append(iMin);
                stringBuffer.append(" beginbfrange\n");
            }
            iMin--;
            int[] iArr = (int[]) objArr[i];
            String strG0 = g0(iArr[0]);
            stringBuffer.append(strG0);
            stringBuffer.append(strG0);
            stringBuffer.append(g0(iArr[2]));
            stringBuffer.append('\n');
        }
        stringBuffer.append("endbfrange\nendcmap\nCMapName currentdict /CMap defineresource pop\nend end\n");
        gq4 gq4Var = new gq4(xo4.c(stringBuffer.toString(), null));
        gq4Var.v(this.l);
        return gq4Var;
    }

    @Override // com.zepto.s40
    public int u(int i) {
        if (this.a0) {
            return 1000;
        }
        if (!this.m) {
            return p(i, this.j);
        }
        int i2 = 65280 & i;
        if (i2 == 0 || i2 == 61440) {
            return p(i & KotlinVersion.MAX_COMPONENT_VALUE, null);
        }
        return 0;
    }

    @Override // com.zepto.s40
    public int v(String str) {
        int iP;
        if (this.a0) {
            return str.length() * 1000;
        }
        int i = 0;
        if (this.m) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            iP = 0;
            while (i < length) {
                char c = charArray[i];
                int i2 = 65280 & c;
                if (i2 == 0 || i2 == 61440) {
                    iP += p(c & 255, null);
                }
                i++;
            }
        } else {
            int length2 = str.length();
            iP = 0;
            while (i < length2) {
                if (jt6.g(str, i)) {
                    iP += p(jt6.c(str, i), this.j);
                    i++;
                } else {
                    iP += p(str.charAt(i), this.j);
                }
                i++;
            }
        }
        return iP;
    }
}
