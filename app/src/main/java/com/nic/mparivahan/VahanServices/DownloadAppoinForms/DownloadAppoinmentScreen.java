package com.nic.mparivahan.VahanServices.DownloadAppoinForms;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadAppoinmentScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.zepto.aw1;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.gd1;
import com.zepto.jv;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadAppoinmentScreen;", "Lcom/zepto/pq;", "", "v1", "A1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "it", "E1", "applNo", "stateCd", "s1", "pfileName", "B1", "Lcom/zepto/aw1;", "C", "Lcom/zepto/aw1;", "binding", "Lcom/zepto/jv;", "D", "Lcom/zepto/jv;", "viewModel", "Lcom/zepto/ev;", "E", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "D1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "Ljava/lang/String;", "digit", "J", "ownerName", "K", "stateCdFromApplNo", "L", "tabSelected", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "C1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDownloadAppoinmentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadAppoinmentScreen.kt\ncom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadAppoinmentScreen\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,393:1\n260#2:394\n260#2:395\n260#2:396\n260#2:397\n*S KotlinDebug\n*F\n+ 1 DownloadAppoinmentScreen.kt\ncom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadAppoinmentScreen\n*L\n213#1:394\n219#1:395\n245#1:396\n258#1:397\n*E\n"})
public final class DownloadAppoinmentScreen extends pq {

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
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String stateCdFromApplNo = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String tabSelected = "ApplicationNo";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (DownloadAppoinmentScreen.this.u1().isShowing()) {
                DownloadAppoinmentScreen.this.u1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().size() <= 0) {
                    DownloadAppoinmentScreen downloadAppoinmentScreen = DownloadAppoinmentScreen.this;
                    downloadAppoinmentScreen.E1(downloadAppoinmentScreen, downloadAppoinmentScreen.t1().b("no_application_status", "No application status found for this application no."));
                    return;
                }
                ApplStatusCurrentListModel applStatusCurrentListModel = applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().get(0);
                Intrinsics.checkNotNullExpressionValue(applStatusCurrentListModel, "get(...)");
                ApplStatusCurrentListModel applStatusCurrentListModel2 = applStatusCurrentListModel;
                applStatusCurrentListModel2.getRegno();
                aw1 aw1Var = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) applStatusCurrentListModel2.getCurr_off_cd().toString(), (CharSequence) ".", false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(applStatusCurrentListModel2.getCurr_off_cd().toString().substring(0, 2), "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    applStatusCurrentListModel2.getCurr_off_cd().toString();
                }
                try {
                    DownloadAppoinmentScreen.this.u1().show();
                    ev evVar = DownloadAppoinmentScreen.this.otpViewModel;
                    if (evVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
                        evVar = null;
                    }
                    DownloadAppoinmentScreen downloadAppoinmentScreen2 = DownloadAppoinmentScreen.this;
                    aw1 aw1Var2 = downloadAppoinmentScreen2.binding;
                    if (aw1Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        aw1Var = aw1Var2;
                    }
                    evVar.h(downloadAppoinmentScreen2, String.valueOf(aw1Var.n.getText()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                DownloadAppoinmentScreen downloadAppoinmentScreen3 = DownloadAppoinmentScreen.this;
                downloadAppoinmentScreen3.E1(downloadAppoinmentScreen3, downloadAppoinmentScreen3.getString(R.string.service_unavable_please_try));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApplicationStatusSuccessModel) obj);
            return Unit.INSTANCE;
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
            if (DownloadAppoinmentScreen.this.u1().isShowing()) {
                DownloadAppoinmentScreen.this.u1().dismiss();
            }
            DownloadAppoinmentScreen downloadAppoinmentScreen = DownloadAppoinmentScreen.this;
            downloadAppoinmentScreen.E1(downloadAppoinmentScreen, downloadAppoinmentScreen.t1().b("no_application_status", "No application status found for this application no."));
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
            DownloadAppoinmentScreen.this.u1().dismiss();
            Log.e("TestUrl", str.toString());
            if (gd1.a.m(str)) {
                return;
            }
            DownloadAppoinmentScreen downloadAppoinmentScreen = DownloadAppoinmentScreen.this;
            Intrinsics.checkNotNull(str);
            downloadAppoinmentScreen.B1(str);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            DownloadAppoinmentScreen.this.u1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str.toString(), "Error", true)) {
                return;
            }
            VContant.INSTANCE.P(DownloadAppoinmentScreen.this, str);
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    private final void A1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void G1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void v1() {
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
        aw1Var2.e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadAppoinmentScreen.w1(this.a, view);
            }
        });
        aw1 aw1Var3 = this.binding;
        if (aw1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var3 = null;
        }
        aw1Var3.e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadAppoinmentScreen.x1(this.a, view);
            }
        });
        aw1 aw1Var4 = this.binding;
        if (aw1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var4 = null;
        }
        aw1Var4.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ru1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadAppoinmentScreen.y1(this.a, view);
            }
        });
        aw1 aw1Var5 = this.binding;
        if (aw1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var5 = null;
        }
        aw1Var5.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.su1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadAppoinmentScreen.z1(this.a, view);
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

    public static final void w1(DownloadAppoinmentScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1();
    }

    public static final void x1(DownloadAppoinmentScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void y1(DownloadAppoinmentScreen this$0, View view) {
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
            Toast.makeText(this$0, this$0.t1().b("PLEASE_ENTER_APPLICATION", "Please enter the valid Application No"), 0).show();
            return;
        }
        aw1 aw1Var3 = this$0.binding;
        if (aw1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var3 = null;
        }
        String strValueOf = String.valueOf(aw1Var3.n.getText());
        aw1 aw1Var4 = this$0.binding;
        if (aw1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aw1Var2 = aw1Var4;
        }
        String strSubstring = String.valueOf(aw1Var2.n.getText()).substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        this$0.s1(strValueOf, strSubstring);
    }

    public static final void z1(DownloadAppoinmentScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void B1(String pfileName) {
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            method.invoke(null, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String str = pfileName + ".pdf";
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), '/' + str);
        Log.e("tesfile2", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + str);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.addFlags(67108864);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "File not found", 1).show();
        }
    }

    public final void C1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void D1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void E1(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(wa3Var.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadAppoinmentScreen.F1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadAppoinmentScreen.G1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download_forms_liera);
        aw1 aw1VarC = aw1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aw1VarC, "inflate(...)");
        this.binding = aw1VarC;
        ev evVar = null;
        if (aw1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1VarC = null;
        }
        setContentView(aw1VarC.b());
        ta3.a aVar = ta3.a;
        aw1 aw1Var = this.binding;
        if (aw1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var = null;
        }
        aVar.e2(this, aw1Var);
        C1(new wa3(this));
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        D1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        v1();
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.n().g(this, new e(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar3 = null;
        }
        evVar3.k().g(this, new e(new b()));
        ev evVar4 = this.otpViewModel;
        if (evVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar4 = null;
        }
        evVar4.i().g(this, new e(new c()));
        ev evVar5 = this.otpViewModel;
        if (evVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar5;
        }
        evVar.j().g(this, new e(new d()));
    }

    public final void s1(String applNo, String stateCd) {
        u1().show();
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.o(this, applNo, stateCd);
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
