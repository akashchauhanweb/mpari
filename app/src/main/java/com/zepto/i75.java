package com.zepto;

import com.zepto.h75;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i75 {

    public static abstract class b {
        public static final b a;

        public class a extends b {
            public final /* synthetic */ Method b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.b = method;
            }

            @Override // com.zepto.i75.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* JADX INFO: renamed from: com.zepto.i75$b$b, reason: collision with other inner class name */
        public class C0093b extends b {
            public C0093b() {
                super();
            }

            @Override // com.zepto.i75.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (z33.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0093b();
            }
            a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.a.a(accessibleObject, obj);
    }

    public static h75.a b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return h75.a.ALLOW;
        }
        wb0.a(it.next());
        throw null;
    }
}
