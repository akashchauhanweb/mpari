package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransactionList;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.jd7;
import com.zepto.jv;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.te;
import com.zepto.uq4;
import com.zepto.yy0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010+\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0010R\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u0010R\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0010R\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010\u0010R\u0016\u0010W\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0010¨\u0006Z"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanVerifyPendingTransactionList;", "Lcom/zepto/pq;", "Lcom/zepto/uq4$b;", "", "w1", "z1", "", "it", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "position", "k", "C", "Ljava/lang/String;", "selectedTab", "D", "inputNo", "E", "chassisNo", "Lcom/zepto/jv;", "F", "Lcom/zepto/jv;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "A1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/PendingTransRegNoDataModel;", "Lkotlin/collections/ArrayList;", "I", "Ljava/util/ArrayList;", "valueList", "Lcom/zepto/uq4;", "J", "Lcom/zepto/uq4;", "adapter", "Lcom/zepto/te;", "K", "Lcom/zepto/te;", "binding", "L", "applNo", "Lcom/zepto/ld7;", "M", "Lcom/zepto/ld7;", "viewModelBeforePayment", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "N", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "retrofitServiceBeforePayment", "Lcom/zepto/al7;", "O", "Lcom/zepto/al7;", "getViewModelRcDetails", "()Lcom/zepto/al7;", "C1", "(Lcom/zepto/al7;)V", "viewModelRcDetails", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "P", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "B1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitServiceRcDetails", "Q", "paymentUrl", "R", "pur_code", "S", "stateCd", "T", "regNo", "U", "OffCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanVerifyPendingTransactionList extends pq implements uq4.b {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public uq4 adapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public te binding;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ld7 viewModelBeforePayment;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VahanProService retrofitServiceBeforePayment;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public al7 viewModelRcDetails;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public VahanServiceConnection retrofitServiceRcDetails;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String selectedTab = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputNo = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList valueList = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String paymentUrl = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String pur_code = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String regNo = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String OffCode = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("renderChckBtn", pendingTransTaxBreakUpModel.getRenderChckBtn());
                jSONObject.put("renderFeeTable", pendingTransTaxBreakUpModel.getRenderFeeTable());
                jSONObject.put("renderTaxTable", pendingTransTaxBreakUpModel.getRenderTaxTable());
                jSONObject.put("state_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getState_cd());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("applNo", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getApplNo());
                jSONObject2.put("finalTaxAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getFinalTaxAmount());
                jSONObject2.put("no_adv_units", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getNo_adv_units());
                jSONObject2.put("off_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getOff_cd());
                jSONObject2.put("pur_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getPur_cd());
                jSONObject2.put("regnNo", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getRegnNo());
                jSONObject2.put("state_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getState_cd());
                jSONObject2.put("taxPurcdDesc", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTaxPurcdDesc());
                jSONObject2.put("totalAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalAmount());
                jSONObject2.put("totalPaybaleInterest", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleInterest());
                jSONObject2.put("totalPaybalePenalty", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybalePenalty());
                jSONObject2.put("totalPaybaleTax", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax());
                jSONObject2.put("totalPaybaleTax1", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax1());
                jSONObject2.put("totalPaybaleTax2", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax2());
                jSONObject2.put("totalAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalAmount());
                VahanVerifyPendingTransactionList.this.regNo = pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getRegnNo();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("tax_pay_dobj", jSONArray);
                jv jvVar = VahanVerifyPendingTransactionList.this.viewModel;
                if (jvVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    jvVar = null;
                }
                jvVar.F(VahanVerifyPendingTransactionList.this, jSONObject);
            } catch (Exception e) {
                VahanVerifyPendingTransactionList.this.u1().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingTransTaxBreakUpModel) obj);
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
            if (VahanVerifyPendingTransactionList.this.u1().isShowing()) {
                VahanVerifyPendingTransactionList.this.u1().dismiss();
            }
            if (str.equals("Error")) {
                VahanVerifyPendingTransactionList.this.D1("Not able to verify payment from bank. Please try again later");
            } else {
                VahanVerifyPendingTransactionList.this.D1(str);
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(VahanPendingTransBankModel vahanPendingTransBankModel) {
            if (VahanVerifyPendingTransactionList.this.u1().isShowing()) {
                VahanVerifyPendingTransactionList.this.u1().dismiss();
            }
            VahanVerifyPendingTransactionList.this.paymentUrl = vahanPendingTransBankModel.getReturnUrl();
            if (StringsKt__StringsKt.contains$default((CharSequence) VahanVerifyPendingTransactionList.this.pur_code, (CharSequence) ".0", false, 2, (Object) null)) {
                String strSubstring = VahanVerifyPendingTransactionList.this.pur_code.substring(0, VahanVerifyPendingTransactionList.this.pur_code.length() - 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            } else {
                StringsKt__StringsKt.trim((CharSequence) VahanVerifyPendingTransactionList.this.pur_code).toString();
            }
            Intent intent = new Intent(VahanVerifyPendingTransactionList.this, (Class<?>) VahanPendingTransactionPaymentRe.class);
            intent.putExtra(VContant.APP_NO, VahanVerifyPendingTransactionList.this.applNo);
            intent.putExtra("rc_number", VahanVerifyPendingTransactionList.this.regNo);
            intent.putExtra(VContant.PURPOSE_CODE, VahanVerifyPendingTransactionList.this.pur_code);
            intent.putExtra("URL", VahanVerifyPendingTransactionList.this.paymentUrl);
            intent.putExtra("RC", VahanVerifyPendingTransactionList.this.regNo);
            VahanVerifyPendingTransactionList.this.startActivity(intent);
            VahanVerifyPendingTransactionList.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanPendingTransBankModel) obj);
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
            if (VahanVerifyPendingTransactionList.this.u1().isShowing()) {
                VahanVerifyPendingTransactionList.this.u1().dismiss();
            }
            if (str.equals("Error")) {
                VahanVerifyPendingTransactionList.this.D1("Not able to verify payment from bank. Please try again later");
            } else {
                VahanVerifyPendingTransactionList.this.D1(str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(String it) {
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
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransactionList.E1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransactionList.F1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void w1() {
        ApplicationService applicationService = this.retrofitService;
        te teVar = null;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        VahanProService vahanProService = this.retrofitServiceBeforePayment;
        if (vahanProService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceBeforePayment");
            vahanProService = null;
        }
        this.viewModelBeforePayment = (ld7) new z(this, new kd7(new jd7(vahanProService))).a(ld7.class);
        C1((al7) new z(this, new bl7(new bg7(v1()))).a(al7.class));
        te teVar2 = this.binding;
        if (teVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            teVar2 = null;
        }
        teVar2.b.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new uq4(this, this.valueList, this);
        te teVar3 = this.binding;
        if (teVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            teVar3 = null;
        }
        RecyclerView recyclerView = teVar3.b;
        uq4 uq4Var = this.adapter;
        if (uq4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            uq4Var = null;
        }
        recyclerView.setAdapter(uq4Var);
        te teVar4 = this.binding;
        if (teVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            teVar4 = null;
        }
        teVar4.c.i.setText("Verify Payment Status");
        te teVar5 = this.binding;
        if (teVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            teVar5 = null;
        }
        teVar5.c.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransactionList.x1(this.a, view);
            }
        });
        te teVar6 = this.binding;
        if (teVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            teVar = teVar6;
        }
        teVar.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransactionList.y1(this.a, view);
            }
        });
    }

    public static final void x1(VahanVerifyPendingTransactionList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void y1(VahanVerifyPendingTransactionList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1();
    }

    private final void z1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void B1(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitServiceRcDetails = vahanServiceConnection;
    }

    public final void C1(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModelRcDetails = al7Var;
    }

    @Override // com.zepto.uq4.b
    public void k(int position) {
        if (this.valueList.size() > 0) {
            this.applNo = ((PendingTransRegNoDataModel) this.valueList.get(position)).getTransactionID();
            this.pur_code = ((PendingTransRegNoDataModel) this.valueList.get(position)).getPurCD();
            this.stateCd = ((PendingTransRegNoDataModel) this.valueList.get(position)).getStateCD();
            this.regNo = ((PendingTransRegNoDataModel) this.valueList.get(position)).getRegnNo();
            this.OffCode = ((PendingTransRegNoDataModel) this.valueList.get(position)).getOffCD();
            String strValueOf = String.valueOf(((PendingTransRegNoDataModel) this.valueList.get(position)).getChassisNo());
            String strSubstring = strValueOf.substring(strValueOf.length() - 5, strValueOf.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.chassisNo = strSubstring;
            if (u1().isShowing()) {
                u1().dismiss();
            }
            u1().show();
            jv jvVar = this.viewModel;
            if (jvVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                jvVar = null;
            }
            jvVar.A(this, ((PendingTransRegNoDataModel) this.valueList.get(position)).getPurCD(), ((PendingTransRegNoDataModel) this.valueList.get(position)).getTransactionID(), ((PendingTransRegNoDataModel) this.valueList.get(position)).getOffCD(), ((PendingTransRegNoDataModel) this.valueList.get(position)).getStateCD(), ((PendingTransRegNoDataModel) this.valueList.get(position)).getRegnNo());
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_transaction_list);
        te teVarC = te.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(teVarC, "inflate(...)");
        this.binding = teVarC;
        jv jvVar = null;
        if (teVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            teVarC = null;
        }
        setContentView(teVarC.b());
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        this.retrofitServiceBeforePayment = VahanProService.INSTANCE.a(this);
        B1(VahanServiceConnection.INSTANCE.a(this));
        if (getIntent() != null) {
            if (getIntent().hasExtra("selectedTab")) {
                String stringExtra = getIntent().getStringExtra("selectedTab");
                Intrinsics.checkNotNull(stringExtra);
                this.selectedTab = stringExtra;
            }
            if (getIntent().hasExtra("inputNo")) {
                String stringExtra2 = getIntent().getStringExtra("inputNo");
                Intrinsics.checkNotNull(stringExtra2);
                this.inputNo = stringExtra2;
            }
            if (getIntent().hasExtra("chassisNo")) {
                String stringExtra3 = getIntent().getStringExtra("chassisNo");
                Intrinsics.checkNotNull(stringExtra3);
                this.chassisNo = stringExtra3;
            }
            if (getIntent().hasExtra("listValue")) {
                Type type = new TypeToken<ArrayList<PendingTransRegNoDataModel>>() { // from class: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransactionList$onCreate$type$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Object objFromJson = new Gson().fromJson(getIntent().getStringExtra("listValue"), type);
                Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel> }");
                this.valueList = (ArrayList) objFromJson;
            }
        }
        A1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        w1();
        jv jvVar2 = this.viewModel;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar2 = null;
        }
        jvVar2.z().g(this, new e(new a()));
        jv jvVar3 = this.viewModel;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar3 = null;
        }
        jvVar3.y().g(this, new e(new b()));
        jv jvVar4 = this.viewModel;
        if (jvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar4 = null;
        }
        jvVar4.C().g(this, new e(new c()));
        jv jvVar5 = this.viewModel;
        if (jvVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            jvVar = jvVar5;
        }
        jvVar.B().g(this, new e(new d()));
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final VahanServiceConnection v1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitServiceRcDetails;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceRcDetails");
        return null;
    }
}
