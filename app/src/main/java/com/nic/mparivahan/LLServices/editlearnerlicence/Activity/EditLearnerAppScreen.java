package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import com.nic.mparivahan.R;
import com.zepto.a02;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sz1;
import com.zepto.ta3;
import com.zepto.tz1;
import com.zepto.va3;
import com.zepto.vb;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wl5;
import com.zepto.zz1;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010&\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010(\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u001e\u0010-\u001a\n **\u0004\u0018\u00010)0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010\u001dR\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/nic/mparivahan/LLServices/editlearnerlicence/Activity/EditLearnerAppScreen;", "Lcom/zepto/pq;", "", "o1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/vb;", "C", "Lcom/zepto/vb;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "pDialog", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "session", "Lcom/zepto/zz1;", "F", "Lcom/zepto/zz1;", "editLearnerVM", "Lcom/nic/mparivahan/LLServices/editlearnerlicence/Service/EditLearnerServices;", "G", "Lcom/nic/mparivahan/LLServices/editlearnerlicence/Service/EditLearnerServices;", "service", "", "H", "Ljava/lang/String;", "fatherName", "I", "mobileNo", "J", "fullName", "K", "transactionCode", "L", "reference", "M", "rtoCode", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "N", "Ljava/util/Calendar;", "cal", "O", "formattedDate", "Lcom/zepto/wl5;", "P", "Lcom/zepto/wl5;", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class EditLearnerAppScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public vb binding;

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
    public String reference = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rtoCode = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String formattedDate;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wl5 sarthiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(sz1 sz1Var) {
            try {
                ProgressDialog progressDialog = EditLearnerAppScreen.this.pDialog;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                }
                if (!progressDialog.isShowing()) {
                    throw null;
                }
                ProgressDialog progressDialog2 = EditLearnerAppScreen.this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
            }
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
            ProgressDialog progressDialog = EditLearnerAppScreen.this.pDialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = EditLearnerAppScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    private final void o1() {
        this.sarthiSession = new wl5(this);
        vb vbVar = this.binding;
        vb vbVar2 = null;
        if (vbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar = null;
        }
        TextView textView = vbVar.y.f;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        textView.setText(wl5Var.k());
        vb vbVar3 = this.binding;
        if (vbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar3 = null;
        }
        vbVar3.y.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditLearnerAppScreen.p1(this.a, view);
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
        vb vbVar4 = this.binding;
        if (vbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar4 = null;
        }
        vbVar4.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditLearnerAppScreen.q1(this.a, view);
            }
        });
        vb vbVar5 = this.binding;
        if (vbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar5 = null;
        }
        vbVar5.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditLearnerAppScreen.r1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.xz1
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                EditLearnerAppScreen.s1(this.a, datePicker, i, i2, i3);
            }
        };
        vb vbVar6 = this.binding;
        if (vbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vbVar2 = vbVar6;
        }
        vbVar2.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditLearnerAppScreen.t1(this.a, onDateSetListener, view);
            }
        });
    }

    public static final void p1(EditLearnerAppScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void q1(EditLearnerAppScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vb vbVar = this$0.binding;
        vb vbVar2 = null;
        if (vbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar = null;
        }
        vbVar.w.setText("");
        vb vbVar3 = this$0.binding;
        if (vbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vbVar2 = vbVar3;
        }
        vbVar2.C.setText("");
    }

    public static final void r1(EditLearnerAppScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vb vbVar = this$0.binding;
        vb vbVar2 = null;
        wa3 wa3Var = null;
        wa3 wa3Var2 = null;
        if (vbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar = null;
        }
        if (vbVar.w.getText().toString().length() == 0) {
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            Toast.makeText(this$0, wa3Var.b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
            return;
        }
        vb vbVar3 = this$0.binding;
        if (vbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar3 = null;
        }
        if (vbVar3.C.getText().toString().length() == 0) {
            wa3 wa3Var4 = this$0.session;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var2 = wa3Var4;
            }
            Toast.makeText(this$0, wa3Var2.b("edit_dl_serv_dob", this$0.getString(R.string.enter_dob)), 1).show();
            return;
        }
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
        vb vbVar4 = this$0.binding;
        if (vbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar4 = null;
        }
        String string = vbVar4.w.getText().toString();
        vb vbVar5 = this$0.binding;
        if (vbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vbVar2 = vbVar5;
        }
        zz1Var.m(string, vbVar2.C.getText().toString());
    }

    public static final void s1(EditLearnerAppScreen this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        this$0.formattedDate = str + '-' + str2 + '-' + str3;
        vb vbVar = this$0.binding;
        if (vbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar = null;
        }
        vbVar.C.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void t1(EditLearnerAppScreen this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vb vbVarX = vb.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(vbVarX, "inflate(...)");
        this.binding = vbVarX;
        zz1 zz1Var = null;
        if (vbVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVarX = null;
        }
        setContentView(vbVarX.m());
        o1();
        ta3.a aVar = ta3.a;
        vb vbVar = this.binding;
        if (vbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vbVar = null;
        }
        aVar.J0(this, vbVar);
        zz1 zz1Var2 = this.editLearnerVM;
        if (zz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
            zz1Var2 = null;
        }
        zz1Var2.i().g(this, new c(new a()));
        zz1 zz1Var3 = this.editLearnerVM;
        if (zz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
        } else {
            zz1Var = zz1Var3;
        }
        zz1Var.j().g(this, new c(new b()));
    }
}
