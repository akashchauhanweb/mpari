package com.zepto;

import android.os.Bundle;
import androidx.lifecycle.h;
import com.zepto.f65;
import com.zepto.hi5;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cm5 {
    public static final b g = new b(null);
    public boolean b;
    public Bundle c;
    public boolean d;
    public f65.b e;
    public final hi5 a = new hi5();
    public boolean f = true;

    public interface a {
        void a(em5 em5Var);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface c {
        Bundle a();
    }

    public static final void d(cm5 this$0, df3 df3Var, h.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(df3Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == h.a.ON_START) {
            this$0.f = true;
        } else if (event == h.a.ON_STOP) {
            this$0.f = false;
        }
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (Map.Entry components : this.a) {
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (Intrinsics.areEqual(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.h lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!this.b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new androidx.lifecycle.k() { // from class: com.zepto.bm5
            @Override // androidx.lifecycle.k
            public final void e(df3 df3Var, h.a aVar) {
                cm5.d(this.c, df3Var, aVar);
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.d = true;
    }

    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        hi5.d dVarN = this.a.n();
        Intrinsics.checkNotNullExpressionValue(dVarN, "this.components.iteratorWithAdditions()");
        while (dVarN.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarN.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.a.w(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        f65.b bVar = this.e;
        if (bVar == null) {
            bVar = new f65.b(this);
        }
        this.e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            f65.b bVar2 = this.e;
            if (bVar2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
