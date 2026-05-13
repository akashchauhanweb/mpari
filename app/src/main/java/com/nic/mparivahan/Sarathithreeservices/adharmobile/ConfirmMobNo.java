package com.nic.mparivahan.sarathithreeservices.adharmobile;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.sarathithreeservices.adharmobile.ConfirmMobNo;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.o8;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.vm1;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.Serializable;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bg\u0010hJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010:\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u00101\u001a\u0004\bP\u00103\"\u0004\bQ\u00105R\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lcom/nic/mparivahan/sarathithreeservices/adharmobile/ConfirmMobNo;", "Lcom/zepto/o40;", "", "O1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "U1", "Landroid/content/Context;", "context", "S1", "V1", "fdate", "D1", "E1", "Lcom/zepto/o8;", "F", "Lcom/zepto/o8;", "F1", "()Lcom/zepto/o8;", "X1", "(Lcom/zepto/o8;)V", "binding", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "N1", "()Lcom/zepto/wl5;", "e2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "J1", "()Lcom/zepto/wa3;", "a2", "(Lcom/zepto/wa3;)V", "langSession", "I", "Landroid/content/Context;", "K1", "()Landroid/content/Context;", "b2", "(Landroid/content/Context;)V", "mContext", "J", "Ljava/lang/String;", "H1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "K", "getDob", "setDob", "dob", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "L", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "G1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "Y1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Lcom/zepto/vm1;", "M", "Lcom/zepto/vm1;", "updateMobVm", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "N", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "M1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "d2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "O", "getAadhaarLastFourDigitMobileNo", "setAadhaarLastFourDigitMobileNo", "aadhaarLastFourDigitMobileNo", "Lcom/zepto/nr1;", "P", "Lcom/zepto/nr1;", "I1", "()Lcom/zepto/nr1;", "Z1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Landroid/app/ProgressDialog;", "Q", "Landroid/app/ProgressDialog;", "L1", "()Landroid/app/ProgressDialog;", "c2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "R", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ConfirmMobNo extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public o8 binding;

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
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public DOEkycX adharData;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            Log.d("dlService_Livedata", dLServiceResponseModleV1.toString());
            ConfirmMobNo.this.L1().dismiss();
            try {
                ConfirmMobNo.this.Y1(dLServiceResponseModleV1.getDldetobj().get(0));
                ConfirmMobNo.this.N1().s(StringsKt__StringsKt.trim((CharSequence) ConfirmMobNo.this.G1().getBioObj().getBioMobileNo()).toString());
                ConfirmMobNo.this.finish();
            } catch (Exception unused) {
                ConfirmMobNo.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DLServiceResponseModleV1) obj);
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
            ConfirmMobNo.this.L1().dismiss();
            Log.e("dlService_LivedataError", str.toString());
            ConfirmMobNo.this.finish();
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
                ConfirmMobNo.this.F1().I.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null && errno.intValue() == 1) {
                    ConfirmMobNo.this.N1().r("U");
                    String dlNo = ConfirmMobNo.this.getDlNo();
                    if (dlNo == null || dlNo.length() == 0) {
                        ConfirmMobNo confirmMobNo = ConfirmMobNo.this;
                        confirmMobNo.V1(confirmMobNo, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                    } else {
                        ConfirmMobNo confirmMobNo2 = ConfirmMobNo.this;
                        confirmMobNo2.V1(confirmMobNo2, "Mobile Number is successfully updated for DL No. :\n" + ConfirmMobNo.this.getDlNo());
                    }
                } else {
                    String errmsg = dlUpdateMobResponse.getErrmsg();
                    if (errmsg != null) {
                        ConfirmMobNo.this.U1(errmsg);
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
            ConfirmMobNo.this.finish();
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

    public static final void P1(ConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q1(ConfirmMobNo this$0, View view) {
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
                this$0.S1(this$0.K1(), this$0.J1().b("label_mb", "Please enter the mobile number"));
                return;
            }
            Editable text2 = this$0.F1().D.getText();
            Intrinsics.checkNotNull(text2);
            if (text2.length() < 10) {
                this$0.S1(this$0.K1(), this$0.J1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            mt6.a aVar = mt6.a;
            if (!aVar.t(this$0.F1().D.getText().toString())) {
                this$0.S1(this$0.K1(), this$0.J1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            Editable text3 = this$0.F1().y.getText();
            Intrinsics.checkNotNull(text3);
            if (text3.length() == 0) {
                this$0.S1(this$0.K1(), this$0.J1().b("label_mb", "Please enter the mobile number"));
                return;
            }
            Editable text4 = this$0.F1().y.getText();
            Intrinsics.checkNotNull(text4);
            if (text4.length() < 10) {
                this$0.S1(this$0.K1(), this$0.J1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            if (!aVar.t(this$0.F1().y.getText().toString())) {
                this$0.S1(this$0.K1(), this$0.J1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                return;
            }
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) this$0.F1().D.getText().toString()).toString(), StringsKt__StringsKt.trim((CharSequence) this$0.F1().y.getText().toString()).toString())) {
                this$0.S1(this$0.K1(), this$0.J1().b("same_mobile_number", this$0.getString(R.string.same_mobile_number)));
                return;
            }
            DOEkycX dOEkycX = this$0.adharData;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            if (dOEkycX.getPhone() == 0 && !Intrinsics.areEqual(strSubstring, this$0.aadhaarLastFourDigitMobileNo)) {
                this$0.S1(this$0.K1(), this$0.J1().b("adhar_same_mobile_number", this$0.getString(R.string.same_mobile_no)));
                return;
            }
            Editable text5 = this$0.F1().H.getText();
            Intrinsics.checkNotNull(text5);
            if (text5.length() == 0) {
                this$0.S1(this$0.K1(), this$0.J1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
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
            String bioDob = this$0.G1().getBioObj().getBioDob();
            Intrinsics.checkNotNull(bioDob);
            String strE1 = this$0.E1(bioDob);
            String str = this$0.dlNo;
            Intrinsics.checkNotNull(str);
            vm1Var.k(strE1, "DL", "0", true, str, string);
            StringBuilder sb = new StringBuilder();
            String bioDob2 = this$0.G1().getBioObj().getBioDob();
            Intrinsics.checkNotNull(bioDob2);
            sb.append(bioDob2);
            sb.append('\n');
            String str2 = this$0.dlNo;
            Intrinsics.checkNotNull(str2);
            sb.append(str2);
            sb.append('\n');
            sb.append(string);
            Log.d("updateMobile", sb.toString());
        } catch (Exception unused) {
        }
    }

    public static final void R1(ConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void W1(ProgressBar pb_otp, ConfirmMobNo this$0, Dialog dialogMsg, View view) {
        Intrinsics.checkNotNullParameter(pb_otp, "$pb_otp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialogMsg, "$dialogMsg");
        try {
            pb_otp.setVisibility(0);
            if (Intrinsics.areEqual(this$0.N1().b(), "204")) {
                Toast.makeText(this$0.getApplicationContext(), this$0.J1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
                Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
                intent.setFlags(67141632);
                this$0.startActivity(intent);
                this$0.finish();
            } else {
                dialogMsg.dismiss();
                this$0.L1().show();
                nr1 nr1VarI1 = this$0.I1();
                String str = this$0.dlNo;
                String str2 = this$0.dob;
                Intrinsics.checkNotNull(str2);
                nr1VarI1.k(this$0, str, this$0.D1(str2));
            }
        } catch (Exception unused) {
        }
    }

    public final String D1(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
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

    public final String E1(String fdate) {
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

    public final o8 F1() {
        o8 o8Var = this.binding;
        if (o8Var != null) {
            return o8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DldetobjX G1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    public final nr1 I1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final wa3 J1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final Context K1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog L1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt M1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 N1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void O1() {
        I1().o().g(this, new e(new a()));
        I1().p().g(this, new e(new b()));
    }

    public final void S1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(J1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(J1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ew0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmMobNo.T1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void U1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = J1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = J1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new d(), 16, null);
    }

    public final void V1(Context context, String message) {
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
        ((TextView) viewFindViewById4).setText(J1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(J1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmMobNo.W1(progressBar, this, dialog, view);
            }
        });
        dialog.show();
    }

    public final void X1(o8 o8Var) {
        Intrinsics.checkNotNullParameter(o8Var, "<set-?>");
        this.binding = o8Var;
    }

    public final void Y1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void Z1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void a2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void b2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void c2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void d2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void e2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o8 o8VarX = o8.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o8VarX, "inflate(...)");
        X1(o8VarX);
        setContentView(F1().m());
        b2(this);
        a2(new wa3(K1()));
        e2(new wl5(K1()));
        ta3.a.p1(K1(), F1());
        c2(new ProgressDialog(this));
        L1().setMessage(J1().b("label_challan_please_wait", getString(R.string.please_wait)));
        L1().setCancelable(false);
        L1().setCanceledOnTouchOutside(false);
        d2(DlServiceInt.INSTANCE.a(this));
        Z1((nr1) new z(this, new rq1(new lr1(M1(), this))).a(nr1.class));
        O1();
        F1().S.g.setText(J1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        F1().S.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmMobNo.P1(this.a, view);
            }
        });
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("aadharData");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
            this.adharData = (DOEkycX) serializableExtra;
            Serializable serializableExtra2 = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            Y1((DldetobjX) serializableExtra2);
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
        F1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmMobNo.Q1(this.a, view);
            }
        });
        F1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmMobNo.R1(this.a, view);
            }
        });
    }
}
