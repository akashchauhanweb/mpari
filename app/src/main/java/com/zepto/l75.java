package com.zepto;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l75 {
    public static final b a;

    public static abstract class b {
        public b() {
        }

        public abstract Method a(Class cls, Field field);

        public abstract Constructor b(Class cls);

        public abstract String[] c(Class cls);

        public abstract boolean d(Class cls);
    }

    public static class c extends b {
        public c() {
            super();
        }

        @Override // com.zepto.l75.b
        public Method a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.zepto.l75.b
        public Constructor b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.zepto.l75.b
        public String[] c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.zepto.l75.b
        public boolean d(Class cls) {
            return false;
        }
    }

    public static class d extends b {
        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;

        @Override // com.zepto.l75.b
        public Method a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e) {
                throw l75.d(e);
            }
        }

        @Override // com.zepto.l75.b
        public Constructor b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.d.invoke(objArr[i], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw l75.d(e);
            }
        }

        @Override // com.zepto.l75.b
        public String[] c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.c.invoke(objArr[i], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw l75.d(e);
            }
        }

        @Override // com.zepto.l75.b
        public boolean d(Class cls) {
            try {
                return ((Boolean) this.a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw l75.d(e);
            }
        }

        public d() throws NoSuchMethodException {
            super();
            this.a = Class.class.getMethod("isRecord", new Class[0]);
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.c = componentType.getMethod("getName", new Class[0]);
            this.d = componentType.getMethod("getType", new Class[0]);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (NoSuchMethodException unused) {
            cVar = new c();
        }
        a = cVar;
    }

    public static void b(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class cls, Field field) {
        return a.a(cls, field);
    }

    public static Constructor i(Class cls) {
        return a.b(cls);
    }

    public static String[] j(Class cls) {
        return a.c(cls);
    }

    public static boolean k(Class cls) {
        return a.d(cls);
    }

    public static void l(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new h53("Failed making " + g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e);
        }
    }

    public static String m(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
        }
    }
}
