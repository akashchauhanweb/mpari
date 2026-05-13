package com.nic.mparivahan.Echallan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.Echallan.NewChallanLessDetails;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.PaymentSearchChallanDetails;
import com.nic.mparivahan.Echallan.SearchChallanDetails;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.GenerateUserVerify;
import com.nic.mparivahan.VahanServices.VahanModel.Vahangenotp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.v44;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yy0;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bn\u0010oJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0007J\b\u0010\u0014\u001a\u00020\u0002H\u0007R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010F\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R\"\u0010J\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u00103\"\u0004\bI\u00105R\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010L\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR\"\u0010Y\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010L\u001a\u0004\bW\u0010N\"\u0004\bX\u0010PR\"\u0010]\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR\"\u0010a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010L\u001a\u0004\b_\u0010N\"\u0004\b`\u0010PR$\u0010i\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/NewChallanLessDetails;", "Lcom/zepto/pq;", "", "F1", "J1", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "selectedChallan", "S1", "", "message", "N1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "challanNo", "w1", "Landroid/content/Context;", "context", "developermess", "V1", "K1", "Lcom/zepto/v44;", "C", "Lcom/zepto/v44;", "binding", "D", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "C1", "()Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "setSelectedChallan", "(Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;)V", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "E", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "F", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/ld7;", "G", "Lcom/zepto/ld7;", "getViewModelAddMob", "()Lcom/zepto/ld7;", "T1", "(Lcom/zepto/ld7;)V", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "H", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceAddMob", "Lcom/zepto/ws6;", "I", "Lcom/zepto/ws6;", "D1", "()Lcom/zepto/ws6;", "R1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "session", "K", "E1", "U1", "viewModelv1", "L", "A1", "P1", "proservice", "M", "Ljava/lang/String;", "getRecordId", "()Ljava/lang/String;", "setRecordId", "(Ljava/lang/String;)V", "recordId", "N", "getMobileNo", "setMobileNo", "mobileNo", "O", "z1", "setFromActivity", "fromActivity", "P", "getInputType", "setInputType", "inputType", "Q", "x1", "setChassisNo", "chassisNo", "Landroid/app/Dialog;", "R", "Landroid/app/Dialog;", "y1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "Landroid/app/ProgressDialog;", "S", "Landroid/app/ProgressDialog;", "progressDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewChallanLessDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public v44 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ChallanListResultModal selectedChallan;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService proservice;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String recordId = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String fromActivity = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ProgressDialog progressDialog;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(SearchChallanModel searchChallanModel) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = NewChallanLessDetails.this.progressDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (searchChallanModel.getStatus() != 200) {
                    NewChallanLessDetails.this.N1(searchChallanModel.getMessage());
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(NewChallanLessDetails.this.getFromActivity(), "verifyPaymentActivity", true)) {
                    if (searchChallanModel.getResult().get(0).getPaymentEligible() != 0) {
                        NewChallanLessDetails newChallanLessDetails = NewChallanLessDetails.this;
                        newChallanLessDetails.N1(newChallanLessDetails.getString(R.string.no_transcation_found));
                        return;
                    }
                    Intent intent = new Intent(NewChallanLessDetails.this, (Class<?>) VerifyPaymentChallanDetails.class);
                    intent.putExtra("selectedData", searchChallanModel.getResult().get(0));
                    ChallanListResultModal selectedChallan = NewChallanLessDetails.this.getSelectedChallan();
                    intent.putExtra("CHALLAN_PLACE", selectedChallan != null ? selectedChallan.getChallanPlace() : null);
                    intent.putExtra("inputchassisno", NewChallanLessDetails.this.getChassisNo());
                    ChallanListResultModal selectedChallan2 = NewChallanLessDetails.this.getSelectedChallan();
                    intent.putExtra("DL_NO", selectedChallan2 != null ? selectedChallan2.getDlNo() : null);
                    intent.putExtra("inputType", "Challan");
                    NewChallanLessDetails.this.startActivity(intent);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(NewChallanLessDetails.this.getFromActivity(), "paymentChallan", true)) {
                    if (searchChallanModel.getResult().size() > 0) {
                        Intent intent2 = new Intent(NewChallanLessDetails.this, (Class<?>) PaymentSearchChallanDetails.class);
                        ChallanListResultModal selectedChallan3 = NewChallanLessDetails.this.getSelectedChallan();
                        intent2.putExtra("challanNo", selectedChallan3 != null ? selectedChallan3.getChallanNo() : null);
                        ChallanListResultModal selectedChallan4 = NewChallanLessDetails.this.getSelectedChallan();
                        intent2.putExtra("DL_NO", selectedChallan4 != null ? selectedChallan4.getDlNo() : null);
                        ChallanListResultModal selectedChallan5 = NewChallanLessDetails.this.getSelectedChallan();
                        intent2.putExtra("CHALLAN_PLACE", selectedChallan5 != null ? selectedChallan5.getChallanPlace() : null);
                        intent2.putExtra("inputchassisno", NewChallanLessDetails.this.getChassisNo());
                        intent2.putExtra("inputType", "Challan");
                        intent2.putExtra("selectedData", searchChallanModel.getResult().get(0));
                        NewChallanLessDetails.this.startActivity(intent2);
                        return;
                    }
                    if (kt6.d(searchChallanModel.getMessage())) {
                        NewChallanLessDetails.this.N1(searchChallanModel.getMessage());
                        return;
                    }
                    NewChallanLessDetails newChallanLessDetails2 = NewChallanLessDetails.this;
                    wa3 wa3Var = newChallanLessDetails2.session;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var = null;
                    }
                    String strB = wa3Var.b("label_went_wrong", NewChallanLessDetails.this.getString(R.string.something_please_try_after_some_time));
                    Intrinsics.checkNotNull(strB);
                    newChallanLessDetails2.N1(strB);
                    return;
                }
                if (searchChallanModel.getResult().size() > 0) {
                    Intent intent3 = new Intent(NewChallanLessDetails.this, (Class<?>) SearchChallanDetails.class);
                    ChallanListResultModal selectedChallan6 = NewChallanLessDetails.this.getSelectedChallan();
                    intent3.putExtra("challanNo", selectedChallan6 != null ? selectedChallan6.getChallanNo() : null);
                    ChallanListResultModal selectedChallan7 = NewChallanLessDetails.this.getSelectedChallan();
                    intent3.putExtra("DL_NO", selectedChallan7 != null ? selectedChallan7.getDlNo() : null);
                    ChallanListResultModal selectedChallan8 = NewChallanLessDetails.this.getSelectedChallan();
                    intent3.putExtra("CHALLAN_PLACE", selectedChallan8 != null ? selectedChallan8.getChallanPlace() : null);
                    intent3.putExtra("selectedData", searchChallanModel.getResult().get(0));
                    intent3.putExtra("inputchassisno", NewChallanLessDetails.this.getChassisNo());
                    intent3.putExtra("inputType", "Challan");
                    NewChallanLessDetails.this.startActivity(intent3);
                    return;
                }
                if (kt6.d(searchChallanModel.getMessage())) {
                    NewChallanLessDetails.this.N1(searchChallanModel.getMessage());
                    return;
                }
                NewChallanLessDetails newChallanLessDetails3 = NewChallanLessDetails.this;
                wa3 wa3Var2 = newChallanLessDetails3.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var2 = null;
                }
                String strB2 = wa3Var2.b("label_went_wrong", NewChallanLessDetails.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB2);
                newChallanLessDetails3.N1(strB2);
            } catch (Exception unused) {
                ProgressDialog progressDialog4 = NewChallanLessDetails.this.progressDialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SearchChallanModel) obj);
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
            ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = NewChallanLessDetails.this.progressDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
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
        public final void a(Vahangenotp vahangenotp) {
            try {
                ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
                ProgressDialog progressDialog2 = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog3 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    } else {
                        progressDialog2 = progressDialog3;
                    }
                    progressDialog2.dismiss();
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    Toast.makeText(NewChallanLessDetails.this.getApplicationContext(), vahangenotp.getApiMessage().getDeveloperMessage(), 1).show();
                } else {
                    NewChallanLessDetails newChallanLessDetails = NewChallanLessDetails.this;
                    newChallanLessDetails.V1(newChallanLessDetails, String.valueOf(vahangenotp.getApiMessage().getDeveloperMessage()));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(NewChallanLessDetails.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
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
            try {
                ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
                ProgressDialog progressDialog2 = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog3 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    } else {
                        progressDialog2 = progressDialog3;
                    }
                    progressDialog2.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(NewChallanLessDetails.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(Vahangenotp vahangenotp) {
            try {
                ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
                wa3 wa3Var = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog2 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    NewChallanLessDetails.this.N1("Unable to send the OTP, Please try after some time");
                    return;
                }
                NewChallanLessDetails newChallanLessDetails = NewChallanLessDetails.this;
                wa3 wa3Var2 = newChallanLessDetails.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                newChallanLessDetails.N1(wa3Var.b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
            } catch (Exception e) {
                e.printStackTrace();
                NewChallanLessDetails.this.N1("Unable to send the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
                ProgressDialog progressDialog2 = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog3 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    } else {
                        progressDialog2 = progressDialog3;
                    }
                    progressDialog2.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            wa3 wa3Var = null;
            try {
                ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog2 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                }
                if (NewChallanLessDetails.this.getD() != null) {
                    Dialog d = NewChallanLessDetails.this.getD();
                    Intrinsics.checkNotNull(d);
                    d.dismiss();
                }
                Toast.makeText(NewChallanLessDetails.this, str, 0).show();
                NewChallanLessDetails newChallanLessDetails = NewChallanLessDetails.this;
                ChallanListResultModal selectedChallan = newChallanLessDetails.getSelectedChallan();
                Intrinsics.checkNotNull(selectedChallan);
                newChallanLessDetails.w1(selectedChallan.getChallanNo());
            } catch (Exception e) {
                ProgressDialog progressDialog3 = NewChallanLessDetails.this.progressDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog3 = null;
                }
                if (progressDialog3.isShowing()) {
                    ProgressDialog progressDialog4 = NewChallanLessDetails.this.progressDialog;
                    if (progressDialog4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                        progressDialog4 = null;
                    }
                    progressDialog4.dismiss();
                }
                e.printStackTrace();
                NewChallanLessDetails newChallanLessDetails2 = NewChallanLessDetails.this;
                wa3 wa3Var2 = newChallanLessDetails2.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                newChallanLessDetails2.N1(wa3Var.b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = NewChallanLessDetails.this.progressDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = NewChallanLessDetails.this.progressDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(str, "ERROR", true)) {
                NewChallanLessDetails.this.N1(str);
                return;
            }
            NewChallanLessDetails newChallanLessDetails = NewChallanLessDetails.this;
            wa3 wa3Var2 = newChallanLessDetails.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            newChallanLessDetails.N1(wa3Var.b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ wa3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, wa3 wa3Var, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = wa3Var;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class k extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ wa3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextView textView, wa3 wa3Var, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = wa3Var;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void F1() {
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        VahanProService.Companion companion = VahanProService.INSTANCE;
        P1(companion.a(this));
        SearchChallanService searchChallanService = this.retrofitService;
        v44 v44Var = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        Q1(companion.a(this));
        T1((ld7) new z(this, new kd7(new jd7(B1()))).a(ld7.class));
        U1((ld7) new z(this, new kd7(new jd7(A1()))).a(ld7.class));
        v44 v44Var2 = this.binding;
        if (v44Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var2 = null;
        }
        v44Var2.z.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.G1(this.a, view);
            }
        });
        v44 v44Var3 = this.binding;
        if (v44Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var3 = null;
        }
        v44Var3.z.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.H1(this.a, view);
            }
        });
        if (StringsKt__StringsJVMKt.equals(this.fromActivity, "verifyPaymentActivity", true)) {
            v44 v44Var4 = this.binding;
            if (v44Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var4 = null;
            }
            TextView textView = v44Var4.z.i;
            wa3 wa3Var = this.session;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var = null;
            }
            textView.setText(wa3Var.b("label_challan_verify_payment_status", getString(R.string.verify_challan_payment)));
        } else if (StringsKt__StringsJVMKt.equals(this.fromActivity, "paymentChallan", true)) {
            v44 v44Var5 = this.binding;
            if (v44Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var5 = null;
            }
            TextView textView2 = v44Var5.z.i;
            wa3 wa3Var2 = this.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var2 = null;
            }
            textView2.setText(wa3Var2.b("label_challan_payment_search", getString(R.string.online_challan_payment)));
        } else {
            v44 v44Var6 = this.binding;
            if (v44Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var6 = null;
            }
            TextView textView3 = v44Var6.z.i;
            wa3 wa3Var3 = this.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var3 = null;
            }
            textView3.setText(wa3Var3.b("label_challan_status", getString(R.string.challan1)));
        }
        v44 v44Var7 = this.binding;
        if (v44Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            v44Var = v44Var7;
        }
        v44Var.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.I1(this.a, view);
            }
        });
    }

    public static final void G1(NewChallanLessDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void H1(NewChallanLessDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1();
    }

    public static final void I1(NewChallanLessDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ChallanListResultModal challanListResultModal = this$0.selectedChallan;
        Intrinsics.checkNotNull(challanListResultModal);
        if (kt6.d(challanListResultModal.getDocNo())) {
            ChallanListResultModal challanListResultModal2 = this$0.selectedChallan;
            Intrinsics.checkNotNull(challanListResultModal2);
            String strSubstring = StringsKt__StringsKt.trim((CharSequence) challanListResultModal2.getDocNo()).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (Intrinsics.areEqual(strSubstring, "AP")) {
                ChallanListResultModal challanListResultModal3 = this$0.selectedChallan;
                Intrinsics.checkNotNull(challanListResultModal3);
                this$0.w1(challanListResultModal3.getChallanNo());
                return;
            }
        }
        if (kt6.d(this$0.inputType) && !Intrinsics.areEqual(this$0.inputType, "RC")) {
            this$0.K1();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("62");
        String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
        String str = this$0.chassisNo;
        v44 v44Var = this$0.binding;
        ProgressDialog progressDialog = null;
        if (v44Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var = null;
        }
        String string2 = v44Var.t.getText().toString();
        ChallanListResultModal challanListResultModal4 = this$0.selectedChallan;
        Intrinsics.checkNotNull(challanListResultModal4);
        GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", str, string, "No", " ", "", "", " ", true, arrayList, string2, challanListResultModal4.getStateCd(), this$0.D1().e(), "", this$0.D1().k());
        ProgressDialog progressDialog2 = this$0.progressDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
        } else {
            progressDialog = progressDialog2;
        }
        progressDialog.show();
        this$0.E1().B1(this$0, generateUserVerify);
    }

    private final void J1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void L1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void M1(EditText enteredChassisNo, NewChallanLessDetails this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(enteredChassisNo, "$enteredChassisNo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        ProgressDialog progressDialog = null;
        wa3 wa3Var = null;
        if (enteredChassisNo.getText().toString().length() < 5) {
            Context applicationContext = this$0.getApplicationContext();
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(applicationContext, wa3Var.b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."), 1).show();
            return;
        }
        d2.dismiss();
        this$0.chassisNo = enteredChassisNo.getText().toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add("62");
        String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
        String string2 = enteredChassisNo.getText().toString();
        v44 v44Var = this$0.binding;
        if (v44Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var = null;
        }
        String string3 = v44Var.t.getText().toString();
        ChallanListResultModal challanListResultModal = this$0.selectedChallan;
        String stateCd = challanListResultModal != null ? challanListResultModal.getStateCd() : null;
        Intrinsics.checkNotNull(stateCd);
        GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", string2, string, "No", " ", "", "", " ", true, arrayList, string3, stateCd, this$0.D1().e(), "", this$0.D1().k());
        ProgressDialog progressDialog2 = this$0.progressDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
        } else {
            progressDialog = progressDialog2;
        }
        progressDialog.show();
        this$0.E1().B1(this$0, generateUserVerify);
    }

    public static final void O1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void W1(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void X1(NewChallanLessDetails this$0, TextView time_text, wa3 langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        new k(time_text, langSession, context, resendOtp).start();
        ProgressDialog progressDialog = this$0.progressDialog;
        v44 v44Var = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog = null;
        }
        progressDialog.show();
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add("62");
        String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
        String str = this$0.chassisNo;
        v44 v44Var2 = this$0.binding;
        if (v44Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            v44Var = v44Var2;
        }
        String string2 = v44Var.t.getText().toString();
        ChallanListResultModal challanListResultModal = this$0.selectedChallan;
        Intrinsics.checkNotNull(challanListResultModal);
        this$0.E1().A1(this$0, new GenerateUserVerify(" ", "", str, string, "No", " ", "", "", " ", true, arrayList, string2, challanListResultModal.getStateCd(), this$0.D1().e(), "", this$0.D1().k()));
    }

    public static final void Y1(EditText enterOtp, Context context, wa3 langSession, NewChallanLessDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(context, langSession.b("label_log_entr_otp", context.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        if (string.length() < 4) {
            Toast.makeText(context, langSession.b("label_log_entr_val_otp", "Please enter the valid OTP"), 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.progressDialog;
        v44 v44Var = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog = null;
        }
        progressDialog.show();
        ws6 ws6Var = new ws6(this$0);
        ld7 ld7VarE1 = this$0.E1();
        v44 v44Var2 = this$0.binding;
        if (v44Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            v44Var = v44Var2;
        }
        String string2 = v44Var.t.getText().toString();
        ChallanListResultModal challanListResultModal = this$0.selectedChallan;
        Intrinsics.checkNotNull(challanListResultModal);
        ld7VarE1.C1(this$0, "", string2, challanListResultModal.getStateCd(), "M", "62", string, "", ws6Var.k(), this$0.chassisNo);
    }

    public static final void Z1(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void a2(NewChallanLessDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final VahanProService A1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final VahanProService B1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final ChallanListResultModal getSelectedChallan() {
        return this.selectedChallan;
    }

    public final ws6 D1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ld7 E1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void K1() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_enter_chassis_no);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.tv_chassi_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.chassis_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.proceedBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.closeBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.M1(editText, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.L1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void N1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        wa3 wa3Var = this.session;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        textView2.setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var2 = wa3Var3;
        }
        textView.setText(wa3Var2.b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.O1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void P1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final void Q1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final void R1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void S1(ChallanListResultModal selectedChallan) {
        String accusedName;
        v44 v44Var = null;
        Boolean boolValueOf = (selectedChallan == null || (accusedName = selectedChallan.getAccusedName()) == null) ? null : Boolean.valueOf(accusedName.length() > 0);
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            v44 v44Var2 = this.binding;
            if (v44Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var2 = null;
            }
            v44Var2.c.setText(selectedChallan.getAccusedName());
        }
        if (selectedChallan.getDocNo().length() > 0) {
            v44 v44Var3 = this.binding;
            if (v44Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var3 = null;
            }
            v44Var3.t.setText(selectedChallan.getDocNo());
        }
        if (selectedChallan.getDlNo().length() > 7) {
            v44 v44Var4 = this.binding;
            if (v44Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var4 = null;
            }
            v44Var4.m.setText(selectedChallan.getDlNo());
        } else {
            v44 v44Var5 = this.binding;
            if (v44Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var5 = null;
            }
            v44Var5.k.setVisibility(8);
        }
        if (selectedChallan.getChallanNo().length() > 0) {
            v44 v44Var6 = this.binding;
            if (v44Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var6 = null;
            }
            v44Var6.j.setText(selectedChallan.getChallanNo());
        }
        if (selectedChallan.getChallanDateTime().length() > 0) {
            v44 v44Var7 = this.binding;
            if (v44Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var7 = null;
            }
            v44Var7.e.setText(com.nic.mparivahan.Echallan.a.a.a(selectedChallan.getChallanDateTime()));
        }
        if (selectedChallan.getStatus().length() > 0) {
            v44 v44Var8 = this.binding;
            if (v44Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var8 = null;
            }
            v44Var8.y.setText(selectedChallan.getStatus());
        }
        if (selectedChallan.getChallanPlace().length() > 0) {
            v44 v44Var9 = this.binding;
            if (v44Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                v44Var9 = null;
            }
            v44Var9.h.setText(selectedChallan.getChallanPlace());
        }
        String str = "";
        if (selectedChallan.getOffences().size() > 0) {
            int size = selectedChallan.getOffences().size();
            for (int i2 = 0; i2 < size; i2++) {
                str = i2 == 0 ? (i2 + 1) + ". " + selectedChallan.getOffences().get(i2).getOffenceName() : str + '\n' + (i2 + 1) + ". " + selectedChallan.getOffences().get(i2).getOffenceName();
            }
        }
        v44 v44Var10 = this.binding;
        if (v44Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var10 = null;
        }
        v44Var10.n.y(yy0.c(this, R.color.back_color));
        v44 v44Var11 = this.binding;
        if (v44Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var11 = null;
        }
        v44Var11.n.z(0);
        v44 v44Var12 = this.binding;
        if (v44Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var12 = null;
        }
        v44Var12.n.A("Read More");
        v44 v44Var13 = this.binding;
        if (v44Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var13 = null;
        }
        v44Var13.n.A("Read Less");
        v44 v44Var14 = this.binding;
        if (v44Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var14 = null;
        }
        v44Var14.n.x(500);
        v44 v44Var15 = this.binding;
        if (v44Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44Var15 = null;
        }
        v44Var15.n.setText(str);
        if (selectedChallan.getStateCd().length() > 0) {
            v44 v44Var16 = this.binding;
            if (v44Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                v44Var = v44Var16;
            }
            v44Var.w.setText(StringsKt__StringsKt.trim((CharSequence) VContant.INSTANCE.l(selectedChallan.getStateCd()).toString()).toString());
        }
    }

    public final void T1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final void U1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void V1(final Context context, String developermess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(developermess, "developermess");
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setContentView(R.layout.validateotp);
        }
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        ImageView imageView = dialog5 != null ? (ImageView) dialog5.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(imageView);
        Dialog dialog6 = this.d;
        TextView textView = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        Intrinsics.checkNotNull(textView);
        Dialog dialog7 = this.d;
        final ImageView imageView2 = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        Intrinsics.checkNotNull(imageView2);
        Dialog dialog8 = this.d;
        TextView textView2 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        Intrinsics.checkNotNull(textView2);
        Dialog dialog9 = this.d;
        final EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        Intrinsics.checkNotNull(editText);
        Dialog dialog10 = this.d;
        final TextView textView3 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        Intrinsics.checkNotNull(textView3);
        Dialog dialog11 = this.d;
        TextView textView4 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        Intrinsics.checkNotNull(textView4);
        Dialog dialog12 = this.d;
        TextView textView5 = dialog12 != null ? (TextView) dialog12.findViewById(R.id.disPlay_mobile) : null;
        Intrinsics.checkNotNull(textView5);
        Dialog dialog13 = this.d;
        TextView textView6 = dialog13 != null ? (TextView) dialog13.findViewById(R.id.enter_otp_txt) : null;
        Intrinsics.checkNotNull(textView6);
        Dialog dialog14 = this.d;
        TextView textView7 = dialog14 != null ? (TextView) dialog14.findViewById(R.id.disPlay) : null;
        Intrinsics.checkNotNull(textView7);
        Dialog dialog15 = this.d;
        Intrinsics.checkNotNull(dialog15 != null ? (TextView) dialog15.findViewById(R.id.otpdisplay) : null);
        final wa3 wa3Var = new wa3(context);
        textView6.setText(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView7.setText(wa3Var.b("otp_verification", context.getString(R.string.otp_verification)));
        textView2.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        textView4.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        textView.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
        editText.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView5.setText(wa3Var.b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
        new j(textView3, wa3Var, context, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.W1(editText, imageView2, view);
            }
        });
        final TextView textView8 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.X1(this.a, textView3, wa3Var, context, textView8, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.Y1(editText, context, wa3Var, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.Z1(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewChallanLessDetails.a2(this.a, view);
            }
        });
        Dialog dialog16 = this.d;
        if (dialog16 != null) {
            dialog16.show();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v44 v44VarC = v44.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(v44VarC, "inflate(...)");
        this.binding = v44VarC;
        fz1 fz1Var = null;
        if (v44VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            v44VarC = null;
        }
        setContentView(v44VarC.b());
        this.selectedChallan = (ChallanListResultModal) getIntent().getParcelableExtra("selectedData");
        if (getIntent().hasExtra("inputType")) {
            String stringExtra = getIntent().getStringExtra("inputType");
            Intrinsics.checkNotNull(stringExtra);
            this.inputType = stringExtra;
        }
        if (getIntent().hasExtra("inputchassisno")) {
            String stringExtra2 = getIntent().getStringExtra("inputchassisno");
            Intrinsics.checkNotNull(stringExtra2);
            this.chassisNo = stringExtra2;
        }
        String stringExtra3 = getIntent().getStringExtra("fromActivity");
        Intrinsics.checkNotNull(stringExtra3);
        this.fromActivity = stringExtra3;
        R1(new ws6(this));
        this.session = new wa3(this);
        this.d = new Dialog(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog = progressDialog;
        progressDialog.setMessage("Please wait");
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.progressDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        F1();
        S1(this.selectedChallan);
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.j().g(this, new i(new a()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var3;
        }
        fz1Var.g().g(this, new i(new b()));
        E1().i1().g(this, new i(new c()));
        E1().j1().g(this, new i(new d()));
        E1().g1().g(this, new i(new e()));
        E1().h1().g(this, new i(new f()));
        E1().e1().g(this, new i(new g()));
        E1().f1().g(this, new i(new h()));
    }

    public final void w1(String challanNo) {
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        try {
            ProgressDialog progressDialog = this.progressDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                progressDialog = null;
            }
            progressDialog.show();
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            ChallanListResultModal challanListResultModal = this.selectedChallan;
            String stateCd = challanListResultModal != null ? challanListResultModal.getStateCd() : null;
            Intrinsics.checkNotNull(stateCd);
            ChallanListResultModal challanListResultModal2 = this.selectedChallan;
            String docNo = challanListResultModal2 != null ? challanListResultModal2.getDocNo() : null;
            Intrinsics.checkNotNull(docNo);
            fz1Var.k(this, challanNo, "", "", stateCd, docNo, "62", this.chassisNo);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final String getChassisNo() {
        return this.chassisNo;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getFromActivity() {
        return this.fromActivity;
    }
}
