package com.zepto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class gf3 {
    public static final gf3 a = new gf3();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    public static final String c(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt__StringsJVMKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public static final androidx.lifecycle.k f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof androidx.lifecycle.k;
        boolean z2 = object instanceof rf1;
        if (z && z2) {
            return new androidx.lifecycle.d((rf1) object, (androidx.lifecycle.k) object);
        }
        if (z2) {
            return new androidx.lifecycle.d((rf1) object, null);
        }
        if (z) {
            return (androidx.lifecycle.k) object;
        }
        Class<?> cls = object.getClass();
        gf3 gf3Var = a;
        if (gf3Var.d(cls) != 2) {
            return new androidx.lifecycle.q(object);
        }
        Object obj = c.get(cls);
        Intrinsics.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            gf3Var.a((Constructor) list.get(0), object);
            return new androidx.lifecycle.y(null);
        }
        int size = list.size();
        androidx.lifecycle.e[] eVarArr = new androidx.lifecycle.e[size];
        for (int i = 0; i < size; i++) {
            a.a((Constructor) list.get(i), object);
            eVarArr[i] = null;
        }
        return new androidx.lifecycle.c(eVarArr);
    }

    public final androidx.lifecycle.e a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            wb0.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Constructor b(Class cls) {
        try {
            Package r0 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r0 != null ? r0.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final int d(Class cls) {
        Map map = b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public final boolean e(Class cls) {
        return cls != null && cf3.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            c.put(cls, CollectionsKt__CollectionsJVMKt.listOf(constructorB));
            return 2;
        }
        if (androidx.lifecycle.b.c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = c.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = c.get(intrface);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        c.put(cls, arrayList);
        return 2;
    }
}
