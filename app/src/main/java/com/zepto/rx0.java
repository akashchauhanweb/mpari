package com.zepto;

import com.google.gson.reflect.TypeToken;
import com.zepto.h75;
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

/* JADX INFO: loaded from: classes.dex */
public final class rx0 {
    public final Map a;
    public final boolean b;
    public final List c;

    public class a implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new TreeSet();
        }
    }

    public class b implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new LinkedHashSet();
        }
    }

    public class c implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new ArrayDeque();
        }
    }

    public class d implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new ArrayList();
        }
    }

    public class e implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    public class f implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    public class g implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new TreeMap();
        }
    }

    public class h implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new LinkedHashMap();
        }
    }

    public class i implements te4 {
        @Override // com.zepto.te4
        public Object a() {
            return new of3();
        }
    }

    public class j implements te4 {
        public final /* synthetic */ Class a;

        public j(Class cls) {
            this.a = cls;
        }

        @Override // com.zepto.te4
        public Object a() {
            try {
                return fq6.a.d(this.a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    public class k implements te4 {
        public final /* synthetic */ String a;

        public k(String str) {
            this.a = str;
        }

        @Override // com.zepto.te4
        public Object a() {
            throw new i53(this.a);
        }
    }

    public class l implements te4 {
        public final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        @Override // com.zepto.te4
        public Object a() {
            throw new i53(this.a);
        }
    }

    public class m implements te4 {
        public final /* synthetic */ String a;

        public m(String str) {
            this.a = str;
        }

        @Override // com.zepto.te4
        public Object a() {
            throw new i53(this.a);
        }
    }

    public class n implements te4 {
        public final /* synthetic */ Type a;

        public n(Type type) {
            this.a = type;
        }

        @Override // com.zepto.te4
        public Object a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new i53("Invalid EnumSet type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new i53("Invalid EnumSet type: " + this.a.toString());
        }
    }

    public class o implements te4 {
        public final /* synthetic */ Type a;

        public o(Type type) {
            this.a = type;
        }

        @Override // com.zepto.te4
        public Object a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new i53("Invalid EnumMap type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new i53("Invalid EnumMap type: " + this.a.toString());
        }
    }

    public class p implements te4 {
        public final /* synthetic */ String a;

        public p(String str) {
            this.a = str;
        }

        @Override // com.zepto.te4
        public Object a() {
            throw new i53(this.a);
        }
    }

    public class q implements te4 {
        public final /* synthetic */ String a;

        public q(String str) {
            this.a = str;
        }

        @Override // com.zepto.te4
        public Object a() {
            throw new i53(this.a);
        }
    }

    public class r implements te4 {
        public final /* synthetic */ Constructor a;

        public r(Constructor constructor) {
            this.a = constructor;
        }

        @Override // com.zepto.te4
        public Object a() {
            try {
                return this.a.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw k75.e(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + k75.c(this.a) + "' with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + k75.c(this.a) + "' with no args", e3.getCause());
            }
        }
    }

    public rx0(Map map, boolean z, List list) {
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

    public static te4 c(Class cls, h75.a aVar) {
        String strL;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            h75.a aVar2 = h75.a.ALLOW;
            if (aVar == aVar2 || (i75.a(declaredConstructor, null) && (aVar != h75.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strL = k75.l(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(strL);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static te4 d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i() : new h();
        }
        return null;
    }

    public static te4 e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    public te4 b(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        wb0.a(this.a.get(type));
        wb0.a(this.a.get(rawType));
        te4 te4VarE = e(type, rawType);
        if (te4VarE != null) {
            return te4VarE;
        }
        h75.a aVarB = i75.b(this.c, rawType);
        te4 te4VarC = c(rawType, aVarB);
        if (te4VarC != null) {
            return te4VarC;
        }
        te4 te4VarD = d(type, rawType);
        if (te4VarD != null) {
            return te4VarD;
        }
        String strA = a(rawType);
        if (strA != null) {
            return new l(strA);
        }
        if (aVarB == h75.a.ALLOW) {
            return f(rawType);
        }
        return new m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public final te4 f(Class cls) {
        if (this.b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.a.toString();
    }
}
