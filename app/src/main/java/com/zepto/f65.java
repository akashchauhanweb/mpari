package com.zepto;

import android.os.Bundle;
import androidx.lifecycle.h;
import com.zepto.cm5;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f65 implements androidx.lifecycle.k {
    public static final a e = new a(null);
    public final em5 c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements cm5.c {
        public final Set a;

        public b(cm5 registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // com.zepto.cm5.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }

        public final void b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.a.add(className);
        }
    }

    public f65(em5 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.c = owner;
    }

    public final void c(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, f65.class.getClassLoader()).asSubclass(cm5.a.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((cm5.a) objNewInstance).a(this.c);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to instantiate " + str, e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Class " + str + " wasn't found", e4);
        }
    }

    @Override // androidx.lifecycle.k
    public void e(df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.g0().d(this);
        Bundle bundleB = this.c.o().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
