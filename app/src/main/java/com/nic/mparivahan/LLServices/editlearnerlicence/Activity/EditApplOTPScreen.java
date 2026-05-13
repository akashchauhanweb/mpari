package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditApplOTPScreen;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import com.nic.mparivahan.R;
import com.zepto.a02;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qb;
import com.zepto.qi4;
import com.zepto.ta3;
import com.zepto.tz1;
import com.zepto.vi1;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wl5;
import com.zepto.zz1;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0016\u0010)\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010+\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/nic/mparivahan/LLServices/editlearnerlicence/Activity/EditApplOTPScreen;", "Lcom/zepto/pq;", "", "m1", "n1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/qb;", "C", "Lcom/zepto/qb;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "pDialog", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "session", "Lcom/zepto/zz1;", "F", "Lcom/zepto/zz1;", "editLearnerVM", "Lcom/nic/mparivahan/LLServices/editlearnerlicence/Service/EditLearnerServices;", "G", "Lcom/nic/mparivahan/LLServices/editlearnerlicence/Service/EditLearnerServices;", "service", "", "H", "Ljava/lang/String;", "fatherName", "I", "mobileNo", "J", "fullName", "K", "transactionCode", "L", "rtoCd", "M", "applNo", "N", "generatedOtp", "O", "reference", "Lcom/zepto/wl5;", "P", "Lcom/zepto/wl5;", "sarthiSession", "", "Q", "Z", "fromResendOtpSubmit", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class EditApplOTPScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public qb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public zz1 editLearnerVM;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public EditLearnerServices service;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String fatherName = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String fullName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String transactionCode = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCd = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String generatedOtp = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String reference = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean fromResendOtpSubmit;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(qi4 qi4Var) {
            ProgressDialog progressDialog = EditApplOTPScreen.this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (!progressDialog.isShowing()) {
                throw null;
            }
            ProgressDialog progressDialog2 = EditApplOTPScreen.this.pDialog;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.dismiss();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
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
            ProgressDialog progressDialog = EditApplOTPScreen.this.pDialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = EditApplOTPScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
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

        public final void a(vi1 vi1Var) {
            ProgressDialog progressDialog = EditApplOTPScreen.this.pDialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = EditApplOTPScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            try {
                Log.e("Result", vi1Var.p());
                if (Intrinsics.areEqual(vi1Var.p(), "00")) {
                    Intent intent = new Intent(EditApplOTPScreen.this, (Class<?>) PersonalDetailsEditScreen.class);
                    intent.putParcelableArrayListExtra("personalDetails", vi1Var.m());
                    intent.putParcelableArrayListExtra("addressDetails", vi1Var.c());
                    intent.putParcelableArrayListExtra("covDetails", vi1Var.h());
                    intent.putParcelableArrayListExtra("selectedCovDetails", vi1Var.o());
                    intent.putExtra("willingToDonate", vi1Var.q());
                    intent.putExtra("licenseFromState", vi1Var.l());
                    intent.putExtra("licenceFromRTO", vi1Var.j());
                    intent.putExtra("jurisdiction", vi1Var.i());
                    intent.putExtra("licenceFromRTOCode", vi1Var.k());
                    intent.putExtra("applicationNo", vi1Var.g());
                    intent.putExtra("reference", vi1Var.n());
                    intent.putExtra("applDate", vi1Var.f());
                    intent.putExtra("allowNewAddr", vi1Var.d());
                    intent.putExtra("applCatg", vi1Var.e());
                    EditApplOTPScreen.this.startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((vi1) obj);
            return Unit.INSTANCE;
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

    private final void m1() {
        String stringExtra = getIntent().getStringExtra("applNo");
        Intrinsics.checkNotNull(stringExtra);
        this.applNo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("fullName");
        Intrinsics.checkNotNull(stringExtra2);
        this.fullName = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("fatherName");
        Intrinsics.checkNotNull(stringExtra3);
        this.fatherName = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("transCode");
        Intrinsics.checkNotNull(stringExtra4);
        this.transactionCode = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("mobileNo");
        Intrinsics.checkNotNull(stringExtra5);
        this.mobileNo = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        Intrinsics.checkNotNull(stringExtra6);
        this.reference = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("rtoCd");
        Intrinsics.checkNotNull(stringExtra7);
        this.rtoCd = stringExtra7;
        qb qbVar = null;
        if (this.applNo.length() > 0) {
            qb qbVar2 = this.binding;
            if (qbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qbVar2 = null;
            }
            qbVar2.b.setText(this.applNo);
        }
        if (this.mobileNo.length() > 0) {
            qb qbVar3 = this.binding;
            if (qbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qbVar3 = null;
            }
            qbVar3.h.setText(this.mobileNo);
            qb qbVar4 = this.binding;
            if (qbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qbVar = qbVar4;
            }
            qbVar.h.setFocusable(false);
            return;
        }
        qb qbVar5 = this.binding;
        if (qbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qbVar5 = null;
        }
        qbVar5.h.setText("");
        qb qbVar6 = this.binding;
        if (qbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qbVar = qbVar6;
        }
        qbVar.h.setFocusable(true);
    }

    private final void n1() {
        this.sarthiSession = new wl5(this);
        qb qbVar = this.binding;
        qb qbVar2 = null;
        if (qbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qbVar = null;
        }
        TextView textView = qbVar.g.f;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        textView.setText(wl5Var.k());
        qb qbVar3 = this.binding;
        if (qbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qbVar3 = null;
        }
        qbVar3.g.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditApplOTPScreen.o1(this.a, view);
            }
        });
        this.session = new wa3(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.pDialog = progressDialog;
        wa3 wa3Var = this.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        progressDialog.setMessage(wa3Var.b("label_challan_please_wait", getString(R.string.please_wait)));
        ProgressDialog progressDialog2 = this.pDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.pDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        this.service = EditLearnerServices.INSTANCE.a(this);
        EditLearnerServices editLearnerServices = this.service;
        if (editLearnerServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            editLearnerServices = null;
        }
        this.editLearnerVM = (zz1) new z(this, new a02(new tz1(editLearnerServices))).a(zz1.class);
        qb qbVar4 = this.binding;
        if (qbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qbVar4 = null;
        }
        qbVar4.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditApplOTPScreen.p1(this.a, view);
            }
        });
        qb qbVar5 = this.binding;
        if (qbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qbVar2 = qbVar5;
        }
        qbVar2.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditApplOTPScreen.q1(this.a, view);
            }
        });
    }

    public static final void o1(EditApplOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void p1(EditApplOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void q1(EditApplOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            qb qbVar = this$0.binding;
            qb qbVar2 = null;
            if (qbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qbVar = null;
            }
            if (qbVar.h.getText().length() < 10) {
                Toast.makeText(this$0, this$0.getString(R.string.invalid_mobile_no), 0).show();
                return;
            }
            this$0.fromResendOtpSubmit = false;
            ProgressDialog progressDialog = this$0.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            zz1 zz1Var = this$0.editLearnerVM;
            if (zz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
                zz1Var = null;
            }
            String str = this$0.transactionCode;
            qb qbVar3 = this$0.binding;
            if (qbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qbVar2 = qbVar3;
            }
            zz1Var.p(str, StringsKt__StringsKt.trim((CharSequence) qbVar2.h.getText().toString()).toString(), this$0.applNo, this$0.fullName, this$0.rtoCd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qb qbVarC = qb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(qbVarC, "inflate(...)");
        this.binding = qbVarC;
        zz1 zz1Var = null;
        if (qbVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qbVarC = null;
        }
        setContentView(qbVarC.b());
        m1();
        n1();
        ta3.a aVar = ta3.a;
        qb qbVar = this.binding;
        if (qbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qbVar = null;
        }
        aVar.L0(this, qbVar);
        zz1 zz1Var2 = this.editLearnerVM;
        if (zz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
            zz1Var2 = null;
        }
        zz1Var2.o().g(this, new d(new a()));
        zz1 zz1Var3 = this.editLearnerVM;
        if (zz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
            zz1Var3 = null;
        }
        zz1Var3.j().g(this, new d(new b()));
        zz1 zz1Var4 = this.editLearnerVM;
        if (zz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
        } else {
            zz1Var = zz1Var4;
        }
        zz1Var.q().g(this, new d(new c()));
    }
}
