package androidx.lifecycle;

import android.app.Application;
import com.zepto.br7;
import com.zepto.cr7;
import com.zepto.dr7;
import com.zepto.h31;
import com.zepto.np;
import com.zepto.ny3;
import com.zepto.zq7;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class z {
    public final cr7 a;
    public final b b;
    public final h31 c;

    public static class a extends c {
        public static a g;
        public final Application e;
        public static final C0016a f = new C0016a(null);
        public static final h31.b h = C0016a.C0017a.a;

        /* JADX INFO: renamed from: androidx.lifecycle.z$a$a, reason: collision with other inner class name */
        public static final class C0016a {

            /* JADX INFO: renamed from: androidx.lifecycle.z$a$a$a, reason: collision with other inner class name */
            public static final class C0017a implements h31.b {
                public static final C0017a a = new C0017a();
            }

            public C0016a() {
            }

            public /* synthetic */ C0016a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(dr7 owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                return owner instanceof f ? ((f) owner).K() : c.b.a();
            }

            public final a b(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.g == null) {
                    a.g = new a(application);
                }
                a aVar = a.g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }
        }

        public a(Application application, int i) {
            this.e = application;
        }

        @Override // androidx.lifecycle.z.c, androidx.lifecycle.z.b
        public zq7 a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.e;
            if (application != null) {
                return g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.z.b
        public zq7 b(Class modelClass, h31 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(h);
            if (application != null) {
                return g(modelClass, application);
            }
            if (np.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public final zq7 g(Class cls, Application application) {
            if (!np.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                zq7 zq7Var = (zq7) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(zq7Var, "{\n                try {\n…          }\n            }");
                return zq7Var;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    public interface b {
        public static final a a = a.a;

        public static final class a {
            public static final /* synthetic */ a a = new a();
        }

        default zq7 a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default zq7 b(Class modelClass, h31 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    public static class c implements b {
        public static c c;
        public static final a b = new a(null);
        public static final h31.b d = a.C0018a.a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.z$c$a$a, reason: collision with other inner class name */
            public static final class C0018a implements h31.b {
                public static final C0018a a = new C0018a();
            }

            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.c == null) {
                    c.c = new c();
                }
                c cVar = c.c;
                Intrinsics.checkNotNull(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.z.b
        public zq7 a(Class modelClass) throws InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                Object objNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (zq7) objNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }
    }

    public static class d {
        public abstract void c(zq7 zq7Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(cr7 store, b factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public zq7 b(String key, Class modelClass) {
        zq7 zq7VarA;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        zq7 zq7VarB = this.a.b(key);
        if (!modelClass.isInstance(zq7VarB)) {
            ny3 ny3Var = new ny3(this.c);
            ny3Var.c(c.d, key);
            try {
                zq7VarA = this.b.b(modelClass, ny3Var);
            } catch (AbstractMethodError unused) {
                zq7VarA = this.b.a(modelClass);
            }
            this.a.d(key, zq7VarA);
            return zq7VarA;
        }
        Object obj = this.b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            Intrinsics.checkNotNull(zq7VarB);
            dVar.c(zq7VarB);
        }
        Intrinsics.checkNotNull(zq7VarB, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return zq7VarB;
    }

    public z(cr7 store, b factory, h31 defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.a = store;
        this.b = factory;
        this.c = defaultCreationExtras;
    }

    public /* synthetic */ z(cr7 cr7Var, b bVar, h31 h31Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cr7Var, bVar, (i & 4) != 0 ? h31.a.b : h31Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(dr7 owner) {
        this(owner.b0(), a.f.a(owner), br7.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(dr7 owner, b factory) {
        this(owner.b0(), factory, br7.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
