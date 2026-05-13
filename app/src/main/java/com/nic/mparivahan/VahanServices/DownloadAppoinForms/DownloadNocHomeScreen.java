package com.nic.mparivahan.VahanServices.DownloadAppoinForms;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadNocHomeScreen;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.PDFViewInternalAcitvity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.aw1;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.jv;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadNocHomeScreen;", "Lcom/zepto/pq;", "", "r1", "w1", "", "pfileName", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/aw1;", "C", "Lcom/zepto/aw1;", "binding", "Lcom/zepto/jv;", "D", "Lcom/zepto/jv;", "viewModel", "Lcom/zepto/ev;", "E", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "I", "Lcom/zepto/ld7;", "q1", "()Lcom/zepto/ld7;", "B1", "(Lcom/zepto/ld7;)V", "vahanProViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "p1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanProService", "K", "Ljava/lang/String;", "digit", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "n1", "()Lcom/zepto/wa3;", "y1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DownloadNocHomeScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public aw1 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ev otpViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ld7 vahanProViewModle;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public VahanProService vahanProService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            DownloadNocHomeScreen.this.o1().dismiss();
            if (gd1.a.m(str)) {
                return;
            }
            DownloadNocHomeScreen downloadNocHomeScreen = DownloadNocHomeScreen.this;
            Intrinsics.checkNotNull(str);
            downloadNocHomeScreen.x1(str);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            DownloadNocHomeScreen.this.o1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str.toString(), "Error", true)) {
                return;
            }
            VContant.INSTANCE.P(DownloadNocHomeScreen.this, str);
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    private final void r1() {
        ApplicationService applicationService = this.retrofitService;
        aw1 aw1Var = null;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        ApplicationServiceOtp applicationServiceOtp = this.otpRetrofitService;
        if (applicationServiceOtp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.otpViewModel = (ev) new z(this, new fv6(new pw(applicationServiceOtp))).a(ev.class);
        aw1 aw1Var2 = this.binding;
        if (aw1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var2 = null;
        }
        aw1Var2.e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNocHomeScreen.s1(this.a, view);
            }
        });
        aw1 aw1Var3 = this.binding;
        if (aw1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var3 = null;
        }
        aw1Var3.e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ew1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNocHomeScreen.t1(this.a, view);
            }
        });
        aw1 aw1Var4 = this.binding;
        if (aw1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var4 = null;
        }
        aw1Var4.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNocHomeScreen.u1(this.a, view);
            }
        });
        aw1 aw1Var5 = this.binding;
        if (aw1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var5 = null;
        }
        aw1Var5.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNocHomeScreen.v1(this.a, view);
            }
        });
        aw1 aw1Var6 = this.binding;
        if (aw1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var6 = null;
        }
        aw1Var6.p.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        aw1 aw1Var7 = this.binding;
        if (aw1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var7 = null;
        }
        aw1Var7.p.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        aw1 aw1Var8 = this.binding;
        if (aw1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var8 = null;
        }
        aw1Var8.o.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        aw1 aw1Var9 = this.binding;
        if (aw1Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var9 = null;
        }
        aw1Var9.o.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        aw1 aw1Var10 = this.binding;
        if (aw1Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var10 = null;
        }
        aw1Var10.n.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        aw1 aw1Var11 = this.binding;
        if (aw1Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aw1Var = aw1Var11;
        }
        aw1Var.n.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static final void s1(DownloadNocHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1();
    }

    public static final void t1(DownloadNocHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void u1(DownloadNocHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        aw1 aw1Var = this$0.binding;
        aw1 aw1Var2 = null;
        if (aw1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var = null;
        }
        Editable text = aw1Var.n.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 10) {
            Toast.makeText(this$0, this$0.n1().b("PLEASE_ENTER_APPLICATION", "Please enter the valid Application No"), 0).show();
            return;
        }
        this$0.o1().show();
        ld7 ld7VarQ1 = this$0.q1();
        aw1 aw1Var3 = this$0.binding;
        if (aw1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aw1Var2 = aw1Var3;
        }
        ld7VarQ1.p(this$0, String.valueOf(aw1Var2.n.getText()), this$0);
    }

    public static final void v1(DownloadNocHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void w1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(String pfileName) {
        aw1 aw1Var = null;
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            method.invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String str = pfileName + ".pdf";
        new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), '/' + str);
        Log.e("tesfile2", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + str);
        try {
            Intent intent = new Intent(this, (Class<?>) PDFViewInternalAcitvity.class);
            intent.putExtra("HeaderName", "Download NOC Certificate");
            aw1 aw1Var2 = this.binding;
            if (aw1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                aw1Var = aw1Var2;
            }
            intent.putExtra("pdfname", String.valueOf(aw1Var.n.getText()));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "File not found", 1).show();
        }
    }

    public final void A1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanProService = vahanProService;
    }

    public final void B1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanProViewModle = ld7Var;
    }

    public final wa3 n1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download_forms_liera);
        aw1 aw1VarC = aw1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aw1VarC, "inflate(...)");
        this.binding = aw1VarC;
        aw1 aw1Var = null;
        if (aw1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1VarC = null;
        }
        setContentView(aw1VarC.b());
        getWindow().addFlags(128);
        ta3.a aVar = ta3.a;
        aw1 aw1Var2 = this.binding;
        if (aw1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aw1Var = aw1Var2;
        }
        aVar.l2(this, aw1Var);
        y1(new wa3(this));
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        z1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        A1(VahanProService.INSTANCE.a(this));
        B1((ld7) new z(this, new kd7(new jd7(p1()))).a(ld7.class));
        r1();
        q1().s0().g(this, new c(new a()));
        q1().t0().g(this, new c(new b()));
    }

    public final VahanProService p1() {
        VahanProService vahanProService = this.vahanProService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanProService");
        return null;
    }

    public final ld7 q1() {
        ld7 ld7Var = this.vahanProViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanProViewModle");
        return null;
    }

    public final void y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }
}
