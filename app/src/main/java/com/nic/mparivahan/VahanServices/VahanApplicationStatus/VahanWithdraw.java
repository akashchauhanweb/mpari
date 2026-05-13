package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdraw;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.zepto.fb3;
import com.zepto.gd1;
import com.zepto.jv;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yy0;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0018\u0010.\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanWithdraw;", "Lcom/zepto/pq;", "", "C1", "", "O1", "H1", "", "it", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "mobileNo", "I1", "z1", "Lcom/zepto/fb3;", "C", "Lcom/zepto/fb3;", "binding", "Lcom/zepto/jv;", "D", "Lcom/zepto/jv;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "K1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "digit", "H", "engineNo", "I", "mobileNoValue", "J", "ownerName", "K", "stateCd", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanWithdraw extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fb3 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mobileNoValue = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(VahanApplDisposeSuccessModel vahanApplDisposeSuccessModel) {
            if (VahanWithdraw.this.B1().isShowing()) {
                VahanWithdraw.this.B1().dismiss();
            }
            gd1.a aVar = gd1.a;
            if (aVar.m(vahanApplDisposeSuccessModel.getRegn_no()) || aVar.m(vahanApplDisposeSuccessModel.getMobile_no())) {
                if (VahanWithdraw.this.B1().isShowing()) {
                    VahanWithdraw.this.B1().dismiss();
                }
                if (kt6.d(vahanApplDisposeSuccessModel.getDeveloperMessage())) {
                    VahanWithdraw.this.L1(vahanApplDisposeSuccessModel.getDeveloperMessage());
                    return;
                } else {
                    VahanWithdraw vahanWithdraw = VahanWithdraw.this;
                    vahanWithdraw.L1(vahanWithdraw.A1().b("record_error_msg", VahanWithdraw.this.getString(R.string.service_unavable_please_try)));
                    return;
                }
            }
            VahanWithdraw.this.engineNo = vahanApplDisposeSuccessModel.getEng_no();
            VahanWithdraw.this.mobileNoValue = vahanApplDisposeSuccessModel.getMobile_no();
            VahanWithdraw.this.ownerName = vahanApplDisposeSuccessModel.getOwner_name();
            VahanWithdraw.this.stateCd = vahanApplDisposeSuccessModel.getState_name();
            VahanWithdraw vahanWithdraw2 = VahanWithdraw.this;
            vahanWithdraw2.I1(String.valueOf(vahanWithdraw2.mobileNoValue));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanApplDisposeSuccessModel) obj);
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
            if (VahanWithdraw.this.B1().isShowing()) {
                VahanWithdraw.this.B1().dismiss();
            }
            Log.e("it", str.toString());
            if (!StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                VahanWithdraw.this.L1(str);
            } else {
                VahanWithdraw vahanWithdraw = VahanWithdraw.this;
                vahanWithdraw.L1(vahanWithdraw.A1().b("record_error_msg", VahanWithdraw.this.getString(R.string.service_unavable_please_try)));
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(SendOtpResult sendOtpResult) {
            if (VahanWithdraw.this.B1().isShowing()) {
                VahanWithdraw.this.B1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    VahanWithdraw.this.L1("Unable to send the OTP, Please try after some times!");
                    return;
                } else {
                    VahanWithdraw vahanWithdraw = VahanWithdraw.this;
                    vahanWithdraw.L1(vahanWithdraw.A1().b("record_error_msg", VahanWithdraw.this.getString(R.string.service_unavable_please_try)));
                    return;
                }
            }
            Intent intent = new Intent(VahanWithdraw.this, (Class<?>) VahanWithdrawOtpVerify.class);
            fb3 fb3Var = VahanWithdraw.this.binding;
            fb3 fb3Var2 = null;
            if (fb3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var = null;
            }
            intent.putExtra("applicationNo", String.valueOf(fb3Var.j.getText()));
            fb3 fb3Var3 = VahanWithdraw.this.binding;
            if (fb3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var3 = null;
            }
            intent.putExtra("chassisNo", String.valueOf(fb3Var3.k.getText()));
            intent.putExtra("engineNo", VahanWithdraw.this.engineNo);
            fb3 fb3Var4 = VahanWithdraw.this.binding;
            if (fb3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fb3Var2 = fb3Var4;
            }
            intent.putExtra("regNo", String.valueOf(fb3Var2.l.getText()));
            intent.putExtra("mobileNo", VahanWithdraw.this.mobileNoValue);
            intent.putExtra("otp", sendOtpResult.getRecordId());
            intent.putExtra("ownerName", VahanWithdraw.this.ownerName);
            intent.putExtra("stateCd", VahanWithdraw.this.stateCd);
            VahanWithdraw.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
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
            if (VahanWithdraw.this.B1().isShowing()) {
                VahanWithdraw.this.B1().dismiss();
            }
            if (str.equals("Error")) {
                VahanWithdraw.this.L1("Unable to send the OTP, Please try after some times!");
            } else {
                VahanWithdraw.this.L1(str);
            }
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

    private final void C1() {
        fb3 fb3Var = this.binding;
        fb3 fb3Var2 = null;
        if (fb3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var = null;
        }
        fb3Var.c.i.setText(A1().b("label_dispose_applicationl", "Dispose Application"));
        ApplicationService applicationService = this.retrofitService;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        fb3 fb3Var3 = this.binding;
        if (fb3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var3 = null;
        }
        fb3Var3.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdraw.D1(this.a, view);
            }
        });
        fb3 fb3Var4 = this.binding;
        if (fb3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var4 = null;
        }
        fb3Var4.c.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdraw.E1(this.a, view);
            }
        });
        fb3 fb3Var5 = this.binding;
        if (fb3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var5 = null;
        }
        fb3Var5.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ll7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdraw.F1(this.a, view);
            }
        });
        fb3 fb3Var6 = this.binding;
        if (fb3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var6 = null;
        }
        fb3Var6.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ml7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdraw.G1(this.a, view);
            }
        });
        fb3 fb3Var7 = this.binding;
        if (fb3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var7 = null;
        }
        fb3Var7.l.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        fb3 fb3Var8 = this.binding;
        if (fb3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var8 = null;
        }
        fb3Var8.l.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        fb3 fb3Var9 = this.binding;
        if (fb3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var9 = null;
        }
        fb3Var9.j.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        fb3 fb3Var10 = this.binding;
        if (fb3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fb3Var2 = fb3Var10;
        }
        fb3Var2.j.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static final void D1(VahanWithdraw this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    public static final void E1(VahanWithdraw this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(VahanWithdraw this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.O1()) {
            this$0.z1();
        }
    }

    public static final void G1(VahanWithdraw this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void H1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText(A1().b("btn_ok", getString(R.string.ok_text)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdraw.M1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.il7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdraw.N1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean O1() {
        fb3 fb3Var = this.binding;
        fb3 fb3Var2 = null;
        if (fb3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var = null;
        }
        Editable text = fb3Var.j.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            fb3 fb3Var3 = this.binding;
            if (fb3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var3 = null;
            }
            fb3Var3.j.setError(A1().b("PLEASE_ENTER_APPLICATION", getString(R.string.please_enter_valid_app_no)));
            fb3 fb3Var4 = this.binding;
            if (fb3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fb3Var2 = fb3Var4;
            }
            fb3Var2.j.requestFocus();
            return false;
        }
        fb3 fb3Var5 = this.binding;
        if (fb3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var5 = null;
        }
        Editable text2 = fb3Var5.l.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() == 0) {
            fb3 fb3Var6 = this.binding;
            if (fb3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var6 = null;
            }
            fb3Var6.l.setError(A1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no)));
            fb3 fb3Var7 = this.binding;
            if (fb3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fb3Var2 = fb3Var7;
            }
            fb3Var2.l.requestFocus();
            return false;
        }
        fb3 fb3Var8 = this.binding;
        if (fb3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var8 = null;
        }
        Editable text3 = fb3Var8.l.getText();
        Intrinsics.checkNotNull(text3);
        if (text3.length() < 4) {
            fb3 fb3Var9 = this.binding;
            if (fb3Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var9 = null;
            }
            fb3Var9.l.setError(A1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no)));
            fb3 fb3Var10 = this.binding;
            if (fb3Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fb3Var2 = fb3Var10;
            }
            fb3Var2.l.requestFocus();
            return false;
        }
        fb3 fb3Var11 = this.binding;
        if (fb3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var11 = null;
        }
        Editable text4 = fb3Var11.k.getText();
        Intrinsics.checkNotNull(text4);
        if (text4.length() == 0) {
            fb3 fb3Var12 = this.binding;
            if (fb3Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var12 = null;
            }
            fb3Var12.k.setError(A1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no)));
            fb3 fb3Var13 = this.binding;
            if (fb3Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fb3Var2 = fb3Var13;
            }
            fb3Var2.k.requestFocus();
            return false;
        }
        fb3 fb3Var14 = this.binding;
        if (fb3Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var14 = null;
        }
        if (String.valueOf(fb3Var14.k.getText()).length() >= 5) {
            return true;
        }
        fb3 fb3Var15 = this.binding;
        if (fb3Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var15 = null;
        }
        fb3Var15.k.setError(A1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no)));
        fb3 fb3Var16 = this.binding;
        if (fb3Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fb3Var2 = fb3Var16;
        }
        fb3Var2.k.requestFocus();
        return false;
    }

    public final wa3 A1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void I1(String mobileNo) {
        try {
            if (B1().isShowing()) {
                B1().dismiss();
            }
            B1().show();
            ws6 ws6Var = new ws6(this);
            jv jvVar = this.viewModel;
            if (jvVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                jvVar = null;
            }
            jvVar.q(this, mobileNo, ws6Var.k());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void K1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_application_vehicle_services);
        fb3 fb3VarC = fb3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fb3VarC, "inflate(...)");
        this.binding = fb3VarC;
        jv jvVar = null;
        if (fb3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3VarC = null;
        }
        setContentView(fb3VarC.b());
        ta3.a aVar = ta3.a;
        fb3 fb3Var = this.binding;
        if (fb3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fb3Var = null;
        }
        aVar.f2(this, fb3Var);
        J1(new wa3(this));
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        K1(new ProgressDialog(this));
        B1().setMessage(A1().b("label_challan_please_wait", "Please wait..."));
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        C1();
        jv jvVar2 = this.viewModel;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar2 = null;
        }
        jvVar2.l().g(this, new e(new a()));
        jv jvVar3 = this.viewModel;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar3 = null;
        }
        jvVar3.i().g(this, new e(new b()));
        jv jvVar4 = this.viewModel;
        if (jvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar4 = null;
        }
        jvVar4.k().g(this, new e(new c()));
        jv jvVar5 = this.viewModel;
        if (jvVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            jvVar = jvVar5;
        }
        jvVar.j().g(this, new e(new d()));
    }

    public final void z1() {
        try {
            if (B1().isShowing()) {
                B1().dismiss();
            }
            B1().show();
            jv jvVar = this.viewModel;
            fb3 fb3Var = null;
            if (jvVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                jvVar = null;
            }
            fb3 fb3Var2 = this.binding;
            if (fb3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var2 = null;
            }
            String strValueOf = String.valueOf(fb3Var2.l.getText());
            fb3 fb3Var3 = this.binding;
            if (fb3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fb3Var3 = null;
            }
            String strValueOf2 = String.valueOf(fb3Var3.j.getText());
            fb3 fb3Var4 = this.binding;
            if (fb3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fb3Var = fb3Var4;
            }
            jvVar.h(this, strValueOf, strValueOf2, String.valueOf(fb3Var.k.getText()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
