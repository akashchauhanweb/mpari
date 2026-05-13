package com.zepto;

import com.zepto.r24;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class s24 {
    public boolean b;
    public boolean c;
    public String e;
    public boolean f;
    public boolean g;
    public final r24.a a = new r24.a();
    public int d = -1;

    public final void a(Function1 animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        op opVar = new op();
        animBuilder.invoke(opVar);
        this.a.b(opVar.a()).c(opVar.b()).e(opVar.c()).f(opVar.d());
    }

    public final r24 b() {
        r24.a aVar = this.a;
        aVar.d(this.b);
        aVar.j(this.c);
        String str = this.e;
        if (str != null) {
            aVar.h(str, this.f, this.g);
        } else {
            aVar.g(this.d, this.f, this.g);
        }
        return aVar.a();
    }

    public final void c(int i, Function1 popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        e(i);
        f(null);
        et4 et4Var = new et4();
        popUpToBuilder.invoke(et4Var);
        this.f = et4Var.a();
        this.g = et4Var.b();
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public final void e(int i) {
        this.d = i;
        this.f = false;
    }

    public final void f(String str) {
        if (str != null) {
            if (!(!StringsKt__StringsJVMKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.e = str;
            this.f = false;
        }
    }

    public final void g(boolean z) {
        this.c = z;
    }
}
