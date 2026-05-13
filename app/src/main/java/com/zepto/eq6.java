package com.zepto;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eq6 {
    public static final eq6 a = c();

    public class a extends eq6 {
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public a(Method method, Object obj) {
            this.b = method;
            this.c = obj;
        }

        @Override // com.zepto.eq6
        public Object d(Class cls) {
            eq6.b(cls);
            return this.b.invoke(this.c, cls);
        }
    }

    public class b extends eq6 {
        public final /* synthetic */ Method b;
        public final /* synthetic */ int c;

        public b(Method method, int i) {
            this.b = method;
            this.c = i;
        }

        @Override // com.zepto.eq6
        public Object d(Class cls) {
            eq6.b(cls);
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
    }

    public class c extends eq6 {
        public final /* synthetic */ Method b;

        public c(Method method) {
            this.b = method;
        }

        @Override // com.zepto.eq6
        public Object d(Class cls) {
            eq6.b(cls);
            return this.b.invoke(null, cls, Object.class);
        }
    }

    public class d extends eq6 {
        @Override // com.zepto.eq6
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class cls) {
        String strA = qx0.a(cls);
        if (strA == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strA);
    }

    public static eq6 c() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract Object d(Class cls);
}
