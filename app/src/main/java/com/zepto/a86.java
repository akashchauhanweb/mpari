package com.zepto;

import java.lang.reflect.Modifier;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class a86 {
    public static a86 j;
    public static a86 k;
    public static a86 l;
    public boolean a = true;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;
    public int i;

    static {
        a86 a86Var = new a86();
        j = a86Var;
        a86Var.a = true;
        a86Var.b = false;
        a86Var.c = false;
        a86Var.d = false;
        a86Var.e = true;
        a86Var.f = false;
        a86Var.g = false;
        a86Var.i = 0;
        a86 a86Var2 = new a86();
        k = a86Var2;
        a86Var2.a = true;
        a86Var2.b = true;
        a86Var2.c = false;
        a86Var2.d = false;
        a86Var2.e = false;
        j.i = 1;
        a86 a86Var3 = new a86();
        l = a86Var3;
        a86Var3.a = false;
        a86Var3.b = true;
        a86Var3.c = false;
        a86Var3.d = true;
        a86Var3.e = false;
        a86Var3.h = false;
        a86Var3.i = 2;
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.b) {
            stringBuffer.append("(");
            c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i]));
        }
    }

    public String d(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public String e(int i) {
        if (!this.d) {
            return "";
        }
        String string = Modifier.toString(i);
        if (string.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.a);
    }

    public String h(Class cls, String str, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z ? i(str).replace(Typography.dollar, '.') : str.replace(Typography.dollar, '.');
        }
        Class<?> componentType = cls.getComponentType();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(componentType, componentType.getName(), z));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    public String i(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
