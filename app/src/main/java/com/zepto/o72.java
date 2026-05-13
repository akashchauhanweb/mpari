package com.zepto;

import com.zepto.r43;
import com.zepto.s43;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public final class o72 {
    public static Hashtable e;
    public static Object[] f;
    public static /* synthetic */ Class g;
    public Class a;
    public ClassLoader b;
    public String c;
    public int d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        e = hashtable;
        hashtable.put("void", Void.TYPE);
        e.put("boolean", Boolean.TYPE);
        e.put("byte", Byte.TYPE);
        e.put("char", Character.TYPE);
        e.put("short", Short.TYPE);
        e.put("int", Integer.TYPE);
        e.put("long", Long.TYPE);
        e.put("float", Float.TYPE);
        e.put("double", Double.TYPE);
        f = new Object[0];
    }

    public o72(String str, Class cls) {
        this.c = str;
        this.a = cls;
        this.b = cls.getClassLoader();
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static Class b(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class cls2 = g;
            if (cls2 != null) {
                return cls2;
            }
            Class clsA = a("java.lang.ClassNotFoundException");
            g = clsA;
            return clsA;
        }
    }

    public static r43 c(r43.a aVar, Object obj, Object obj2) {
        return new s43(aVar, obj, obj2, f);
    }

    public static r43 d(r43.a aVar, Object obj, Object obj2, Object obj3) {
        return new s43(aVar, obj, obj2, new Object[]{obj3});
    }

    public au3 e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = Integer.parseInt(str, 16);
        Class clsB = b(str3, this.b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i2 = 0; i2 < iCountTokens; i2++) {
            clsArr[i2] = b(stringTokenizer.nextToken(), this.b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i3 = 0; i3 < iCountTokens2; i3++) {
            strArr[i3] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i4 = 0; i4 < iCountTokens3; i4++) {
            clsArr2[i4] = b(stringTokenizer3.nextToken(), this.b);
        }
        return new bu3(i, str2, clsB, clsArr, strArr, clsArr2, b(str7, this.b));
    }

    public r43.a f(String str, r26 r26Var, int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        return new s43.a(i2, str, r26Var, g(i, -1));
    }

    public z46 g(int i, int i2) {
        return new a56(this.a, this.c, i);
    }
}
