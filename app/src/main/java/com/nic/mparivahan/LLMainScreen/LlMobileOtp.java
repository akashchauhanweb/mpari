package com.nic.mparivahan.LLMainScreen;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.LLMainScreen.LlAdharMobUpdate.LlMobUpdateAdhar;
import com.nic.mparivahan.LLMainScreen.LlMobileOtp;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;
import com.nic.mparivahan.LLServices.UI.ChangeNameLL;
import com.nic.mparivahan.LLServices.UI.DuplicateLL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.ad;
import com.zepto.dg5;
import com.zepto.hz0;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010P\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010T\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010W\u001a\u0004\b^\u0010Y\"\u0004\b_\u0010[R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlMobileOtp;", "Lcom/zepto/pq;", "", "I1", "", "message", "Q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "mobile_no", "e2", "Lcom/zepto/ad;", "C", "Lcom/zepto/ad;", "mbBinding", "D", "Landroid/content/Context;", "A1", "()Landroid/content/Context;", "V1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "C1", "()Landroid/app/ProgressDialog;", "X1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "T1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "E1", "()Lcom/zepto/wl5;", "a2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/nr1;", "H", "Lcom/zepto/nr1;", "x1", "()Lcom/zepto/nr1;", "S1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "I", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "D1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "Z1", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/ws6;", "J", "Lcom/zepto/ws6;", "F1", "()Lcom/zepto/ws6;", "b2", "(Lcom/zepto/ws6;)V", "sessionManager", "K", "Ljava/lang/String;", "getRecord_id", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "record_id", "L", "B1", "W1", "mobNo", "Landroid/widget/TextView;", "M", "Landroid/widget/TextView;", "H1", "()Landroid/widget/TextView;", "d2", "(Landroid/widget/TextView;)V", "txt_reset", "N", "G1", "c2", "submitOtp", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "O", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "z1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "U1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlMobileOtp extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ad mbBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mobNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView submitOtp;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            ad adVar = null;
            if (s.length() < 9) {
                LlMobileOtp.this.W1("");
                ad adVar2 = LlMobileOtp.this.mbBinding;
                if (adVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                } else {
                    adVar = adVar2;
                }
                adVar.d.setAlpha(0.6f);
                return;
            }
            LlMobileOtp llMobileOtp = LlMobileOtp.this;
            ad adVar3 = llMobileOtp.mbBinding;
            if (adVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                adVar3 = null;
            }
            llMobileOtp.W1(String.valueOf(adVar3.i.getText()));
            ad adVar4 = LlMobileOtp.this.mbBinding;
            if (adVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            } else {
                adVar = adVar4;
            }
            adVar.d.setAlpha(1.0f);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SendOtpResult sendOtpResult) {
            LlMobileOtp.this.C1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    LlMobileOtp.this.Y1(String.valueOf(sendOtpResult.getRecordId()));
                    LlMobileOtp llMobileOtp = LlMobileOtp.this;
                    String mobNo = llMobileOtp.getMobNo();
                    Intrinsics.checkNotNull(mobNo);
                    llMobileOtp.e2(llMobileOtp, mobNo);
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(LlMobileOtp.this, sendOtpResult.getStatusDesc());
                } else {
                    LlMobileOtp.this.Q1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                LlMobileOtp llMobileOtp2 = LlMobileOtp.this;
                String strB = llMobileOtp2.y1().b("label_went_wrong", LlMobileOtp.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                llMobileOtp2.Q1(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
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

    public static final class d extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ LlMobileOtp b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextView textView, LlMobileOtp llMobileOtp, Ref.ObjectRef objectRef) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = llMobileOtp;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            ((TextView) this.c.element).setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Log.e("calling", "321");
            this.a.setText(this.b.y1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ((TextView) this.c.element).setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class e extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ LlMobileOtp b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextView textView, LlMobileOtp llMobileOtp, Ref.ObjectRef objectRef) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = llMobileOtp;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            ((TextView) this.c.element).setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.y1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ((TextView) this.c.element).setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void I1() {
        V1(this);
        T1(new wa3(A1()));
        b2(new ws6(A1()));
        a2(new wl5(A1()));
        ad adVar = this.mbBinding;
        ad adVar2 = null;
        if (adVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar = null;
        }
        adVar.h.g.setText(E1().k());
        ad adVar3 = this.mbBinding;
        if (adVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar3 = null;
        }
        adVar3.d.setAlpha(0.6f);
        X1(new ProgressDialog(A1()));
        C1().setMessage(y1().b("label_challan_please_wait", getString(R.string.please_wait)));
        C1().setCancelable(false);
        C1().setCanceledOnTouchOutside(false);
        Z1(DlServiceInt.INSTANCE.a(this));
        S1((nr1) new z(this, new rq1(new lr1(D1(), this))).a(nr1.class));
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            U1((FetchLlDetails) serializableExtra);
            ad adVar4 = this.mbBinding;
            if (adVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                adVar4 = null;
            }
            adVar4.c.setText(StringsKt__StringsKt.trim((CharSequence) z1().getLearningLicence()).toString());
            this.mobNo = StringsKt__StringsKt.trim((CharSequence) z1().getMobileNumber()).toString();
        } catch (Exception unused) {
        }
        try {
            ad adVar5 = this.mbBinding;
            if (adVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                adVar5 = null;
            }
            adVar5.h.g.setText(E1().k());
            ad adVar6 = this.mbBinding;
            if (adVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            } else {
                adVar2 = adVar6;
            }
            adVar2.h.f.setVisibility(8);
        } catch (Exception unused2) {
        }
    }

    public static final void J1(LlMobileOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void K1(LlMobileOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        ad adVar = this$0.mbBinding;
        ad adVar2 = null;
        if (adVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar = null;
        }
        if (!adVar.e.isChecked()) {
            this$0.Q1(this$0.y1().b("plz_accept_term_conditions", this$0.getString(R.string.pls_enter_term_conditions)));
            return;
        }
        ad adVar3 = this$0.mbBinding;
        if (adVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar3 = null;
        }
        if (String.valueOf(adVar3.i.getText()).length() < 10) {
            String strB = this$0.y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            Intrinsics.checkNotNull(strB);
            this$0.Q1(strB);
            return;
        }
        mt6.a aVar = mt6.a;
        ad adVar4 = this$0.mbBinding;
        if (adVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
        } else {
            adVar2 = adVar4;
        }
        if (!aVar.t(String.valueOf(adVar2.i.getText()))) {
            String strB2 = this$0.y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            Intrinsics.checkNotNull(strB2);
            this$0.Q1(strB2);
        } else {
            this$0.C1().show();
            nr1 nr1VarX1 = this$0.x1();
            String str = this$0.mobNo;
            Intrinsics.checkNotNull(str);
            nr1VarX1.F(this$0, str, this$0.F1().k());
        }
    }

    public static final void L1(LlMobileOtp this$0, OtpVerifyResult otpVerifyResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("sub", otpVerifyResult.toString());
        try {
            if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                this$0.Q1(otpVerifyResult.getStatusDesc());
                return;
            }
            if (Intrinsics.areEqual(this$0.E1().b(), "574")) {
                Intent intent = new Intent(this$0, (Class<?>) ChangeNameLL.class);
                intent.putExtra("LLDetails", this$0.z1());
                intent.putExtra("Mobile_no", this$0.mobNo);
                this$0.startActivity(intent);
                this$0.finish();
                return;
            }
            if (Intrinsics.areEqual(this$0.E1().b(), "504")) {
                Intent intent2 = new Intent(this$0, (Class<?>) ChangeAddressLL.class);
                intent2.putExtra("LLDetails", this$0.z1());
                intent2.putExtra("Mobile_no", this$0.mobNo);
                this$0.startActivity(intent2);
                this$0.finish();
                return;
            }
            if (Intrinsics.areEqual(this$0.E1().b(), "502")) {
                Intent intent3 = new Intent(this$0, (Class<?>) DuplicateLL.class);
                intent3.putExtra("LLDetails", this$0.z1());
                ad adVar = this$0.mbBinding;
                if (adVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                    adVar = null;
                }
                intent3.putExtra("Mobile_no", StringsKt__StringsKt.trim((CharSequence) String.valueOf(adVar.i.getText())).toString());
                this$0.startActivity(intent3);
                this$0.finish();
            }
        } catch (Exception unused) {
            String strB = this$0.y1().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            this$0.Q1(strB);
        }
    }

    public static final void M1(LlMobileOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ad adVar = this$0.mbBinding;
        ad adVar2 = null;
        if (adVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar = null;
        }
        adVar.i.setText("");
        ad adVar3 = this$0.mbBinding;
        if (adVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
        } else {
            adVar2 = adVar3;
        }
        adVar2.e.setChecked(false);
    }

    public static final void N1(LlMobileOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0.A1());
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + hz0.a.m() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LlMobileOtp.O1(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void O1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void P1(LlMobileOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        try {
            Intent intent = new Intent(this$0.A1(), (Class<?>) LlMobUpdateAdhar.class);
            intent.putExtra("LLDetails", this$0.z1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.R1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void f2(LlMobileOtp this$0, TextView time_text, Ref.ObjectRef resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.x1().D(this$0, String.valueOf(this$0.record_id));
        new e(time_text, this$0, resendOtp).start();
    }

    public static final void g2(LlMobileOtp this$0, EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.y1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.y1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        nr1 nr1VarX1 = this$0.x1();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarX1.G(this$0, string, str);
    }

    public static final void h2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void i2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void j2(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final Context A1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final String getMobNo() {
        return this.mobNo;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt D1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 E1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final ws6 F1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final TextView G1() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final TextView H1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void S1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void T1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void U1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void V1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void W1(String str) {
        this.mobNo = str;
    }

    public final void X1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Y1(String str) {
        this.record_id = str;
    }

    public final void Z1(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void a2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void b2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void c2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final void d2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.widget.TextView] */
    public final void e2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        objectRef.element = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        c2((TextView) viewFindViewById4);
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        d2((TextView) viewFindViewById7);
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(y1().b("otp_verification", getString(R.string.otp_verification)));
        G1().setText(y1().b("vahan_btn_submit", getString(R.string.submit)));
        H1().setText(y1().b("btn_reset", getString(R.string.reset)));
        ((TextView) objectRef.element).setText(y1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(y1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(y1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(y1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView2.setText(sb.toString());
            } else {
                textView2.setText(y1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView2.setText(y1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new d(textView, this, objectRef).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.j2(editText, imageView2, view);
            }
        });
        ((TextView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.f2(this.a, textView, objectRef, view);
            }
        });
        G1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.g2(this.a, editText, view);
            }
        });
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.h2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.i2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ad adVarC = ad.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(adVarC, "inflate(...)");
        this.mbBinding = adVarC;
        if (adVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVarC = null;
        }
        setContentView(adVarC.b());
        I1();
        ta3.a aVar = ta3.a;
        ad adVar = this.mbBinding;
        if (adVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar = null;
        }
        aVar.h1(this, adVar);
        ad adVar2 = this.mbBinding;
        if (adVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar2 = null;
        }
        adVar2.h.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ej3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.J1(this.a, view);
            }
        });
        ad adVar3 = this.mbBinding;
        if (adVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar3 = null;
        }
        adVar3.i.addTextChangedListener(new a());
        ad adVar4 = this.mbBinding;
        if (adVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar4 = null;
        }
        adVar4.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ij3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.K1(this.a, view);
            }
        });
        x1().u().g(this, new c(new b()));
        x1().E().g(this, new mf4() { // from class: com.zepto.jj3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlMobileOtp.L1(this.a, (OtpVerifyResult) obj);
            }
        });
        ad adVar5 = this.mbBinding;
        if (adVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar5 = null;
        }
        adVar5.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.M1(this.a, view);
            }
        });
        ad adVar6 = this.mbBinding;
        if (adVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar6 = null;
        }
        adVar6.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.N1(this.a, view);
            }
        });
        ad adVar7 = this.mbBinding;
        if (adVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar7 = null;
        }
        adVar7.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileOtp.P1(this.a, view);
            }
        });
        dg5.a.d("");
        String str = this.mobNo;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            ad adVar8 = this.mbBinding;
            if (adVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                adVar8 = null;
            }
            AppCompatEditText appCompatEditText = adVar8.i;
            String str2 = this.mobNo;
            Intrinsics.checkNotNull(str2);
            appCompatEditText.setText(StringsKt__StringsKt.trim((CharSequence) str2).toString());
        } catch (Exception unused) {
            ad adVar9 = this.mbBinding;
            if (adVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                adVar9 = null;
            }
            adVar9.i.setText((CharSequence) null);
        }
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        ad adVar = null;
        try {
            dg5.a aVar = dg5.a;
            if (aVar.b().length() > 8) {
                ad adVar2 = this.mbBinding;
                if (adVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                    adVar2 = null;
                }
                adVar2.i.setText(aVar.b());
                this.mobNo = StringsKt__StringsKt.trim((CharSequence) aVar.b()).toString();
            }
        } catch (Exception unused) {
        }
        ad adVar3 = this.mbBinding;
        if (adVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            adVar3 = null;
        }
        AppCompatEditText appCompatEditText = adVar3.i;
        ad adVar4 = this.mbBinding;
        if (adVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
        } else {
            adVar = adVar4;
        }
        appCompatEditText.setFocusable(String.valueOf(adVar.i.getText()).length() <= 8);
    }

    public final nr1 x1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails z1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }
}
