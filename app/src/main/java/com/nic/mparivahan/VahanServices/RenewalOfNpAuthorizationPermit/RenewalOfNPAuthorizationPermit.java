package com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitModel.NPAPermitResponseModel;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPAPermitService;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPARepositorySaveToDraftService;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAuthorizationPermit;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.ApiMessage;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.RenewalOfPermitSaveToDraftResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.af;
import com.zepto.i95;
import com.zepto.j95;
import com.zepto.k95;
import com.zepto.kt6;
import com.zepto.l95;
import com.zepto.m95;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y95;
import com.zepto.z95;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bq\u0010rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR>\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010<\u001a\u0004\b^\u0010>\"\u0004\b_\u0010@R\"\u0010d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010<\u001a\u0004\bb\u0010>\"\u0004\bc\u0010@R\"\u0010h\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010<\u001a\u0004\bf\u0010>\"\u0004\bg\u0010@R\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAuthorizationPermit;", "Lcom/zepto/pq;", "", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/HashMap;", "", "serviceSelection_HashMap", "m1", "Lcom/zepto/af;", "C", "Lcom/zepto/af;", "p1", "()Lcom/zepto/af;", "I1", "(Lcom/zepto/af;)V", "binding", "Lcom/zepto/j95;", "D", "Lcom/zepto/j95;", "z1", "()Lcom/zepto/j95;", "S1", "(Lcom/zepto/j95;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPAPermitService;", "E", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPAPermitService;", "x1", "()Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPAPermitService;", "Q1", "(Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPAPermitService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "L1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/y95;", "G", "Lcom/zepto/y95;", "v1", "()Lcom/zepto/y95;", "O1", "(Lcom/zepto/y95;)V", "renewalDraftViewModle", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPARepositorySaveToDraftService;", "H", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPARepositorySaveToDraftService;", "w1", "()Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPARepositorySaveToDraftService;", "P1", "(Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfNPAPermitService/RenewalOfNPARepositorySaveToDraftService;)V", "renewalService", "I", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "M1", "(Ljava/lang/String;)V", "rc_number", "J", "y1", "R1", "statCd", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lkotlin/collections/HashMap;", "L", "Ljava/util/HashMap;", "getServiceSelection_HashMap", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "M", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "u1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "N", "r1", "K1", "off_code", "O", "o1", "H1", "aadhar_name", "P", "n1", "G1", "aadhar_address", "", "Q", "Z", "A1", "()Z", "setFaceless", "(Z)V", "isFaceless", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RenewalOfNPAuthorizationPermit extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public af binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public j95 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public RenewalOfNPAPermitService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public y95 renewalDraftViewModle;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public RenewalOfNPARepositorySaveToDraftService renewalService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String statCd;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean isFaceless;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(NPAPermitResponseModel nPAPermitResponseModel) {
            RenewalOfNPAuthorizationPermit.this.s1().dismiss();
            try {
                if (nPAPermitResponseModel.getApiMessage().getStatusCode() == 200) {
                    RenewalOfNPAuthorizationPermit.this.p1().q.setText(nPAPermitResponseModel.getData().getPreviousPermitNo());
                    RenewalOfNPAuthorizationPermit.this.p1().s.setText(nPAPermitResponseModel.getData().getPreviousPermitNo());
                    RenewalOfNPAuthorizationPermit.this.p1().k.setText(nPAPermitResponseModel.getData().getPerviousAuthNo());
                    RenewalOfNPAuthorizationPermit.this.p1().i.setText(nPAPermitResponseModel.getData().getPreviousAuthFrom());
                    RenewalOfNPAuthorizationPermit.this.p1().m.setText(nPAPermitResponseModel.getData().getPreviousAuthUpto());
                    RenewalOfNPAuthorizationPermit.this.p1().o.setText(nPAPermitResponseModel.getData().getPreviousIssueDate());
                    RenewalOfNPAuthorizationPermit.this.p1().e.setText(nPAPermitResponseModel.getData().getAuthorizationUpto());
                    RenewalOfNPAuthorizationPermit.this.p1().b.setText(nPAPermitResponseModel.getData().getAllotmentOffice());
                } else {
                    VContant.INSTANCE.N(RenewalOfNPAuthorizationPermit.this, nPAPermitResponseModel.getApiMessage().getDeveloperMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NPAPermitResponseModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(RenewalOfPermitSaveToDraftResponse renewalOfPermitSaveToDraftResponse) {
            RenewalOfNPAuthorizationPermit.this.s1().dismiss();
            Data data = renewalOfPermitSaveToDraftResponse.getData();
            if (!kt6.d(data != null ? data.getApplNo() : null)) {
                VContant.Companion companion = VContant.INSTANCE;
                RenewalOfNPAuthorizationPermit renewalOfNPAuthorizationPermit = RenewalOfNPAuthorizationPermit.this;
                ApiMessage apiMessage = renewalOfPermitSaveToDraftResponse.getApiMessage();
                companion.N(renewalOfNPAuthorizationPermit, String.valueOf(apiMessage != null ? apiMessage.getDeveloperMessage() : null));
                return;
            }
            Intent intent = new Intent(RenewalOfNPAuthorizationPermit.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NP_CODE);
            intent.putExtra(VContant.NP_CODE, renewalOfPermitSaveToDraftResponse.getData());
            Data data2 = renewalOfPermitSaveToDraftResponse.getData();
            intent.putExtra(VContant.APP_NO, data2 != null ? data2.getApplNo() : null);
            intent.putExtra("state_code", RenewalOfNPAuthorizationPermit.this.u1().getState_cd());
            intent.putExtra("rc_number", RenewalOfNPAuthorizationPermit.this.t1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_FITNESS_PURPOSE_CODE);
            intent.putExtra("off_code", RenewalOfNPAuthorizationPermit.this.r1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, RenewalOfNPAuthorizationPermit.this.getIsFaceless());
            intent.putExtra("RC", RenewalOfNPAuthorizationPermit.this.t1());
            intent.putExtra("RcDetails", RenewalOfNPAuthorizationPermit.this.u1());
            intent.putExtra(VContant.NEXGEN_addahar_name, RenewalOfNPAuthorizationPermit.this.o1());
            intent.putExtra(VContant.NEXGEN_addahar_address, RenewalOfNPAuthorizationPermit.this.n1());
            RenewalOfNPAuthorizationPermit.this.startActivity(intent);
            RenewalOfNPAuthorizationPermit.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RenewalOfPermitSaveToDraftResponse) obj);
            return Unit.INSTANCE;
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
            RenewalOfNPAuthorizationPermit.this.s1().dismiss();
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final void B1(RenewalOfNPAuthorizationPermit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.t1());
        intent.putExtra("RcDetails", this$0.u1());
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
        this$0.startActivity(intent);
    }

    public static final void C1(RenewalOfNPAuthorizationPermit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.p1().b.getText().toString();
        String string2 = this$0.p1().e.getText().toString();
        String rc_off_cd = this$0.u1().getRc_off_cd();
        Intrinsics.checkNotNull(rc_off_cd);
        this$0.v1().i(new z95(string, "", string2, "N", 0, "10.02.82.192", Integer.parseInt(rc_off_cd), this$0.p1().i.getText().toString(), this$0.p1().k.getText().toString(), this$0.p1().m.getText().toString(), this$0.p1().o.getText().toString(), this$0.p1().q.getText().toString(), Integer.parseInt(VContant.RenewalNpAuthorization_CODE), this$0.t1(), this$0.y1()));
    }

    public static final void D1(RenewalOfNPAuthorizationPermit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.q1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void E1(RenewalOfNPAuthorizationPermit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1();
    }

    private final void F1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void I1(af afVar) {
        Intrinsics.checkNotNullParameter(afVar, "<set-?>");
        this.binding = afVar;
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void L1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void N1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void O1(y95 y95Var) {
        Intrinsics.checkNotNullParameter(y95Var, "<set-?>");
        this.renewalDraftViewModle = y95Var;
    }

    public final void P1(RenewalOfNPARepositorySaveToDraftService renewalOfNPARepositorySaveToDraftService) {
        Intrinsics.checkNotNullParameter(renewalOfNPARepositorySaveToDraftService, "<set-?>");
        this.renewalService = renewalOfNPARepositorySaveToDraftService;
    }

    public final void Q1(RenewalOfNPAPermitService renewalOfNPAPermitService) {
        Intrinsics.checkNotNullParameter(renewalOfNPAPermitService, "<set-?>");
        this.retrofitService = renewalOfNPAPermitService;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.statCd = str;
    }

    public final void S1(j95 j95Var) {
        Intrinsics.checkNotNullParameter(j95Var, "<set-?>");
        this.viewModel = j95Var;
    }

    public final String m1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        return serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? ta3.a.P(this, "Issue of Duplicate RC") : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? "Transfer of Ownership" : serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS) ? ta3.a.P(this, "Change of Address in RC") : serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION) ? ta3.a.P(this, "Hypothecation Termination") : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION) ? ta3.a.P(this, "Hypothecation Continuation") : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION) ? ta3.a.P(this, "Hypothecation Addition") : serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR) ? ta3.a.P(this, "RC Particulars against Fee") : serviceSelection_HashMap.containsKey(VContant.NOC) ? ta3.a.P(this, "No Objection Certificate (NOC)") : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS) ? ta3.a.P(this, "Duplicate Fitness Certificate") : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_PERMIT) ? ta3.a.P(this, "Duplicate Permit Certificate") : serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER) ? ta3.a.P(this, "RC Surrender") : serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION) ? ta3.a.P(this, "RC Cancellation") : serviceSelection_HashMap.containsKey(VContant.PAY_TAX) ? ta3.a.P(this, "Pay Tax") : serviceSelection_HashMap.containsKey(VContant.PAY_TAXASS) ? ta3.a.P(this, "Tax Assessment") : serviceSelection_HashMap.containsKey(VContant.RC_RELEASE) ? ta3.a.P(this, "RC Release") : serviceSelection_HashMap.containsKey(VContant.Temp_Permit) ? ta3.a.P(this, "Temporary Permit") : serviceSelection_HashMap.containsKey(VContant.NP_Permit) ? ta3.a.P(this, "Renewal of NP Authorization Permit") : "";
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

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        af afVarC = af.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(afVarC, "inflate(...)");
        I1(afVarC);
        setContentView(p1().b());
        ta3.a.R2(this, p1());
        J1(new wa3(this));
        L1(new ProgressDialog(this));
        s1().setMessage(q1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        K1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        M1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        N1((NrvDetails) serializableExtra);
        HashMap map = (HashMap) getIntent().getSerializableExtra("map");
        Intrinsics.checkNotNull(map);
        this.serviceSelection_HashMap = map;
        p1().w.setText(q1().b("vehicle_no", "Vehicle No.:") + ' ' + t1());
        R1(String.valueOf(u1().getState_cd()));
        p1().v.i.setText(m1(this.serviceSelection_HashMap));
        Q1(RenewalOfNPAPermitService.INSTANCE.a(this));
        P1(RenewalOfNPARepositorySaveToDraftService.INSTANCE.a(this));
        S1((j95) new z(this, new m95(new i95(x1()))).a(j95.class));
        O1((y95) new z(this, new k95(new l95(w1()))).a(y95.class));
        p1().x.setPaintFlags(p1().x.getPaintFlags() | 8);
        p1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfNPAuthorizationPermit.B1(this.a, view);
            }
        });
        try {
            s1().show();
            z1().i(t1(), String.valueOf(u1().getState_cd()), String.valueOf(u1().getRc_off_cd()));
        } catch (Exception unused) {
        }
        z1().h().g(this, new d(new a()));
        p1().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfNPAuthorizationPermit.C1(this.a, view);
            }
        });
        v1().h().g(this, new d(new b()));
        v1().g().g(this, new d(new c()));
        p1().v.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfNPAuthorizationPermit.D1(this.a, view);
            }
        });
        p1().v.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfNPAuthorizationPermit.E1(this.a, view);
            }
        });
    }

    public final af p1() {
        af afVar = this.binding;
        if (afVar != null) {
            return afVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String r1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
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

    public final String t1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final y95 v1() {
        y95 y95Var = this.renewalDraftViewModle;
        if (y95Var != null) {
            return y95Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("renewalDraftViewModle");
        return null;
    }

    public final RenewalOfNPARepositorySaveToDraftService w1() {
        RenewalOfNPARepositorySaveToDraftService renewalOfNPARepositorySaveToDraftService = this.renewalService;
        if (renewalOfNPARepositorySaveToDraftService != null) {
            return renewalOfNPARepositorySaveToDraftService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("renewalService");
        return null;
    }

    public final RenewalOfNPAPermitService x1() {
        RenewalOfNPAPermitService renewalOfNPAPermitService = this.retrofitService;
        if (renewalOfNPAPermitService != null) {
            return renewalOfNPAPermitService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String y1() {
        String str = this.statCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statCd");
        return null;
    }

    public final j95 z1() {
        j95 j95Var = this.viewModel;
        if (j95Var != null) {
            return j95Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
