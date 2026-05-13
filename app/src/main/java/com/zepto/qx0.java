package com.zepto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qx0 {
    public final Map a;
    public final boolean b;
    public final List c;

    public class a implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new TreeSet();
        }
    }

    public class b implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new LinkedHashSet();
        }
    }

    public class c implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new ArrayDeque();
        }
    }

    public class d implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new ArrayList();
        }
    }

    public class e implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    public class f implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    public class g implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new TreeMap();
        }
    }

    public class h implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new LinkedHashMap();
        }
    }

    public class i implements se4 {
        @Override // com.zepto.se4
        public Object a() {
            return new pf3();
        }
    }

    public class j implements se4 {
        public final /* synthetic */ Class a;

        public j(Class cls) {
            this.a = cls;
        }

        @Override // com.zepto.se4
        public Object a() {
            try {
                return eq6.a.d(this.a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    public class k implements se4 {
        public final /* synthetic */ String a;

        public k(String str) {
            this.a = str;
        }

        @Override // com.zepto.se4
        public Object a() {
            throw new h53(this.a);
        }
    }

    public class l implements se4 {
        public final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        @Override // com.zepto.se4
        public Object a() {
            throw new h53(this.a);
        }
    }

    public class m implements se4 {
        public final /* synthetic */ String a;

        public m(String str) {
            this.a = str;
        }

        @Override // com.zepto.se4
        public Object a() {
            throw new h53(this.a);
        }
    }

    public class n implements se4 {
        public final /* synthetic */ Type a;

        public n(Type type) {
            this.a = type;
        }

        @Override // com.zepto.se4
        public Object a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new h53("Invalid EnumSet type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new h53("Invalid EnumSet type: " + this.a.toString());
        }
    }

    public class o implements se4 {
        public final /* synthetic */ Type a;

        public o(Type type) {
            this.a = type;
        }

        @Override // com.zepto.se4
        public Object a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new h53("Invalid EnumMap type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new h53("Invalid EnumMap type: " + this.a.toString());
        }
    }

    public class p implements se4 {
        public final /* synthetic */ String a;

        public p(String str) {
            this.a = str;
        }

        @Override // com.zepto.se4
        public Object a() {
            throw new h53(this.a);
        }
    }

    public class q implements se4 {
        public final /* synthetic */ String a;

        public q(String str) {
            this.a = str;
        }

        @Override // com.zepto.se4
        public Object a() {
            throw new h53(this.a);
        }
    }

    public class r implements se4 {
        public final /* synthetic */ Constructor a;

        public r(Constructor constructor) {
            this.a = constructor;
        }

        @Override // com.zepto.se4
        public Object a() {
            try {
                return this.a.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw l75.e(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + l75.c(this.a) + "' with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + l75.c(this.a) + "' with no args", e3.getCause());
            }
        }
    }

    public qx0(Map map, boolean z, List list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    public static se4 c(Class cls, g75 g75Var) {
        String strM;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            g75 g75Var2 = g75.ALLOW;
            if (g75Var == g75Var2 || (j75.a(declaredConstructor, null) && (g75Var != g75.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (g75Var != g75Var2 || (strM = l75.m(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(strM);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static se4 d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(uo6.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new i() : new h();
        }
        return null;
    }

    public static se4 e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    public se4 b(uo6 uo6Var) {
        Type typeD = uo6Var.d();
        Class clsC = uo6Var.c();
        wb0.a(this.a.get(typeD));
        wb0.a(this.a.get(clsC));
        se4 se4VarE = e(typeD, clsC);
        if (se4VarE != null) {
            return se4VarE;
        }
        g75 g75VarB = j75.b(this.c, clsC);
        se4 se4VarC = c(clsC, g75VarB);
        if (se4VarC != null) {
            return se4VarC;
        }
        se4 se4VarD = d(typeD, clsC);
        if (se4VarD != null) {
            return se4VarD;
        }
        String strA = a(clsC);
        if (strA != null) {
            return new l(strA);
        }
        if (g75VarB == g75.ALLOW) {
            return f(clsC);
        }
        return new m("Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public final se4 f(Class cls) {
        if (this.b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.a.toString();
    }
}
