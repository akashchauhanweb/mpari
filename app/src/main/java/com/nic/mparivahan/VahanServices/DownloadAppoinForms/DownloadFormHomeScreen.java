package com.nic.mparivahan.VahanServices.DownloadAppoinForms;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadFormHomeScreen;
import com.nic.mparivahan.VahanServices.DownloadFormsActivity;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.zepto.aw1;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.jv;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0015R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadFormHomeScreen;", "Lcom/zepto/pq;", "", "t1", "y1", "Landroid/content/Context;", "context", "", "it", "B1", "applNo", "stateCd", "q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/aw1;", "C", "Lcom/zepto/aw1;", "binding", "Lcom/zepto/jv;", "D", "Lcom/zepto/jv;", "viewModel", "Lcom/zepto/ev;", "E", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "A1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "Ljava/lang/String;", "digit", "J", "ownerName", "K", "stateCdFromApplNo", "L", "tabSelected", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "z1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDownloadFormHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadFormHomeScreen.kt\ncom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadFormHomeScreen\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,350:1\n260#2:351\n260#2:352\n260#2:353\n260#2:354\n*S KotlinDebug\n*F\n+ 1 DownloadFormHomeScreen.kt\ncom/nic/mparivahan/VahanServices/DownloadAppoinForms/DownloadFormHomeScreen\n*L\n210#1:351\n216#1:352\n242#1:353\n255#1:354\n*E\n"})
public final class DownloadFormHomeScreen extends pq {

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
            String string;
            if (DownloadFormHomeScreen.this.s1().isShowing()) {
                DownloadFormHomeScreen.this.s1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().size() <= 0) {
                    DownloadFormHomeScreen downloadFormHomeScreen = DownloadFormHomeScreen.this;
                    downloadFormHomeScreen.B1(downloadFormHomeScreen, downloadFormHomeScreen.r1().b("no_application_status", "No application status found for this application no."));
                    return;
                }
                ApplStatusCurrentListModel applStatusCurrentListModel = applicationStatusSuccessModel.getTransList().get(0).getCurrentlist().get(0);
                Intrinsics.checkNotNullExpressionValue(applStatusCurrentListModel, "get(...)");
                ApplStatusCurrentListModel applStatusCurrentListModel2 = applStatusCurrentListModel;
                String regno = applStatusCurrentListModel2.getRegno();
                aw1 aw1Var = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) applStatusCurrentListModel2.getCurr_off_cd().toString(), (CharSequence) ".", false, 2, (Object) null)) {
                    string = applStatusCurrentListModel2.getCurr_off_cd().toString().substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    string = applStatusCurrentListModel2.getCurr_off_cd().toString();
                }
                try {
                    Intent intent = new Intent(DownloadFormHomeScreen.this, (Class<?>) DownloadFormsActivity.class);
                    aw1 aw1Var2 = DownloadFormHomeScreen.this.binding;
                    if (aw1Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aw1Var2 = null;
                    }
                    Editable text = aw1Var2.n.getText();
                    intent.putExtra("state_code", text != null ? text.subSequence(0, 2).toString() : null);
                    intent.putExtra("off_code", string.toString());
                    intent.putExtra("rc_number", regno.toString());
                    aw1 aw1Var3 = DownloadFormHomeScreen.this.binding;
                    if (aw1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        aw1Var = aw1Var3;
                    }
                    intent.putExtra("appl_no", String.valueOf(aw1Var.n.getText()));
                    DownloadFormHomeScreen.this.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                DownloadFormHomeScreen downloadFormHomeScreen2 = DownloadFormHomeScreen.this;
                downloadFormHomeScreen2.B1(downloadFormHomeScreen2, downloadFormHomeScreen2.getString(R.string.service_unavable_please_try));
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
            if (DownloadFormHomeScreen.this.s1().isShowing()) {
                DownloadFormHomeScreen.this.s1().dismiss();
            }
            DownloadFormHomeScreen downloadFormHomeScreen = DownloadFormHomeScreen.this;
            downloadFormHomeScreen.B1(downloadFormHomeScreen, downloadFormHomeScreen.r1().b("no_application_status", "No application status found for this application no."));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(Context context, String it) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormHomeScreen.C1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormHomeScreen.D1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void q1(String applNo, String stateCd) {
        s1().show();
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.o(this, applNo, stateCd);
    }

    private final void t1() {
        aw1 aw1Var = null;
        try {
            if (getIntent() == null) {
                aw1 aw1Var2 = this.binding;
                if (aw1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aw1Var2 = null;
                }
                aw1Var2.h.setText(r1().b("View_Forms", "View Form(s)"));
            } else if (StringsKt__StringsJVMKt.equals$default(getIntent().getStringExtra("service_name"), "View Forms", false, 2, null)) {
                aw1 aw1Var3 = this.binding;
                if (aw1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aw1Var3 = null;
                }
                aw1Var3.h.setText(r1().b("View_Forms", "View Form(s)"));
            } else {
                aw1 aw1Var4 = this.binding;
                if (aw1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aw1Var4 = null;
                }
                aw1Var4.h.setText(getIntent().getStringExtra("service_name"));
            }
        } catch (Exception unused) {
        }
        ApplicationService applicationService = this.retrofitService;
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
        aw1 aw1Var5 = this.binding;
        if (aw1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var5 = null;
        }
        aw1Var5.e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormHomeScreen.u1(this.a, view);
            }
        });
        aw1 aw1Var6 = this.binding;
        if (aw1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var6 = null;
        }
        aw1Var6.e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormHomeScreen.v1(this.a, view);
            }
        });
        aw1 aw1Var7 = this.binding;
        if (aw1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var7 = null;
        }
        aw1Var7.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormHomeScreen.w1(this.a, view);
            }
        });
        aw1 aw1Var8 = this.binding;
        if (aw1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var8 = null;
        }
        aw1Var8.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormHomeScreen.x1(this.a, view);
            }
        });
        aw1 aw1Var9 = this.binding;
        if (aw1Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var9 = null;
        }
        aw1Var9.p.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        aw1 aw1Var10 = this.binding;
        if (aw1Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var10 = null;
        }
        aw1Var10.p.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        aw1 aw1Var11 = this.binding;
        if (aw1Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var11 = null;
        }
        aw1Var11.o.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        aw1 aw1Var12 = this.binding;
        if (aw1Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var12 = null;
        }
        aw1Var12.o.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        aw1 aw1Var13 = this.binding;
        if (aw1Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aw1Var13 = null;
        }
        aw1Var13.n.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        aw1 aw1Var14 = this.binding;
        if (aw1Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aw1Var = aw1Var14;
        }
        aw1Var.n.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static final void u1(DownloadFormHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1();
    }

    public static final void v1(DownloadFormHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w1(DownloadFormHomeScreen this$0, View view) {
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
            Toast.makeText(this$0, this$0.r1().b("PLEASE_ENTER_APPLICATION", "Please enter the valid Application No"), 0).show();
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
        this$0.q1(strValueOf, strSubstring);
    }

    public static final void x1(DownloadFormHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void y1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
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
        aVar.i2(this, aw1Var);
        z1(new wa3(this));
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        A1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        t1();
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.n().g(this, new c(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar3;
        }
        evVar.k().g(this, new c(new b()));
    }

    public final wa3 r1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }
}
