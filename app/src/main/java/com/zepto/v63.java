package com.zepto;

import com.zepto.f63;
import com.zepto.hg6;
import com.zepto.r63;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class v63 {
    public final Class a;
    public final Map b;
    public final Class c;

    public static abstract class a {
        public final Class a;

        /* JADX INFO: renamed from: com.zepto.v63$a$a, reason: collision with other inner class name */
        public static final class C0125a {
            public Object a;
            public r63.b b;

            public C0125a(Object obj, r63.b bVar) {
                this.a = obj;
                this.b = bVar;
            }
        }

        public a(Class cls) {
            this.a = cls;
        }

        public abstract at3 a(at3 at3Var);

        public final Class b() {
            return this.a;
        }

        public Map c() {
            return Collections.emptyMap();
        }

        public abstract at3 d(s80 s80Var);

        public abstract void e(at3 at3Var);
    }

    public v63(Class cls, yu4... yu4VarArr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (yu4 yu4Var : yu4VarArr) {
            if (map.containsKey(yu4Var.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + yu4Var.b().getCanonicalName());
            }
            map.put(yu4Var.b(), yu4Var);
        }
        if (yu4VarArr.length > 0) {
            this.c = yu4VarArr[0].b();
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(map);
    }

    public hg6.b a() {
        return hg6.b.c;
    }

    public final Class b() {
        return this.c;
    }

    public final Class c() {
        return this.a;
    }

    public abstract String d();

    public final Object e(at3 at3Var, Class cls) {
        yu4 yu4Var = (yu4) this.b.get(cls);
        if (yu4Var != null) {
            return yu4Var.a(at3Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a f();

    public abstract f63.c g();

    public abstract at3 h(s80 s80Var);

    public final Set i() {
        return this.b.keySet();
    }

    public abstract void j(at3 at3Var);
}
