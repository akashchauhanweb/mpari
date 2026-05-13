package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.df3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static b c = new b();
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public static class a {
        public final Map a = new HashMap();
        public final Map b;

        public a(Map map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                h.a aVar = (h.a) entry.getValue();
                List arrayList = (List) this.a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.a.put(aVar, arrayList);
                }
                arrayList.add((C0013b) entry.getKey());
            }
        }

        public static void b(List list, df3 df3Var, h.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0013b) list.get(size)).a(df3Var, aVar, obj);
                }
            }
        }

        public void a(df3 df3Var, h.a aVar, Object obj) {
            b((List) this.a.get(aVar), df3Var, aVar, obj);
            b((List) this.a.get(h.a.ON_ANY), df3Var, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    public static final class C0013b {
        public final int a;
        public final Method b;

        public C0013b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(df3 df3Var, h.a aVar, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.b.invoke(obj, df3Var);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.b.invoke(obj, df3Var, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0013b)) {
                return false;
            }
            C0013b c0013b = (C0013b) obj;
            return this.a == c0013b.a && this.b.getName().equals(c0013b.b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).b.entrySet()) {
                e(map, (C0013b) entry.getKey(), (h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!df3.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                h.a aVarValue = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0013b(i, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((o) method.getAnnotation(o.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, C0013b c0013b, h.a aVar, Class cls) {
        h.a aVar2 = (h.a) map.get(c0013b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0013b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0013b.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
