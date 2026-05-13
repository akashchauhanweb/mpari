package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.h75;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n75 implements po6 {
    public final rx0 c;
    public final kb2 e;
    public final v52 f;
    public final x43 g;
    public final List h;

    public class a extends c {
        public final /* synthetic */ boolean e;
        public final /* synthetic */ Method f;
        public final /* synthetic */ Field g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ no6 i;
        public final /* synthetic */ Gson j;
        public final /* synthetic */ TypeToken k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ boolean m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, boolean z, boolean z2, boolean z3, Method method, Field field, boolean z4, no6 no6Var, Gson gson, TypeToken typeToken, boolean z5, boolean z6) {
            super(str, str2, z, z2);
            this.e = z3;
            this.f = method;
            this.g = field;
            this.h = z4;
            this.i = no6Var;
            this.j = gson;
            this.k = typeToken;
            this.l = z5;
            this.m = z6;
        }

        @Override // com.zepto.n75.c
        public void a(s53 s53Var, int i, Object[] objArr) {
            Object obj = this.i.read(s53Var);
            if (obj != null || !this.l) {
                objArr[i] = obj;
                return;
            }
            throw new o53("null is not allowed as value for record component '" + this.b + "' of primitive type; at path " + s53Var.b());
        }

        @Override // com.zepto.n75.c
        public void b(s53 s53Var, Object obj) throws IllegalAccessException {
            Object obj2 = this.i.read(s53Var);
            if (obj2 == null && this.l) {
                return;
            }
            if (this.e) {
                n75.c(obj, this.g);
            } else if (this.m) {
                throw new i53("Cannot set value of 'static final' " + k75.f(this.g, false));
            }
            this.g.set(obj, obj2);
        }

        @Override // com.zepto.n75.c
        public void c(b63 b63Var, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.c) {
                if (this.e) {
                    Method method = this.f;
                    if (method == null) {
                        n75.c(obj, this.g);
                    } else {
                        n75.c(obj, method);
                    }
                }
                Method method2 = this.f;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, new Object[0]);
                    } catch (InvocationTargetException e) {
                        throw new i53("Accessor " + k75.f(this.f, false) + " threw exception", e.getCause());
                    }
                } else {
                    objInvoke = this.g.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                b63Var.e0(this.a);
                (this.h ? this.i : new ro6(this.j, this.i, this.k.getType())).write(b63Var, objInvoke);
            }
        }
    }

    public static abstract class b extends no6 {
        public final Map a;

        public b(Map map) {
            this.a = map;
        }

        public abstract Object a();

        public abstract Object b(Object obj);

        public abstract void c(Object obj, s53 s53Var, c cVar);

        @Override // com.zepto.no6
        public Object read(s53 s53Var) throws IOException {
            if (s53Var.G0() == v53.NULL) {
                s53Var.C0();
                return null;
            }
            Object objA = a();
            try {
                s53Var.e();
                while (s53Var.d0()) {
                    c cVar = (c) this.a.get(s53Var.A0());
                    if (cVar == null || !cVar.d) {
                        s53Var.Q0();
                    } else {
                        c(objA, s53Var, cVar);
                    }
                }
                s53Var.B();
                return b(objA);
            } catch (IllegalAccessException e) {
                throw k75.e(e);
            } catch (IllegalStateException e2) {
                throw new u53(e2);
            }
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Object obj) throws IOException {
            if (obj == null) {
                b63Var.m0();
                return;
            }
            b63Var.m();
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).c(b63Var, obj);
                }
                b63Var.B();
            } catch (IllegalAccessException e) {
                throw k75.e(e);
            }
        }
    }

    public static abstract class c {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public c(String str, String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public abstract void a(s53 s53Var, int i, Object[] objArr);

        public abstract void b(s53 s53Var, Object obj);

        public abstract void c(b63 b63Var, Object obj);
    }

    public static final class d extends b {
        public final te4 b;

        public d(te4 te4Var, Map map) {
            super(map);
            this.b = te4Var;
        }

        @Override // com.zepto.n75.b
        public Object a() {
            return this.b.a();
        }

        @Override // com.zepto.n75.b
        public Object b(Object obj) {
            return obj;
        }

        @Override // com.zepto.n75.b
        public void c(Object obj, s53 s53Var, c cVar) {
            cVar.b(s53Var, obj);
        }
    }

    public static final class e extends b {
        public static final Map e = f();
        public final Constructor b;
        public final Object[] c;
        public final Map d;

        public e(Class cls, Map map, boolean z) {
            super(map);
            this.d = new HashMap();
            Constructor constructorH = k75.h(cls);
            this.b = constructorH;
            if (z) {
                n75.c(null, constructorH);
            } else {
                k75.k(constructorH);
            }
            String[] strArrI = k75.i(cls);
            for (int i = 0; i < strArrI.length; i++) {
                this.d.put(strArrI[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        public static Map f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // com.zepto.n75.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.c.clone();
        }

        @Override // com.zepto.n75.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object b(Object[] objArr) {
            try {
                return this.b.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                throw k75.e(e2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + k75.c(this.b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + k75.c(this.b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke constructor '" + k75.c(this.b) + "' with args " + Arrays.toString(objArr), e5.getCause());
            }
        }

        @Override // com.zepto.n75.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, s53 s53Var, c cVar) {
            Integer num = (Integer) this.d.get(cVar.b);
            if (num != null) {
                cVar.a(s53Var, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + k75.c(this.b) + "' for field with name '" + cVar.b + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public n75(rx0 rx0Var, kb2 kb2Var, v52 v52Var, x43 x43Var, List list) {
        this.c = rx0Var;
        this.e = kb2Var;
        this.f = v52Var;
        this.g = x43Var;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (i75.a(accessibleObject, obj)) {
            return;
        }
        throw new i53(k75.f(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    @Override // com.zepto.po6
    public no6 a(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        h75.a aVarB = i75.b(this.h, rawType);
        if (aVarB != h75.a.BLOCK_ALL) {
            boolean z = aVarB == h75.a.BLOCK_INACCESSIBLE;
            return k75.j(rawType) ? new e(rawType, e(gson, typeToken, rawType, z, true), z) : new d(this.c.b(typeToken), e(gson, typeToken, rawType, z, false));
        }
        throw new i53("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final c d(Gson gson, Field field, Method method, String str, TypeToken typeToken, boolean z, boolean z2, boolean z3) {
        boolean zA = gv4.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z4 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        v43 v43Var = (v43) field.getAnnotation(v43.class);
        no6 no6VarB = v43Var != null ? this.g.b(this.c, gson, typeToken, v43Var) : null;
        boolean z5 = no6VarB != null;
        if (no6VarB == null) {
            no6VarB = gson.getAdapter(typeToken);
        }
        return new a(str, field.getName(), z, z2, z3, method, field, z5, no6VarB, gson, typeToken, zA, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map e(com.google.gson.Gson r29, com.google.gson.reflect.TypeToken r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.n75.e(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):java.util.Map");
    }

    public final List f(Field field) {
        xy5 xy5Var = (xy5) field.getAnnotation(xy5.class);
        if (xy5Var == null) {
            return Collections.singletonList(this.e.a(field));
        }
        String strValue = xy5Var.value();
        String[] strArrAlternate = xy5Var.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    public final boolean g(Field field, boolean z) {
        return (this.f.d(field.getType(), z) || this.f.g(field, z)) ? false : true;
    }
}
