package com.zepto;

import android.os.Bundle;
import com.zepto.cm5;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class zl5 implements cm5.c {
    public final cm5 a;
    public boolean b;
    public Bundle c;
    public final Lazy d;

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ dr7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dr7 dr7Var) {
            super(0);
            this.c = dr7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final am5 invoke() {
            return androidx.lifecycle.v.e(this.c);
        }
    }

    public zl5(cm5 savedStateRegistry, dr7 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.a = savedStateRegistry;
        this.d = LazyKt__LazyJVMKt.lazy(new a(viewModelStoreOwner));
    }

    @Override // com.zepto.cm5.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().g().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((androidx.lifecycle.s) entry.getValue()).c().a();
            if (!Intrinsics.areEqual(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d();
        Bundle bundle = this.c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final am5 c() {
        return (am5) this.d.getValue();
    }

    public final void d() {
        if (this.b) {
            return;
        }
        Bundle bundleB = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.c = bundle;
        this.b = true;
        c();
    }
}
