package com.nic.mparivahan.VahanServices.MiscellaneousFeePayment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.ComPaymentTaxActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.ApiMessage;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPResponseModel;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPService.MFPService;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePayReq;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.nd;
import com.zepto.po3;
import com.zepto.pq;
import com.zepto.qo3;
import com.zepto.ro3;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0006\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010G\u001a\u0004\bV\u0010I\"\u0004\bW\u0010KR\"\u0010\\\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010G\u001a\u0004\bZ\u0010I\"\u0004\b[\u0010KR\"\u0010`\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010G\u001a\u0004\b^\u0010I\"\u0004\b_\u0010KR\"\u0010g\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0016\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010r\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010\u0016\u001a\u0004\bp\u0010k\"\u0004\bq\u0010mR\"\u0010v\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010\u0016\u001a\u0004\bt\u0010k\"\u0004\bu\u0010m¨\u0006y"}, d2 = {"Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MiscellaneousFeePayment;", "Lcom/zepto/pq;", "", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/nd;", "C", "Lcom/zepto/nd;", "p1", "()Lcom/zepto/nd;", "K1", "(Lcom/zepto/nd;)V", "binding", "Lcom/zepto/ro3;", "D", "Lcom/zepto/ro3;", "u1", "()Lcom/zepto/ro3;", "P1", "(Lcom/zepto/ro3;)V", "mfpSaveToDraftViewModel", "Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPService/MFPService;", "E", "Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPService/MFPService;", "t1", "()Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPService/MFPService;", "O1", "(Lcom/nic/mparivahan/VahanServices/MiscellaneousFeePayment/MFPService/MFPService;)V", "mfpSaveToDraftService", "Lcom/zepto/ld7;", "F", "Lcom/zepto/ld7;", "B1", "()Lcom/zepto/ld7;", "W1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "R1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "I", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "U1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "", "J", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "S1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "T1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "L", "v1", "Q1", "off_code", "M", "o1", "J1", "aadhar_name", "N", "n1", "I1", "aadhar_address", "O", "Z", "C1", "()Z", "setFaceless", "(Z)V", "isFaceless", "", "P", "q1", "()D", "L1", "(D)V", "feeAmount", "Q", "r1", "M1", "fineAmount", "R", "A1", "V1", "totalAmount", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MiscellaneousFeePayment extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public nd binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ro3 mfpSaveToDraftViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public MFPService mfpSaveToDraftService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VahanProService retrofitService;

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

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public double feeAmount;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public double fineAmount;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public double totalAmount;

    public static final class a extends Lambda implements Function1 {
        public a() {
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
        public final void a(MFPResponseModel mFPResponseModel) {
            gd1.a aVar = gd1.a;
            Data data = mFPResponseModel.getData();
            if (aVar.m(data != null ? data.getApplNo() : null)) {
                MiscellaneousFeePayment.this.w1().dismiss();
                VContant.Companion companion = VContant.INSTANCE;
                MiscellaneousFeePayment miscellaneousFeePayment = MiscellaneousFeePayment.this;
                ApiMessage apiMessage = mFPResponseModel.getApiMessage();
                companion.N(miscellaneousFeePayment, apiMessage != null ? apiMessage.getDeveloperMessage() : null);
                return;
            }
            Data data2 = mFPResponseModel.getData();
            String applNo = data2 != null ? data2.getApplNo() : null;
            double d = Double.parseDouble(MiscellaneousFeePayment.this.p1().j.getText().toString());
            Data data3 = mFPResponseModel.getData();
            Integer offCd = data3 != null ? data3.getOffCd() : null;
            Intrinsics.checkNotNull(offCd);
            MFPRequestModel mFPRequestModel = new MFPRequestModel(applNo, d, offCd.intValue(), mFPResponseModel.getData().getPurCd(), String.valueOf(mFPResponseModel.getData().getRegnNo()), String.valueOf(mFPResponseModel.getData().getStateCd()));
            vh7 vh7Var = new vh7(MiscellaneousFeePayment.this);
            if (MiscellaneousFeePayment.this.getIsFaceless()) {
                Gson gson = new Gson();
                Data data4 = mFPResponseModel.getData();
                String strValueOf = String.valueOf(data4 != null ? data4.getApplNo() : null);
                String strV1 = MiscellaneousFeePayment.this.v1();
                String strR = hz0.a.r();
                String strX1 = MiscellaneousFeePayment.this.x1();
                String strValueOf2 = String.valueOf(MiscellaneousFeePayment.this.y1().getState_cd());
                String rc_vh_class_cd = MiscellaneousFeePayment.this.y1().getRc_vh_class_cd();
                MiscellaneousFeePayment.this.B1().y(MiscellaneousFeePayment.this, gson.toJson(new BeforePayReq("A", strValueOf, null, 22, null, "", "", null, null, 0, "", 1, "", "", null, strV1, strR, "", "", VContant.MISELL_PURPOSE_CODE, "", "", 0.0d, 0, strX1, strValueOf2, "", "", "", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, vh7Var.a(), null, mFPRequestModel)).toString());
                return;
            }
            Gson gson2 = new Gson();
            Data data5 = mFPResponseModel.getData();
            String strValueOf3 = String.valueOf(data5 != null ? data5.getApplNo() : null);
            String strV12 = MiscellaneousFeePayment.this.v1();
            String strR2 = hz0.a.r();
            String strX12 = MiscellaneousFeePayment.this.x1();
            String strValueOf4 = String.valueOf(MiscellaneousFeePayment.this.y1().getState_cd());
            String rc_vh_class_cd2 = MiscellaneousFeePayment.this.y1().getRc_vh_class_cd();
            MiscellaneousFeePayment.this.B1().y(MiscellaneousFeePayment.this, gson2.toJson(new BeforePayReq("M", strValueOf3, null, 22, null, "", "", null, null, 0, "", 1, "", "", null, strV12, strR2, "", "", VContant.MISELL_PURPOSE_CODE, "", "", 0.0d, 0, strX12, strValueOf4, "", "", "", rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null, null, null, null, null, null, null, vh7Var.a(), null, mFPRequestModel)).toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((MFPResponseModel) obj);
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
            MiscellaneousFeePayment.this.w1().dismiss();
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() > 0 && MiscellaneousFeePayment.this.p1().e.getText().toString().length() > 0) {
                MiscellaneousFeePayment miscellaneousFeePayment = MiscellaneousFeePayment.this;
                miscellaneousFeePayment.L1(Double.parseDouble(miscellaneousFeePayment.p1().c.getText().toString()));
                MiscellaneousFeePayment miscellaneousFeePayment2 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment2.M1(Double.parseDouble(miscellaneousFeePayment2.p1().e.getText().toString()));
                MiscellaneousFeePayment miscellaneousFeePayment3 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment3.V1(miscellaneousFeePayment3.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
                MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
                return;
            }
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() == 0 && MiscellaneousFeePayment.this.p1().e.getText().toString().length() > 0) {
                MiscellaneousFeePayment.this.L1(0.0d);
                MiscellaneousFeePayment miscellaneousFeePayment4 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment4.M1(Double.parseDouble(miscellaneousFeePayment4.p1().e.getText().toString()));
                MiscellaneousFeePayment miscellaneousFeePayment5 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment5.V1(miscellaneousFeePayment5.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
                MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
                return;
            }
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() == 0 && MiscellaneousFeePayment.this.p1().e.getText().toString().length() == 0) {
                MiscellaneousFeePayment.this.L1(0.0d);
                MiscellaneousFeePayment.this.M1(0.0d);
                MiscellaneousFeePayment miscellaneousFeePayment6 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment6.V1(miscellaneousFeePayment6.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
                MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
                return;
            }
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() <= 0 || MiscellaneousFeePayment.this.p1().e.getText().toString().length() != 0) {
                return;
            }
            MiscellaneousFeePayment miscellaneousFeePayment7 = MiscellaneousFeePayment.this;
            miscellaneousFeePayment7.L1(Double.parseDouble(miscellaneousFeePayment7.p1().c.getText().toString()));
            MiscellaneousFeePayment.this.M1(0.0d);
            MiscellaneousFeePayment miscellaneousFeePayment8 = MiscellaneousFeePayment.this;
            miscellaneousFeePayment8.V1(miscellaneousFeePayment8.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
            MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
        }
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (MiscellaneousFeePayment.this.p1().e.getText().toString().length() > 0 && MiscellaneousFeePayment.this.p1().c.getText().toString().length() > 0) {
                MiscellaneousFeePayment miscellaneousFeePayment = MiscellaneousFeePayment.this;
                miscellaneousFeePayment.L1(Double.parseDouble(miscellaneousFeePayment.p1().c.getText().toString()));
                MiscellaneousFeePayment miscellaneousFeePayment2 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment2.M1(Double.parseDouble(miscellaneousFeePayment2.p1().e.getText().toString()));
                MiscellaneousFeePayment miscellaneousFeePayment3 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment3.V1(miscellaneousFeePayment3.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
                MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
                return;
            }
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() > 0 && MiscellaneousFeePayment.this.p1().e.getText().toString().length() == 0) {
                MiscellaneousFeePayment miscellaneousFeePayment4 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment4.L1(Double.parseDouble(miscellaneousFeePayment4.p1().c.getText().toString()));
                MiscellaneousFeePayment.this.M1(0.0d);
                MiscellaneousFeePayment miscellaneousFeePayment5 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment5.V1(miscellaneousFeePayment5.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
                MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
                return;
            }
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() == 0 && MiscellaneousFeePayment.this.p1().e.getText().toString().length() == 0) {
                MiscellaneousFeePayment.this.L1(0.0d);
                MiscellaneousFeePayment.this.M1(0.0d);
                MiscellaneousFeePayment miscellaneousFeePayment6 = MiscellaneousFeePayment.this;
                miscellaneousFeePayment6.V1(miscellaneousFeePayment6.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
                MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
                return;
            }
            if (MiscellaneousFeePayment.this.p1().c.getText().toString().length() != 0 || MiscellaneousFeePayment.this.p1().e.getText().toString().length() <= 0) {
                return;
            }
            MiscellaneousFeePayment.this.L1(0.0d);
            MiscellaneousFeePayment miscellaneousFeePayment7 = MiscellaneousFeePayment.this;
            miscellaneousFeePayment7.M1(Double.parseDouble(miscellaneousFeePayment7.p1().e.getText().toString()));
            MiscellaneousFeePayment miscellaneousFeePayment8 = MiscellaneousFeePayment.this;
            miscellaneousFeePayment8.V1(miscellaneousFeePayment8.getFeeAmount() + MiscellaneousFeePayment.this.getFineAmount());
            MiscellaneousFeePayment.this.p1().j.setText(String.valueOf(MiscellaneousFeePayment.this.getTotalAmount()));
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

    public static final void D1(MiscellaneousFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.s1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void E1(MiscellaneousFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.x1());
        intent.putExtra("RcDetails", this$0.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
        this$0.startActivity(intent);
    }

    public static final void F1(MiscellaneousFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1().c.getText().length() < 2) {
            Toast.makeText(this$0, this$0.s1().b("please_enter_fee_amount", this$0.getString(R.string.please_enter_fee_amount)), 1).show();
            return;
        }
        if (this$0.p1().e.getText().length() < 2) {
            Toast.makeText(this$0, this$0.s1().b("please_enter_fine_amount", this$0.getString(R.string.please_enter_fine_amount)), 1).show();
            return;
        }
        if (this$0.p1().j.getText().length() < 2) {
            Toast.makeText(this$0, this$0.s1().b("please_enter_total_amount", this$0.getString(R.string.please_enter_total_amount)), 1).show();
            return;
        }
        try {
            this$0.w1().show();
            this$0.u1().i(new MFPRequestModel("", Double.parseDouble(this$0.p1().j.getText().toString()), Integer.parseInt(this$0.v1()), Integer.parseInt(VContant.MISELL_PURPOSE_CODE), this$0.x1(), String.valueOf(this$0.y1().getState_cd())));
        } catch (Exception unused) {
        }
    }

    public static final void G1(MiscellaneousFeePayment this$0, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl == null || returnUrl.length() == 0) {
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) ComPaymentTaxActivity.class);
            intent.putExtra("url", paymentBeforeUrlResponse.getReturnUrl());
            intent.putExtra("ServiceName", "Miscellaneous Fee Payment");
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void H1(MiscellaneousFeePayment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        if (str.equals("Error")) {
            VContant.INSTANCE.N(this$0, this$0.getString(R.string.service_unavable_please_try));
        } else {
            VContant.INSTANCE.N(this$0, str);
        }
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final ld7 B1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void K1(nd ndVar) {
        Intrinsics.checkNotNullParameter(ndVar, "<set-?>");
        this.binding = ndVar;
    }

    public final void L1(double d2) {
        this.feeAmount = d2;
    }

    public final void M1(double d2) {
        this.fineAmount = d2;
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void O1(MFPService mFPService) {
        Intrinsics.checkNotNullParameter(mFPService, "<set-?>");
        this.mfpSaveToDraftService = mFPService;
    }

    public final void P1(ro3 ro3Var) {
        Intrinsics.checkNotNullParameter(ro3Var, "<set-?>");
        this.mfpSaveToDraftViewModel = ro3Var;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void R1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void T1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void U1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void V1(double d2) {
        this.totalAmount = d2;
    }

    public final void W1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final String n1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nd ndVarC = nd.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ndVarC, "inflate(...)");
        K1(ndVarC);
        setContentView(p1().b());
        O1(MFPService.INSTANCE.a(this));
        N1(new wa3(this));
        R1(new ProgressDialog(this));
        w1().setMessage(s1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        ta3.a.o1(this, p1());
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        S1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        T1((NrvDetails) serializableExtra);
        U1(VahanProService.INSTANCE.a(this));
        W1((ld7) new z(this, new kd7(new jd7(z1()))).a(ld7.class));
        p1().i.i.setText(VContant.INSTANCE.n(this, new vh7(this)));
        p1().i.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiscellaneousFeePayment.D1(this.a, view);
            }
        });
        p1().l.setText(s1().b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        p1().m.setText(s1().b("view_vehicle_details", "View Vehicle Details"));
        p1().m.setPaintFlags(p1().m.getPaintFlags() | 8);
        p1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiscellaneousFeePayment.E1(this.a, view);
            }
        });
        P1((ro3) new z(this, new po3(new qo3(t1()))).a(ro3.class));
        W1((ld7) new z(this, new kd7(new jd7(z1()))).a(ld7.class));
        p1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ru3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiscellaneousFeePayment.F1(this.a, view);
            }
        });
        u1().h().g(this, new e(new a()));
        u1().g().g(this, new e(new b()));
        B1().D0().g(this, new mf4() { // from class: com.zepto.su3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MiscellaneousFeePayment.G1(this.a, (PaymentBeforeUrlResponse) obj);
            }
        });
        B1().E0().g(this, new mf4() { // from class: com.zepto.tu3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MiscellaneousFeePayment.H1(this.a, (String) obj);
            }
        });
        p1().c.addTextChangedListener(new c());
        p1().e.addTextChangedListener(new d());
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

    public final nd p1() {
        nd ndVar = this.binding;
        if (ndVar != null) {
            return ndVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final double getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX INFO: renamed from: r1, reason: from getter */
    public final double getFineAmount() {
        return this.fineAmount;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MFPService t1() {
        MFPService mFPService = this.mfpSaveToDraftService;
        if (mFPService != null) {
            return mFPService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mfpSaveToDraftService");
        return null;
    }

    public final ro3 u1() {
        ro3 ro3Var = this.mfpSaveToDraftViewModel;
        if (ro3Var != null) {
            return ro3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mfpSaveToDraftViewModel");
        return null;
    }

    public final String v1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService z1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
