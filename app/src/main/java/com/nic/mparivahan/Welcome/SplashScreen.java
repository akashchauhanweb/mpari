package com.nic.mparivahan.Welcome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.View.SignInDashBoard;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.PushNotification.BannerServices;
import com.nic.mparivahan.PushNotification.DownLoadLangService;
import com.nic.mparivahan.PushNotification.StateMaseterService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.Model.Version;
import com.nic.mparivahan.Welcome.SplashScreen;
import com.zepto.cq;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kp7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s12;
import com.zepto.t14;
import com.zepto.tu7;
import com.zepto.ue5;
import com.zepto.uq6;
import com.zepto.v14;
import com.zepto.w14;
import com.zepto.ws6;
import com.zepto.z04;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/nic/mparivahan/Welcome/SplashScreen;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "B1", "p1", "Landroid/widget/ProgressBar;", "C", "Landroid/widget/ProgressBar;", "progressBar", "Lcom/zepto/tu7;", "D", "Lcom/zepto/tu7;", "u1", "()Lcom/zepto/tu7;", "I1", "(Lcom/zepto/tu7;)V", "viewModel", "Lcom/nic/mparivahan/Welcome/VersionService;", "E", "Lcom/nic/mparivahan/Welcome/VersionService;", "retrofitService", "Lcom/zepto/v14;", "F", "Lcom/zepto/v14;", "r1", "()Lcom/zepto/v14;", "F1", "(Lcom/zepto/v14;)V", "napixViewModel", "Lcom/nic/mparivahan/Welcome/NapixService;", "G", "Lcom/nic/mparivahan/Welcome/NapixService;", "napixService", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "t1", "()Lcom/zepto/ws6;", "H1", "(Lcom/zepto/ws6;)V", "session_manger", "Lcom/zepto/uq6;", "I", "Lcom/zepto/uq6;", "q1", "()Lcom/zepto/uq6;", "E1", "(Lcom/zepto/uq6;)V", "mUpdateManager", "Lcom/zepto/ld7;", "J", "Lcom/zepto/ld7;", "v1", "()Lcom/zepto/ld7;", "J1", "(Lcom/zepto/ld7;)V", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "K", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "s1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "G1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceAddMob", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SplashScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ProgressBar progressBar;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public tu7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VersionService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public v14 napixViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final NapixService napixService = NapixService.INSTANCE.a();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 session_manger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public uq6 mUpdateManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    public static final class a implements uq6.c {
        @Override // com.zepto.uq6.c
        public void a(int i) {
        }

        @Override // com.zepto.uq6.c
        public void b(int i) {
        }
    }

    public static final class b implements uq6.b {
        @Override // com.zepto.uq6.b
        public void a(long j, long j2) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                if (gd1.a.m(str)) {
                    return;
                }
                Toast.makeText(SplashScreen.this, str, 1).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void A1(SplashScreen this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!s12.k()) {
                ue5.a aVar = ue5.a;
                Context baseContext = this$0.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                if (!aVar.a(baseContext)) {
                    hz0.a aVar2 = hz0.a;
                    if (!aVar2.I(this$0)) {
                        if (com.nic.mparivahan.a.a.a(this$0)) {
                            this$0.u1().n();
                        } else if (this$0.t1().u()) {
                            Intent intent = new Intent(this$0, (Class<?>) SignInScreen.class);
                            intent.putExtra(aVar2.u(), aVar2.v());
                            this$0.startActivity(intent);
                            this$0.finish();
                        } else {
                            this$0.startActivity(new Intent(this$0, (Class<?>) SignInDashBoard.class));
                            this$0.finish();
                        }
                    }
                }
            }
        } catch (Exception unused) {
            ProgressBar progressBar = this$0.progressBar;
            Intrinsics.checkNotNull(progressBar);
            progressBar.setVisibility(8);
        }
    }

    public static final void C1(SplashScreen this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void D1(SplashScreen this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w1(SplashScreen this$0, NapixTokenModel napixTokenModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new ws6(this$0).F(napixTokenModel.getAccess_token());
        StateMaseterService.INSTANCE.a(this$0);
        BannerServices.INSTANCE.a(this$0);
        if (gd1.a.m(napixTokenModel.getAccess_token())) {
            return;
        }
        try {
            if (new SimpleDateFormat("dd-MM-yyyy").format(new Date()).equals(new cq(this$0).c())) {
                return;
            }
            DownLoadLangService.INSTANCE.a(this$0);
        } catch (Exception unused) {
        }
    }

    public static final void x1(SplashScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.t1().u()) {
            this$0.startActivity(new Intent(this$0, (Class<?>) SignInDashBoard.class));
            this$0.finish();
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) SignInScreen.class);
        hz0.a aVar = hz0.a;
        intent.putExtra(aVar.u(), aVar.v());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void y1(SplashScreen this$0, Version version) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (StringsKt__StringsJVMKt.equals(version.getStatusCode(), "VER001", true)) {
            ProgressBar progressBar = this$0.progressBar;
            Intrinsics.checkNotNull(progressBar);
            progressBar.setVisibility(8);
            if (!this$0.t1().u()) {
                this$0.startActivity(new Intent(this$0, (Class<?>) SignInDashBoard.class));
                this$0.finish();
                return;
            }
            Intent intent = new Intent(this$0, (Class<?>) SignInScreen.class);
            hz0.a aVar = hz0.a;
            intent.putExtra(aVar.u(), aVar.v());
            this$0.startActivity(intent);
            this$0.finish();
            return;
        }
        ProgressBar progressBar2 = this$0.progressBar;
        Intrinsics.checkNotNull(progressBar2);
        progressBar2.setVisibility(8);
        if (!this$0.t1().u()) {
            this$0.startActivity(new Intent(this$0, (Class<?>) SignInDashBoard.class));
            this$0.finish();
            return;
        }
        Intent intent2 = new Intent(this$0, (Class<?>) SignInScreen.class);
        hz0.a aVar2 = hz0.a;
        intent2.putExtra(aVar2.u(), aVar2.v());
        this$0.startActivity(intent2);
        this$0.finish();
    }

    public static final void z1(SplashScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressBar progressBar = this$0.progressBar;
        Intrinsics.checkNotNull(progressBar);
        progressBar.setVisibility(8);
        if (!this$0.t1().u()) {
            this$0.startActivity(new Intent(this$0, (Class<?>) SignInDashBoard.class));
            this$0.finish();
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) SignInScreen.class);
        hz0.a aVar = hz0.a;
        intent.putExtra(aVar.u(), aVar.v());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public final void B1() {
        ue5.a aVar = ue5.a;
        Context baseContext = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        if (aVar.a(baseContext)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("It seems device don't pass basic integrity & uncertified by Google").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: com.zepto.m56
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SplashScreen.C1(this.a, dialogInterface, i);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setTitle("Information");
            alertDialogCreate.show();
            return;
        }
        if (s12.k()) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("It seems device is virtual, Please proceed with real device.").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: com.zepto.n56
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SplashScreen.D1(this.a, dialogInterface, i);
                }
            });
            AlertDialog alertDialogCreate2 = builder2.create();
            alertDialogCreate2.setTitle("Information");
            alertDialogCreate2.show();
            return;
        }
        hz0.a aVar2 = hz0.a;
        if (aVar2.I(this)) {
            aVar2.f(this, getString(R.string.usbdebug));
        } else {
            r1().i();
        }
    }

    public final void E1(uq6 uq6Var) {
        Intrinsics.checkNotNullParameter(uq6Var, "<set-?>");
        this.mUpdateManager = uq6Var;
    }

    public final void F1(v14 v14Var) {
        Intrinsics.checkNotNullParameter(v14Var, "<set-?>");
        this.napixViewModel = v14Var;
    }

    public final void G1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final void H1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.session_manger = ws6Var;
    }

    public final void I1(tu7 tu7Var) {
        Intrinsics.checkNotNullParameter(tu7Var, "<set-?>");
        this.viewModel = tu7Var;
    }

    public final void J1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvvm_splash);
        getWindow().addFlags(128);
        com.nic.mparivahan.Welcome.a.a.a(this);
        View viewFindViewById = findViewById(R.id.progress_bar);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ProgressBar");
        this.progressBar = (ProgressBar) viewFindViewById;
        H1(new ws6(this));
        G1(VahanProService.INSTANCE.a(this));
        J1((ld7) new z(this, new kd7(new jd7(s1()))).a(ld7.class));
        v1().z0().g(this, new d(new c()));
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        r1().g().g(this, new mf4() { // from class: com.zepto.o56
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SplashScreen.w1(this.a, (NapixTokenModel) obj);
            }
        });
        r1().k().g(this, new mf4() { // from class: com.zepto.p56
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SplashScreen.x1(this.a, (String) obj);
            }
        });
        u1().r().g(this, new mf4() { // from class: com.zepto.q56
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SplashScreen.y1(this.a, (Version) obj);
            }
        });
        u1().k().g(this, new mf4() { // from class: com.zepto.r56
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SplashScreen.z1(this.a, (String) obj);
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.zepto.s56
            @Override // java.lang.Runnable
            public final void run() {
                SplashScreen.A1(this.c);
            }
        }, 1000L);
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onStart() {
        super.onStart();
        this.retrofitService = VersionService.INSTANCE.a(this);
        F1((v14) new z(this, new w14(new t14(this.napixService))).a(v14.class));
        VersionService versionService = this.retrofitService;
        if (versionService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            versionService = null;
        }
        I1((tu7) new z(this, new z04(new kp7(versionService))).a(tu7.class));
        try {
            if (com.nic.mparivahan.a.a.a(this)) {
                p1();
                B1();
            }
        } catch (Exception unused) {
        }
    }

    public final void p1() {
        uq6 uq6VarA = uq6.k.a(this);
        Intrinsics.checkNotNull(uq6VarA);
        E1(uq6VarA.H(1));
        q1().L();
        q1().v(new a());
        q1().u(new b());
    }

    public final uq6 q1() {
        uq6 uq6Var = this.mUpdateManager;
        if (uq6Var != null) {
            return uq6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUpdateManager");
        return null;
    }

    public final v14 r1() {
        v14 v14Var = this.napixViewModel;
        if (v14Var != null) {
            return v14Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("napixViewModel");
        return null;
    }

    public final VahanProService s1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    public final ws6 t1() {
        ws6 ws6Var = this.session_manger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session_manger");
        return null;
    }

    public final tu7 u1() {
        tu7 tu7Var = this.viewModel;
        if (tu7Var != null) {
            return tu7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final ld7 v1() {
        ld7 ld7Var = this.viewModelAddMob;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelAddMob");
        return null;
    }
}
