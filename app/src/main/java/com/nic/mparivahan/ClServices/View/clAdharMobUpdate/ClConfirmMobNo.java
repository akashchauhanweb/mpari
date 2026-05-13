package com.nic.mparivahan.ClServices.View.clAdharMobUpdate;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.GetClPojo;
import com.nic.mparivahan.ClServices.View.clAdharMobUpdate.ClConfirmMobNo;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.zepto.dg5;
import com.zepto.jl0;
import com.zepto.k7;
import com.zepto.kl0;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.sn0;
import com.zepto.vm1;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/clAdharMobUpdate/ClConfirmMobNo;", "Lcom/zepto/o40;", "", "M1", "", "fdate", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "message", "T1", "D1", "Q1", "S1", "Lcom/zepto/k7;", "F", "Lcom/zepto/k7;", "F1", "()Lcom/zepto/k7;", "V1", "(Lcom/zepto/k7;)V", "binding", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "L1", "()Lcom/zepto/wl5;", "b2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "G1", "()Lcom/zepto/wa3;", "W1", "(Lcom/zepto/wa3;)V", "langSession", "I", "Landroid/content/Context;", "J1", "()Landroid/content/Context;", "Z1", "(Landroid/content/Context;)V", "mContext", "J", "Ljava/lang/String;", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "K", "getDob", "setDob", "dob", "Lcom/zepto/vm1;", "L", "Lcom/zepto/vm1;", "updateMobVm", "M", "getAadhaarLastFourDigitMobileNo", "setAadhaarLastFourDigitMobileNo", "aadhaarLastFourDigitMobileNo", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "K1", "()Landroid/app/ProgressDialog;", "a2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/kl0;", "O", "Lcom/zepto/kl0;", "H1", "()Lcom/zepto/kl0;", "X1", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "P", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "I1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "Y1", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "Q", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClConfirmMobNo extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public k7 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public DOEkycX adharData;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetClPojo getClPojo) {
            ClConfirmMobNo.this.K1().dismiss();
            try {
                if (getClPojo.getCl_No().length() > 0) {
                    String string = StringsKt__StringsKt.trim((CharSequence) getClPojo.getMobile_No().toString()).toString();
                    dg5.a aVar = dg5.a;
                    aVar.c(StringsKt__StringsKt.trim((CharSequence) string).toString());
                    Log.d("dob_Call_000---", aVar.a());
                    ClConfirmMobNo.this.finish();
                }
            } catch (Exception unused) {
                ClConfirmMobNo.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetClPojo) obj);
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
            ClConfirmMobNo.this.K1().dismiss();
            ClConfirmMobNo.this.finish();
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
        public final void a(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                ClConfirmMobNo.this.F1().I.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null && errno.intValue() == 1) {
                    ClConfirmMobNo clConfirmMobNo = ClConfirmMobNo.this;
                    clConfirmMobNo.T1(clConfirmMobNo, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                } else {
                    String errmsg = dlUpdateMobResponse.getErrmsg();
                    if (errmsg != null) {
                        ClConfirmMobNo.this.S1(errmsg);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlUpdateMobResponse) obj);
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

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ClConfirmMobNo.this.finish();
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

    private final void M1() {
        H1().p().g(this, new e(new a()));
        H1().l().g(this, new e(new b()));
    }

    public static final void N1(ClConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void O1(ClConfirmMobNo this$0, View view) {
        String strSubstring;
        vm1 vm1Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1().D.getText().toString().length() > 8) {
            strSubstring = this$0.F1().D.getText().toString().substring(this$0.F1().D.getText().toString().length() - 4, this$0.F1().D.getText().toString().length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        try {
            Editable text = this$0.F1().D.getText();
            Intrinsics.checkNotNull(text);
            if (text.length() == 0) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_mb", "Please enter the mobile number"));
                return;
            }
            Editable text2 = this$0.F1().D.getText();
            Intrinsics.checkNotNull(text2);
            if (text2.length() < 10) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            mt6.a aVar = mt6.a;
            if (!aVar.t(this$0.F1().D.getText().toString())) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            Editable text3 = this$0.F1().y.getText();
            Intrinsics.checkNotNull(text3);
            if (text3.length() == 0) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_mb", "Please enter the mobile number"));
                return;
            }
            Editable text4 = this$0.F1().y.getText();
            Intrinsics.checkNotNull(text4);
            if (text4.length() < 10) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            if (!aVar.t(this$0.F1().y.getText().toString())) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) this$0.F1().D.getText().toString()).toString(), StringsKt__StringsKt.trim((CharSequence) this$0.F1().y.getText().toString()).toString())) {
                this$0.Q1(this$0.J1(), this$0.G1().b("same_mobile_number", this$0.getString(R.string.same_mobile_number)));
                return;
            }
            DOEkycX dOEkycX = this$0.adharData;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            if (dOEkycX.getPhone() == 0 && !Intrinsics.areEqual(strSubstring, this$0.aadhaarLastFourDigitMobileNo)) {
                this$0.Q1(this$0.J1(), this$0.G1().b("adhar_same_mobile_number", this$0.getString(R.string.same_mobile_no)));
                return;
            }
            Editable text5 = this$0.F1().H.getText();
            Intrinsics.checkNotNull(text5);
            if (text5.length() == 0) {
                this$0.Q1(this$0.J1(), this$0.G1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
                return;
            }
            this$0.F1().I.c(true);
            String string = StringsKt__StringsKt.trim((CharSequence) this$0.F1().D.getText().toString()).toString();
            vm1 vm1Var2 = this$0.updateMobVm;
            if (vm1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
                vm1Var = null;
            } else {
                vm1Var = vm1Var2;
            }
            String str = this$0.dob;
            Intrinsics.checkNotNull(str);
            String strD1 = this$0.D1(str);
            String str2 = this$0.dlNo;
            Intrinsics.checkNotNull(str2);
            vm1Var.k(strD1, "CL", "0", true, str2, string);
            StringBuilder sb = new StringBuilder();
            sb.append(this$0.dob);
            sb.append('\n');
            String str3 = this$0.dlNo;
            Intrinsics.checkNotNull(str3);
            sb.append(str3);
            sb.append('\n');
            sb.append(string);
            Log.d("updateMobile", sb.toString());
        } catch (Exception unused) {
        }
    }

    public static final void P1(ClConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void U1(ProgressBar pb_otp, ClConfirmMobNo this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(pb_otp, "$pb_otp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        pb_otp.setVisibility(0);
        if (Intrinsics.areEqual(this$0.L1().b(), "204")) {
            Toast.makeText(this$0.getApplicationContext(), this$0.G1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
            Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
            intent.setFlags(67141632);
            this$0.startActivity(intent);
            this$0.finish();
            return;
        }
        d2.dismiss();
        this$0.K1().show();
        String str = this$0.dob;
        Intrinsics.checkNotNull(str);
        Log.d("dob_Call", str);
        String str2 = this$0.dlNo;
        Intrinsics.checkNotNull(str2);
        String string = StringsKt__StringsKt.trim((CharSequence) str2).toString();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        String str3 = this$0.dob;
        Intrinsics.checkNotNull(str3);
        String strE1 = this$0.E1(str3);
        Charset charsetForName2 = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
        byte[] bytes2 = strE1.getBytes(charsetForName2);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
        kl0 kl0VarH1 = this$0.H1();
        Context contextJ1 = this$0.J1();
        Intrinsics.checkNotNull(strEncodeToString);
        Intrinsics.checkNotNull(strEncodeToString2);
        kl0VarH1.j(contextJ1, strEncodeToString, strEncodeToString2);
    }

    public final String D1(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return fdate;
        }
    }

    public final String E1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return fdate;
        }
    }

    public final k7 F1() {
        k7 k7Var = this.binding;
        if (k7Var != null) {
            return k7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 G1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final kl0 H1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter I1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final Context J1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog K1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 L1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void Q1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(G1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(G1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClConfirmMobNo.R1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void S1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = G1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = G1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new d(), 16, null);
    }

    public final void T1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_otp_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pb_otp);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ProgressBar");
        final ProgressBar progressBar = (ProgressBar) viewFindViewById3;
        progressBar.setVisibility(8);
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(G1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(G1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClConfirmMobNo.U1(progressBar, this, dialog, view);
            }
        });
        dialog.show();
    }

    public final void V1(k7 k7Var) {
        Intrinsics.checkNotNullParameter(k7Var, "<set-?>");
        this.binding = k7Var;
    }

    public final void W1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void X1(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void Y1(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void Z1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void a2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void b2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl_confirm_mob_no);
        k7 k7VarX = k7.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(k7VarX, "inflate(...)");
        V1(k7VarX);
        setContentView(F1().m());
        Z1(this);
        W1(new wa3(this));
        b2(new wl5(J1()));
        Y1(ClInter.INSTANCE.a(J1()));
        X1((kl0) new z(this, new sn0(new jl0(I1()))).a(kl0.class));
        a2(new ProgressDialog(this));
        K1().setMessage(G1().b("label_challan_please_wait", getString(R.string.please_wait)));
        K1().setCancelable(false);
        K1().setCanceledOnTouchOutside(false);
        F1().S.g.setText(G1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        F1().S.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClConfirmMobNo.N1(this.a, view);
            }
        });
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("aadharData");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
            this.adharData = (DOEkycX) serializableExtra;
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.aadhaarLastFourDigitMobileNo = String.valueOf(getIntent().getStringExtra("aadhaarLastFourDigitMobileNo"));
        } catch (Exception unused) {
        }
        vm1 vm1Var = (vm1) new z(this).a(vm1.class);
        this.updateMobVm = vm1Var;
        if (vm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
            vm1Var = null;
        }
        vm1Var.i().g(this, new e(new c()));
        F1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClConfirmMobNo.O1(this.a, view);
            }
        });
        F1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClConfirmMobNo.P1(this.a, view);
            }
        });
        M1();
    }
}
