package ai.protectt.app.security.main;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.LoggerController;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.Gson;
import com.zepto.co3;
import com.zepto.f80;
import com.zepto.gw4;
import com.zepto.if5;
import com.zepto.jf5;
import com.zepto.jt;
import com.zepto.k16;
import com.zepto.nn3;
import com.zepto.oj1;
import com.zepto.qj2;
import com.zepto.qn3;
import com.zepto.s06;
import com.zepto.uu;
import com.zepto.ye1;
import com.zepto.yz0;
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
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016JQ\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lai/protectt/app/security/main/LoggerController;", "Landroid/content/ContentProvider;", "", "onCreate", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "Landroid/content/ContentValues;", "values", "insert", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Landroid/app/Application;", "context", "", "p", "Landroid/app/Activity;", "activity", "i", "Landroid/content/Context;", "application", "j", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "b", "app-security_release"}, k = 1, mv = {1, 6, 0})
public final class LoggerController extends ContentProvider {
    public static Context c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String TAG = "LoggerController";

    public static final class b extends TimerTask {
        public final /* synthetic */ Application c;
        public final /* synthetic */ Activity e;
        public final /* synthetic */ LoggerController f;

        public b(Application application, Activity activity, LoggerController loggerController) {
            this.c = application;
            this.e = activity;
            this.f = loggerController;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                jt.a aVar = jt.c;
                if (aVar.V()) {
                    return;
                }
                if (gw4.a.b()) {
                    NativeInteractor.a.n(this.c, ScanCore.a.T("ZS0wMzU="));
                }
                aVar.K0(this.c);
                aVar.z0(this.e);
                this.f.j(this.c);
            } catch (Exception e) {
                nn3.a.b(this.f.TAG, String.valueOf(e), e);
            }
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ LoggerController f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, LoggerController loggerController, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = loggerController;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                oj1 oj1Var = oj1.a;
                if (oj1Var.f() == null) {
                    oj1Var.j(this.e);
                }
            } catch (Exception e) {
                nn3.c(nn3.a, this.f.TAG, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ Application b;

        public d(Application application) {
            this.b = application;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LoggerController.this.i(this.b, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (jt.c.V()) {
                return;
            }
            LoggerController.this.i(this.b, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final void k(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        qn3.a.d(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    public static final void l(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        qn3.a.d(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    public static final void m(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        qn3.a.d(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    public static final void n(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        qn3.a.d(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    public static final void o(if5 i) {
        Intrinsics.checkNotNullParameter(i, "$i");
        qn3.a.d(String.valueOf(i.getTitle()), String.valueOf(i.getMsg()));
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    public final void i(Application context, Activity activity) {
        try {
            new Timer().schedule(new b(context, activity, this), 5000L);
        } catch (Exception e) {
            nn3.a.b(this.TAG, String.valueOf(e), e);
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    public final void j(Context application) {
        int identifier;
        BufferedReader bufferedReader;
        boolean zX;
        boolean zU0;
        f80.d(qj2.c, null, null, new c(application, this, null), 3, null);
        File file = new File(application.getDir("dex", 0), "features.json");
        try {
            try {
                gw4 gw4Var = gw4.a;
                if (gw4Var.b()) {
                    Resources resources = application.getResources();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    identifier = resources.getIdentifier(nativeInteractor.N0(), nativeInteractor.R0(), application.getPackageName());
                } else if (gw4Var.c()) {
                    Resources resources2 = application.getResources();
                    NativeInteractor nativeInteractor2 = NativeInteractor.a;
                    identifier = resources2.getIdentifier(nativeInteractor2.Q0(), nativeInteractor2.R0(), application.getPackageName());
                } else {
                    identifier = 0;
                }
                InputStream inputStreamOpenRawResource = application.getResources().openRawResource(identifier);
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
            } catch (Exception e) {
                if (StringsKt__StringsKt.contains((CharSequence) e.toString(), (CharSequence) "NotFoundException: File res/raw/feature", true) || StringsKt__StringsKt.contains((CharSequence) e.toString(), (CharSequence) "NotFoundException: Resource ID #0x0", true)) {
                    k16.a.a(application);
                }
                if (!file.exists()) {
                    return;
                }
            }
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                jf5 jf5Var = (jf5) new Gson().fromJson(text, jf5.class);
                s06.a aVar = s06.m;
                Context context = getContext();
                Intrinsics.checkNotNull(context);
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context!!.applicationContext");
                aVar.b(applicationContext);
                s06 s06VarA = aVar.a();
                Intrinsics.checkNotNull(s06VarA);
                String strL = s06VarA.l();
                if (strL.length() > 0) {
                    co3 co3Var = co3.a;
                    Context context2 = getContext();
                    Intrinsics.checkNotNull(context2);
                    Context applicationContext2 = context2.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "context!!.applicationContext");
                    zX = co3Var.x(strL, applicationContext2);
                    zU0 = ScanUtils.a.U0(strL);
                } else {
                    ScanCore.a.d0();
                    co3 co3Var2 = co3.a;
                    s06 s06VarA2 = aVar.a();
                    Intrinsics.checkNotNull(s06VarA2);
                    String strL2 = s06VarA2.l();
                    Context context3 = getContext();
                    Intrinsics.checkNotNull(context3);
                    Context applicationContext3 = context3.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "context!!.applicationContext");
                    zX = co3Var2.x(strL2, applicationContext3);
                    ScanUtils scanUtils = ScanUtils.a;
                    s06 s06VarA3 = aVar.a();
                    Intrinsics.checkNotNull(s06VarA3);
                    zU0 = scanUtils.U0(s06VarA3.l());
                }
                List<if5> ruleList = jf5Var.getRuleList();
                Intrinsics.checkNotNull(ruleList);
                for (final if5 if5Var : ruleList) {
                    if (if5Var.getRuleid() == 47 && zX) {
                        Activity activityR = jt.c.r();
                        Intrinsics.checkNotNull(activityR);
                        activityR.runOnUiThread(new Runnable() { // from class: com.zepto.tn3
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoggerController.k(if5Var);
                            }
                        });
                    }
                    if (if5Var.getRuleid() == 250 && zU0) {
                        Activity activityR2 = jt.c.r();
                        Intrinsics.checkNotNull(activityR2);
                        activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.un3
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoggerController.l(if5Var);
                            }
                        });
                    }
                    if (if5Var.getRuleid() == 17) {
                        String strW0 = ScanCore.a.w0();
                        if (strW0.length() > 0) {
                            new uu().i(strW0, if5Var, "Log");
                        }
                    }
                    if (if5Var.getRuleid() == 19) {
                        NativeInteractor nativeInteractor3 = NativeInteractor.a;
                        Context context4 = getContext();
                        Intrinsics.checkNotNull(context4);
                        Intrinsics.checkNotNullExpressionValue(context4, "context!!");
                        if (Intrinsics.areEqual(nativeInteractor3.t(context4), "true")) {
                            Activity activityR3 = jt.c.r();
                            Intrinsics.checkNotNull(activityR3);
                            activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.vn3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LoggerController.m(if5Var);
                                }
                            });
                        }
                    }
                    if (if5Var.getRuleid() == 11) {
                        ScanUtils scanUtils2 = ScanUtils.a;
                        Context context5 = c;
                        Intrinsics.checkNotNull(context5);
                        if (scanUtils2.c0(context5).length() > 0) {
                            Activity activityR4 = jt.c.r();
                            Intrinsics.checkNotNull(activityR4);
                            activityR4.runOnUiThread(new Runnable() { // from class: com.zepto.wn3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LoggerController.n(if5Var);
                                }
                            });
                        }
                    }
                    if (if5Var.getRuleid() == 10) {
                        ScanUtils scanUtils3 = ScanUtils.a;
                        Context context6 = c;
                        Intrinsics.checkNotNull(context6);
                        if (scanUtils3.s0(context6)) {
                            Activity activityR5 = jt.c.r();
                            Intrinsics.checkNotNull(activityR5);
                            activityR5.runOnUiThread(new Runnable() { // from class: com.zepto.xn3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LoggerController.o(if5Var);
                                }
                            });
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

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Context context = getContext();
            Context applicationContext = null;
            c = context == null ? null : context.getApplicationContext();
            jt.a aVar = jt.c;
            Context context2 = getContext();
            Context applicationContext2 = context2 == null ? null : context2.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2);
            aVar.K0(applicationContext2);
            Context context3 = getContext();
            if (context3 != null) {
                applicationContext = context3.getApplicationContext();
            }
            if (applicationContext == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            p((Application) applicationContext);
            return true;
        } catch (Exception e) {
            nn3.c(nn3.a, this.TAG, Intrinsics.stringPlus("", e), null, 4, null);
            return true;
        }
    }

    public final void p(Application context) {
        try {
            context.registerActivityLifecycleCallbacks(new d(context));
        } catch (Exception e) {
            nn3.c(nn3.a, this.TAG, Intrinsics.stringPlus("", e), null, 4, null);
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }
}
