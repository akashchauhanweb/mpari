package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.zd2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ce2 {
    public static String[] e = {"3", VContant.MAINSCREEN, "1033", "3", "0", "1033", VContant.MAINSCREEN, "0", "0", "0", "3", "0"};
    public Hashtable a = new Hashtable();
    public Hashtable b = new Hashtable();
    public String c = "Cp1252";
    public boolean d = false;

    public ce2() {
        this.a.put("Courier".toLowerCase(), "Courier");
        this.a.put("Courier-Bold".toLowerCase(), "Courier-Bold");
        this.a.put("Courier-Oblique".toLowerCase(), "Courier-Oblique");
        this.a.put("Courier-BoldOblique".toLowerCase(), "Courier-BoldOblique");
        this.a.put("Helvetica".toLowerCase(), "Helvetica");
        this.a.put("Helvetica-Bold".toLowerCase(), "Helvetica-Bold");
        this.a.put("Helvetica-Oblique".toLowerCase(), "Helvetica-Oblique");
        this.a.put("Helvetica-BoldOblique".toLowerCase(), "Helvetica-BoldOblique");
        this.a.put("Symbol".toLowerCase(), "Symbol");
        this.a.put("Times-Roman".toLowerCase(), "Times-Roman");
        this.a.put("Times-Bold".toLowerCase(), "Times-Bold");
        this.a.put("Times-Italic".toLowerCase(), "Times-Italic");
        this.a.put("Times-BoldItalic".toLowerCase(), "Times-BoldItalic");
        this.a.put("ZapfDingbats".toLowerCase(), "ZapfDingbats");
        ArrayList arrayList = new ArrayList();
        arrayList.add("Courier");
        arrayList.add("Courier-Bold");
        arrayList.add("Courier-Oblique");
        arrayList.add("Courier-BoldOblique");
        this.b.put("Courier".toLowerCase(), arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Helvetica");
        arrayList2.add("Helvetica-Bold");
        arrayList2.add("Helvetica-Oblique");
        arrayList2.add("Helvetica-BoldOblique");
        this.b.put("Helvetica".toLowerCase(), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("Symbol");
        this.b.put("Symbol".toLowerCase(), arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("Times-Roman");
        arrayList4.add("Times-Bold");
        arrayList4.add("Times-Italic");
        arrayList4.add("Times-BoldItalic");
        this.b.put("Times".toLowerCase(), arrayList4);
        this.b.put("Times-Roman".toLowerCase(), arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("ZapfDingbats");
        this.b.put("ZapfDingbats".toLowerCase(), arrayList5);
    }

    public zd2 a(String str, String str2, boolean z, float f, int i, p40 p40Var) {
        return b(str, str2, z, f, i, p40Var, true);
    }

    public zd2 b(String str, String str2, boolean z, float f, int i, p40 p40Var, boolean z2) {
        String str3;
        s40 s40VarE;
        int i2;
        int i3 = i;
        if (str == null) {
            return new zd2(zd2.b.UNDEFINED, f, i3, p40Var);
        }
        ArrayList arrayList = (ArrayList) this.b.get(str.toLowerCase());
        if (arrayList != null) {
            boolean z3 = false;
            int i4 = i3 == -1 ? 0 : i3;
            Iterator it = arrayList.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = i5;
                    str3 = str;
                    break;
                }
                str3 = (String) it.next();
                String lowerCase = str3.toLowerCase();
                int i6 = lowerCase.toLowerCase().indexOf("bold") != -1 ? 1 : 0;
                i2 = (lowerCase.toLowerCase().indexOf("italic") == -1 && lowerCase.toLowerCase().indexOf("oblique") == -1) ? i6 : i6 | 2;
                if ((i4 & 3) == i2) {
                    z3 = true;
                    break;
                }
                i5 = i2;
            }
            if (i3 != -1 && z3) {
                i3 &= ~i2;
            }
        } else {
            str3 = str;
        }
        try {
            try {
                s40VarE = s40.f(str3, str2, z, z2, null, null, true);
            } catch (IOException unused) {
                return new zd2(zd2.b.UNDEFINED, f, i3, p40Var);
            } catch (NullPointerException unused2) {
                return new zd2(zd2.b.UNDEFINED, f, i3, p40Var);
            }
        } catch (cu1 unused3) {
            s40VarE = null;
        }
        if (s40VarE == null) {
            try {
                String str4 = (String) this.a.get(str3.toLowerCase());
                if (str4 == null) {
                    return new zd2(zd2.b.UNDEFINED, f, i3, p40Var);
                }
                s40VarE = s40.e(str4, str2, z, z2, null, null);
            } catch (cu1 e2) {
                throw new p52(e2);
            }
        }
        return new zd2(s40VarE, f, i3, p40Var);
    }
}
