package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServicesMainScreens.ClRtoSelect;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster;
import com.zepto.b8;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.nr1;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.x31;
import com.zepto.y31;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bE\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R2\u0010/\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R2\u00104\u001a\u0012\u0012\u0004\u0012\u0002000&j\b\u0012\u0004\u0012\u000200`(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,\"\u0004\b3\u0010.R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010S\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\"\u0010[\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010N\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\"\u0010_\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR\"\u0010c\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010N\u001a\u0004\ba\u0010P\"\u0004\bb\u0010RR\"\u0010g\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR\"\u0010k\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010N\u001a\u0004\bi\u0010P\"\u0004\bj\u0010RR\"\u0010o\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u0010RR\"\u0010s\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010N\u001a\u0004\bq\u0010P\"\u0004\br\u0010RR\"\u0010w\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010N\u001a\u0004\bu\u0010P\"\u0004\bv\u0010RR\"\u0010{\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010N\u001a\u0004\by\u0010P\"\u0004\bz\u0010RR\"\u0010\u007f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010N\u001a\u0004\b}\u0010P\"\u0004\b~\u0010RR&\u0010\u0083\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010N\u001a\u0005\b\u0081\u0001\u0010P\"\u0005\b\u0082\u0001\u0010RR&\u0010\u0087\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010N\u001a\u0005\b\u0085\u0001\u0010P\"\u0005\b\u0086\u0001\u0010R¨\u0006\u008a\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/ClRtoSelect;", "Lcom/zepto/pq;", "", "G1", "", "message", "N1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/b8;", "C", "Lcom/zepto/b8;", "rtoSelectBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "w1", "()Landroid/content/Context;", "W1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "Z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "V1", "(Lcom/zepto/wa3;)V", "langSession", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/sarathiStateApi/StateMaster;", "Lkotlin/collections/ArrayList;", "G", "Ljava/util/ArrayList;", "E1", "()Ljava/util/ArrayList;", "f2", "(Ljava/util/ArrayList;)V", "state_list", "Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "H", "x1", "X1", "mRtosMaster", "Lcom/zepto/wl5;", "I", "Lcom/zepto/wl5;", "C1", "()Lcom/zepto/wl5;", "d2", "(Lcom/zepto/wl5;)V", "sahi_session", "Lcom/zepto/nr1;", "J", "Lcom/zepto/nr1;", "r1", "()Lcom/zepto/nr1;", "R1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "K", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "A1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "a2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "L", "Ljava/lang/String;", "D1", "()Ljava/lang/String;", "e2", "(Ljava/lang/String;)V", "state_code", "M", "F1", "g2", "state_name", "N", "s1", "S1", "dlValue", "O", "t1", "T1", "dobValue", "P", "u1", "U1", "fatherName", "Q", "p1", "P1", "clName", "R", "q1", "Q1", "clPhoto", "S", "B1", "b2", "rto_code", "T", "y1", "Y1", "mobileNumber", "U", "getRto_name", "c2", "rto_name", "V", "getAddress", "setAddress", "address", "W", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "X", "getValidity", "setValidity", "validity", "Y", "getCl_Status", "setCl_Status", "cl_Status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClRtoSelect extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public b8 rtoSelectBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList state_list;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList mRtosMaster;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String state_name;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String rto_code;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String mobileNumber;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String rto_name = "NA";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String cl_Status = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i == 0) {
                ClRtoSelect.this.e2("0");
                return;
            }
            try {
                ClRtoSelect clRtoSelect = ClRtoSelect.this;
                clRtoSelect.e2(((StateMaster) clRtoSelect.E1().get(i)).getState_code());
                ClRtoSelect clRtoSelect2 = ClRtoSelect.this;
                clRtoSelect2.g2(((StateMaster) clRtoSelect2.E1().get(i)).getState_name());
                nr1 nr1VarR1 = ClRtoSelect.this.r1();
                ClRtoSelect clRtoSelect3 = ClRtoSelect.this;
                nr1VarR1.h(clRtoSelect3, clRtoSelect3.D1());
            } catch (Exception e) {
                e.getLocalizedMessage();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i == 0) {
                ClRtoSelect.this.b2("0");
                return;
            }
            ClRtoSelect clRtoSelect = ClRtoSelect.this;
            clRtoSelect.c2(((RtosMaster) clRtoSelect.x1().get(i)).getRto_name());
            ClRtoSelect clRtoSelect2 = ClRtoSelect.this;
            clRtoSelect2.b2(((RtosMaster) clRtoSelect2.x1().get(i)).getRto_code());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    private final void G1() {
        W1(this);
        V1(new wa3(w1()));
        d2(new wl5(w1()));
        b8 b8VarC = b8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(b8VarC, "inflate(...)");
        this.rtoSelectBinding = b8VarC;
        if (b8VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            b8VarC = null;
        }
        setContentView(b8VarC.b());
        a2(DlServiceInt.INSTANCE.a(w1()));
        Z1(new ProgressDialog(w1()));
        z1().setMessage(v1().b("label_challan_please_wait", getString(R.string.please_wait)));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        R1((nr1) new z(this, new rq1(new lr1(A1(), this))).a(nr1.class));
        z1().show();
        r1().i(this);
        try {
            T1(String.valueOf(getIntent().getStringExtra("dobValue")));
            S1(String.valueOf(getIntent().getStringExtra("dlValue")));
            U1(String.valueOf(getIntent().getStringExtra("fatherName")));
            P1(String.valueOf(getIntent().getStringExtra("clName")));
            Q1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            Y1(String.valueOf(getIntent().getStringExtra("mobileNumber")));
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
        } catch (Exception unused) {
        }
    }

    public static final void H1(ClRtoSelect this$0, SarathiStatePojo sarathiStatePojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            b8 b8Var = null;
            if (!StringsKt__StringsJVMKt.equals(sarathiStatePojo.getStatus_code(), "00", true)) {
                this$0.f2(new ArrayList());
                this$0.E1().add(0, new StateMaster("Select State", "0"));
                y31 y31Var = new y31(this$0, this$0.E1());
                b8 b8Var2 = this$0.rtoSelectBinding;
                if (b8Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                } else {
                    b8Var = b8Var2;
                }
                b8Var.c.setAdapter((SpinnerAdapter) y31Var);
                return;
            }
            List<StateMaster> stateMaster = sarathiStatePojo.getStateMaster();
            Intrinsics.checkNotNull(stateMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster> }");
            this$0.f2((ArrayList) stateMaster);
            y31 y31Var2 = new y31(this$0, this$0.E1());
            b8 b8Var3 = this$0.rtoSelectBinding;
            if (b8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                b8Var3 = null;
            }
            b8Var3.c.setAdapter((SpinnerAdapter) y31Var2);
            int size = this$0.E1().size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (StringsKt__StringsJVMKt.equals(this$0.C1().n(), "OR", true) && StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) ((StateMaster) this$0.E1().get(i)).getState_code()).toString(), "OD", true)) {
                    b8 b8Var4 = this$0.rtoSelectBinding;
                    if (b8Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                        b8Var4 = null;
                    }
                    b8Var4.c.setSelection(i);
                } else if (Intrinsics.areEqual(this$0.C1().n(), StringsKt__StringsKt.trim((CharSequence) ((StateMaster) this$0.E1().get(i)).getState_code()).toString())) {
                    this$0.g2(((StateMaster) this$0.E1().get(i)).getState_name());
                    b8 b8Var5 = this$0.rtoSelectBinding;
                    if (b8Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                        b8Var5 = null;
                    }
                    b8Var5.c.setSelection(i);
                } else {
                    i++;
                }
            }
            b8 b8Var6 = this$0.rtoSelectBinding;
            if (b8Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                b8Var6 = null;
            }
            b8Var6.c.setEnabled(false);
            b8 b8Var7 = this$0.rtoSelectBinding;
            if (b8Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            } else {
                b8Var = b8Var7;
            }
            b8Var.c.setClickable(false);
        } catch (Exception unused) {
            Toast.makeText(this$0.getApplicationContext(), this$0.v1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    public static final void I1(ClRtoSelect this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.getApplicationContext(), this$0.v1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), 1).show();
    }

    public static final void J1(ClRtoSelect this$0, CurrentRTO currentRTO) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        try {
            b8 b8Var = null;
            if (!StringsKt__StringsJVMKt.equals(currentRTO.getStatus_code(), "00", true)) {
                List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                this$0.X1((ArrayList) rtosMaster);
                ArrayList arrayListX1 = this$0.x1();
                String strB = this$0.v1().b("select_rto", this$0.getString(R.string.please_select_rto));
                Intrinsics.checkNotNull(strB);
                arrayListX1.add(0, new RtosMaster(strB, "0"));
                x31 x31Var = new x31(this$0, this$0.x1());
                b8 b8Var2 = this$0.rtoSelectBinding;
                if (b8Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                } else {
                    b8Var = b8Var2;
                }
                b8Var.b.setAdapter((SpinnerAdapter) x31Var);
                return;
            }
            List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
            Intrinsics.checkNotNull(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
            this$0.X1((ArrayList) rtosMaster2);
            ArrayList arrayListX12 = this$0.x1();
            String strB2 = this$0.v1().b("select_rto", this$0.getString(R.string.please_select_rto));
            Intrinsics.checkNotNull(strB2);
            arrayListX12.add(0, new RtosMaster(strB2, "0"));
            x31 x31Var2 = new x31(this$0, this$0.x1());
            b8 b8Var3 = this$0.rtoSelectBinding;
            if (b8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                b8Var3 = null;
            }
            b8Var3.b.setAdapter((SpinnerAdapter) x31Var2);
            b8 b8Var4 = this$0.rtoSelectBinding;
            if (b8Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
                b8Var4 = null;
            }
            b8Var4.b.setEnabled(true);
            b8 b8Var5 = this$0.rtoSelectBinding;
            if (b8Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            } else {
                b8Var = b8Var5;
            }
            b8Var.b.setClickable(true);
        } catch (Exception unused) {
            this$0.N1(this$0.v1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
        }
    }

    public static final void K1(ClRtoSelect this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        this$0.N1(this$0.v1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void L1(ClRtoSelect this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void M1(ClRtoSelect this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (StringsKt__StringsJVMKt.equals(this$0.B1(), "0", true)) {
            this$0.N1("Please select RTO");
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) MobileOtpScreen.class);
            intent.putExtra("dlValue", this$0.s1());
            intent.putExtra("dobValue", this$0.t1());
            intent.putExtra("fatherName", this$0.u1());
            intent.putExtra("clName", this$0.p1());
            intent.putExtra("clPhoto", this$0.q1());
            intent.putExtra("stateCode", this$0.D1());
            intent.putExtra("stateName", this$0.F1());
            intent.putExtra("rtoCode", this$0.B1());
            intent.putExtra("rtoName", this$0.rto_name);
            intent.putExtra("clPhoto", this$0.q1());
            intent.putExtra("mobileNumber", this$0.y1());
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    private final void N1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(v1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(v1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(v1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClRtoSelect.O1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void O1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final DlServiceInt A1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String B1() {
        String str = this.rto_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_code");
        return null;
    }

    public final wl5 C1() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final String D1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final ArrayList E1() {
        ArrayList arrayList = this.state_list;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_list");
        return null;
    }

    public final String F1() {
        String str = this.state_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_name");
        return null;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void R1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void V1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void W1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void X1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mRtosMaster = arrayList;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void Z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void a2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_code = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_name = str;
    }

    public final void d2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final void f2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.state_list = arrayList;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_name = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl_rto_select);
        G1();
        ta3.a aVar = ta3.a;
        b8 b8Var = this.rtoSelectBinding;
        b8 b8Var2 = null;
        if (b8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            b8Var = null;
        }
        aVar.d0(this, b8Var);
        b8 b8Var3 = this.rtoSelectBinding;
        if (b8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            b8Var3 = null;
        }
        b8Var3.e.setText(s1());
        r1().z().g(this, new mf4() { // from class: com.zepto.wo0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ClRtoSelect.H1(this.a, (SarathiStatePojo) obj);
            }
        });
        r1().B().g(this, new mf4() { // from class: com.zepto.xo0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ClRtoSelect.I1(this.a, (String) obj);
            }
        });
        b8 b8Var4 = this.rtoSelectBinding;
        if (b8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            b8Var4 = null;
        }
        b8Var4.c.setOnItemSelectedListener(new a());
        b8 b8Var5 = this.rtoSelectBinding;
        if (b8Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            b8Var5 = null;
        }
        b8Var5.b.setOnItemSelectedListener(new b());
        r1().y().g(this, new mf4() { // from class: com.zepto.yo0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ClRtoSelect.J1(this.a, (CurrentRTO) obj);
            }
        });
        r1().A().g(this, new mf4() { // from class: com.zepto.zo0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ClRtoSelect.K1(this.a, (String) obj);
            }
        });
        b8 b8Var6 = this.rtoSelectBinding;
        if (b8Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
            b8Var6 = null;
        }
        b8Var6.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ap0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClRtoSelect.L1(this.a, view);
            }
        });
        b8 b8Var7 = this.rtoSelectBinding;
        if (b8Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rtoSelectBinding");
        } else {
            b8Var2 = b8Var7;
        }
        b8Var2.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClRtoSelect.M1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    public final String q1() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final nr1 r1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final String s1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String t1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String u1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final Context w1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ArrayList x1() {
        ArrayList arrayList = this.mRtosMaster;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRtosMaster");
        return null;
    }

    public final String y1() {
        String str = this.mobileNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobileNumber");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
