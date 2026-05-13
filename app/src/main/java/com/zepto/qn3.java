package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.zepto.jt;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qn3 {
    public static final qn3 a = new qn3();
    public static String b = "Logger";
    public static String c = "";

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

    static {
        f80.d(qj2.c, null, null, new a(null), 3, null);
    }

    public static final void e(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(67108864);
        jt.a aVar = jt.c;
        Activity activityR = aVar.r();
        if (activityR != null) {
            activityR.startActivity(intent);
        }
        Iterator it = aVar.d().iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
        Activity activityR2 = jt.c.r();
        if (activityR2 != null) {
            activityR2.finish();
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final void b() {
        if (mo5.a.b()) {
            Log.e("protected", "HO");
            k16.a.a(jt.c.C());
        }
    }

    public final void c(Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            oj1 oj1Var = oj1.a;
            if (oj1Var.f() == null) {
                oj1Var.j(context);
            }
            StringBuilder sb = new StringBuilder();
            String strH = jt.c.h();
            Intrinsics.checkNotNull(strH);
            sb.append(strH);
            sb.append("||");
            sb.append(gw4.a.a());
            Object objE = mx2.a.e(NativeInteractor.a.o1(), new Object[]{activity, Boolean.TRUE, sb.toString()});
            nn3 nn3Var = nn3.a;
            nn3Var.f(b, Intrinsics.stringPlus("Dex Anti Total Res:-", objE));
            if (Intrinsics.areEqual(String.valueOf(objE), ScanCore.a.T("U0FGRQ=="))) {
                nn3Var.f(b, Intrinsics.stringPlus("Dex Anti  Res:-", objE));
            } else {
                ScanUtils.a.Z0(String.valueOf(objE));
            }
        } catch (Exception e) {
            nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> appDebugging: Error: ", e), e);
        }
    }

    public final void d(String dialogTitle, String dialogMessage) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogMessage, "dialogMessage");
        jt.a aVar = jt.c;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(aVar.r()).create();
        alertDialogCreate.setTitle(dialogTitle);
        alertDialogCreate.setMessage(dialogMessage);
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.setButton(-1, NativeInteractor.a.L0(), new DialogInterface.OnClickListener() { // from class: com.zepto.pn3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qn3.e(dialogInterface, i);
            }
        });
        Activity activityR = aVar.r();
        Intrinsics.checkNotNull(activityR);
        if (activityR.isFinishing()) {
            return;
        }
        Intrinsics.checkNotNull(alertDialogCreate);
        alertDialogCreate.show();
    }

    public final String f() {
        return c;
    }

    public final boolean g() {
        try {
            ScanCore scanCore = ScanCore.a;
            if (scanCore.R().length() > 0) {
                return true;
            }
            return scanCore.h0().length() > 0;
        } catch (Exception e) {
            nn3.c(nn3.a, b, e.toString(), null, 4, null);
            return false;
        }
    }
}
