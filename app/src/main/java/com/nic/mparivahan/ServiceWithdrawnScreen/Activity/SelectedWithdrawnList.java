package com.nic.mparivahan.ServiceWithdrawnScreen.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.SelectedWithdrawnList;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceListModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceResultModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ReasonModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ReasonResultModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.SelectedCovRequestModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ValidateWithDrawanServiceModal;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import com.zepto.ez5;
import com.zepto.f53;
import com.zepto.gz5;
import com.zepto.hz5;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.sv5;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.zv5;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b[\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J8\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0007J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0002R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR&\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR&\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020\f`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR&\u0010S\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020\f`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NR&\u0010V\u001a\u0012\u0012\u0004\u0012\u00020T0\u0016j\b\u0012\u0004\u0012\u00020T`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010NR\u0016\u0010X\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010&R&\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0016j\b\u0012\u0004\u0012\u00020\n`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010N¨\u0006]"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Activity/SelectedWithdrawnList;", "Lcom/zepto/o40;", "", "c2", "L1", "O1", "S1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "position", "", "confirmationValue", "remarks", "appliedService", "appliedCovs", "status", "Y1", "Q1", "M1", "Z1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/AppliedServiceResultModal;", "appliedServiceResultModal", "f2", "N1", "message", "W1", "Lcom/zepto/zv5;", "F", "Lcom/zepto/zv5;", "binding", "G", "Ljava/lang/String;", "applicantFullName", "H", "applicationNo", "I", "applicantDob", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "dialog", "Landroid/content/Context;", "K", "Landroid/content/Context;", "mContext", "Lcom/zepto/wl5;", "L", "Lcom/zepto/wl5;", "R1", "()Lcom/zepto/wl5;", "b2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "P1", "()Lcom/zepto/wa3;", "a2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/hz5;", "N", "Lcom/zepto/hz5;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/ServiceWithdrawn;", "O", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/ServiceWithdrawn;", "service", "Lcom/zepto/sv5;", "P", "Lcom/zepto/sv5;", "adapter", "Lkotlin/collections/ArrayList;", "Q", "Ljava/util/ArrayList;", "listValue", "R", "reasonArray", "S", "confirmationArray", "Lcom/nic/mparivahan/ServiceWithdrawnScreen/Modal/SelectedCovRequestModal;", "T", "selectedListOfServices", "U", "totalArraySize", "V", "selectedPos", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SelectedWithdrawnList extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public zv5 binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public hz5 viewModal;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ServiceWithdrawn service;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public sv5 adapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int totalArraySize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String applicantFullName = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String applicationNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String applicantDob = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList listValue = new ArrayList();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList reasonArray = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ArrayList confirmationArray = new ArrayList();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ArrayList selectedListOfServices = new ArrayList();

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ArrayList selectedPos = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ReasonModal reasonModal) {
            try {
                if (Intrinsics.areEqual(reasonModal.getStatusDesc(), "success")) {
                    ArrayList<ReasonResultModal> result = reasonModal.getResult();
                    Intrinsics.checkNotNull(result);
                    if (result.size() > 0) {
                        SelectedWithdrawnList.this.reasonArray.add(0, "Select");
                        int size = reasonModal.getResult().size();
                        for (int i = 0; i < size; i++) {
                            SelectedWithdrawnList.this.reasonArray.add(reasonModal.getResult().get(i).getKey());
                        }
                    }
                    SelectedWithdrawnList.this.Z1();
                }
            } catch (Exception e) {
                e.printStackTrace();
                SelectedWithdrawnList.this.Z1();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ReasonModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(AppliedServiceListModal appliedServiceListModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = SelectedWithdrawnList.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = SelectedWithdrawnList.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (Intrinsics.areEqual(appliedServiceListModal.getStatusCd(), "00")) {
                    ArrayList<AppliedServiceResultModal> appliedServiceResultModal = appliedServiceListModal.getAppliedServiceResultModal();
                    Intrinsics.checkNotNull(appliedServiceResultModal);
                    if (appliedServiceResultModal.size() > 0) {
                        SelectedWithdrawnList.this.totalArraySize = appliedServiceListModal.getAppliedServiceResultModal().size();
                        SelectedWithdrawnList.this.f2(appliedServiceListModal.getAppliedServiceResultModal());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = SelectedWithdrawnList.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = SelectedWithdrawnList.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AppliedServiceListModal) obj);
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
            ProgressDialog progressDialog = SelectedWithdrawnList.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = SelectedWithdrawnList.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(ValidateWithDrawanServiceModal validateWithDrawanServiceModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = SelectedWithdrawnList.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = SelectedWithdrawnList.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!Intrinsics.areEqual(validateWithDrawanServiceModal.getStatus_code(), "01")) {
                    SelectedWithdrawnList selectedWithdrawnList = SelectedWithdrawnList.this;
                    Toast.makeText(selectedWithdrawnList, selectedWithdrawnList.getString(R.string.please_try_again), 0).show();
                } else if (Intrinsics.areEqual(validateWithDrawanServiceModal.getResult().get(0).getMessage(), "true")) {
                    SelectedWithdrawnList.this.c2();
                } else {
                    Toast.makeText(SelectedWithdrawnList.this, validateWithDrawanServiceModal.getResult().get(0).getErrorMsg(), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = SelectedWithdrawnList.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = SelectedWithdrawnList.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ValidateWithDrawanServiceModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(ValidateWithDrawanServiceModal validateWithDrawanServiceModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = SelectedWithdrawnList.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = SelectedWithdrawnList.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!Intrinsics.areEqual(validateWithDrawanServiceModal.getStatus_code(), "01")) {
                    SelectedWithdrawnList selectedWithdrawnList = SelectedWithdrawnList.this;
                    Toast.makeText(selectedWithdrawnList, selectedWithdrawnList.getString(R.string.please_try_again), 0).show();
                } else if (Intrinsics.areEqual(validateWithDrawanServiceModal.getStatus_desc(), "success")) {
                    SelectedWithdrawnList.this.W1(validateWithDrawanServiceModal.getResult().get(0).getMessage());
                } else {
                    Toast.makeText(SelectedWithdrawnList.this, validateWithDrawanServiceModal.getResult().get(0).getErrorMsg(), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = SelectedWithdrawnList.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = SelectedWithdrawnList.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ValidateWithDrawanServiceModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    private final void L1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            hz5 hz5Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            f53 jsonTree = new Gson().toJsonTree(this.selectedListOfServices);
            hz5 hz5Var2 = this.viewModal;
            if (hz5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            } else {
                hz5Var = hz5Var2;
            }
            String str = this.applicationNo;
            Intrinsics.checkNotNull(jsonTree);
            hz5Var.y("ServiceWithdrawn", str, jsonTree);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void O1() {
        String stringExtra = getIntent().getStringExtra("applicantFullName");
        Intrinsics.checkNotNull(stringExtra);
        this.applicantFullName = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("applNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.applicationNo = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("applicantDob");
        Intrinsics.checkNotNull(stringExtra3);
        this.applicantDob = stringExtra3;
        zv5 zv5Var = null;
        if (kt6.d(this.applicantFullName)) {
            zv5 zv5Var2 = this.binding;
            if (zv5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zv5Var2 = null;
            }
            zv5Var2.j.setText(this.applicantFullName);
        }
        if (kt6.d(this.applicationNo)) {
            zv5 zv5Var3 = this.binding;
            if (zv5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zv5Var3 = null;
            }
            zv5Var3.e.setText(this.applicationNo);
        }
        if (kt6.d(this.applicantDob)) {
            zv5 zv5Var4 = this.binding;
            if (zv5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zv5Var = zv5Var4;
            }
            zv5Var.h.setText(this.applicantDob);
        }
    }

    private final void S1() {
        this.mContext = this;
        Context context = this.mContext;
        zv5 zv5Var = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        b2(new wl5(context));
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        a2(new wa3(context2));
        ServiceWithdrawn.Companion companion = ServiceWithdrawn.INSTANCE;
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context3 = null;
        }
        this.service = companion.a(context3);
        zv5 zv5Var2 = this.binding;
        if (zv5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5Var2 = null;
        }
        zv5Var2.k.f.setText(R1().k());
        zv5 zv5Var3 = this.binding;
        if (zv5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5Var3 = null;
        }
        zv5Var3.k.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedWithdrawnList.T1(this.a, view);
            }
        });
        ServiceWithdrawn serviceWithdrawn = this.service;
        if (serviceWithdrawn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            serviceWithdrawn = null;
        }
        this.viewModal = (hz5) new z(this, new ez5(new gz5(serviceWithdrawn))).a(hz5.class);
        zv5 zv5Var4 = this.binding;
        if (zv5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5Var4 = null;
        }
        zv5Var4.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedWithdrawnList.U1(this.a, view);
            }
        });
        zv5 zv5Var5 = this.binding;
        if (zv5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zv5Var = zv5Var5;
        }
        zv5Var.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedWithdrawnList.V1(this.a, view);
            }
        });
    }

    public static final void T1(SelectedWithdrawnList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void U1(SelectedWithdrawnList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.selectedListOfServices.size() == 0) {
            Toast.makeText(this$0, this$0.P1().b("SELECT_REASON_SERVICE_WITHDRAWN", "Please select confirmation & reason/remarks in each item"), 0).show();
            return;
        }
        if (this$0.totalArraySize != this$0.selectedListOfServices.size()) {
            Toast.makeText(this$0, this$0.P1().b("SELECT_REASON_SERVICE_WITHDRAWN", "Please select confirmation & reason/remarks in each item"), 0).show();
            return;
        }
        f53 jsonTree = new Gson().toJsonTree(this$0.selectedListOfServices);
        ProgressDialog progressDialog = this$0.dialog;
        hz5 hz5Var = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        hz5 hz5Var2 = this$0.viewModal;
        if (hz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            hz5Var = hz5Var2;
        }
        String str = this$0.applicationNo;
        Intrinsics.checkNotNull(jsonTree);
        hz5Var.z("ServiceWithdrawn", str, jsonTree);
    }

    public static final void V1(SelectedWithdrawnList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ApplicationDetails.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void X1(Dialog d2, SelectedWithdrawnList this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) ApplicationDetails.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirm_dialog_service_withdrawn);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.serviceWithDrawnMsgTv);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(P1().b("SELECTED_FOLLOWING_SERVICE_WITHDRAWN", getString(R.string.service_withdrawn_msg)));
        View viewFindViewById2 = dialog.findViewById(R.id.proceedMsgTv);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setText(P1().b("WANT_TO_PROCEED", getString(R.string.are_you_want_to_proceed)));
        View viewFindViewById3 = dialog.findViewById(R.id.serviceWithDrawnList);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.cancelBtn);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView = (MyTextView) viewFindViewById4;
        myTextView.setText(P1().b("button_cancel", getString(R.string.cancel)));
        View viewFindViewById5 = dialog.findViewById(R.id.proceedBtn);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView2 = (MyTextView) viewFindViewById5;
        myTextView2.setText(P1().b("button_proceed", getString(R.string.proceed)));
        int size = this.selectedListOfServices.size();
        for (int i = 0; i < size; i++) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setGravity(17);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            if (Intrinsics.areEqual(((SelectedCovRequestModal) this.selectedListOfServices.get(i)).getAppliedCov(), "NA")) {
                textView.setText((i + 1) + ". " + ((SelectedCovRequestModal) this.selectedListOfServices.get(i)).getAppliedService());
            } else {
                textView.setText((i + 1) + ". " + ((SelectedCovRequestModal) this.selectedListOfServices.get(i)).getAppliedService() + ' ' + ((SelectedCovRequestModal) this.selectedListOfServices.get(i)).getAppliedCov());
            }
            linearLayout2.addView(textView);
            linearLayout.addView(linearLayout2);
        }
        myTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedWithdrawnList.d2(dialog, view);
            }
        });
        myTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedWithdrawnList.e2(dialog, this, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void e2(Dialog d2, SelectedWithdrawnList this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.L1();
    }

    public final void M1() {
        this.confirmationArray.add("Select");
        this.confirmationArray.add("Yes");
        this.confirmationArray.add("No");
    }

    public final void N1() {
        ProgressDialog progressDialog = null;
        try {
            ProgressDialog progressDialog2 = this.dialog;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog2 = null;
            }
            if (progressDialog2.isShowing()) {
                ProgressDialog progressDialog3 = this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = this.dialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog4 = null;
            }
            progressDialog4.show();
            hz5 hz5Var = this.viewModal;
            if (hz5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
                hz5Var = null;
            }
            hz5Var.h(this.applicationNo);
        } catch (Exception e2) {
            e2.printStackTrace();
            ProgressDialog progressDialog5 = this.dialog;
            if (progressDialog5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = this.dialog;
                if (progressDialog6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    public final wa3 P1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void Q1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            hz5 hz5Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            hz5 hz5Var2 = this.viewModal;
            if (hz5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            } else {
                hz5Var = hz5Var2;
            }
            hz5Var.t();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final wl5 R1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void W1(String message) {
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
        ((TextView) viewFindViewById3).setText(P1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedWithdrawnList.X1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void Y1(int position, String confirmationValue, String remarks, String appliedService, String appliedCovs, String status) {
        Intrinsics.checkNotNullParameter(confirmationValue, "confirmationValue");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(appliedService, "appliedService");
        Intrinsics.checkNotNullParameter(appliedCovs, "appliedCovs");
        Intrinsics.checkNotNullParameter(status, "status");
        if (Intrinsics.areEqual(confirmationValue, "Select") || Intrinsics.areEqual(remarks, "Select")) {
            return;
        }
        SelectedCovRequestModal selectedCovRequestModal = new SelectedCovRequestModal(confirmationValue, remarks, appliedService, appliedCovs, status);
        if (this.selectedPos.size() <= 0) {
            this.selectedPos.add(Integer.valueOf(position));
            this.selectedListOfServices.add(selectedCovRequestModal);
        } else if (this.selectedPos.contains(Integer.valueOf(position)) && this.selectedListOfServices.size() > 0) {
            this.selectedListOfServices.set(position, selectedCovRequestModal);
        } else {
            this.selectedPos.add(Integer.valueOf(position));
            this.selectedListOfServices.add(selectedCovRequestModal);
        }
    }

    public final void Z1() {
        this.adapter = new sv5(this, this.listValue, this.reasonArray, this.confirmationArray, this);
        zv5 zv5Var = this.binding;
        sv5 sv5Var = null;
        if (zv5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5Var = null;
        }
        zv5Var.l.setLayoutManager(new LinearLayoutManager(this));
        zv5 zv5Var2 = this.binding;
        if (zv5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5Var2 = null;
        }
        RecyclerView recyclerView = zv5Var2.l;
        sv5 sv5Var2 = this.adapter;
        if (sv5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sv5Var = sv5Var2;
        }
        recyclerView.setAdapter(sv5Var);
    }

    public final void a2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void b2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void f2(ArrayList appliedServiceResultModal) {
        sv5 sv5Var = this.adapter;
        if (sv5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sv5Var = null;
        }
        sv5Var.D(appliedServiceResultModal);
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        zv5 zv5VarC = zv5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(zv5VarC, "inflate(...)");
        this.binding = zv5VarC;
        hz5 hz5Var = null;
        if (zv5VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5VarC = null;
        }
        setContentView(zv5VarC.b());
        a2(new wa3(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(P1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        O1();
        S1();
        ta3.a aVar = ta3.a;
        zv5 zv5Var = this.binding;
        if (zv5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zv5Var = null;
        }
        aVar.q(this, zv5Var);
        Q1();
        M1();
        N1();
        hz5 hz5Var2 = this.viewModal;
        if (hz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var2 = null;
        }
        hz5Var2.s().g(this, new f(new a()));
        hz5 hz5Var3 = this.viewModal;
        if (hz5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var3 = null;
        }
        hz5Var3.i().g(this, new f(new b()));
        hz5 hz5Var4 = this.viewModal;
        if (hz5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var4 = null;
        }
        hz5Var4.m().g(this, new f(new c()));
        hz5 hz5Var5 = this.viewModal;
        if (hz5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var5 = null;
        }
        hz5Var5.w().g(this, new f(new d()));
        hz5 hz5Var6 = this.viewModal;
        if (hz5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            hz5Var = hz5Var6;
        }
        hz5Var.v().g(this, new f(new e()));
    }
}
