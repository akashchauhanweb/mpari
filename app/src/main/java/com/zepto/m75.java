package com.zepto;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m75 implements oo6 {
    public final qx0 c;
    public final jb2 e;
    public final u52 f;
    public final w43 g;
    public final List h;

    public class a extends c {
        public final /* synthetic */ boolean f;
        public final /* synthetic */ Method g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ mo6 i;
        public final /* synthetic */ pk2 j;
        public final /* synthetic */ uo6 k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ boolean m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, mo6 mo6Var, pk2 pk2Var, uo6 uo6Var, boolean z5, boolean z6) {
            super(str, field, z, z2);
            this.f = z3;
            this.g = method;
            this.h = z4;
            this.i = mo6Var;
            this.j = pk2Var;
            this.k = uo6Var;
            this.l = z5;
            this.m = z6;
        }

        @Override // com.zepto.m75.c
        public void a(a63 a63Var, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.d) {
                if (this.f) {
                    Method method = this.g;
                    if (method == null) {
                        m75.c(obj, this.b);
                    } else {
                        m75.c(obj, method);
                    }
                }
                Method method2 = this.g;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, new Object[0]);
                    } catch (InvocationTargetException e) {
                        throw new h53("Accessor " + l75.g(this.g, false) + " threw exception", e.getCause());
                    }
                } else {
                    objInvoke = this.b.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                a63Var.e0(this.a);
                (this.h ? this.i : new qo6(this.j, this.i, this.k.d())).c(a63Var, objInvoke);
            }
        }
    }

    public static abstract class b extends mo6 {
        public final Map a;

        public b(Map map) {
            this.a = map;
        }

        @Override // com.zepto.mo6
        public void c(a63 a63Var, Object obj) throws IOException {
            if (obj == null) {
                a63Var.m0();
                return;
            }
            a63Var.m();
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(a63Var, obj);
                }
                a63Var.B();
            } catch (IllegalAccessException e) {
                throw l75.e(e);
            }
        }
    }

    public static abstract class c {
        public final String a;
        public final Field b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public c(String str, Field field, boolean z, boolean z2) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
            this.d = z;
            this.e = z2;
        }

        public abstract void a(a63 a63Var, Object obj);
    }

    public static final class d extends b {
        public final se4 b;

        public d(se4 se4Var, Map map) {
            super(map);
            this.b = se4Var;
        }
    }

    public static final class e extends b {
        public static final Map e = d();
        public final Constructor b;
        public final Object[] c;
        public final Map d;

        public e(Class cls, Map map, boolean z) {
            super(map);
            this.d = new HashMap();
            Constructor constructorI = l75.i(cls);
            this.b = constructorI;
            if (z) {
                m75.c(null, constructorI);
            } else {
                l75.l(constructorI);
            }
            String[] strArrJ = l75.j(cls);
            for (int i = 0; i < strArrJ.length; i++) {
                this.d.put(strArrJ[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        public static Map d() {
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
    }

    public m75(qx0 qx0Var, jb2 jb2Var, u52 u52Var, w43 w43Var, List list) {
        this.c = qx0Var;
        this.e = jb2Var;
        this.f = u52Var;
        this.g = w43Var;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (j75.a(accessibleObject, obj)) {
            return;
        }
        throw new h53(l75.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    @Override // com.zepto.oo6
    public mo6 a(pk2 pk2Var, uo6 uo6Var) {
        Class clsC = uo6Var.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        g75 g75VarB = j75.b(this.h, clsC);
        if (g75VarB != g75.BLOCK_ALL) {
            boolean z = g75VarB == g75.BLOCK_INACCESSIBLE;
            return l75.k(clsC) ? new e(clsC, e(pk2Var, uo6Var, clsC, z, true), z) : new d(this.c.b(uo6Var), e(pk2Var, uo6Var, clsC, z, false));
        }
        throw new h53("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final c d(pk2 pk2Var, Field field, Method method, String str, uo6 uo6Var, boolean z, boolean z2, boolean z3) {
        boolean zA = fv4.a(uo6Var.c());
        int modifiers = field.getModifiers();
        boolean z4 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        u43 u43Var = (u43) field.getAnnotation(u43.class);
        mo6 mo6VarB = u43Var != null ? this.g.b(this.c, pk2Var, uo6Var, u43Var) : null;
        boolean z5 = mo6VarB != null;
        if (mo6VarB == null) {
            mo6VarB = pk2Var.f(uo6Var);
        }
        return new a(str, field, z, z2, z3, method, z5, mo6VarB, pk2Var, uo6Var, zA, z4);
    }

    public final Map e(pk2 pk2Var, uo6 uo6Var, Class cls, boolean z, boolean z2) {
        boolean z3;
        Method method;
        int i;
        int i2;
        boolean z4;
        m75 m75Var = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        uo6 uo6VarB = uo6Var;
        boolean z5 = z;
        Class clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (clsC != cls && declaredFields.length > 0) {
                g75 g75VarB = j75.b(m75Var.h, clsC);
                if (g75VarB == g75.BLOCK_ALL) {
                    throw new h53("ReflectionAccessFilter does not permit using reflection for " + clsC + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z5 = g75VarB == g75.BLOCK_INACCESSIBLE;
            }
            boolean z8 = z5;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                boolean zG = m75Var.g(field, z6);
                boolean zG2 = m75Var.g(field, z7);
                if (zG || zG2) {
                    c cVar = null;
                    if (!z2) {
                        z3 = zG2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z3 = z7;
                    } else {
                        Method methodH = l75.h(clsC, field);
                        if (!z8) {
                            l75.l(methodH);
                        }
                        if (methodH.getAnnotation(wy5.class) != null && field.getAnnotation(wy5.class) == null) {
                            throw new h53("@SerializedName on " + l75.g(methodH, z7) + " is not supported");
                        }
                        z3 = zG2;
                        method = methodH;
                    }
                    if (!z8 && method == null) {
                        l75.l(field);
                    }
                    Type typeO = com.zepto.d.o(uo6VarB.d(), clsC, field.getGenericType());
                    List listF = m75Var.f(field);
                    int size = listF.size();
                    int i4 = z7;
                    while (i4 < size) {
                        String str = (String) listF.get(i4);
                        boolean z9 = i4 != 0 ? z7 : zG;
                        int i5 = i4;
                        c cVar2 = cVar;
                        int i6 = size;
                        List list = listF;
                        Field field2 = field;
                        int i7 = i3;
                        int i8 = length;
                        boolean z10 = z7;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, d(pk2Var, field, method, str, uo6.b(typeO), z9, z3, z8)) : cVar2;
                        i4 = i5 + 1;
                        zG = z9;
                        i3 = i7;
                        size = i6;
                        listF = list;
                        field = field2;
                        length = i8;
                        z7 = z10;
                    }
                    c cVar3 = cVar;
                    Field field3 = field;
                    i = i3;
                    i2 = length;
                    z4 = z7;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cVar3.a + "'; conflict is caused by fields " + l75.f(cVar3.b) + " and " + l75.f(field3));
                    }
                } else {
                    i = i3;
                    i2 = length;
                    z4 = z7;
                }
                i3 = i + 1;
                z6 = true;
                m75Var = this;
                length = i2;
                z7 = z4;
            }
            uo6VarB = uo6.b(com.zepto.d.o(uo6VarB.d(), clsC, clsC.getGenericSuperclass()));
            clsC = uo6VarB.c();
            m75Var = this;
            z5 = z8;
        }
        return linkedHashMap;
    }

    public final List f(Field field) {
        wy5 wy5Var = (wy5) field.getAnnotation(wy5.class);
        if (wy5Var == null) {
            return Collections.singletonList(this.e.a(field));
        }
        String strValue = wy5Var.value();
        String[] strArrAlternate = wy5Var.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    public final boolean g(Field field, boolean z) {
        return (this.f.c(field.getType(), z) || this.f.f(field, z)) ? false : true;
    }
}
