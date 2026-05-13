package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nn3 {
    public static final nn3 a = new nn3();
    public static final String b = "LogUtil";

    public static final class a extends SuspendLambda implements Function2 {
        public int c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (!NativeInteractor.a.N()) {
                    System.loadLibrary("protectt-native-lib");
                }
            } catch (UnsatisfiedLinkError unused) {
                nn3.a.h(jt.c.C());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ Activity f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = activity;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
            } catch (Exception e) {
                nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> isDebugger: Error: ", e), e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oj1 oj1Var = oj1.a;
                if (oj1Var.f() == null) {
                    oj1Var.j(this.e);
                }
                this.c = 1;
                if (bh1.a(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    mx2.a.c(NativeInteractor.a.n1(), new Object[]{this.f, ScanCore.a.T("ZS0wMDY=")}, this.f);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            gw4 gw4Var = gw4.a;
            Object objE = mx2.a.e(NativeInteractor.a.l1(), new Object[]{this.f, Boxing.boxBoolean(true), gw4Var.a()});
            nn3 nn3Var = nn3.a;
            nn3Var.f(nn3Var.e(), Intrinsics.stringPlus("Dex Total Res:-", objE));
            if (Intrinsics.areEqual(String.valueOf(objE), ScanCore.a.T("U0FGRQ=="))) {
                nn3Var.f(nn3Var.e(), Intrinsics.stringPlus("Dex Res:-", objE));
            } else {
                ScanUtils.a.Z0(String.valueOf(objE));
                if (gw4Var.b()) {
                    this.c = 2;
                    if (bh1.a(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mx2.a.c(NativeInteractor.a.n1(), new Object[]{this.f, ScanCore.a.T("ZS0wMDY=")}, this.f);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        f80.d(qj2.c, null, null, new a(null), 3, null);
    }

    public static /* synthetic */ void c(nn3 nn3Var, String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        nn3Var.b(str, str2, exc);
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (ScanUtils.a.m0(context)) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager!!…      0\n                )");
            int size = installedPackages.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                PackageInfo packageInfo = installedPackages.get(i);
                String[] strArrD = NativeInteractor.a.d();
                int length = strArrD.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = strArrD[i3];
                    i3++;
                    if (Intrinsics.areEqual(str, packageInfo.packageName)) {
                        return true;
                    }
                }
                i = i2;
            }
        } catch (Exception e) {
            c(this, b, e.toString(), null, 4, null);
        }
        return false;
    }

    public final void b(String Tag, String e, Exception exc) {
        Intrinsics.checkNotNullParameter(Tag, "Tag");
        Intrinsics.checkNotNullParameter(e, "e");
        if (Intrinsics.areEqual("release", "release")) {
            return;
        }
        if (exc != null) {
            Log.e(Tag, e, exc);
        } else {
            Log.e(Tag, e);
        }
    }

    public final void d(String Tag, Exception e) {
        Intrinsics.checkNotNullParameter(Tag, "Tag");
        Intrinsics.checkNotNullParameter(e, "e");
        if (Intrinsics.areEqual("release", "release")) {
            return;
        }
        Log.e(Tag, e.toString());
    }

    public final String e() {
        return b;
    }

    public final void f(String Tag, String message) {
        Intrinsics.checkNotNullParameter(Tag, "Tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.areEqual("release", "release")) {
            return;
        }
        Log.i(Tag, message);
    }

    public final void g(Activity activity, Context context) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(qj2.c, null, null, new b(context, activity, null), 3, null);
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.e("protected", "SO");
        k16.a.a(context);
    }

    public final void i(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Log.e("Exception", exception.toString(), exception);
    }

    public final boolean j() {
        return ScanCore.a.m1();
    }
}
