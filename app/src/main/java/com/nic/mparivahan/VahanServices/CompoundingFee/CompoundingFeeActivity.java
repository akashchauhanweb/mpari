package com.nic.mparivahan.VahanServices.CompoundingFee;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.ComPaymentTaxActivity;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.ApiMessage;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.BeforePayForCompoundFee;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.CompResponse;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.CompoundRequest;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundingFeeActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.as0;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n8;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.ur0;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.zr0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bg\u0010hJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010G\u001a\u0004\bV\u0010I\"\u0004\bW\u0010KR\"\u0010\\\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010G\u001a\u0004\bZ\u0010I\"\u0004\b[\u0010KR\"\u0010`\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010G\u001a\u0004\b^\u0010I\"\u0004\b_\u0010KR\"\u0010c\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundingFeeActivity;", "Lcom/zepto/pq;", "", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "y1", "()Lcom/zepto/ld7;", "R1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/zepto/as0;", "D", "Lcom/zepto/as0;", "q1", "()Lcom/zepto/as0;", "J1", "(Lcom/zepto/as0;)V", "compoundViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;", "F", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;", "r1", "()Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;", "K1", "(Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;)V", "feeService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "L1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/zepto/n8;", "I", "Lcom/zepto/n8;", "p1", "()Lcom/zepto/n8;", "I1", "(Lcom/zepto/n8;)V", "binding", "", "J", "Ljava/lang/String;", "v1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "L", "t1", "M1", "off_code", "M", "getAadhar_name", "H1", "aadhar_name", "N", "getAadhar_address", "G1", "aadhar_address", "O", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CompoundingFeeActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public as0 compoundViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public CompoundFeeServices feeService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public n8 binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isFaceless;

    public static final void A1(CompoundingFeeActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
    }

    public static final void B1(CompoundingFeeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1().l.getText().length() != 0) {
            try {
                this$0.u1().show();
                if (StringsKt__StringsJVMKt.equals(this$0.w1().getState_cd(), "DL", true)) {
                    Double dValueOf = Double.valueOf(Double.parseDouble(this$0.p1().l.getText().toString()));
                    String rc_off_cd = this$0.w1().getRc_off_cd();
                    Intrinsics.checkNotNull(rc_off_cd);
                    CompoundRequest compoundRequest = new CompoundRequest(" ", dValueOf, Integer.parseInt(rc_off_cd), Integer.parseInt(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE), this$0.v1(), "DL");
                    Gson gson = new Gson();
                    as0 as0VarQ1 = this$0.q1();
                    String json = gson.toJson(compoundRequest);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    as0VarQ1.h(json);
                } else {
                    Double dValueOf2 = Double.valueOf(Double.parseDouble(this$0.p1().l.getText().toString()));
                    String rc_off_cd2 = this$0.w1().getRc_off_cd();
                    Intrinsics.checkNotNull(rc_off_cd2);
                    CompoundRequest compoundRequest2 = new CompoundRequest(" ", dValueOf2, Integer.parseInt(rc_off_cd2), Integer.parseInt(VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE), this$0.v1(), "DL");
                    Gson gson2 = new Gson();
                    as0 as0VarQ12 = this$0.q1();
                    String json2 = gson2.toJson(compoundRequest2);
                    Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                    as0VarQ12.i(json2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final void C1(CompoundingFeeActivity this$0, CompResponse compResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Data data = compResponse.getData();
        if (!kt6.d(data != null ? data.getApplNo() : null)) {
            this$0.u1().dismiss();
            VUtility.Companion companion = VUtility.INSTANCE;
            ApiMessage apiMessage = compResponse.getApiMessage();
            companion.h(this$0, String.valueOf(apiMessage != null ? apiMessage.getMessage() : null));
            return;
        }
        String str = StringsKt__StringsJVMKt.equals(this$0.w1().getState_cd(), "DL", true) ? VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE : VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE;
        vh7 vh7Var = new vh7(this$0);
        if (this$0.p1().l.getText().length() > 0) {
            Gson gson = new Gson();
            Data data2 = compResponse.getData();
            Data dataCopy = data2 != null ? data2.copy(null, this$0.w1().getRc_off_cd(), str, this$0.v1(), "DL", String.valueOf((int) Double.parseDouble(this$0.p1().l.getText().toString())), null) : null;
            if (this$0.isFaceless) {
                Boolean bool = Boolean.FALSE;
                Data data3 = compResponse.getData();
                String strValueOf = String.valueOf(data3 != null ? data3.getApplNo() : null);
                String strT1 = this$0.t1();
                String strR = hz0.a.r();
                String strV1 = this$0.v1();
                String rc_vh_class_cd = this$0.w1().getRc_vh_class_cd();
                this$0.y1().y(this$0, gson.toJson(new BeforePayForCompoundFee("", bool, "A", strValueOf, null, 0, null, "", "", null, null, 0, "", 1, "", "", null, strT1, strR, "", "", str, "", "", 0, 0, strV1, "DL", "DL", "String", "", rc_vh_class_cd != null ? rc_vh_class_cd : null, null, null, null, null, null, null, vh7Var.a(), null, dataCopy, null, true, 0)).toString());
                return;
            }
            Boolean bool2 = Boolean.FALSE;
            Data data4 = compResponse.getData();
            String strValueOf2 = String.valueOf(data4 != null ? data4.getApplNo() : null);
            String strT12 = this$0.t1();
            String strR2 = hz0.a.r();
            String strV12 = this$0.v1();
            String rc_vh_class_cd2 = this$0.w1().getRc_vh_class_cd();
            this$0.y1().y(this$0, gson.toJson(new BeforePayForCompoundFee("", bool2, "M", strValueOf2, null, 0, null, "", "", null, null, 0, "", 1, "", "", null, strT12, strR2, "", "", str, "", "", 0, 0, strV12, "DL", "DL", "String", "", rc_vh_class_cd2 != null ? rc_vh_class_cd2 : null, null, null, null, null, null, null, "", null, dataCopy, null, true, 0)).toString());
        }
    }

    public static final void D1(CompoundingFeeActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
    }

    public static final void E1(CompoundingFeeActivity this$0, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl == null || returnUrl.length() == 0) {
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) ComPaymentTaxActivity.class);
            intent.putExtra("url", paymentBeforeUrlResponse.getReturnUrl());
            intent.putExtra("ServiceName", this$0.getString(R.string.compoundFee));
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void F1(CompoundingFeeActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
        if (str.equals("Error")) {
            VContant.INSTANCE.N(this$0, this$0.getString(R.string.service_unavable_please_try));
        } else {
            VContant.INSTANCE.N(this$0, str);
        }
    }

    public static final void z1(CompoundingFeeActivity this$0, FeesModle feesModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
        try {
            this$0.p1().f.setText(String.valueOf(feesModle.get(0).getFeeAmount()));
            this$0.p1().h.setText(String.valueOf(feesModle.get(0).getFineAmount()));
            this$0.p1().l.setText(String.valueOf(feesModle.get(0).getTotalAmount()));
            this$0.p1().j.setEnabled(true);
            this$0.p1().j.setAlpha(1.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void I1(n8 n8Var) {
        Intrinsics.checkNotNullParameter(n8Var, "<set-?>");
        this.binding = n8Var;
    }

    public final void J1(as0 as0Var) {
        Intrinsics.checkNotNullParameter(as0Var, "<set-?>");
        this.compoundViewModel = as0Var;
    }

    public final void K1(CompoundFeeServices compoundFeeServices) {
        Intrinsics.checkNotNullParameter(compoundFeeServices, "<set-?>");
        this.feeService = compoundFeeServices;
    }

    public final void L1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void P1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void Q1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void R1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compounding_fee2);
        n8 n8VarC = n8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(n8VarC, "inflate(...)");
        I1(n8VarC);
        setContentView(p1().b());
        Q1(VahanProService.INSTANCE.a(this));
        K1(CompoundFeeServices.INSTANCE.a(this));
        ta3.a.i0(this, p1());
        R1((ld7) new z(this, new kd7(new jd7(x1()))).a(ld7.class));
        J1((as0) new z(this, new ur0(new zr0(r1()))).a(as0.class));
        L1(new wa3(this));
        M1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra);
        N1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        p1().e.i.setText(s1().b("comp_FeePayment", getString(R.string.compoundFee)));
        p1().o.setText(s1().b("vehicle_no", "Vehicle No.:") + ' ' + v1());
        p1().p.setText(s1().b("view_vehicle_details", "View Vehicle Details"));
        p1().p.setPaintFlags(p1().p.getPaintFlags() | 8);
        try {
            u1().show();
            p1().j.setEnabled(false);
            p1().j.setAlpha(0.5f);
            if (StringsKt__StringsJVMKt.equals(String.valueOf(w1().getState_cd()), "DL", true)) {
                y1().t1(this, v1(), String.valueOf(w1().getState_cd()), StringsKt__StringsKt.trim((CharSequence) VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE).toString());
            } else {
                y1().t1(this, v1(), String.valueOf(w1().getState_cd()), StringsKt__StringsKt.trim((CharSequence) VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE).toString());
            }
        } catch (Exception unused) {
        }
        y1().T().g(this, new mf4() { // from class: com.zepto.av0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CompoundingFeeActivity.z1(this.a, (FeesModle) obj);
            }
        });
        y1().U().g(this, new mf4() { // from class: com.zepto.bv0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CompoundingFeeActivity.A1(this.a, (String) obj);
            }
        });
        p1().j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cv0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompoundingFeeActivity.B1(this.a, view);
            }
        });
        q1().j().g(this, new mf4() { // from class: com.zepto.dv0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CompoundingFeeActivity.C1(this.a, (CompResponse) obj);
            }
        });
        q1().k().g(this, new mf4() { // from class: com.zepto.ev0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CompoundingFeeActivity.D1(this.a, (String) obj);
            }
        });
        y1().D0().g(this, new mf4() { // from class: com.zepto.fv0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CompoundingFeeActivity.E1(this.a, (PaymentBeforeUrlResponse) obj);
            }
        });
        y1().E0().g(this, new mf4() { // from class: com.zepto.gv0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CompoundingFeeActivity.F1(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final n8 p1() {
        n8 n8Var = this.binding;
        if (n8Var != null) {
            return n8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final as0 q1() {
        as0 as0Var = this.compoundViewModel;
        if (as0Var != null) {
            return as0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("compoundViewModel");
        return null;
    }

    public final CompoundFeeServices r1() {
        CompoundFeeServices compoundFeeServices = this.feeService;
        if (compoundFeeServices != null) {
            return compoundFeeServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("feeService");
        return null;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String t1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
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

    public final String v1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService x1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 y1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
