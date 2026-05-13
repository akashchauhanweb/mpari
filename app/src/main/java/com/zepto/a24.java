package com.zepto;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.z;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class a24 implements df3, dr7, androidx.lifecycle.f, em5 {
    public static final a o = new a(null);
    public final Context a;
    public j24 b;
    public final Bundle c;
    public h.b d;
    public final w24 e;
    public final String f;
    public final Bundle g;
    public androidx.lifecycle.m h;
    public final dm5 i;
    public boolean j;
    public final Lazy k;
    public final Lazy l;
    public h.b m;
    public final z.b n;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a24 b(a aVar, Context context, j24 j24Var, Bundle bundle, h.b bVar, w24 w24Var, String str, Bundle bundle2, int i, Object obj) {
            String str2;
            Bundle bundle3 = (i & 4) != 0 ? null : bundle;
            h.b bVar2 = (i & 8) != 0 ? h.b.CREATED : bVar;
            w24 w24Var2 = (i & 16) != 0 ? null : w24Var;
            if ((i & 32) != 0) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return aVar.a(context, j24Var, bundle3, bVar2, w24Var2, str2, (i & 64) != 0 ? null : bundle2);
        }

        public final a24 a(Context context, j24 destination, Bundle bundle, h.b hostLifecycleState, w24 w24Var, String id, Bundle bundle2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id, "id");
            return new a24(context, destination, bundle, hostLifecycleState, w24Var, id, bundle2, null);
        }
    }

    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(em5 owner) {
            super(owner, null);
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.a
        public zq7 e(String key, Class modelClass, androidx.lifecycle.s handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new c(handle);
        }
    }

    public static final class c extends zq7 {
        public final androidx.lifecycle.s d;

        public c(androidx.lifecycle.s handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.d = handle;
        }

        public final androidx.lifecycle.s g() {
            return this.d;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.w invoke() {
            Context context = a24.this.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            a24 a24Var = a24.this;
            return new androidx.lifecycle.w(application, a24Var, a24Var.c());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s invoke() {
            if (!a24.this.j) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            }
            if (a24.this.g0().b() != h.b.DESTROYED) {
                return ((c) new androidx.lifecycle.z(a24.this, new b(a24.this)).a(c.class)).g();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
    }

    public /* synthetic */ a24(Context context, j24 j24Var, Bundle bundle, h.b bVar, w24 w24Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, j24Var, bundle, bVar, w24Var, str, bundle2);
    }

    @Override // androidx.lifecycle.f
    public z.b K() {
        return this.n;
    }

    @Override // androidx.lifecycle.f
    public h31 L() {
        ny3 ny3Var = new ny3(null, 1, null);
        Context context = this.a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            ny3Var.c(z.a.h, application);
        }
        ny3Var.c(androidx.lifecycle.v.a, this);
        ny3Var.c(androidx.lifecycle.v.b, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            ny3Var.c(androidx.lifecycle.v.c, bundleC);
        }
        return ny3Var;
    }

    @Override // com.zepto.dr7
    public cr7 b0() {
        if (!this.j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (g0().b() == h.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        w24 w24Var = this.e;
        if (w24Var != null) {
            return w24Var.a(this.f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    public final Bundle c() {
        if (this.c == null) {
            return null;
        }
        return new Bundle(this.c);
    }

    public final androidx.lifecycle.w d() {
        return (androidx.lifecycle.w) this.k.getValue();
    }

    public final j24 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof a24)) {
            return false;
        }
        a24 a24Var = (a24) obj;
        if (!Intrinsics.areEqual(this.f, a24Var.f) || !Intrinsics.areEqual(this.b, a24Var.b) || !Intrinsics.areEqual(g0(), a24Var.g0()) || !Intrinsics.areEqual(o(), a24Var.o())) {
            return false;
        }
        if (!Intrinsics.areEqual(this.c, a24Var.c)) {
            Bundle bundle = this.c;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            if (!setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    Object obj2 = this.c.get(str);
                    Bundle bundle2 = a24Var.c;
                    if (!Intrinsics.areEqual(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final String f() {
        return this.f;
    }

    public final h.b g() {
        return this.m;
    }

    @Override // com.zepto.df3
    public androidx.lifecycle.h g0() {
        return this.h;
    }

    public final void h(h.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.d = event.b();
        l();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f.hashCode() * 31) + this.b.hashCode();
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = this.c.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + g0().hashCode()) * 31) + o().hashCode();
    }

    public final void i(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.i.e(outBundle);
    }

    public final void j(j24 j24Var) {
        Intrinsics.checkNotNullParameter(j24Var, "<set-?>");
        this.b = j24Var;
    }

    public final void k(h.b maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.m = maxState;
        l();
    }

    public final void l() {
        if (!this.j) {
            this.i.c();
            this.j = true;
            if (this.e != null) {
                androidx.lifecycle.v.c(this);
            }
            this.i.d(this.g);
        }
        if (this.d.ordinal() < this.m.ordinal()) {
            this.h.o(this.d);
        } else {
            this.h.o(this.m);
        }
    }

    @Override // com.zepto.em5
    public cm5 o() {
        return this.i.b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a24.class.getSimpleName());
        sb.append('(' + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public a24(Context context, j24 j24Var, Bundle bundle, h.b bVar, w24 w24Var, String str, Bundle bundle2) {
        this.a = context;
        this.b = j24Var;
        this.c = bundle;
        this.d = bVar;
        this.e = w24Var;
        this.f = str;
        this.g = bundle2;
        this.h = new androidx.lifecycle.m(this);
        this.i = dm5.d.a(this);
        this.k = LazyKt__LazyJVMKt.lazy(new d());
        this.l = LazyKt__LazyJVMKt.lazy(new e());
        this.m = h.b.INITIALIZED;
        this.n = d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a24(a24 entry, Bundle bundle) {
        this(entry.a, entry.b, bundle, entry.d, entry.e, entry.f, entry.g);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.d = entry.d;
        k(entry.m);
    }
}
