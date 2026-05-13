package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.app.Activity;
import android.app.PendingIntent;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class mx2 {
    public static final mx2 a = new mx2();
    public static Object b;
    public static Object c;
    public static Class d;
    public static Class e;
    public static boolean f;

    public final boolean a() {
        return f;
    }

    public final void b(DexClassLoader dexLoadedClassRef) {
        Constructor declaredConstructor;
        Constructor declaredConstructor2;
        Intrinsics.checkNotNullParameter(dexLoadedClassRef, "dexLoadedClassRef");
        try {
            d = dexLoadedClassRef.loadClass("utils.log.Constants");
            e = dexLoadedClassRef.loadClass("print.utils.Logs");
            Class cls = d;
            Object objNewInstance = null;
            Object objNewInstance2 = (cls == null || (declaredConstructor = cls.getDeclaredConstructor(new Class[0])) == null) ? null : declaredConstructor.newInstance(new Object[0]);
            if (objNewInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            b = objNewInstance2;
            Class cls2 = e;
            if (cls2 != null && (declaredConstructor2 = cls2.getDeclaredConstructor(new Class[0])) != null) {
                objNewInstance = declaredConstructor2.newInstance(new Object[0]);
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            c = objNewInstance;
            f = true;
        } catch (Exception e2) {
            nn3.a.b("ImageLogger", e2.toString(), e2);
        }
    }

    public final void c(String methodName, Object[] requiredDetails, Activity currentActivity) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(requiredDetails, "requiredDetails");
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        try {
            int length = requiredDetails.length;
            Class[] clsArr = new Class[length];
            int length2 = requiredDetails.length;
            int i = 0;
            while (i < length2) {
                int i2 = i + 1;
                Object obj = requiredDetails[i];
                if (obj instanceof Integer) {
                    clsArr[i] = Integer.TYPE;
                } else if (obj instanceof String) {
                    clsArr[i] = String.class;
                } else if (obj instanceof PendingIntent) {
                    clsArr[i] = PendingIntent.class;
                } else if (obj instanceof Activity) {
                    clsArr[i] = Activity.class;
                } else if (obj instanceof Boolean) {
                    clsArr[i] = Boolean.TYPE;
                }
                i = i2;
            }
            Class cls = e;
            Method declaredMethod = cls == null ? null : cls.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(clsArr, length));
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.invoke(c, requiredDetails[0], requiredDetails[1]);
        } catch (Exception e2) {
            nn3.a.b("ImageLogger", e2.toString(), e2);
        }
    }

    public final String d(String stringName) {
        Intrinsics.checkNotNullParameter(stringName, "stringName");
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            Object obj = null;
            if (!stringName.equals(nativeInteractor.O0()) && !stringName.equals(nativeInteractor.P0())) {
                Class cls = d;
                Field declaredField = cls == null ? null : cls.getDeclaredField(stringName);
                if (declaredField != null) {
                    obj = declaredField.get("");
                }
                return String.valueOf(obj);
            }
            Class cls2 = e;
            Field declaredField2 = cls2 == null ? null : cls2.getDeclaredField(stringName);
            if (declaredField2 != null) {
                obj = declaredField2.get("");
            }
            return String.valueOf(obj);
        } catch (Exception e2) {
            nn3.a.b("ImageLogger", e2.toString(), e2);
            return "";
        }
    }

    public final Object e(String methodName, Object[] requiredDetails) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(requiredDetails, "requiredDetails");
        try {
            int length = requiredDetails.length;
            Class[] clsArr = new Class[length];
            int length2 = requiredDetails.length;
            int i = 0;
            while (i < length2) {
                int i2 = i + 1;
                Object obj = requiredDetails[i];
                if (obj instanceof Integer) {
                    clsArr[i] = Integer.TYPE;
                } else if (obj instanceof String) {
                    clsArr[i] = String.class;
                } else if (obj instanceof PendingIntent) {
                    clsArr[i] = PendingIntent.class;
                } else if (obj instanceof Activity) {
                    clsArr[i] = Activity.class;
                } else if (obj instanceof Boolean) {
                    clsArr[i] = Boolean.TYPE;
                } else if (obj instanceof Long) {
                    clsArr[i] = Long.TYPE;
                }
                i = i2;
            }
            Class cls = e;
            Intrinsics.checkNotNull(cls);
            Object objInvoke = cls.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(clsArr, length)).invoke(c, requiredDetails[0], requiredDetails[1], requiredDetails[2]);
            nn3.a.f("ImageLogger", methodName + ":-" + objInvoke);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) objInvoke.toString(), new String[]{"|-|"}, false, 0, 6, (Object) null);
            return Intrinsics.areEqual(listSplit$default.get(1), NativeInteractor.a.i1()) ? (String) listSplit$default.get(3) : "SAFE";
        } catch (Exception e2) {
            nn3.a.b("ImageLogger", e2.toString(), e2);
            return "SAFE";
        }
    }
}
