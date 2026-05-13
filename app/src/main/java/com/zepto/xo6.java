package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import com.zepto.ie2;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo6 extends bp6 {
    public static Class b;
    public static Constructor c;
    public static Method d;
    public static Method e;
    public static boolean f;

    public static boolean g(Object obj, String str, int i, boolean z) {
        i();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface h(Object obj) {
        i();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void i() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    private static Object j() {
        i();
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.zepto.bp6
    public Typeface a(Context context, ie2.c cVar, Resources resources, int i) {
        Object objJ = j();
        for (ie2.d dVar : cVar.a()) {
            File fileD = cp6.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!cp6.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!g(objJ, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return h(objJ);
    }
}
