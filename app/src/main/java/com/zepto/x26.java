package com.zepto;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class x26 {
    public static void a(uo4 uo4Var, HashMap map, pq4 pq4Var, boolean z) {
        String str;
        try {
            String str2 = (String) map.get("Action");
            int i = 0;
            if ("GoTo".equals(str2)) {
                String str3 = (String) map.get("Named");
                if (str3 != null) {
                    if (z) {
                        uo4Var.r(lp4.T1, new lp4(str3));
                        return;
                    } else {
                        uo4Var.r(lp4.T1, new hq4(str3, null));
                        return;
                    }
                }
                String str4 = (String) map.get("Page");
                if (str4 != null) {
                    ko4 ko4Var = new ko4();
                    StringTokenizer stringTokenizer = new StringTokenizer(str4);
                    ko4Var.m(pq4Var.I(Integer.parseInt(stringTokenizer.nextToken())));
                    if (stringTokenizer.hasMoreTokens()) {
                        String strNextToken = stringTokenizer.nextToken();
                        if (strNextToken.startsWith("/")) {
                            strNextToken = strNextToken.substring(1);
                        }
                        ko4Var.m(new lp4(strNextToken));
                        while (i < 4 && stringTokenizer.hasMoreTokens()) {
                            String strNextToken2 = stringTokenizer.nextToken();
                            if (strNextToken2.equals("null")) {
                                ko4Var.m(np4.f);
                            } else {
                                ko4Var.m(new op4(strNextToken2));
                            }
                            i++;
                        }
                    } else {
                        ko4Var.m(lp4.Bb);
                        ko4Var.n(new float[]{0.0f, 10000.0f, 0.0f});
                    }
                    uo4Var.r(lp4.T1, ko4Var);
                    return;
                }
                return;
            }
            if (!"GoToR".equals(str2)) {
                if (!"URI".equals(str2)) {
                    if (!"Launch".equals(str2) || (str = (String) map.get("File")) == null) {
                        return;
                    }
                    uo4 uo4Var2 = new uo4();
                    uo4Var2.r(lp4.E8, lp4.i5);
                    uo4Var2.r(lp4.Q2, new hq4(str));
                    uo4Var.r(lp4.h, uo4Var2);
                    return;
                }
                String str5 = (String) map.get("URI");
                if (str5 != null) {
                    uo4 uo4Var3 = new uo4();
                    lp4 lp4Var = lp4.E8;
                    lp4 lp4Var2 = lp4.Ca;
                    uo4Var3.r(lp4Var, lp4Var2);
                    uo4Var3.r(lp4Var2, new hq4(str5));
                    uo4Var.r(lp4.h, uo4Var3);
                    return;
                }
                return;
            }
            uo4 uo4Var4 = new uo4();
            String str6 = (String) map.get("Named");
            if (str6 != null) {
                uo4Var4.r(lp4.D1, new hq4(str6, null));
            } else {
                String str7 = (String) map.get("NamedN");
                if (str7 != null) {
                    uo4Var4.r(lp4.D1, new lp4(str7));
                } else {
                    String str8 = (String) map.get("Page");
                    if (str8 != null) {
                        ko4 ko4Var2 = new ko4();
                        StringTokenizer stringTokenizer2 = new StringTokenizer(str8);
                        ko4Var2.m(new op4(stringTokenizer2.nextToken()));
                        if (stringTokenizer2.hasMoreTokens()) {
                            String strNextToken3 = stringTokenizer2.nextToken();
                            if (strNextToken3.startsWith("/")) {
                                strNextToken3 = strNextToken3.substring(1);
                            }
                            ko4Var2.m(new lp4(strNextToken3));
                            while (i < 4 && stringTokenizer2.hasMoreTokens()) {
                                String strNextToken4 = stringTokenizer2.nextToken();
                                if (strNextToken4.equals("null")) {
                                    ko4Var2.m(np4.f);
                                } else {
                                    ko4Var2.m(new op4(strNextToken4));
                                }
                                i++;
                            }
                        } else {
                            ko4Var2.m(lp4.Bb);
                            ko4Var2.n(new float[]{0.0f, 10000.0f, 0.0f});
                        }
                        uo4Var4.r(lp4.D1, ko4Var2);
                    }
                }
            }
            String str9 = (String) map.get("File");
            if (uo4Var4.u() <= 0 || str9 == null) {
                return;
            }
            uo4Var4.r(lp4.E8, lp4.T3);
            uo4Var4.r(lp4.Q2, new hq4(str9));
            String str10 = (String) map.get("NewWindow");
            if (str10 != null) {
                if (str10.equals("true")) {
                    uo4Var4.r(lp4.e6, lo4.g);
                } else if (str10.equals("false")) {
                    uo4Var4.r(lp4.e6, lo4.h);
                }
            }
            uo4Var.r(lp4.h, uo4Var4);
        } catch (Exception unused) {
        }
    }

    public static Object[] b(pq4 pq4Var, gp4 gp4Var, List list, boolean z) {
        int size = list.size();
        gp4[] gp4VarArr = new gp4[size];
        for (int i = 0; i < size; i++) {
            gp4VarArr[i] = pq4Var.K();
        }
        ListIterator listIterator = list.listIterator();
        int i2 = 0;
        int i3 = 0;
        while (listIterator.hasNext()) {
            HashMap map = (HashMap) listIterator.next();
            List list2 = (List) map.get("Kids");
            Object[] objArrB = (list2 == null || list2.isEmpty()) ? null : b(pq4Var, gp4VarArr[i3], list2, z);
            uo4 uo4Var = new uo4();
            i2++;
            if (objArrB != null) {
                uo4Var.r(lp4.d3, (gp4) objArrB[0]);
                uo4Var.r(lp4.f5, (gp4) objArrB[1]);
                int iIntValue = ((Integer) objArrB[2]).intValue();
                if ("false".equals(map.get("Open"))) {
                    uo4Var.r(lp4.q1, new op4(-iIntValue));
                } else {
                    uo4Var.r(lp4.q1, new op4(iIntValue));
                    i2 += iIntValue;
                }
            }
            uo4Var.r(lp4.c7, gp4Var);
            if (i3 > 0) {
                uo4Var.r(lp4.B7, gp4VarArr[i3 - 1]);
            }
            if (i3 < size - 1) {
                uo4Var.r(lp4.f6, gp4VarArr[i3 + 1]);
            }
            uo4Var.r(lp4.T9, new hq4((String) map.get("Title"), "UnicodeBig"));
            String str = (String) map.get("Color");
            if (str != null) {
                try {
                    ko4 ko4Var = new ko4();
                    StringTokenizer stringTokenizer = new StringTokenizer(str);
                    for (int i4 = 0; i4 < 3; i4++) {
                        float f = Float.parseFloat(stringTokenizer.nextToken());
                        if (f < 0.0f) {
                            f = 0.0f;
                        }
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        ko4Var.m(new op4(f));
                    }
                    uo4Var.r(lp4.w0, ko4Var);
                } catch (Exception unused) {
                }
            }
            String str2 = (String) map.get("Style");
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                int i5 = lowerCase.indexOf("italic") >= 0 ? 1 : 0;
                if (lowerCase.indexOf("bold") >= 0) {
                    i5 |= 2;
                }
                if (i5 != 0) {
                    uo4Var.r(lp4.Q2, new op4(i5));
                }
            }
            a(uo4Var, map, pq4Var, z);
            pq4Var.o(uo4Var, gp4VarArr[i3]);
            i3++;
        }
        return new Object[]{gp4VarArr[0], gp4VarArr[size - 1], Integer.valueOf(i2)};
    }
}
