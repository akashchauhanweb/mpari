package com.zepto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class no4 {
    public static final char[] l = {' '};
    public static final no4[] m = new no4[1];
    public static final HashSet n;
    public static final HashSet o;
    public String a;
    public String b;
    public bp4 c;
    public s40 d;
    public t56 e;
    public HashMap f;
    public HashMap g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;

    static {
        HashSet hashSet = new HashSet();
        n = hashSet;
        HashSet hashSet2 = new HashSet();
        o = hashSet2;
        hashSet.add("ACTION");
        hashSet.add("UNDERLINE");
        hashSet.add("REMOTEGOTO");
        hashSet.add("LOCALGOTO");
        hashSet.add("LOCALDESTINATION");
        hashSet.add("GENERICTAG");
        hashSet.add("NEWPAGE");
        hashSet.add("IMAGE");
        hashSet.add("BACKGROUND");
        hashSet.add("PDFANNOTATION");
        hashSet.add("SKEW");
        hashSet.add("HSCALE");
        hashSet.add("SEPARATOR");
        hashSet.add("TAB");
        hashSet.add("CHAR_SPACING");
        hashSet2.add("SUBSUPSCRIPT");
        hashSet2.add("SPLITCHARACTER");
        hashSet2.add("HYPHENATION");
        hashSet2.add("TEXTRENDERMODE");
    }

    public no4(String str, no4 no4Var) {
        this.a = "";
        this.b = "Cp1252";
        this.f = new HashMap();
        this.g = new HashMap();
        this.k = false;
        m[0] = this;
        this.a = str;
        this.c = no4Var.c;
        HashMap map = no4Var.f;
        this.f = map;
        this.g = no4Var.g;
        this.d = no4Var.d;
        Object[] objArr = (Object[]) map.get("IMAGE");
        if (objArr != null) {
            wb0.a(objArr[0]);
            this.i = ((Float) objArr[1]).floatValue();
            this.j = ((Float) objArr[2]).floatValue();
            this.k = ((Boolean) objArr[3]).booleanValue();
        }
        this.b = this.c.b().j();
        t56 t56Var = (t56) this.g.get("SPLITCHARACTER");
        this.e = t56Var;
        if (t56Var == null) {
            this.e = kg1.a;
        }
    }

    public static boolean v(int i) {
        return (i >= 8203 && i <= 8207) || (i >= 8234 && i <= 8238);
    }

    public no4 A(float f) {
        int i = 1;
        if (f < this.c.f()) {
            String strSubstring = this.a.substring(1);
            this.a = this.a.substring(0, 1);
            return new no4(strSubstring, this);
        }
        int length = this.a.length();
        float fE = 0.0f;
        int i2 = 0;
        boolean zG = false;
        while (i2 < length) {
            zG = jt6.g(this.a, i2);
            fE += zG ? e(jt6.c(this.a, i2)) : e(this.a.charAt(i2));
            if (fE > f) {
                break;
            }
            if (zG) {
                i2++;
            }
            i2++;
        }
        if (i2 == length) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (zG) {
            i = 2;
        }
        String strSubstring2 = this.a.substring(i);
        this.a = this.a.substring(0, i);
        return new no4(strSubstring2, this);
    }

    public float B() {
        if (k("CHAR_SPACING")) {
            return this.c.h(this.a) + (this.a.length() * ((Float) d("CHAR_SPACING")).floatValue());
        }
        if (k("SEPARATOR")) {
            return 0.0f;
        }
        return this.c.h(this.a);
    }

    public void a(float f) {
        Object[] objArr = (Object[]) this.f.get("TAB");
        if (objArr != null) {
            this.f.put("TAB", new Object[]{objArr[0], objArr[1], objArr[2], new Float(f)});
        }
    }

    public p40 b() {
        return (p40) this.g.get("COLOR");
    }

    public bp4 c() {
        return this.c;
    }

    public Object d(String str) {
        return this.f.containsKey(str) ? this.f.get(str) : this.g.get(str);
    }

    public float e(int i) {
        if (v(i)) {
            return 0.0f;
        }
        if (!k("CHAR_SPACING")) {
            return this.c.g(i);
        }
        return this.c.g(i) + ((Float) d("CHAR_SPACING")).floatValue();
    }

    public hx2 f() {
        return null;
    }

    public float g() {
        return this.j;
    }

    public float h() {
        Float f = (Float) d("SUBSUPSCRIPT");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public int i(int i) {
        return this.d.t(i);
    }

    public float j(float f, float f2) {
        int i = 0;
        int iIndexOf = -1;
        while (true) {
            iIndexOf = this.a.indexOf(32, iIndexOf + 1);
            if (iIndexOf < 0) {
                return B() + (this.a.length() * f) + (i * f2);
            }
            i++;
        }
    }

    public boolean k(String str) {
        if (this.f.containsKey(str)) {
            return true;
        }
        return this.g.containsKey(str);
    }

    public boolean l(int i, int i2, int i3, char[] cArr, no4[] no4VarArr) {
        return this.e.a(i, i2, i3, cArr, no4VarArr);
    }

    public boolean m() {
        if (k("SEPARATOR")) {
            return !((Boolean) ((Object[]) d("SEPARATOR"))[1]).booleanValue();
        }
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return k("SEPARATOR");
    }

    public boolean q() {
        return this.b.equals("UnicodeBigUnmarked") || this.b.equals("Identity-H");
    }

    public boolean r() {
        return !this.f.isEmpty();
    }

    public boolean s() {
        return k("TAB");
    }

    public int t() {
        return this.a.length();
    }

    public String toString() {
        return this.a;
    }

    public int u() {
        if (!"Identity-H".equals(this.b)) {
            return this.a.length();
        }
        int length = this.a.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (jt6.e(this.a.charAt(i))) {
                i++;
            }
            i2++;
            i++;
        }
        return i2;
    }

    public no4 w(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        this.h = false;
        wb0.a(this.g.get("HYPHENATION"));
        int length = this.a.length();
        char[] charArray = this.a.toCharArray();
        s40 s40VarB = this.c.b();
        int i5 = -1;
        float f2 = 0.0f;
        if (s40VarB.m() != 2 || s40VarB.t(32) == 32) {
            i = 0;
            int i6 = -1;
            while (i < length) {
                char c = charArray[i];
                if (c == '\r' || c == '\n') {
                    this.h = true;
                    String strSubstring = this.a.substring(((c == '\r' && (i3 = i + 1) < length && charArray[i3] == '\n') ? 2 : 1) + i);
                    String strSubstring2 = this.a.substring(0, i);
                    this.a = strSubstring2;
                    if (strSubstring2.length() < 1) {
                        this.a = " ";
                    }
                    return new no4(strSubstring, this);
                }
                boolean zH = jt6.h(charArray, i);
                float fE = f2 + (zH ? e(jt6.b(charArray[i], charArray[i + 1])) : e(c));
                i4 = c == ' ' ? i + 1 : i5;
                if (zH) {
                    i++;
                }
                if (fE > f) {
                    i2 = i6;
                    i5 = i4;
                    break;
                }
                if (this.e.a(0, i, length, charArray, null)) {
                    i6 = i + 1;
                }
                i++;
                f2 = fE;
                i5 = i4;
            }
            i2 = i6;
        } else {
            i = 0;
            i2 = -1;
            while (i < length) {
                char c2 = charArray[i];
                char cT = (char) s40VarB.t(c2);
                if (cT == '\n') {
                    this.h = true;
                    String strSubstring3 = this.a.substring(i + 1);
                    String strSubstring4 = this.a.substring(0, i);
                    this.a = strSubstring4;
                    if (strSubstring4.length() < 1) {
                        this.a = "\u0001";
                    }
                    return new no4(strSubstring3, this);
                }
                float fE2 = f2 + e(c2);
                i4 = cT == ' ' ? i + 1 : i5;
                if (fE2 > f) {
                    i5 = i4;
                    break;
                }
                if (this.e.a(0, i, length, charArray, m)) {
                    i2 = i + 1;
                }
                i++;
                f2 = fE2;
                i5 = i4;
            }
        }
        if (i == length) {
            return null;
        }
        if (i2 < 0) {
            String str = this.a;
            this.a = "";
            return new no4(str, this);
        }
        if (i5 <= i2 || !this.e.a(0, 0, 1, l, null)) {
            i5 = i2;
        }
        String strSubstring5 = this.a.substring(i5);
        this.a = x(this.a.substring(0, i5));
        return new no4(strSubstring5, this);
    }

    public String x(String str) {
        s40 s40VarB = this.c.b();
        if (s40VarB.m() != 2 || s40VarB.t(32) == 32) {
            while (true) {
                if (!str.endsWith(" ") && !str.endsWith("\t")) {
                    break;
                }
                str = str.substring(0, str.length() - 1);
            }
        } else {
            while (str.endsWith("\u0001")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public float y() {
        s40 s40VarB = this.c.b();
        if (s40VarB.m() != 2 || s40VarB.t(32) == 32) {
            if (this.a.length() <= 1 || !this.a.startsWith(" ")) {
                return 0.0f;
            }
            this.a = this.a.substring(1);
            return this.c.g(32);
        }
        if (this.a.length() <= 1 || !this.a.startsWith("\u0001")) {
            return 0.0f;
        }
        this.a = this.a.substring(1);
        return this.c.g(1);
    }

    public float z() {
        s40 s40VarB = this.c.b();
        if (s40VarB.m() != 2 || s40VarB.t(32) == 32) {
            if (this.a.length() <= 1 || !this.a.endsWith(" ")) {
                return 0.0f;
            }
            String str = this.a;
            this.a = str.substring(0, str.length() - 1);
            return this.c.g(32);
        }
        if (this.a.length() <= 1 || !this.a.endsWith("\u0001")) {
            return 0.0f;
        }
        String str2 = this.a;
        this.a = str2.substring(0, str2.length() - 1);
        return this.c.g(1);
    }

    public no4(fk0 fk0Var, ho4 ho4Var) {
        this.a = "";
        this.b = "Cp1252";
        this.f = new HashMap();
        this.g = new HashMap();
        this.k = false;
        m[0] = this;
        this.a = fk0Var.c();
        zd2 zd2VarD = fk0Var.d();
        float fJ = zd2VarD.j();
        fJ = fJ == -1.0f ? 12.0f : fJ;
        this.d = zd2VarD.c();
        int iK = zd2VarD.k();
        iK = iK == -1 ? 0 : iK;
        if (this.d == null) {
            this.d = zd2VarD.d(false);
        } else {
            if ((iK & 1) != 0) {
                this.f.put("TEXTRENDERMODE", new Object[]{2, new Float(fJ / 30.0f), null});
            }
            if ((iK & 2) != 0) {
                this.f.put("SKEW", new float[]{0.0f, 0.21256f});
            }
        }
        this.c = new bp4(this.d, fJ);
        HashMap mapB = fk0Var.b();
        if (mapB != null) {
            for (Map.Entry entry : mapB.entrySet()) {
                String str = (String) entry.getKey();
                if (n.contains(str)) {
                    this.f.put(str, entry.getValue());
                } else if (o.contains(str)) {
                    this.g.put(str, entry.getValue());
                }
            }
            if ("".equals(mapB.get("GENERICTAG"))) {
                this.f.put("GENERICTAG", fk0Var.c());
            }
        }
        if (zd2VarD.n()) {
            this.f.put("UNDERLINE", jt6.a((Object[][]) this.f.get("UNDERLINE"), new Object[]{null, new float[]{0.0f, 0.06666667f, 0.0f, -0.33333334f, 0.0f}}));
        }
        if (zd2VarD.m()) {
            this.f.put("UNDERLINE", jt6.a((Object[][]) this.f.get("UNDERLINE"), new Object[]{null, new float[]{0.0f, 0.06666667f, 0.0f, 0.33333334f, 0.0f}}));
        }
        if (ho4Var != null) {
            this.f.put("ACTION", ho4Var);
        }
        this.g.put("COLOR", zd2VarD.g());
        this.g.put("ENCODING", this.c.b().j());
        Object[] objArr = (Object[]) this.f.get("IMAGE");
        if (objArr != null) {
            this.f.remove("HSCALE");
            wb0.a(objArr[0]);
            this.i = ((Float) objArr[1]).floatValue();
            this.j = ((Float) objArr[2]).floatValue();
            this.k = ((Boolean) objArr[3]).booleanValue();
        }
        this.c.d(null);
        Float f = (Float) this.f.get("HSCALE");
        if (f != null) {
            this.c.c(f.floatValue());
        }
        this.b = this.c.b().j();
        t56 t56Var = (t56) this.g.get("SPLITCHARACTER");
        this.e = t56Var;
        if (t56Var == null) {
            this.e = kg1.a;
        }
    }
}
