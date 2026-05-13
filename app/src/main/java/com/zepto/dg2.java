package com.zepto;

import com.zepto.sf2;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg2 {
    public static final w26 a = new w26();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return sf2.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        w26 w26Var = a;
        w26 w26Var2 = (w26) w26Var.get(classLoader);
        if (w26Var2 == null) {
            w26Var2 = new w26();
            w26Var.put(classLoader, w26Var2);
        }
        Class cls = (Class) w26Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        w26Var2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new sf2.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new sf2.l("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public abstract sf2 a(ClassLoader classLoader, String str);
}
