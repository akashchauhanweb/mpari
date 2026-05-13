package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lt0 {
    public final Object a;
    public final ta0 b;
    public final Function1 c;
    public final Object d;
    public final Throwable e;

    public lt0(Object obj, ta0 ta0Var, Function1 function1, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ta0Var;
        this.c = function1;
        this.d = obj2;
        this.e = th;
    }

    public static /* synthetic */ lt0 b(lt0 lt0Var, Object obj, ta0 ta0Var, Function1 function1, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = lt0Var.a;
        }
        if ((i & 2) != 0) {
            ta0Var = lt0Var.b;
        }
        ta0 ta0Var2 = ta0Var;
        if ((i & 4) != 0) {
            function1 = lt0Var.c;
        }
        Function1 function12 = function1;
        if ((i & 8) != 0) {
            obj2 = lt0Var.d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = lt0Var.e;
        }
        return lt0Var.a(obj, ta0Var2, function12, obj4, th);
    }

    public final lt0 a(Object obj, ta0 ta0Var, Function1 function1, Object obj2, Throwable th) {
        return new lt0(obj, ta0Var, function1, obj2, th);
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d(za0 za0Var, Throwable th) {
        ta0 ta0Var = this.b;
        if (ta0Var != null) {
            za0Var.k(ta0Var, th);
        }
        Function1 function1 = this.c;
        if (function1 != null) {
            za0Var.l(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt0)) {
            return false;
        }
        lt0 lt0Var = (lt0) obj;
        return Intrinsics.areEqual(this.a, lt0Var.a) && Intrinsics.areEqual(this.b, lt0Var.b) && Intrinsics.areEqual(this.c, lt0Var.c) && Intrinsics.areEqual(this.d, lt0Var.d) && Intrinsics.areEqual(this.e, lt0Var.e);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ta0 ta0Var = this.b;
        int iHashCode2 = (iHashCode + (ta0Var == null ? 0 : ta0Var.hashCode())) * 31;
        Function1 function1 = this.c;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ lt0(Object obj, ta0 ta0Var, Function1 function1, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : ta0Var, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
