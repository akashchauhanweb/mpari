package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.zepto.co3;
import com.zepto.jt;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class co3 {
    public static Context b;
    public static Activity c;
    public static final co3 a = new co3();
    public static String d = "LoggingServiceUtil";

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
        public /* synthetic */ Object e;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.e = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            yz0 yz0Var;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                yz0Var = (yz0) this.e;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yz0Var = (yz0) this.e;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    nn3.a.f(co3.a.t(), Intrinsics.stringPlus("", e));
                }
            }
            while (zz0.d(yz0Var)) {
                co3.a.y();
                this.e = yz0Var;
                this.c = 1;
                if (bh1.a(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(if5 if5Var) {
            co3.a.p(String.valueOf(if5Var.getTitle()), String.valueOf(if5Var.getMsg()));
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            jt.a aVar = jt.c;
            if (aVar.m() != null) {
                ni0 ni0VarM = aVar.m();
                Intrinsics.checkNotNull(ni0VarM);
                String trust = ni0VarM.getTrust();
                if (trust != null && trust.length() != 0) {
                    ni0 ni0VarM2 = aVar.m();
                    Intrinsics.checkNotNull(ni0VarM2);
                    String trust2 = ni0VarM2.getTrust();
                    uu uuVar = new uu();
                    PackageManager packageManager = aVar.C().getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager, "AppProtecttInteractor.mAppContext.packageManager");
                    String packageName = aVar.C().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "AppProtecttInteractor.mAppContext.packageName");
                    List listB = uuVar.b(packageManager, packageName);
                    Intrinsics.checkNotNull(listB);
                    String strValueOf = String.valueOf(listB.get(0));
                    Intrinsics.checkNotNull(trust2);
                    if (!StringsKt__StringsKt.contains$default((CharSequence) trust2, (CharSequence) strValueOf, false, 2, (Object) null)) {
                        if (gw4.a.b()) {
                            List<if5> listW = aVar.w();
                            Intrinsics.checkNotNull(listW);
                            for (final if5 if5Var : listW) {
                                if (if5Var.getRuleid() == 17) {
                                    Activity activityR = jt.c.r();
                                    Intrinsics.checkNotNull(activityR);
                                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.do3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            co3.c.d(if5Var);
                                        }
                                    });
                                }
                            }
                            co3.a.n(ScanCore.a.T("ZS0wMDk="));
                        } else {
                            ScanUtils.a.X0(225, Intrinsics.stringPlus(strValueOf, "|LoggingServiceTrustCheck"));
                        }
                    }
                    if (gw4.a.b()) {
                        co3.a.C();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ Activity f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = activity;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.e, this.f, continuation);
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
                    mx2.a.c(NativeInteractor.a.n1(), new Object[]{this.f, ScanCore.a.T("ZS0wMDg=")}, this.f);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            gw4 gw4Var = gw4.a;
            Object objE = mx2.a.e(NativeInteractor.a.l1(), new Object[]{this.f, Boxing.boxBoolean(true), gw4Var.a()});
            nn3 nn3Var = nn3.a;
            co3 co3Var = co3.a;
            nn3Var.f(co3Var.t(), Intrinsics.stringPlus("Dex Total Res:-", objE));
            if (Intrinsics.areEqual(String.valueOf(objE), ScanCore.a.T("U0FGRQ=="))) {
                nn3Var.f(co3Var.t(), Intrinsics.stringPlus("Dex Res:-", objE));
            } else {
                ScanUtils.a.Z0(String.valueOf(objE));
                if (gw4Var.b()) {
                    this.c = 2;
                    if (bh1.a(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mx2.a.c(NativeInteractor.a.n1(), new Object[]{this.f, ScanCore.a.T("ZS0wMDg=")}, this.f);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ Activity f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = activity;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((e) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
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
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Object objE = mx2.a.e(NativeInteractor.a.r1(), new Object[]{this.f, Boxing.boxBoolean(true), gw4.a.a()});
            nn3 nn3Var = nn3.a;
            co3 co3Var = co3.a;
            nn3Var.f(co3Var.t(), Intrinsics.stringPlus("Dex Total tamperingInfo Res:-", objE));
            if (Intrinsics.areEqual(String.valueOf(objE), ScanCore.a.T("U0FGRQ=="))) {
                nn3Var.f(co3Var.t(), Intrinsics.stringPlus("Dex tamperingInfo Res:-", objE));
            } else {
                ScanAlerts scanAlertsL = jt.c.L();
                if5 if5VarQ = scanAlertsL == null ? null : scanAlertsL.Q(225);
                if (if5VarQ != null) {
                    ScanUtils.a.b0(if5VarQ, String.valueOf(objE));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            co3 co3Var = co3.a;
            ni0 ni0VarM = jt.c.m();
            Intrinsics.checkNotNull(ni0VarM);
            co3Var.B(String.valueOf(ni0VarM.getTrust()));
            return Unit.INSTANCE;
        }
    }

    static {
        qj2 qj2Var = qj2.c;
        f80.d(qj2Var, null, null, new a(null), 3, null);
        f80.d(qj2Var, null, null, new b(null), 3, null);
    }

    public static final void k(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        a.p(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    public static final void l(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        a.p(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    public static final void q(DialogInterface dialogInterface, int i) {
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

    public final void A(Activity activity, Context context) {
        try {
            jt.a aVar = jt.c;
            aVar.z0(activity);
            String strM = NativeInteractor.a.m("cmVsZWFzZQ==");
            String strH = aVar.h();
            if (strH == null || strH.length() == 0 || !StringsKt__StringsJVMKt.equals$default(aVar.h(), strM, false, 2, null)) {
                return;
            }
            v(activity, context);
            i(context, activity);
        } catch (Exception e2) {
            nn3.a.b("LoggingService", e2.toString(), e2);
        }
    }

    public final void B(String str) {
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            jt.a aVar = jt.c;
            Context contextC = aVar.C();
            ScanCore scanCore = ScanCore.a;
            Object objP1 = nativeInteractor.p1(contextC, scanCore.T("ZS0wMzM="));
            if (objP1.toString().length() != 0) {
                String strI1 = ScanUtils.a.i1((Signature) objP1);
                Intrinsics.checkNotNull(strI1);
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) strI1, false, 2, (Object) null) && gw4.a.b()) {
                    nativeInteractor.n(aVar.C(), scanCore.T("ZS0wMTc="));
                }
            } else if (gw4.a.b()) {
                nativeInteractor.n(aVar.C(), scanCore.T("ZS0wMTY="));
            }
        } catch (Exception e2) {
            nn3.a.b(d, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
        }
    }

    public final void C() {
        f80.d(qj2.c, null, null, new f(null), 3, null);
    }

    public final void i(Context context, Activity activity) {
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
            nn3Var.f(d, Intrinsics.stringPlus("Dex Anti Total Res:-", objE));
            if (Intrinsics.areEqual(String.valueOf(objE), ScanCore.a.T("U0FGRQ=="))) {
                nn3Var.f(d, Intrinsics.stringPlus("Dex Anti  Res:-", objE));
            } else {
                ScanUtils.a.Z0(String.valueOf(objE));
            }
        } catch (Exception e2) {
            nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> appDebugging: Error: ", e2), e2);
        }
    }

    public final void j(Context context) {
        int identifier;
        BufferedReader bufferedReader;
        jt.c.K0(context);
        File file = new File(context.getDir("dex", 0), "features.json");
        try {
            try {
                gw4 gw4Var = gw4.a;
                if (gw4Var.b()) {
                    Resources resources = context.getResources();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    identifier = resources.getIdentifier(nativeInteractor.N0(), nativeInteractor.R0(), context.getPackageName());
                } else if (gw4Var.c()) {
                    Resources resources2 = context.getResources();
                    NativeInteractor nativeInteractor2 = NativeInteractor.a;
                    identifier = resources2.getIdentifier(nativeInteractor2.Q0(), nativeInteractor2.R0(), context.getPackageName());
                } else {
                    identifier = 0;
                }
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "application.resources.openRawResource(feature)");
                ye1 ye1Var = ye1.a;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(ye1Var.b(ye1Var.f(inputStreamOpenRawResource))));
                bufferedInputStream.available();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.close();
                bufferedInputStream.close();
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
                bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, ConstantsKt.DEFAULT_BUFFER_SIZE);
            } catch (Exception e2) {
                if (StringsKt__StringsKt.contains((CharSequence) e2.toString(), (CharSequence) "NotFoundException: File res/raw/feature", true) || StringsKt__StringsKt.contains((CharSequence) e2.toString(), (CharSequence) "NotFoundException: Resource ID #0x0", true)) {
                    k16.a.a(context);
                }
                if (!file.exists()) {
                    return;
                }
            }
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                jf5 jf5Var = (jf5) new Gson().fromJson(text, jf5.class);
                List<if5> ruleList = jf5Var.getRuleList();
                Intrinsics.checkNotNull(ruleList);
                for (final if5 if5Var : ruleList) {
                    if (if5Var.getRuleid() == 47) {
                        oj1 oj1Var = oj1.a;
                        if (oj1Var.f() == null) {
                            oj1Var.j(context);
                        }
                        if (Intrinsics.areEqual(oj1.i(oj1Var, if5Var, context, null, 4, null), Boolean.FALSE)) {
                            Activity activityR = jt.c.r();
                            Intrinsics.checkNotNull(activityR);
                            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.zn3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    co3.k(if5Var);
                                }
                            });
                        }
                    }
                }
                ScanCore scanCore = ScanCore.a;
                if (scanCore.w0().length() == 0) {
                    nn3.a.f(d, "Trust Empty");
                } else {
                    String strW0 = scanCore.w0();
                    uu uuVar = new uu();
                    PackageManager packageManager = context.getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager, "application.packageManager");
                    String packageName = context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "application.packageName");
                    List listB = uuVar.b(packageManager, packageName);
                    Intrinsics.checkNotNull(listB);
                    if (!StringsKt__StringsKt.contains$default((CharSequence) strW0, (CharSequence) String.valueOf(listB.get(0)), false, 2, (Object) null)) {
                        List<if5> ruleList2 = jf5Var.getRuleList();
                        Intrinsics.checkNotNull(ruleList2);
                        for (final if5 if5Var2 : ruleList2) {
                            if (if5Var2.getRuleid() == 17) {
                                Activity activityR2 = jt.c.r();
                                Intrinsics.checkNotNull(activityR2);
                                activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.ao3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        co3.l(if5Var2);
                                    }
                                });
                            }
                        }
                    }
                }
                if (!file.exists()) {
                    return;
                }
                file.delete();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (file.exists()) {
                file.delete();
            }
            throw th3;
        }
    }

    public final void m(Context context, Activity activity) {
        jt.a aVar = jt.c;
        if (aVar.V()) {
            f80.d(qj2.c, null, null, new c(null), 3, null);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        aVar.m0((Application) applicationContext);
        a.w(context, activity);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        j(applicationContext2);
    }

    public final void n(String str) {
        try {
            oj1 oj1Var = oj1.a;
            if (oj1Var.f() == null) {
                oj1Var.j(jt.c.C());
            }
            mx2 mx2Var = mx2.a;
            String strM1 = NativeInteractor.a.m1();
            jt.a aVar = jt.c;
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            Object[] objArr = {activityR, str};
            Activity activityR2 = aVar.r();
            Intrinsics.checkNotNull(activityR2);
            mx2Var.c(strM1, objArr, activityR2);
        } catch (Exception e2) {
            nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> isDebugger: Error: ", e2), e2);
        }
    }

    public final void o(Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        A(activity, context);
        m(context, activity);
    }

    public final void p(String str, String str2) {
        jt.a aVar = jt.c;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(aVar.r()).create();
        alertDialogCreate.setTitle(str);
        alertDialogCreate.setMessage(str2);
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.setButton(-1, NativeInteractor.a.L0(), new DialogInterface.OnClickListener() { // from class: com.zepto.bo3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                co3.q(dialogInterface, i);
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

    public final Activity r() {
        return c;
    }

    public final Context s() {
        return b;
    }

    public final String t() {
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u(java.io.File r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "algorithmString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            if (r9 == 0) goto L71
            boolean r1 = r9.exists()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r1 != 0) goto Lf
            goto L71
        Lf:
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
        L21:
            int r3 = r1.read(r9)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.element = r3     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L34
            r10.update(r9, r5, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            goto L21
        L2f:
            r9 = move-exception
            r0 = r1
            goto L89
        L32:
            r9 = move-exception
            goto L74
        L34:
            r1.close()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            byte[] r9 = r10.digest()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r10.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            int r2 = r9.length     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
        L41:
            if (r5 >= r2) goto L64
            int r3 = r5 + 1
            r4 = r9[r5]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            int r4 = r4 + 256
            r5 = 16
            java.lang.String r4 = java.lang.Integer.toString(r4, r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r5 = "toString((mdbytes[i] and…ff.toByte()) + 0x100, 16)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r5 = 1
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r10.append(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r5 = r3
            goto L41
        L64:
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r1.close()
            return r9
        L6c:
            r9 = move-exception
            goto L89
        L6e:
            r9 = move-exception
            r1 = r0
            goto L74
        L71:
            java.lang.String r9 = ""
            return r9
        L74:
            com.zepto.nn3 r2 = com.zepto.nn3.a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = com.zepto.co3.d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r6 = 4
            r7 = 0
            com.zepto.nn3.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L85
            goto L88
        L85:
            r1.close()
        L88:
            return r0
        L89:
            if (r0 != 0) goto L8c
            goto L8f
        L8c:
            r0.close()
        L8f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.co3.u(java.io.File, java.lang.String):java.lang.String");
    }

    public final void v(Activity activity, Context context) {
        f80.d(qj2.c, null, null, new d(context, activity, null), 3, null);
    }

    public final void w(Context context, Activity activity) {
        f80.d(qj2.c, null, null, new e(context, activity, null), 3, null);
    }

    public final boolean x(String input, Context context) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (!StringsKt__StringsKt.contains$default((CharSequence) input, (CharSequence) "L1", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) input, (CharSequence) "L2", false, 2, (Object) null)) {
                if (!z() && !qn3.a.g()) {
                    nn3 nn3Var = nn3.a;
                    if (!nn3Var.j()) {
                        if (!nn3Var.a(context)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e2) {
            nn3.c(nn3.a, "TAG", e2.toString(), null, 4, null);
            return false;
        }
    }

    public final void y() {
        try {
            mo5 mo5Var = mo5.a;
            mo5Var.n(true);
            NativeInteractor.a.b("init");
            nn3.a.f(d, Intrinsics.stringPlus("", Boolean.valueOf(mo5Var.b())));
            qn3.a.b();
        } catch (Exception e2) {
            nn3.a.f(d, Intrinsics.stringPlus("", e2));
        }
    }

    public final boolean z() {
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            if (nativeInteractor.c0()) {
                return true;
            }
            return nativeInteractor.l0().length() > 0;
        } catch (Exception e2) {
            nn3.c(nn3.a, "TAG", e2.toString(), null, 4, null);
            return false;
        }
    }
}
