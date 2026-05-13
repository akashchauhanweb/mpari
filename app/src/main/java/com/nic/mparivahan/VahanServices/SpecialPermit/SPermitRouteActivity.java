package com.nic.mparivahan.VahanServices.SpecialPermit;

import android.R;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.SpecialPermit.SPermitRouteActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.b56;
import com.zepto.j37;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bd\u0010eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u00101\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R&\u00103\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00106\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010:\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105R\u0016\u0010<\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010>\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00105R\u0016\u0010@\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00105R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010J\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u00105\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u00105\u001a\u0004\bT\u0010G\"\u0004\bU\u0010IR\"\u0010Z\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u00105\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR\"\u0010^\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u00105\u001a\u0004\b\\\u0010G\"\u0004\b]\u0010IR\"\u0010`\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010C\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SpecialPermit/SPermitRouteActivity;", "Lcom/zepto/pq;", "", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/zepto/b56;", "C", "Lcom/zepto/b56;", "binding", "Lcom/zepto/o47;", "D", "Lcom/zepto/o47;", "getFitnessDraftViewModle", "()Lcom/zepto/o47;", "y1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "E", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "n1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "z1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "q1", "()Landroid/app/ProgressDialog;", "C1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "o1", "()Lcom/zepto/wa3;", "A1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "serviceTypeArrayList", "I", "natureOfGoodsArrayList", "J", "Ljava/lang/String;", "validFromDate", "K", "validUptoDate", "L", "periodModeSelectedValue", "M", "periodCountValue", "N", "selectedServiceType", "O", "allotmentOffice", "", "P", "Z", "addPassengerEnable", "Q", "r1", "()Ljava/lang/String;", "D1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "R", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "s1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "E1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "S", "p1", "B1", "off_code", "T", "m1", "x1", "aadhar_name", "U", "l1", "w1", "aadhar_address", "V", "isFaceless", "()Z", "setFaceless", "(Z)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SPermitRouteActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public b56 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList serviceTypeArrayList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList natureOfGoodsArrayList = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String validFromDate = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String validUptoDate = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String periodModeSelectedValue = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String periodCountValue = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String selectedServiceType = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String allotmentOffice = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean addPassengerEnable;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean isFaceless;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            SPermitRouteActivity sPermitRouteActivity = SPermitRouteActivity.this;
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
            sPermitRouteActivity.selectedServiceType = (String) itemAtPosition;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    private final void t1() {
        String strL = VContant.INSTANCE.L(this, VContant.SPEICAL_PERMIT_PURPOSE_CODE);
        b56 b56Var = this.binding;
        b56 b56Var2 = null;
        if (b56Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b56Var = null;
        }
        b56Var.K.i.setText(strL);
        y1((o47) new z(this, new n47(new j37(n1()))).a(o47.class));
        b56 b56Var3 = this.binding;
        if (b56Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b56Var3 = null;
        }
        b56Var3.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ah5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitRouteActivity.u1(this.a, view);
            }
        });
        b56 b56Var4 = this.binding;
        if (b56Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b56Var4 = null;
        }
        b56Var4.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bh5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitRouteActivity.v1(this.a, view);
            }
        });
        if (this.serviceTypeArrayList.size() > 0) {
            this.serviceTypeArrayList.add(0, "Select Service Type");
            ArrayList arrayList = this.serviceTypeArrayList;
            Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_spinner_item, arrayList);
            arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            b56 b56Var5 = this.binding;
            if (b56Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                b56Var5 = null;
            }
            b56Var5.H.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        b56 b56Var6 = this.binding;
        if (b56Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            b56Var2 = b56Var6;
        }
        b56Var2.H.setOnItemSelectedListener(new a());
    }

    public static final void u1(SPermitRouteActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void v1(SPermitRouteActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SPermitDetailsActivity.class);
        intent.putExtra("validFromDate", this$0.validFromDate);
        intent.putExtra("periodMode", this$0.periodModeSelectedValue);
        intent.putExtra("periodCount", this$0.periodCountValue);
        intent.putExtra("validUpto", this$0.validUptoDate);
        b56 b56Var = this$0.binding;
        if (b56Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b56Var = null;
        }
        intent.putExtra("routeLength", String.valueOf(b56Var.G.getText()));
        intent.putExtra("serviceType", this$0.selectedServiceType);
        intent.putStringArrayListExtra("natureOfGoods", this$0.natureOfGoodsArrayList);
        intent.putExtra("allotmentOffice", this$0.allotmentOffice);
        intent.putExtra("addPassangerEnable", this$0.addPassengerEnable);
        intent.putExtra("RC", this$0.r1());
        intent.putExtra("RcDetails", this$0.s1());
        intent.putExtra("off_code", this$0.p1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.l1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public final void A1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void C1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void E1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final String l1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final DuplicateFitnessService n1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final wa3 o1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, o1().b("are_you_sure_you_want_to_leave", getString(com.nic.mparivahan.R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b56 b56VarX = b56.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(b56VarX, "inflate(...)");
        this.binding = b56VarX;
        if (b56VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b56VarX = null;
        }
        setContentView(b56VarX.m());
        A1(new wa3(this));
        z1(DuplicateFitnessService.INSTANCE.a(this));
        B1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        x1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        w1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        D1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        E1((NrvDetails) serializableExtra);
        C1(new ProgressDialog(this));
        q1().setMessage(o1().b("label_challan_please_wait", getString(com.nic.mparivahan.R.string.loading_msg)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        if (getIntent().hasExtra("serviceType")) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("serviceType");
            Intrinsics.checkNotNull(stringArrayListExtra);
            this.serviceTypeArrayList = stringArrayListExtra;
        }
        if (getIntent().hasExtra("natureOfGoods")) {
            ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("natureOfGoods");
            Intrinsics.checkNotNull(stringArrayListExtra2);
            this.natureOfGoodsArrayList = stringArrayListExtra2;
        }
        if (getIntent().hasExtra("allotmentOffice")) {
            String stringExtra = getIntent().getStringExtra("allotmentOffice");
            Intrinsics.checkNotNull(stringExtra);
            this.allotmentOffice = stringExtra;
        }
        if (getIntent().hasExtra("validDate")) {
            String stringExtra2 = getIntent().getStringExtra("validDate");
            Intrinsics.checkNotNull(stringExtra2);
            this.validFromDate = stringExtra2;
        }
        if (getIntent().hasExtra("periodMode")) {
            String stringExtra3 = getIntent().getStringExtra("periodMode");
            Intrinsics.checkNotNull(stringExtra3);
            this.periodModeSelectedValue = stringExtra3;
        }
        if (getIntent().hasExtra("periodCount")) {
            String stringExtra4 = getIntent().getStringExtra("periodCount");
            Intrinsics.checkNotNull(stringExtra4);
            this.periodCountValue = stringExtra4;
        }
        if (getIntent().hasExtra("validUpto")) {
            String stringExtra5 = getIntent().getStringExtra("validUpto");
            Intrinsics.checkNotNull(stringExtra5);
            this.validUptoDate = stringExtra5;
        }
        if (getIntent().hasExtra("addPassangerEnable")) {
            this.addPassengerEnable = getIntent().getBooleanExtra("addPassangerEnable", false);
        }
        t1();
    }

    public final String p1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String r1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails s1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final void w1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void x1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void y1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void z1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }
}
