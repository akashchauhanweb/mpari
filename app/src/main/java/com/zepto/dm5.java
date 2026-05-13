package com.zepto;

import android.os.Bundle;
import androidx.lifecycle.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dm5 {
    public static final a d = new a(null);
    public final em5 a;
    public final cm5 b;
    public boolean c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dm5 a(em5 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new dm5(owner, null);
        }
    }

    public /* synthetic */ dm5(em5 em5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(em5Var);
    }

    public static final dm5 a(em5 em5Var) {
        return d.a(em5Var);
    }

    public final cm5 b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.h hVarG0 = this.a.g0();
        if (hVarG0.b() != h.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        hVarG0.a(new f65(this.a));
        this.b.e(hVarG0);
        this.c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        androidx.lifecycle.h hVarG0 = this.a.g0();
        if (!hVarG0.b().b(h.b.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + hVarG0.b()).toString());
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.b.g(outBundle);
    }

    public dm5(em5 em5Var) {
        this.a = em5Var;
        this.b = new cm5();
    }
}
