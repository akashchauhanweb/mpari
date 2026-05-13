package com.zepto;

import ai.protectt.app.security.main.scan.ScanCore;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mo5 {
    public static final mo5 a = new mo5();
    public static final String b = "ScanVariables";
    public static boolean c = true;
    public static Integer d = 0;
    public static String e = "NOT_YET_START";
    public static final List f = new ArrayList();
    public static final List g = new ArrayList();
    public static final List h = new ArrayList();
    public static final HashMap i = new HashMap();
    public static final HashMap j = new HashMap();
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation continuation) {
            super(2, continuation);
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                s06.m.b(this.e);
                ScanCore.a.d0();
                jt.c.t0(true);
            } catch (Exception e) {
                nn3.a.f(mo5.a.j(), String.valueOf(e.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (jt.c.a0()) {
            return;
        }
        f80.d(qj2.c, null, null, new a(context, null), 3, null);
    }

    public final boolean b() {
        return c;
    }

    public final HashMap c() {
        return i;
    }

    public final HashMap d() {
        return j;
    }

    public final List e() {
        return f;
    }

    public final List f() {
        return h;
    }

    public final List g() {
        return g;
    }

    public final String h() {
        return e;
    }

    public final boolean i() {
        return m;
    }

    public final String j() {
        return b;
    }

    public final boolean k() {
        return n;
    }

    public final void l(boolean z) {
        l = z;
    }

    public final void m(boolean z) {
        k = z;
    }

    public final void n(boolean z) {
        c = z;
    }

    public final void o(boolean z) {
        n = z;
    }

    public final void p(Integer num) {
        d = num;
    }

    public final void q(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        e = str;
    }

    public final void r(boolean z) {
        m = z;
    }
}
